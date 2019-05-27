package com.demo.lizejun.dagger2sample.chapter3_1;

import dagger.Module;
import dagger.Provides;

@Module
public class SourceModule {

    @Provides
    LocalSource provideLocalSource() {
        return new LocalSource();
    }
}
