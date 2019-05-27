package com.demo.lizejun.dagger2sample.chapter0_2;

import dagger.Component;

@Component(modules = OnlyInjectYouCanModule2.class)
public interface OnlyInjectYouCanComponent2 {
     void inject(OnlyInjectYoucan2Activity activity);
}
