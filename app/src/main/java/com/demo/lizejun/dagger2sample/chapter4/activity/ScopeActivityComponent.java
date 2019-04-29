package com.demo.lizejun.dagger2sample.chapter4.activity;


import com.demo.lizejun.dagger2sample.chapter4.app.ScopeAppComponent;
import com.demo.lizejun.dagger2sample.chapter4.fragment.ScopeFragmentComponent;
import com.demo.lizejun.dagger2sample.chapter4.my.MyRepositoryComponent;

import dagger.Component;

@Component(dependencies = {ScopeAppComponent.class}, modules = {ScopeActivityModule.class})
@PerScopeActivity
//在依赖关系中，需要依赖的(有dependencies)Component的@Scope不可以为@Singleton。
//@Singleton
public interface ScopeActivityComponent {
     void inject(ScopeActivity scopeActivity);
    ScopeFragmentComponent scopeFragmentComponent();
    MyRepositoryComponent scopeMyRepositoryComponent();
}
