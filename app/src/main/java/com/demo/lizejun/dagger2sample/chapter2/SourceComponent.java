package com.demo.lizejun.dagger2sample.chapter2;

import dagger.Component;

@Component(modules = SourceModule.class)
public interface SourceComponent {
     void inject(DataRepository dataRepository);
}
