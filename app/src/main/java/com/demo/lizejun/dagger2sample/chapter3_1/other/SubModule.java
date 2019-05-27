package com.demo.lizejun.dagger2sample.chapter3_1.other;

import dagger.Module;
import dagger.Provides;

@Module
public class SubModule {
    @Provides
    SubSource provideSubSource() {
        return new SubSource();
    }
}
