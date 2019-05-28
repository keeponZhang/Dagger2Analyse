package com.demo.lizejun.dagger2sample.chapter4_0.test0;

import com.demo.lizejun.dagger2sample.chapter4_0.bean.Pot;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PotModule0 {

    @Provides
    @Singleton
    Pot providePot() {
        return new Pot("keepon0");
    }
}

//    public void injectMembers(MyScopeActivity0 instance) {
//        if (instance == null) {
//            throw new NullPointerException("Cannot inject members into a null reference");
//        }
//        instance.pot = potAndPot2Provider.get();
//        instance.pot2 = potAndPot2Provider.get();
//    }