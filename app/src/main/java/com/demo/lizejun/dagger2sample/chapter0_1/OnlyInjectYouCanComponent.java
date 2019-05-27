package com.demo.lizejun.dagger2sample.chapter0_1;

import dagger.Component;

@Component(modules = OnlyInjectYouCanModule.class)//Component的module不为空，生成的Component的builder的build方法创建Component时会首先判断module是否为空，否则会创建module
public interface OnlyInjectYouCanComponent {
     void inject(OnlyInjectYoucanActivity activity);
}
