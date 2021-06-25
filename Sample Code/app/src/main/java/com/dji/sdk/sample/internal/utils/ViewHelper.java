package com.dji.sdk.sample.internal.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ViewHelper {
    private static final double M_PI = Math.PI;
	/**
	 * Shows message on current activity.
	 * 
	 * @param activity The activity the user want to show toast.
	 * @param msg The String that the user want to put in the message.
	 */
	public static void showToast(final Activity activity, final String msg) {
		showToast(activity.getApplicationContext(), msg);
    }

    private static Handler sMainThreadHandler;
    private static Handler getMainThreadHandler() {
        if (sMainThreadHandler == null) {
            synchronized (ViewHelper.class){
                if(sMainThreadHandler==null){
                    sMainThreadHandler = new Handler(Looper.getMainLooper());
                }
            }
        }
        return sMainThreadHandler;
    }

    /**
     * Shows message anywhere.
     * @param context context
     * @param msg The String that the user want to put in the message.
     */
    public static void showToast(final Context context, final String msg) {
        getMainThreadHandler().post(() -> Toast.makeText(context, msg, Toast.LENGTH_SHORT).show());
    }

    public static void showText(final Activity activity, final TextView tv, final String msg) {
        if(tv == null)
        {
            showToast(activity, "The current textView is null. ");
            return;
        }
        activity.runOnUiThread(new Runnable() {
            public void run() {
                tv.setText(msg);
            }
        });
    }
	
	/**
	 * Transfers to list from enum array.
	 * 
	 * @param o An object array
	 * @return An ArrayList object of String for enum.
	 */
	public static ArrayList<String> makeList(Object[] o) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < o.length; i++) {
            list.add(o[i].toString());
        }
        return list;
    }
    public static ArrayList<String> makeList(int[] o) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < o.length; i++) {
            list.add(Integer.valueOf(o[i]).toString());
        }
        return list;
    }

    public static ArrayList<String> makeList(long[] o) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < o.length; i++) {
            list.add(Long.valueOf(o[i]).toString());
        }
        return list;
    }

    public static ArrayList<String> makeList(List o) {
        ArrayList<String> list = new ArrayList<String>();
        Iterator iterator = o.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().toString());
        }
        return list;
    }
    public static String getString(byte[] bytes) {
        if (null == bytes) {
            return "";
        }
        // 去除NULL字符
        byte zero = 0x00;
        byte no = (byte)0xFF;
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i] == zero || bytes[i] == no) {
                bytes = readBytes(bytes, 0, i);
                break;
            }
        }
        return getString(bytes, "GBK");
    }
    
    private static String getString(byte[] bytes, String charsetName) {
        return new String(bytes, Charset.forName(charsetName));
    }

    public static byte[] readBytes(byte[] source, int from, int length) {
        byte[] result = new byte[length];
        System.arraycopy(source, from, result, 0, length);
        return result;
    }

    public static byte[] getBytes(String data) {
        return getBytes(data, "UTF-8");
    }

    private static byte[] getBytes(String data, String charsetName) {
        Charset charset = Charset.forName(charsetName);
        return data.getBytes(charset);
    }


    public static String getStringUTF8(byte[] bytes, int start, int length) {
        if (null == bytes || bytes.length == 0) {
            return "";
        }
        // 去除NULL字符
        byte zero = 0x00;
        for (int i = start; i < length && i < bytes.length; i++) {
            if (bytes[i] == zero) {
                length = i-start;
                break;
            }
        }
        return getString(bytes, start, length, "UTF-8");
    }
    private static String getString(byte[] bytes, int start, int length, String charsetName) {
        return new String(bytes, start, length, Charset.forName(charsetName));
    }

    public static String byte2hex(byte[] buffer) {
        String h = "";
        if (null == buffer) {
            return h;
        }
        for (int i = 0; i < buffer.length; i++) {
            String temp = Integer.toHexString(buffer[i] & 0xFF);
            if (temp.length() == 1) {
                temp = "0" + temp;
            }
            h = h + " " + temp;
        }
        return h;
    }

    public static byte[] getBytes(int data) {
        byte[] bytes = new byte[4];
        bytes[0] = (byte) (data & 0xff);
        bytes[1] = (byte) ((data & 0xff00) >> 8);
        bytes[2] = (byte) ((data & 0xff0000) >> 16);
        bytes[3] = (byte) ((data & 0xff000000) >> 24);
        return bytes;
    }

    public static short getInt(byte b) {
        return (short) (0xff & b);
    }



    public static void addView(View parent, int layoutId) {
        addView(parent, layoutId, parent.getContext());
    }

    public static void addView(View parent, int layoutId, Context context) {

        View v = LayoutInflater.from(context).inflate(layoutId, null);

        if(parent instanceof LinearLayout && v instanceof LinearLayout) {
            addView((LinearLayout)parent, (LinearLayout)v);
        } else {
            ((ViewGroup)parent).addView(v);
        }
    }

    public static void addView(LinearLayout parent, LinearLayout child) {
        ArrayList<View> views = new ArrayList<View>();
        ArrayList<LinearLayout.LayoutParams> params = new ArrayList<LinearLayout.LayoutParams>();
        int count = child.getChildCount();
        for(int i = 0; i < count; i++) {
            views.add(child.getChildAt(i));
            params.add((LinearLayout.LayoutParams)child.getChildAt(i).getLayoutParams());
        }

        child.removeAllViews();
        parent.setOrientation(child.getOrientation());

        //addGravity(parent, child);

        for(int i = 0; i < count; i++) {
            parent.addView(views.get(i), params.get(i));
        }
    }
    public static double distance(double latA, double lngA, double latB, double lngB) {
        double earthR = 6371000;
        double x = Math.cos(latA*M_PI/180) * Math.cos(latB*M_PI/180) * Math.cos((lngA-lngB)*M_PI/180);
        double y = Math.sin(latA*M_PI/180) * Math.sin(latB*M_PI/180);
        double s = x + y;
        if (s > 1) {
            s = 1;
        }
        if (s < -1) {
            s = -1;
        }
        double alpha = Math.acos(s);
        double distance = alpha * earthR;
        return distance;
    }

}
