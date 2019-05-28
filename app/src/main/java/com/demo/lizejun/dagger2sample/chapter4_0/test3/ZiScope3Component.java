package com.demo.lizejun.dagger2sample.chapter4_0.test3;

import dagger.Subcomponent;

/**
 * createBy	 keepon
 */
//经验证，可不加
//@Singleton//如果父component时singlton加了反而报错，在组织关系中，如果父Component的@Scope不为@Singleton，那么子Component的@Scope才可以为@Singleton。
//@MyActivityScope3  //会报错，在组织关系中，子Component的@Scope不可以和父Component的@Scope相同
@Subcomponent
public interface ZiScope3Component {
	void inject(MyScopeActivity3 activity);
}

//在组织关系中，子Component的@Scope不可以和父Component的@Scope相同
//在组织关系中，如果父Component的@Scope不为@Singleton，那么子Component的@Scope可以为@Singleton。
