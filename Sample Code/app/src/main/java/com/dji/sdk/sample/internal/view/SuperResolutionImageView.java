package com.dji.sdk.sample.internal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

import java.util.ArrayList;
import java.util.List;

import dji.sdk.media.SuperResInfoBean;


public class SuperResolutionImageView extends SubsamplingScaleImageView {

    SuperResolutionGroupMedia mMedia;
    private Paint mBorderPaint = new Paint();
    private Paint mPaint = new Paint();
    private PorterDuffXfermode mClearMode;
    private int mMaskColor;
    private RectF mViewRect = new RectF();
    private RectF mCaptureRect = new RectF();
    private RectF mCaptureRectInPercent = new RectF();
    private Path mPath = new Path();
    private List<CaptureItemArea> mCaptureItemAreaList = new ArrayList<>();

    private OnClickCaptureItemAreaListener mOnClickCaptureItemAreaListener;
    private OnPreviewImageLoadListener mOnPreviewImageLoadListener;
    private OnStateChangedListener mOutStateChangedListener;
    private float mTouchUpX;
    private float mTouchUpY;
    private boolean mMaskEnabled = true;
    private boolean mPreviewMode = false;
    private boolean previewImageLoaded = false;


    public SuperResolutionImageView(Context context) {
        this(context, null);
    }

    public SuperResolutionImageView(Context context, AttributeSet attr) {
        super(context, attr);
        configurePaint();
        super.setOnStateChangedListener(new OnStateChangedListener() {
            @Override
            public void onScaleChanged(float newScale, int origin) {
                postInvalidate();
                if (mOutStateChangedListener != null) {
                    mOutStateChangedListener.onScaleChanged(newScale, origin);
                }
            }

            @Override
            public void onCenterChanged(PointF newCenter, int origin) {
                if (mOutStateChangedListener != null) {
                    mOutStateChangedListener.onCenterChanged(newCenter, origin);
                }
            }
        });

    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    protected void onImageLoaded() {
        super.onImageLoaded();
        resetScaleAndCenter();
        postInvalidate();
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mMedia != null && previewImageLoaded) {
            SuperResInfoBean hyperAnalyticInfo = mMedia.getHyperAnalyticInfo();
            if (hyperAnalyticInfo == null) {
                return;
            }
            int layoutId = canvas.saveLayer(0, 0, getWidth(), getHeight(), null, Canvas.ALL_SAVE_FLAG);
            SuperResInfoBean.CaptureAreaInfo captureAreaInfoBean = hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo();
            mCaptureRectInPercent.set(captureAreaInfoBean.getLeft(), captureAreaInfoBean.getTop(), captureAreaInfoBean.getRight(), captureAreaInfoBean.getBottom());
            updateCaptureRectInView(mCaptureRectInPercent);
            updateCaptureItemArea(hyperAnalyticInfo);
            mViewRect.set(0,0,getWidth(), getHeight());

            if (isMaskEnabled()) {
                mPaint.setColor(mMaskColor);
                mPaint.setXfermode(null);
                canvas.drawRect(mViewRect, mPaint);
            }

            mPaint.setXfermode(mClearMode);
            canvas.drawRect(mCaptureRect, mPaint);

            canvas.drawRect(mCaptureRect, mBorderPaint);
            if (!mPreviewMode) {
                // 有照片丢失
                for (int i = mCaptureItemAreaList.size() - 1; i >= 0; i--) {
                    CaptureItemArea area = mCaptureItemAreaList.get(i);
                    if (isImageNoCapture(i)) {
                        area.imageNoCaptured = true;
                        // 照片没拍成功，灰色蒙层
                        mPaint.setColor(mMaskColor);
                        mPaint.setXfermode(null);
                        canvas.drawRect(area.rectF, mPaint);
                    }
                }

                float rowH = mCaptureRect.height() / hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getRow();
                float colW = mCaptureRect.width() / hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getColumn();
                for (int i = 1; i < hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getRow(); i++) {
                    mPath.reset();
                    mPath.moveTo(mCaptureRect.left, mCaptureRect.top + i * rowH);
                    mPath.lineTo(mCaptureRect.right, mCaptureRect.top + i * rowH);
                    canvas.drawPath(mPath, mBorderPaint);
                }
                for (int i = 1; i < hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getColumn(); i++) {
                    mPath.reset();
                    mPath.moveTo(mCaptureRect.left + i * colW, mCaptureRect.top);
                    mPath.lineTo(mCaptureRect.left + i * colW, mCaptureRect.bottom);
                    canvas.drawPath(mPath, mBorderPaint);
                }
            }

            canvas.restoreToCount(layoutId);
        }
    }

