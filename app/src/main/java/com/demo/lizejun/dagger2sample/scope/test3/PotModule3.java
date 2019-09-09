package com.demo.lizejun.dagger2sample.scope.test3;

import com.demo.lizejun.dagger2sample.scope.bean.Pot;
import com.demo.lizejun.dagger2sample.scope.bean.Rose;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule3 {

    @Provides
    @MyActivityScope3
    Pot providePot() {
        return new Pot("keepon3");
    }
    @Provides
    Rose provideRose() {
        return new Rose("keeponRose");
    }
}