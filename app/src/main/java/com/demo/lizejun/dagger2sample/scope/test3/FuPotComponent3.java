package com.demo.lizejun.dagger2sample.scope.test3;

import dagger.Component;

@MyActivityScope3
@Component(modules = PotModule3.class)
public interface FuPotComponent3 {
	//子Component可以获得父component module提供的所有实例
	ZiScope3Component getZiScope3Component();
}