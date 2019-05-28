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
		PotComponent0 potComponent0 = DaggerPotComponent0.create();
		Pot pot3 = potComponent0.getPot();
		Pot pot4 = potComponent0.getPot();
		//pot3跟pot4一样，跟pot1.pot2不一样
		Log.e("TAG", "MyScopeActivity0 onCreate getPot pot3:"+ pot3+" pot4="+pot4);
	}
	//保持单例，同一个component实例,使用scope


}
