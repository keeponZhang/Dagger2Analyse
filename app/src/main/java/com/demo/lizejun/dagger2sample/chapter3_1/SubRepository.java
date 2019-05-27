package com.demo.lizejun.dagger2sample.chapter3_1;


import javax.inject.Inject;

public class SubRepository {

    @Inject
    LocalSource mLocalSource;

    public SubRepository() {
        //1.实例化所依赖的Component。
        DependencyComponent dependencyComponent = DaggerDependencyComponent.create();
        //2.在构建时传入依赖的Component实例。
        SourceComponent sourceComponent = DaggerSourceComponent.builder().dependencyComponent(dependencyComponent).build();
        //3.获取SubComponent。（一般来说，component实现类是单独生成的，而这个SubSourceComponent则是通过sourceComponent获得的，
        // 其类生成也在DaggerSourceComponent类中）
        SubSourceComponent subSourceComponent = sourceComponent.getSubSourceComponent();
        //4.完成依赖注入。
        subSourceComponent.inject(this);
    }

    public String getLocalData() {
        return mLocalSource.getLocalData();
    }

}
