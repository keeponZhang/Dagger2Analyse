package com.demo.lizejun.dagger2sample.chapter3.other;

import dagger.Module;
import dagger.Provides;

@Module
public class DependencyModule1 {

    @Provides
    DependencySource1 provideDependencySource() {
        return new DependencySource1();
    }
}
