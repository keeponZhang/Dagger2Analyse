package com.demo.lizejun.dagger2sample.chapter0;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.demo.lizejun.dagger2sample.BaseActivity;
import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class OnlyInjectActivity extends BaseActivity {
	@Inject//（生成OnlyInjectActivity_MembersInjector,如果实例化的地方和构造函数都用Inject注解标注，DaggerOnlyInjectComponent的initialize方法会实例化
			// onlyInjectActivityMembersInjector，onlyInjectActivityMembersInjector实例化会调用OnlyInjectActivityMembersInjector的create方法，传入Inject标注的
			// 构造函数生成的Factory（provider）
	LocalSource0 mLocalSource;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_only_inject);
		mTvText = (TextView) findViewById(R.id.tv_text);
		DaggerOnlyInjectComponent.create().inject(this);
//		DaggerOnlyInjectComponent2.create().inject(this);
	}

	public String getData() {
		String data = mLocalSource.getData();
		Log.e("TAG", "OnlyInjectYoucan2Activity getData:" + data);
		return data;
	}
}
