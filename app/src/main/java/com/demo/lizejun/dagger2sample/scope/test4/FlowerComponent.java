package com.demo.lizejun.dagger2sample.scope.test4;

import com.demo.lizejun.dagger2sample.scope.bean.Flower;

import dagger.Component;

/**
 * createBy	 keepon
 */
@Component(modules = FlowerModule.class)
public interface FlowerComponent {
	Flower getFlower();
}
