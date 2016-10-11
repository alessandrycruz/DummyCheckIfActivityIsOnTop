package com.alobot.dummycheckifactivityisontop;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

public class Utilities {
    /**
     * Checks if an Activity is on the Top of the Application
     *
     * @param context
     * @param className
     * @return boolean
     */
    public static boolean isActivityOnTop(Context context, Class<?> className) {
        boolean onTop = false;
        String activityName;

        if (context != null) {
            activityName = className.getName();

            ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
            List<ActivityManager.RunningTaskInfo> taskInfo = activityManager.getRunningTasks(1);

            for (ActivityManager.RunningTaskInfo object : taskInfo) {
                if (object.topActivity.getClassName().equals(activityName)) {
                    onTop = true;

                    break;
                }
            }
        }

        return onTop;
    }
}
