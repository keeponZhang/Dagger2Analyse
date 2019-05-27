package com.demo.lizejun.dagger2sample.chapter3;



import dagger.Component;

@Component(modules = DependencyModule0.class)
public interface DependencyComponent0 {
//    和前面不同，我们不在它里面声明一个inject接口，而是声明了一个getDependencySource接口，
//    返回值为DependencySource，表示可以给被它依赖的Component提供DependencySource这种类型的实例
    DependencySource0 getDependencySource();
}


//DependencyComponent0不持有DependencyComponentActivity_MembersInjector，也没有inject方法，有getDependencySource方法
//因为有moudle,会实例化moudle和创建moudle方法生成的factory类的实例
// this.provideDependencySourceProvider =
//         DependencyModule0_ProvideDependencySourceFactory.create(builder.dependencyModule0);