package com.demo.lizejun.dagger2sample.chapter4_0.test4;

import com.demo.lizejun.dagger2sample.chapter4_0.bean.Flower;

import dagger.Module;
import dagger.Provides;

/**
 * createBy	 keepon
 */
@Module
public class FlowerModule {
	@Provides
	Flower provideFlower() {
		return new Flower("香的Flower");
	}
}
