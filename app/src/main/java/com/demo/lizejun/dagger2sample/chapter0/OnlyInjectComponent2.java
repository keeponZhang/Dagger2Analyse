package com.demo.lizejun.dagger2sample.chapter0;

import android.app.Activity;

import dagger.Component;

@Component()  //Component无内容，DataRepository_MembersInjector类的create(Provider<LocalSource02> mLocalSourceProvider)方法只有一个参数
public interface OnlyInjectComponent2 {
     //
     void inject(Activity activity);
}
