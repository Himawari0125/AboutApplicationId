package com.example.slee.aboutapplicationid;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

/**
 * Created by S.Lee on 2017/9/19 0019.
 */

public class MyApplication extends Application {
    public static String TAG;
    public static String packageName;

    @Override
    public void onCreate() {
        super.onCreate();
        TAG = getClass().getSimpleName()+"_";
        packageName = getPackageName();
        Log.i(TAG,packageName);
        ComponentNameUtils componentNameUtils = new ComponentNameUtils(getBaseContext());
        switch (packageName){
            case "com.chronocloud.chestnut":
                componentNameUtils.setComponentName(ComponentNameUtils.FREECON);
                //startActivity(new Intent().addCategory(Intent.CATEGORY_LAUNCHER));
                break;
            case "com.chronocloud.test":
                componentNameUtils.setComponentName(ComponentNameUtils.THIRDCON);
              //  startActivity(new Intent().addCategory(Intent.CATEGORY_LAUNCHER));
                break;
            case "com.chronocloud.bodyscale":
                componentNameUtils.setComponentName(ComponentNameUtils.PROCON);
               // startActivity(new Intent().addCategory(Intent.CATEGORY_LAUNCHER));
                break;
            default:
                componentNameUtils.setComponentName(ComponentNameUtils.DEFCON);
                break;
        }



    }
}
