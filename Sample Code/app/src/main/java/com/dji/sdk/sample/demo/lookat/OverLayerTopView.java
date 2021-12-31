package com.dji.sdk.sample.demo.lookat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import dji.common.flightcontroller.flightassistant.SmartTrackBoundInfo;
import dji.common.flightcontroller.flightassistant.SmartTrackPositionInfo;
import dji.common.flightcontroller.flightassistant.SmartTrackTrackInfo;
import dji.common.flightcontroller.flightassistant.SmartTrackVelocityInfo;
import dji.sdk.camera.view.PinPoint;

public class OverLayerTopView extends AppCompatImageView {
    private Paint rectBorderPaint;
    private Paint pointPaint;
    private TextPaint wordPaint;
    private int screenWidth, screenHeight;
    private RectF rect = new RectF();
    private SmartTrackBoundInfo selectBound;
    private StringBuffer buffer = new StringBuffer();
    private DecimalFormat velocityDf = new DecimalFormat("#0.00");
    private DecimalFormat gpsDf = new DecimalFormat("#0.00000");
    private List<LookAtMissionView.Point> points = new ArrayList<>();

    public OverLayerTopView(Context context) {
        this(context, null, 0);
    }

    public OverLayerTopView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public OverLayerTopView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        initPaint();
        post(new Runnable() {
            @Override
            public void run() {
                screenWidth = getWidth();
                screenHeight = getHeight();
            }
        });
    }

    private void initPaint() {
        rectBorderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectBorderPaint.setColor(Color.GREEN);
        rectBorderPaint.setStyle(Paint.Style.STROKE);
        rectBorderPaint.setStrokeWidth(5f);
        rectBorderPaint.setAlpha(255);//透明度

        wordPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);//抗锯齿
        wordPaint.setColor(Color.YELLOW);//字体颜色
        wordPaint.setStrokeWidth(1f);//画笔的宽度
        wordPaint.setTextSize(25);//字体大小

        pointPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        pointPaint.setColor(Color.BLUE);
        pointPaint.setStrokeWidth(40F);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (points != null) {
            for (LookAtMissionView.Point point : points) {
                for (PinPoint pinPoint : point.pinPointInfo.getPinPoints()){
                    drawPoint(canvas, pinPoint.getX(), pinPoint.getY());
                    drawTipText(canvas, initPointInfo(point), pinPoint.getX() * screenWidth, pinPoint.getY() * screenHeight);
                }
            }
        }
        if (selectBound != null) {
            drawBound(canvas, selectBound);
        }
    }

    private String initTargetInfo(SmartTrackTrackInfo info) {
        buffer.setLength(0);
        buffer.append("Id:").append(info.getId()).append(" ");
        buffer.append("Mode:").append(info.getMode()).append(" ");
        buffer.append("Type:").append(info.getType()).append("\n");
        SmartTrackPositionInfo positionInfo = info.getPositionInfo();
        if (positionInfo != null) {
            buffer.append("Lng:").append(gpsDf.format(positionInfo.getLng())).append(" ");
            buffer.append("Lat:").append(gpsDf.format(positionInfo.getLat())).append(" ");
            buffer.append("Alt:").append(gpsDf.format(positionInfo.getAlt())).append("\n");
        }
        SmartTrackVelocityInfo velocityInfo = info.getVelocityInfo();
        if (velocityInfo != null) {
            buffer.append("North:").append(velocityDf.format(velocityInfo.getNorth())).append(" ");
            buffer.append("East:").append(velocityDf.format(velocityInfo.getEast())).append(" ");
            buffer.append("Up:").append(velocityDf.format(velocityInfo.getUp())).append("\n");
        }
        return buffer.toString();
    }

    private String initPointInfo(LookAtMissionView.Point point) {
        buffer.setLength(0);
        buffer.append("Lng:").append(point.pos.longitude).append(" ");
        buffer.append("Lat:").append(point.pos.latitude).append(" ");
        buffer.append("Alt:").append(point.pos.altitude).append("\n");
        buffer.append("Direction:").append(point.pinPointInfo.getPointDirection()).append("\n");
        buffer.append("PhysicalSource:").append(point.physicalSource);
        return buffer.toString();
    }

    private void drawBound(Canvas canvas, SmartTrackBoundInfo boundInfo) {
        rect.left = (boundInfo.getCenterX() - boundInfo.getWidth() / 2) * screenWidth;
        rect.right = (boundInfo.getCenterX() + boundInfo.getWidth() / 2) * screenWidth;
        rect.top = (boundInfo.getCenterY() - boundInfo.getHeight() / 2) * screenHeight;
        rect.bottom = (boundInfo.getCenterY() + boundInfo.getHeight() / 2) * screenHeight;
        canvas.drawRect(rect, rectBorderPaint);
    }

    private void drawPoint(Canvas canvas, float x, float y) {
        canvas.drawPoint(x * screenWidth, y * screenHeight, pointPaint);
    }

    private void drawTipText(Canvas canvas, String str, float x, float y) {
        StaticLayout sy = new StaticLayout(str, wordPaint, 800,
                Layout.Alignment.ALIGN_CENTER, 1, 0, true);
        canvas.save();
        canvas.translate(-sy.getWidth() / 2F + x, -sy.getHeight() / 2F + y);
        sy.draw(canvas);
        canvas.restore();
    }

    public void onSelectBoundInfo(SmartTrackBoundInfo info) {
        selectBound = info;
        invalidate();
    }

    public void onPointsChanged(List<LookAtMissionView.Point> pinPoints) {
        this.points = pinPoints;
        invalidate();
    }
}
