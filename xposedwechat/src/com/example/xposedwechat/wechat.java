package com.example.xposedwechat;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class wechat implements IXposedHookLoadPackage {
	

    public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {

        if (!lpparam.packageName.equals("com.tencent.mm"))
            return;
        XposedBridge.log("Loaded app: " + lpparam.packageName);
        try {
            XposedHelpers.findAndHookMethod("com.tencent.mm.sdk.platformtools.bb", lpparam.classLoader, "pu", Integer.TYPE, new XC_MethodHook() {  
                        @Override  
                        protected void beforeHookedMethod(MethodHookParam param) {  
                            int gameType = ((Integer) param.args[0]).intValue();  
                            XposedBridge.log("gameType: " + gameType);
                            switch (gameType) {  
                            	case 2:
                            		param.setResult(0);
                            		return;
                            	case 5:  
                                    param.setResult(5);
                                    return;
                                default: 
                                	return;
                            }  
                        }  
                    });  
          
        } catch (Throwable t) {
            throw t;
        }
    }
}
