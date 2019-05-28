package com.demo.lizejun.dagger2sample.chapter4_2.my;

import dagger.Module;
import dagger.Provides;

@Module
public class MyDataModule {


    @Provides
    //module 的scope注解要与他的component的scope注解一致，所以如果其component是singleton,这里用PerScopeData会报错
//    @PerScopeData
//    @PerScopeData
//    @Singleton
    public MyData provideMyData() {
        return new MyData("module");
    }


}


