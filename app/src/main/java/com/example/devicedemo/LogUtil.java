package com.example.devicedemo;

import android.util.Log;

/**
 * @author zuoguozhen
 * @date 2018/7/2
 */
class LogUtil {
    private static final boolean IS_PRINT_LOG = false;

    public static void e(String tag, String msg) {
        if (IS_PRINT_LOG) {
            Log.e(tag, msg);
        }
    }
}
