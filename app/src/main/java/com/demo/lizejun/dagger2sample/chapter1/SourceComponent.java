package com.demo.lizejun.dagger2sample.chapter1;

import dagger.Component;

@Component(modules = {RemoteSourceModule.class})
//@Component()  //Component无内容，DataRepository_MembersInjector类的create(Provider<LocalSource> mLocalSourceProvider)方法只有一个参数
//@Component(modules = {StringModule.class})  //实例化在类中加Inject，有参数的话，也要moudle;module只配置了参数的话，实体bean的构造函数的	@Inject不能去掉
public interface SourceComponent {
    public void inject(DataRepository dataRepository);
}
