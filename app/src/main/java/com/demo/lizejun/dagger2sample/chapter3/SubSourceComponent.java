package com.demo.lizejun.dagger2sample.chapter3;


import dagger.Subcomponent;
//Subcomponent注解的不会生成一个component
//它不用自己声明Module，而是通过与父Component关联的Module来完成依赖注入。
@Subcomponent
public interface SubSourceComponent {
    //子类注入的对象是SubRepository
    public void inject(SubRepository subRepository);
}
