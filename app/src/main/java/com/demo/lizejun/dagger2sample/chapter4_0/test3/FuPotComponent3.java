package com.demo.lizejun.dagger2sample.chapter4_0.test3;

import com.demo.lizejun.dagger2sample.chapter4_0.bean.Pot;

import dagger.Component;

@MyActivityScope3
@Component(modules = PotModule3.class)
public interface FuPotComponent3 {
	//子Component可以获得父component module提供的所有实例
	ZiScope3Component getZiScope3Component();
}