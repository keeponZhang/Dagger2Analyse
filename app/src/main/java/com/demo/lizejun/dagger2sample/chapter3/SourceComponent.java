package com.demo.lizejun.dagger2sample.chapter3;


import dagger.Component;

//SourceComponent依赖 DependencyComponent
@Component(dependencies = DependencyComponent.class, modules = SourceModule.class)
//@Component(dependencies = DependencyComponent.class)
public interface SourceComponent {
    //父类注入的对象是DataRepository
    public void inject(DataRepository dataRepository);

    SubSourceComponent getSubSourceComponent();
}
