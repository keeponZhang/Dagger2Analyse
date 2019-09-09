package com.demo.lizejun.dagger2sample.chapter0_2;

import javax.inject.Inject;

//构造函数用@Inject注释，就会有一个factory
public class LocalSource03 {


	private String mName;
	@Inject//（有参数和无参数的构造函数被@Inject生成的factory是不同的，无参数的的factory通过create直接创建，有参数的
	//通过create方法创建时需要moudle里方法生成的factory ）
	public LocalSource03(String name) {
		mName = name;
	}


	public String getData() {
		return  mName+"LocalSource2使用module和@Inject,提供实例化参数创建实例，获取到了本地数据";
	}
}
