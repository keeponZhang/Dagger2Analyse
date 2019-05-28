package com.demo.lizejun.dagger2sample.chapter4_0.test4;

import dagger.Module;
import dagger.Provides;

/**
 * createBy	 keepon
 */
@Module
public class ComplexModule {

	private String mName;

	ComplexModule(String name){

		mName = name;
	}
	@Provides
	public String provideHumanName() {
		return mName;
	}
}
