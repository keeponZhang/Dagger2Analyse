package com.demo.lizejun.dagger2sample.chapter0_1;

public class LocalSource01 {


	private String mName;

	////(用module，这里无需用)
	public LocalSource01(String name) {
		mName = name;
	}


	public String getData() {
		return  mName+"LocalSource1使用在module直接创建实例，获取到了本地数据";
	}
}
