package com.dji.sdk.sample.common;

import android.app.Service;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dji.sdk.sample.R;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import de.greenrobot.event.EventBus;

/**
 * Created by dji on 15/12/18.
 */
public class ListViewItem extends LinearLayout implements View.OnClickListener {

    public static final String TAG = ListViewItem.class.getName();

    private static String PACKAGE_PREFIX = "com.dji.sdk.sample.";
    private final static String DOT = ".";

    protected int mTitleId = -1;
    protected int mChildrenLayoutId = -1;
    protected int mComponentNameId = -1;
    protected int mViewNameId = -1;

    protected String mComponentNameString = "";
    protected String mViewNameString = "";

    private boolean isBasicFunctionListItem = false;

    private TextView mTitleView;

    public ListViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.set);
        mTitleId = a.getResourceId(R.styleable.set_list_item_name, 0);
        mChildrenLayoutId = a.getResourceId(R.styleable.set_sub_Layout, 0);

        if (a.hasValue(R.styleable.set_view_name)) {
            mComponentNameId = a.getResourceId(R.styleable.set_component_name, 0);
            mViewNameId = a.getResourceId(R.styleable.set_view_name, 0);
            isBasicFunctionListItem = true;

            Log.v(TAG, "init");

            mViewNameString = getContext().getString(mViewNameId);
            mComponentNameString = getContext().getString(mComponentNameId);
        }

        a.recycle();

        setOnClickListener(this);

        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Service.LAYOUT_INFLATER_SERVICE);

        View content = layoutInflater.inflate(R.layout.list_item, null, false);
        addView(content);

    }

    @Override
    public void onClick(View v) {
        if (Utils.isFastDoubleClick()) return;
        if (!isBasicFunctionListItem) {
            EventBus.getDefault().post(new SetViewWrapper(mChildrenLayoutId, mTitleId, getContext()));
        } else {
            try {
                EventBus.getDefault().post(new SetViewWrapper(getView(), mTitleId));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

    }

    protected void onFinishInflate() {
        super.onFinishInflate();

        mTitleView = (TextView) findViewById(R.id.set_item_title);
        mTitleView.setText(mTitleId);
    }

    private View getView() throws ClassNotFoundException, NoSuchMethodException,
                IllegalAccessException, InvocationTargetException, InstantiationException {

        Object instance = null;
        Object[] params = new Object[2];
        params[0] = getContext();
        params[1] = null;

        Class classType = Class.forName(PACKAGE_PREFIX + mComponentNameString + DOT + mViewNameString);
        Log.v("TAG", PACKAGE_PREFIX + mComponentNameString + DOT + mViewNameString);
        Constructor<?>[] consts = classType.getConstructors();
        Constructor<?> constructor = null;
        for(int i = 0; i < consts.length; i++) {
            int paramsLength = consts[i].getParameterAnnotations().length;
            if(paramsLength == 2) {
                constructor = consts[i];
                break;
            }
        }

        if(constructor != null) {
            Class<?>[] type = constructor.getParameterTypes();
            instance = classType.getConstructor(type).newInstance(params);
        }
        return (View)instance;
    }
}
