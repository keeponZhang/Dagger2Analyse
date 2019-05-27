package com.demo.lizejun.dagger2sample.chapter0;

import dagger.Component;

@Component()//Component的module为空，生成的Component的builder不会实例化module
public interface OnlyInjectComponent {
     //这里参数类型为OnlyInjectActivity，生成的component会去找OnlyInjectActivity类生成的MembersInjector
     void inject(OnlyInjectActivity activity);
}
