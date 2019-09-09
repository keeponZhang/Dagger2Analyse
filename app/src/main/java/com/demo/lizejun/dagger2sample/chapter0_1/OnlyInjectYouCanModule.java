package com.demo.lizejun.dagger2sample.chapter0_1;

import dagger.Module;
import dagger.Provides;

/**
 * createBy	 keepon
 */
@Module
public class OnlyInjectYouCanModule {
	//module每一个对应的方法都会生成一个factory（前面带module前缀），调用factory的create实例化需要传入module
	    @Provides  ////module提供实例化方法,实体bean的构造函数的@Inject可以去掉
	    public LocalSource01 providelocalYouCan() {
	        return new LocalSource01("keepon");
	    }

	@Provides
	public String provideTest() {
		return "test";
	}
}
