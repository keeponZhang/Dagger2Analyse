package com.demo.lizejun.dagger2sample.scope.test4;

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
