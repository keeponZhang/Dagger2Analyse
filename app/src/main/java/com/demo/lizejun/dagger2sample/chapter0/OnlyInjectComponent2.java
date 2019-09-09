package com.demo.lizejun.dagger2sample.chapter0;

import android.app.Activity;

import dagger.Component;

@Component()
public interface OnlyInjectComponent2 {
     //不会生成MembersInjector
     void inject(Activity activity);
}
