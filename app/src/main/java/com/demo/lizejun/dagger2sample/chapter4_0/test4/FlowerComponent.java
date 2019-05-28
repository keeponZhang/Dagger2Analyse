package com.demo.lizejun.dagger2sample.chapter4_0.test4;

import com.demo.lizejun.dagger2sample.chapter4_0.bean.Flower;

import dagger.Component;

/**
 * createBy	 keepon
 */
@Component(modules = FlowerModule.class)
public interface FlowerComponent {
	Flower getFlower();
}
