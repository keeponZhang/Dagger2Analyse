package com.demo.lizejun.dagger2sample.chapter3_1;

import dagger.Module;
import dagger.Provides;

@Module
public class FuModule {

    @Provides
    FuSource provideFuSource() {
        return new FuSource();
    }
}
