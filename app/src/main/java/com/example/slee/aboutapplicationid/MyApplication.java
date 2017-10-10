package com.example.slee.aboutapplicationid;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import java.util.Calendar;
import java.util.Date;

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



        Calendar calendar = Calendar.getInstance();
        int miniut = calendar.get(Calendar.MINUTE);
        ComponentNameUtils componentNameUtils = new ComponentNameUtils(getBaseContext());
        if(miniut < 15){
            Log.i("Time:"+miniut+":"+calendar.get(Calendar.SECOND),"<15");
            componentNameUtils.setComponentName(ComponentNameUtils.FREECON);
        }else if(miniut < 30){
            Log.i("Time:"+miniut+":"+calendar.get(Calendar.SECOND),"<30");
            componentNameUtils.setComponentName(ComponentNameUtils.THIRDCON);
        }else if(miniut < 45){
            Log.i("Time:"+miniut+":"+calendar.get(Calendar.SECOND),"<45");
            componentNameUtils.setComponentName(ComponentNameUtils.PROCON);
        }else{
            Log.i("Time:"+miniut+":"+calendar.get(Calendar.SECOND),"else");
            componentNameUtils.setComponentName(ComponentNameUtils.DEFCON);
        }
    }
}
