package com.demo.lizejun.dagger2sample.chapter4_0.test2;

import dagger.Component;

/**
 * createBy	 keepon
 */
//MyScope2Component (unscoped) cannot depend on scoped components
//dagger2规定如果被依赖的component使用了scope,依赖Component也必须标注@Scope
//	 This @Singleton component cannot depend on scoped components
//@Singleton//(这也会报错)，我们不能给MainActivityComponent也标注@Singleton，并且dagger2也不允许。因为单例依赖单例是不符合设计原则的，我们需要自定义一个@Scope注解。
@MyActivityScope2
@Component(dependencies = DenpencyPotComponent2.class)
public interface MyScope2_1Component {
	void inject(MyScopeActivity2_1 activity);
}
//在依赖关系中，被依赖的Component和需要依赖的Component的@Scope不能相同,如果PotComponent2的scope为MyActivityScope2，会报错
//在依赖关系中，需要依赖的Component的@Scope不可以为@Singleton。