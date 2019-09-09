package com.demo.lizejun.dagger2sample.chapter0_1;

import android.os.Bundle;
import android.widget.TextView;

import com.demo.lizejun.dagger2sample.BaseActivity;
import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class OnlyInjectYoucanActivity extends BaseActivity {
 	@Inject
	LocalSource01 mLocalSource;
	//（生成OnlyInjectYoucanActivity_MembersInjector,因为这里使用module直接创建实例，DaggerOnlyInjectYouCanComponent的builder会先实例化module，
	//(自己通过builder配置，空的话会自动生成）,DaggerOnlyInjectYouCanComponent的initialize先创建providelocalYouCanProvider实例，再生成生成OnlyInjectYoucanActivity_MembersInjector实例。
	//OnlyInjectYoucanActivity_MembersInjector的injectMembers方法实现赋值操作，其实就是调用providelocalYouCanProvider的get方法获取实例
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_only_inject);
		mTvText = (TextView) findViewById(R.id.tv_text);
		//调用OnlyInjectYouCanModule的无参构造函数实例化一个OnlyInjectYouCanModule
		DaggerOnlyInjectYouCanComponent.create().inject(this);
		//之所以提供OnlyInjectYouCanModule实例化，其实module就是一个普通的类，自己可以根据需求创建构造函数
//		DaggerOnlyInjectYouCanComponent.builder().onlyInjectYouCanModule(new OnlyInjectYouCanModule()).build().inject(this);

	}


	@Override
	protected String getData() {
		return mLocalSource.getData();
	}
}
