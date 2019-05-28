package com.demo.lizejun.dagger2sample.chapter4_2.app;

import javax.inject.Singleton;

import dagger.Component;

//每个进程只有一个实例。
//在依赖或者继承的组织方式中，如果其中一个Component声明了@Scope，那么其它的Component也需要声明

//@PerScopeActivity
//在依赖关系中，被依赖的Component和需要依赖的Component的@Scope不能相同
@Singleton //这个component没有dependencies,可以用Singleton
@Component(modules = {ScopeAppModule.class})
public interface ScopeAppComponent {
    public ScopeAppData getScopeAppData(); //如果它被其它的Component依赖，那么需要声明getXXX方法。
}
