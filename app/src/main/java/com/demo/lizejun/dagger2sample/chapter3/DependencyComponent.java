package com.demo.lizejun.dagger2sample.chapter3;

import dagger.Component;

@Component(modules = DependencyModule.class)
public interface DependencyComponent {
//    和前面不同，我们不在它里面声明一个inject接口，而是声明了一个getDependencySource接口，
//    返回值为DependencySource，表示可以给被它依赖的Component提供DependencySource这种类型的实例
    DependencySource getDependencySource();
}
