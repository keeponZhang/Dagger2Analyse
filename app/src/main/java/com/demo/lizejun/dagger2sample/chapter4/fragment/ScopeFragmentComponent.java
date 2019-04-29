package com.demo.lizejun.dagger2sample.chapter4.fragment;


import dagger.Subcomponent;

@Subcomponent(modules = {ScopeFragmentModule.class})
@PerScopeFragment
//在组织关系中，如果父Component的@Scope不为@Singleton，那么子Component的@Scope可以为@Singleton,但是这里不行
//在依赖关系中，需要依赖的Component的@Scope不可以为@Singleton
//@Singleton
//在组织关系中，子Component的@Scope不可以和父Component的@Scope相同：
//@PerScopeActivity
public interface ScopeFragmentComponent {
    public void inject(ScopeFragment scopeFragment);
}
