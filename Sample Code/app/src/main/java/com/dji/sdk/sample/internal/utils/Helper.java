package com.dji.sdk.sample.internal.utils;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;

import com.dji.sdk.sample.internal.view.HealthInformationView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import dji.common.product.Model;
import dji.sdk.sdkmanager.DJISDKManager;

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
            @Override
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

    public static boolean isMultiStreamPlatform() {
	    if (DJISDKManager.getInstance() == null){
	        return false;
        }
        Model model = DJISDKManager.getInstance().getProduct().getModel();
        return model != null && (model == Model.INSPIRE_2
                || model == Model.MATRICE_200
                || model == Model.MATRICE_210
                || model == Model.MATRICE_210_RTK
                || model == Model.MATRICE_200_V2
                || model == Model.MATRICE_210_V2
                || model == Model.MATRICE_210_RTK_V2
                || model == Model.MATRICE_300_RTK
                || model == Model.MATRICE_600
                || model == Model.MATRICE_600_PRO
                || model == Model.A3
                || model == Model.N3);
    }

    public static boolean isM300Product() {
        if (DJISDKManager.getInstance().getProduct() == null) {
            return false;
        }
        Model model = DJISDKManager.getInstance().getProduct().getModel();
        return model == Model.MATRICE_300_RTK;
    }

    private static List<HealthInformationView.HealthInfo> hmsJson;

    public static List<HealthInformationView.HealthInfo> getHmsInfo(Context context) {
        if (hmsJson == null) {
            synchronized (Helper.class) {
                if (hmsJson == null) {
                    // the newest json file , can find by github
                    hmsJson = getObjFromJsonFile(context, "hms.json", new TypeToken<List<HealthInformationView.HealthInfo>>() {
                    }.getType());
                }
            }
        }
        return hmsJson;
    }

    private static List<HealthInformationView.HealthInfoMatchSDKError> hmsMatchSDKError;

    public static List<HealthInformationView.HealthInfoMatchSDKError> getHmsMatchSDKError(Context context) {
        if (hmsMatchSDKError == null) {
            synchronized (Helper.class){
                if (hmsMatchSDKError == null) {
                    // the newest json file , can find by github
                    hmsMatchSDKError = getObjFromJsonFile(context, "hms_match_sdkerror.json", new TypeToken<List<HealthInformationView.HealthInfoMatchSDKError>>() {
                    }.getType());
                }
            }
        }
        return hmsMatchSDKError;
    }

    private static <T> T getObjFromJsonFile(Context context, String file, Type type) {
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = context.getAssets().open(file);
            out = new ByteArrayOutputStream();
            byte[] bytes = new byte[1024];
            int length;
            while ((length = in.read(bytes, 0, 1024)) > -1) {
                out.write(bytes, 0, length);
            }
            out.flush();
            String json = out.toString();
            Gson gson = new Gson();
            return gson.fromJson(json, type);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
