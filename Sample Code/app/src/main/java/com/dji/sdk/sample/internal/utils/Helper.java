package com.dji.sdk.sample.internal.utils;

import android.app.Activity;
import android.widget.TextView;
import android.widget.Toast;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Helper {
	
	public Helper() {
		
	}
	
	/**
	 * Shows message on current activity.
	 * 
	 * @param activity The activity the user want to show toast.
	 * @param msg The String that the user want to put in the message.
	 */
	public static void showToast(final Activity activity, final String msg) {
		activity.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
            }
        });
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
	public ArrayList<String> makeList(Object[] o) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < o.length; i++) {
            list.add(o[i].toString());
        }
        return list;
    }
    public ArrayList<String> makeList(int[] o) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < o.length; i++) {
            list.add(Integer.valueOf(o[i]).toString());
        }
        return list;
    }

    public ArrayList<String> makeList(List o) {
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
        return getBytes(data, "GBK");
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

    public static String timeStamp2Date(String format) {

        if (format == null || format.isEmpty()) {
            format = "yyyy-MM-dd-HH-mm-ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        long time = System.currentTimeMillis();
        return sdf.format(new Date(time));
    }

}
