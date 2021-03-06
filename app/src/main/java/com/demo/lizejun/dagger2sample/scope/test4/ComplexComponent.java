package com.demo.lizejun.dagger2sample.scope.test4;

import dagger.Component;

/**
 * createBy	 keepon
 */
//DaggerComplexComponent  Builder会提供flowerComponent,complexModule方法
@Component(dependencies = FlowerComponent.class,modules = ComplexModule.class)
public interface ComplexComponent {
	void inject(ComplextActivity complextActivity);
}
