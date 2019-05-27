package com.demo.lizejun.dagger2sample.chapter3_1.other;


import com.demo.lizejun.dagger2sample.chapter3_1.FuComponentActivity;
import com.demo.lizejun.dagger2sample.chapter3_1.FuModule;

import dagger.Component;

@Component( modules = FuModule.class)
public interface FuComponent1 {
    //父类注入的对象是FuComponentActivity
     void inject(FuComponentActivity activity);
     SubComponent1 getSubSourceComponent1();
}
