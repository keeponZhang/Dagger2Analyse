package com.demo.lizejun.dagger2sample.chapter4_0.test3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface MyActivityScope3 {}