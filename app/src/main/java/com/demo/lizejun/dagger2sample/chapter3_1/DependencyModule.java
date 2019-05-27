package com.demo.lizejun.dagger2sample.chapter3_1;

import dagger.Module;
import dagger.Provides;

@Module
public class DependencyModule {

    @Provides
    DependencySource provideDependencySource() {
        return new DependencySource();
    }
}
