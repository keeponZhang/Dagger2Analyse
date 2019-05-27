package com.demo.lizejun.dagger2sample.chapter0;

import javax.inject.Inject;

public class LocalSource03 {


	private String mName;

	@Inject
	public LocalSource03(String name) {
		mName = name;
	}


	public String getData() {
		return  "LocalSource03使用有参构造函数上使用  @Inject 的方式，获取到了本地数据";
	}
}
