package com.demo.lizejun.dagger2sample.chapter4_0.test1;

import com.demo.lizejun.dagger2sample.chapter4_0.bean.Pot;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule1 {

    @Provides
    Pot providePot() {
        return new Pot("keepon1");
    }
}