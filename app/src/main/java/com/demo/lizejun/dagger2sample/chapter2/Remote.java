package com.demo.lizejun.dagger2sample.chapter2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.inject.Qualifier;

//先利用@Qulifier创建别名，对应远程数据源
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Remote {
}
