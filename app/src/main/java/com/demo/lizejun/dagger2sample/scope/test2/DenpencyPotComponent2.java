package com.demo.lizejun.dagger2sample.scope.test2;

import com.demo.lizejun.dagger2sample.scope.bean.Pot;

import javax.inject.Singleton;

import dagger.Component;

 @Singleton
@Component(modules = PotModule2.class)
public interface DenpencyPotComponent2 {
 	//依赖的component获取实例只能通过被依赖component暴露获取实例的方法来获取
	Pot getPot();
	//如果被依赖的component没有暴露获取某种实例，依赖的component使用@inject注入会报错。
//	Flower getFlower();
}