package com.example.slee.aboutapplicationid;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by S.Lee on 2017/9/20 0020.
 */

public class ComponentNameUtils {
    private ComponentName defCon,proCon,freeCon,thirdCon;
    public static final int DEFCON = 1001,PROCON = 1002,FREECON = 1003,THIRDCON = 1004;
    private PackageManager packageManager;

    public ComponentNameUtils(Context mContext){
        defCon = new ComponentName(mContext,"com.example.slee.aboutapplicationid.MainActivity");
        proCon = new ComponentName(mContext,"com.example.slee.aboutapplicationid.pro");
        freeCon = new ComponentName(mContext,"com.example.slee.aboutapplicationid.free");
        thirdCon = new ComponentName(mContext,"com.example.slee.aboutapplicationid.third");
        packageManager = mContext.getApplicationContext().getPackageManager();
    }

    public void setComponentName(int mCon){
        switch(mCon){
            case DEFCON:
                enableComponent(defCon);
                disableComponent(freeCon);
                disableComponent(thirdCon);
                disableComponent(proCon);
                break;
            case PROCON:
                enableComponent(proCon);
                disableComponent(freeCon);
                disableComponent(thirdCon);
                disableComponent(defCon);
                break;
            case FREECON:
                enableComponent(freeCon);
                disableComponent(thirdCon);
                disableComponent(proCon);
                disableComponent(defCon);
                break;
            case THIRDCON:
                enableComponent(thirdCon);
                disableComponent(proCon);
                disableComponent(freeCon);
                disableComponent(defCon);
                break;
        }
    }

    private void disableComponent(ComponentName componentName){
        packageManager.setComponentEnabledSetting(componentName,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);


    }

    private void enableComponent(ComponentName componentName){
        packageManager.setComponentEnabledSetting(componentName,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                PackageManager.DONT_KILL_APP);
    }

}
