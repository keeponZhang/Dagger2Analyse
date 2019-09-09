package com.demo.lizejun.dagger2sample.scope.test4;

import com.demo.lizejun.dagger2sample.scope.bean.Flower;

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
