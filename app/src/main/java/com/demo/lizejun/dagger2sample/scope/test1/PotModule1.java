package com.demo.lizejun.dagger2sample.scope.test1;

import com.demo.lizejun.dagger2sample.scope.bean.Pot;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule1 {

    @Provides
    Pot providePot() {
        return new Pot("keepon1");
    }
}