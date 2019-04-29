package com.demo.lizejun.dagger2sample.chapter4_1;


import dagger.Component;

@Component( modules = {ScopeActivityModule1.class})
//如果在Module的provideXXX方法上加上了@Scope声明，那么在与他关联的Component上也必须加上相同的@Scope声明
@PerScopeActivity1
public interface ScopeActivityComponent1 {
     void inject(ScopeActivity1 scopeActivity);
}
