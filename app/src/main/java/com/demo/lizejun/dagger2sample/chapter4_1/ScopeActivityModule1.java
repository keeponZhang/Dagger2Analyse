package com.demo.lizejun.dagger2sample.chapter4_1;

import dagger.Module;
import dagger.Provides;

@Module
public class ScopeActivityModule1 {

    @Provides
//    如果Component加上了@Scope声明，provideXXX不加，那么和Component不加声明的情况相同。
//    只有当Module的provideXXX方法和Component都加上了@Scope声明，
    // 那么在Component实例的生命周期内，只会创建一个由provideXXX方法返回的实例。
    // 也就是说，该Component会持有之前通过provideXXX方法创建的实例的引用，如果之前创建过，那么就不再调用Module的provideXXX去创建新的实例，而是直接返回它之前持有的那一份。
    @PerScopeActivity1
    public ScopeActivitySharedData1 provideScopeActivityData() {
        return new ScopeActivitySharedData1();
    }

    @Provides
    public ScopeActivityNormalData1 provideScopeActivityNormalData() {
        return new ScopeActivityNormalData1();
    }
}
