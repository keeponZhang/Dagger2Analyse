package com.demo.lizejun.dagger2sample.chapter4.activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ScopeActivityModule {

    @Provides //查看chapter4_1
    @PerScopeActivity
    public ScopeActivitySharedData provideScopeActivityData() {
        //加了注解后，即使是new处理，也会保持唯一
        return new ScopeActivitySharedData();
    }

    @Provides
    public ScopeActivityNormalData provideScopeActivityNormalData() {
        return new ScopeActivityNormalData();
    }
}
