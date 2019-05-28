package com.demo.lizejun.dagger2sample.chapter4_0.test0;

import com.demo.lizejun.dagger2sample.chapter4_0.bean.Pot;

import javax.inject.Singleton;

import dagger.Component;

@Singleton //如果在Module的provideXXX方法上加上了@Scope声明，那么在与他关联的Component上也必须加上相同的@Scope声明
@Component(modules = PotModule0.class)
public interface PotComponent0 {
	void inject(MyScopeActivity0 scopeActivity0);
	Pot getPot();
}

//当Module的provideXXX方法和Component都加上了@Scope声明，那么在Component实例的生命周期内，
//只会创建一个由provideXXX方法返回的实例。也就是说，该Component会持有之前通过provideXXX方法创建的实例的引用，
//如果之前创建过，那么就不再调用Module的provideXXX去创建新的实例，而是直接返回它之前持有的那一份。
