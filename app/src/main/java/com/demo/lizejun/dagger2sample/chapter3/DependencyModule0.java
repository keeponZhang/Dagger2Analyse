package com.demo.lizejun.dagger2sample.chapter3;

import dagger.Module;
import dagger.Provides;

@Module
public class DependencyModule0 {

    @Provides
    DependencySource0 provideDependencySource() {
        return new DependencySource0();
    }
    @Provides
    String provideString() {
        return "providerString";
    }
}
