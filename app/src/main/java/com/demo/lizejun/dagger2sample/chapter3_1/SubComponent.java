package com.demo.lizejun.dagger2sample.chapter3_1;


import dagger.Subcomponent;
//Subcomponent注解的不会生成一个component
//它不用自己声明Module，而是通过与父Component关联的Module来完成依赖注入。
//可以注入父类依赖moudle的提供的实例
@Subcomponent
public interface SubComponent {
    //子类注入的对象是SubComponentActivity
     void inject(SubComponentActivity activity);
}
