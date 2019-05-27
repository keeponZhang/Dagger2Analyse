package com.demo.lizejun.dagger2sample.chapter3_1.other;


import com.demo.lizejun.dagger2sample.chapter3_1.SubComponentActivity;

import dagger.Component;

//Subcomponent注解的不会生成一个component
//它不用自己声明Module，而是通过与父Component关联的Module来完成依赖注入。
@Component
public interface SubComponent1 {
    //子类注入的对象是SubComponentActivity
     void inject(SubComponentActivity activity);
}
