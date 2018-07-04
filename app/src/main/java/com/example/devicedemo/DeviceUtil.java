package com.example.devicedemo;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;

/**
 * @author zuoguozhen
 * @date 2018/5/17
 */
public class DeviceUtil {
    /**
     * @return IMEI
     */
    public static String getDeviceId() {
        TelephonyManager telephonyManager = (TelephonyManager) AppApplication.getInstance().getSystemService(Context.TELEPHONY_SERVICE);
        return telephonyManager.getDeviceId();
    }

    /**
     * @return DPI
     */
    public static String getDisplayMetrics(){
        DisplayMetrics displayMetrics = AppApplication.getInstance().getResources().getDisplayMetrics();
        return displayMetrics.toString();
    }

}
