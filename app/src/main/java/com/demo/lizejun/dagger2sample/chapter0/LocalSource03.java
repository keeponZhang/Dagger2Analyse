package com.demo.lizejun.dagger2sample.chapter0;

import javax.inject.Inject;

public class LocalSource03 {


	private String mName;

	@Inject //生成的factory在用create创建实例是需要provider，这个provider一般是module里面的方法自动生成的factory
	public LocalSource03(String name) {
		mName = name;
	}


	public String getData() {
		return  "LocalSource03使用有参构造函数上使用  @Inject 的方式，获取到了本地数据";
	}
}
