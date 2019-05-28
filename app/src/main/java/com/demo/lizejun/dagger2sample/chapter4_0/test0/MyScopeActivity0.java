package com.demo.lizejun.dagger2sample.chapter4_0.test0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter4_0.bean.Pot;

import javax.inject.Inject;

public class MyScopeActivity0 extends AppCompatActivity {
	@Inject
	Pot pot;

	@Inject
	Pot pot2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scope0);
		DaggerPotComponent0.create().inject(this);
		Log.e("TAG", "MyScopeActivity0 onCreate:"+pot.show()+"  pot="+pot);
		Log.e("TAG", "MyScopeActivity0 onCreate:"+pot2.show()+"  pot2="+pot2);
	}
	//保持单例，同一个component,使用scope


}
