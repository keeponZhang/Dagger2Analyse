package com.demo.lizejun.dagger2sample.chapter0;

import javax.inject.Inject;

public class LocalSource0 {


	@Inject//(生成LocalSource0_Factory,LocalSource0都是在LocalSource0_Factory完成的)
	public LocalSource0() {
	}


	public String getData() {
		return  "LocalSource0使用在无参构造函数上使用  @Inject 的方式，获取到了本地数据";
	}
}
