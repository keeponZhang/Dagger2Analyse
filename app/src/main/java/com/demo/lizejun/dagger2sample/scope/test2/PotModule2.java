package com.demo.lizejun.dagger2sample.scope.test2;

import com.demo.lizejun.dagger2sample.scope.bean.Flower;
import com.demo.lizejun.dagger2sample.scope.bean.Pot;

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