package com.demo.lizejun.dagger2sample.chapter3_1;


import dagger.Component;

//SourceComponent依赖 DependencyComponent0
@Component(dependencies = DependencyComponent.class, modules = SourceModule.class)
//@Component(dependencies = DependencyComponent0.class)
public interface SourceComponent {
    //父类注入的对象是DataRepository
     void inject(DataRepository dataRepository);

    SubSourceComponent getSubSourceComponent();
}
