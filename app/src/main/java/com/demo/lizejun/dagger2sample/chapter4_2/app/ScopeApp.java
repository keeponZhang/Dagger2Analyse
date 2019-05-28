package com.demo.lizejun.dagger2sample.chapter4_2.app;


import android.app.Application;
import android.util.Log;

public class ScopeApp extends Application {


    private ScopeAppComponent mScopeAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //AppComponent必须率先初始化
        mScopeAppComponent = DaggerScopeAppComponent.builder().scopeAppModule(new ScopeAppModule()).build();
        Log.e("TAG", "ScopeApp onCreate:"+mScopeAppComponent.getScopeAppData());
    }

    //需要依赖AppComponent的通过application来拿
    public ScopeAppComponent getAppComponent() {
        return mScopeAppComponent;
    }
}
