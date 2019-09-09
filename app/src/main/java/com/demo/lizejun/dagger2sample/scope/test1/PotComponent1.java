package com.demo.lizejun.dagger2sample.scope.test1;

import javax.inject.Singleton;

import dagger.Component;

@Singleton //如果Component加上了@Scope声明，module的provide没加（此时并不会报错），那么和Component不加声明的情况相同。
@Component(modules = PotModule1.class)
public interface PotComponent1 {
	void inject(MyScopeActivity1 scopeActivity0);
}