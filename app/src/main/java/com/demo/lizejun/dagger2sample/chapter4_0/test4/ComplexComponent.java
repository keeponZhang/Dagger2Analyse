package com.demo.lizejun.dagger2sample.chapter4_0.test4;

import dagger.Component;

/**
 * createBy	 keepon
 */
@Component(dependencies = FlowerComponent.class,modules = ComplexModule.class)
public interface ComplexComponent {
	void inject(ComplextActivity complextActivity);
}
