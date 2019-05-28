package com.demo.lizejun.dagger2sample.chapter4_0.test2;

import com.demo.lizejun.dagger2sample.chapter4_0.bean.Flower;
import com.demo.lizejun.dagger2sample.chapter4_0.bean.Pot;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule2 {

    @Provides
    @Singleton
    Pot providePot() {
        return new Pot("keepon2");
    }

    @Provides
    Flower provideFlower() {
        return new Flower("keeponFlower");
    }
}