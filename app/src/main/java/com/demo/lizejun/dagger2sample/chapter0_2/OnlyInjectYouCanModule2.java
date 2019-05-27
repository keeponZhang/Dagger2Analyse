package com.demo.lizejun.dagger2sample.chapter0_2;

import dagger.Module;
import dagger.Provides;

/**
 * createBy	 keepon
 */
@Module
public class OnlyInjectYouCanModule2 {
	    @Provides  //module只配置了参数的话，实体bean的构造函数的@Inject不能去掉
	    public String provideString() {
	        return "chenmo";
	    }
}