    @Override
    public boolean onTouchEvent(@NonNull MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                mTouchUpX = event.getX();
                mTouchUpY = event.getY();
                break;
            default:
                break;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean performClick() {
        CaptureItemArea captureItemArea = getClickCaptureAreaIndex(mTouchUpX, mTouchUpY);
        if (captureItemArea != null && mOnClickCaptureItemAreaListener != null) {
            mOnClickCaptureItemAreaListener.onClickCaptureItemArea(captureItemArea);
            return true;
        } else {
            return super.performClick();
        }
    }

    public void setMedia(SuperResolutionGroupMedia media) {

        mMedia = media;

        mCaptureItemAreaList.clear();
        if (media.getHyperAnalyticInfo() != null) {
            for (int i = 0; i < mMedia.getHyperAnalyticInfo().getSuperResImageInfo().getCaptureAreaInfo().getRow() * mMedia.getHyperAnalyticInfo().getSuperResImageInfo().getCaptureAreaInfo().getColumn(); i++) {
                mCaptureItemAreaList.add(new CaptureItemArea());
            }
        }
        updateMedia();
        postInvalidate();
    }

    public void setOnPreviewImageLoadListener(OnPreviewImageLoadListener onPreviewImageLoadListener){
        mOnPreviewImageLoadListener = onPreviewImageLoadListener;
    }

    public void setOnClickCaptureItemAreaListener(OnClickCaptureItemAreaListener onClickCaptureItemAreaListener) {
        mOnClickCaptureItemAreaListener = onClickCaptureItemAreaListener;
    }

    @Override
    public void setOnStateChangedListener(OnStateChangedListener onStateChangedListener) {
        mOutStateChangedListener = onStateChangedListener;
    }

    private void updateMedia() {

        mMedia.getWideMedia().fetchPreviewImageWithPath(error -> {
            if (error != null) {
                //weakEmitter.onError(new DJIErrorException(error));
            } else {
                Bitmap bitmap = BitmapFactory.decodeFile( mMedia.getWideMedia().getPreviewImageCachePath());
                post(new Runnable() {
                    @Override
                    public void run() {
                        setImage(ImageSource.cachedBitmap(bitmap));
                        previewImageLoaded = true;
                        if (mOnPreviewImageLoadListener != null) {
                            mOnPreviewImageLoadListener.onSuccess();
                        }
                    }
                });
            }

        });


    }

    public boolean isMaskEnabled() {
        return mMaskEnabled;
    }

    public void setMaskEnabled(boolean maskEnabled) {
        mMaskEnabled = maskEnabled;
        postInvalidate();
    }


    /**
     * 照片是否没有拍成功
     * @param index
     * @return
     */
    private boolean isImageNoCapture(int index) {
        if (index < mMedia.getHyperAnalyticInfo().getSuperResImageInfo().getZoomImageFileInfoList().size()) {
            return false;
        } else {
            return true;
        }
    }

    private void configurePaint() {
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setStyle(Paint.Style.FILL);

        mBorderPaint.setAntiAlias(true);
        mBorderPaint.setDither(true);
        mBorderPaint.setStyle(Paint.Style.STROKE);
        mBorderPaint.setColor(Color.WHITE);
        mBorderPaint.setPathEffect(new DashPathEffect(new float[]{8,8}, 0));
        mBorderPaint.setStrokeWidth(4);

        mClearMode = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        mMaskColor = Color.argb(128,0,0,0);
    }

    /**
     * 更新view上的选框
     * @param captureRectInImage
     */
    private void updateCaptureRectInView(RectF captureRectInImage) {
        PointF topLeft = sourceToViewCoord(captureRectInImage.left * getSWidth(), captureRectInImage.top * getSHeight());
        PointF bottomRight = sourceToViewCoord(captureRectInImage.right * getSWidth(), captureRectInImage.bottom * getSHeight());
        if (topLeft != null && bottomRight != null) {
            mCaptureRect.set(topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
        }
    }

    /**
     * 更新每个超解析小区域的位置信息
     * @param hyperAnalyticInfo
     */
    private void updateCaptureItemArea(SuperResInfoBean hyperAnalyticInfo) {
        float rowH = mCaptureRect.height() / hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getRow();
        float colW = mCaptureRect.width() / hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getColumn();
        transUpdateCaptureItemArea(rowH, colW, 0,0,0,hyperAnalyticInfo);
    }

    /**
     * 递归遍历所有小区域，更新位置信息
     * @param rowH
     * @param colW
     * @param curRow
     * @param curCol
     * @param index
     * @param hyperAnalyticInfo
     */
    private void transUpdateCaptureItemArea(float rowH, float colW, int curRow, int curCol, int index, SuperResInfoBean hyperAnalyticInfo) {
        if (index >= mCaptureItemAreaList.size()) {
            return;
        }
        CaptureItemArea captureItemArea = mCaptureItemAreaList.get(index);
        captureItemArea.index = index;
        float left = mCaptureRect.left + colW * curCol;
        float top =  mCaptureRect.top + rowH * curRow;
        captureItemArea.rectF.set(left, top ,left + colW, top + rowH);
        if (curRow % 2 == 0) {
            if (curCol == hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getColumn()-1) {
                transUpdateCaptureItemArea(rowH, colW, curRow + 1, hyperAnalyticInfo.getSuperResImageInfo().getCaptureAreaInfo().getColumn()-1, index+1, hyperAnalyticInfo);
            } else {
                transUpdateCaptureItemArea(rowH, colW, curRow , curCol+1, index+1, hyperAnalyticInfo);
            }
        } else {
            if (curCol == 0) {
                transUpdateCaptureItemArea(rowH, colW, curRow + 1, 0, index + 1, hyperAnalyticInfo);
            } else {
                transUpdateCaptureItemArea(rowH, colW, curRow, curCol-1, index + 1, hyperAnalyticInfo);
            }
        }
    }

    /**
     * 获取点击超解析zoom照片的区域index，index是类似蛇形的顺序，下面是一个3x3的超解析区域的index位置
     * |0,1,2|
     * |5,4,3|
     * |6,7,8|
     * @param touchX
     * @param touchY
     * @return
     */
    private CaptureItemArea getClickCaptureAreaIndex(float touchX, float touchY) {
        for (CaptureItemArea captureItemArea : mCaptureItemAreaList) {
            if (captureItemArea.rectF.contains(touchX, touchY)) {
                return captureItemArea;
            }
        }
        return null;
    }

    /**
     * 超解析每个小区域的位置信息
     */
    public static class CaptureItemArea {
        public int index = -1;
        public RectF rectF = new RectF();
        public boolean imageMissed = false;
        public boolean imageNoCaptured = false;

        @Override
        public String toString() {
            return "CaptureItemArea{" +
                    "index=" + index +
                    ", rectF=" + rectF +
                    ", imageMissed=" + imageMissed +
                    ", imageNoCaptured=" + imageNoCaptured +
                    '}';
        }
    }


    public interface OnClickCaptureItemAreaListener {
        void onClickCaptureItemArea(CaptureItemArea captureItemArea);
    }

    public interface OnPreviewImageLoadListener {
        void onSuccess();
        void onFailure(String error);
    }

}
