package com.demo.lizejun.dagger2sample.chapter4_2.my;


import dagger.Subcomponent;

//在组织关系中，如果父Component的@Scope不为@Singleton，那么子Component的@Scope可以为@Singleton,但是这里不行
//@Singleton跟@Inject不能配合使用，不会实现单例，因为@Scope不能加载@Inject上面，如果通过module
//@PerScopeData
//@Singleton
@Subcomponent(modules = MyDataModule.class)
public interface MyRepositoryComponent {
    public void inject(MyRepository myRepository);
}
