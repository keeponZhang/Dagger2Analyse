package com.demo.lizejun.dagger2sample.chapter4_0.test3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter4_0.bean.Pot;
import com.demo.lizejun.dagger2sample.chapter4_0.bean.Rose;

import javax.inject.Inject;

public class MyScopeActivity3 extends AppCompatActivity {
	@Inject
	Pot pot;

	@Inject
	Pot  pot2;
	@Inject
	Rose mRose;

	@Inject
	Rose mRose2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scope3);
		DaggerFuPotComponent3.create().getZiScope3Component().inject(this);
		Log.e("TAG", "MyScopeActivity3 onCreate:"+pot.show()+"  pot="+pot);
		Log.e("TAG", "MyScopeActivity3 onCreate:"+pot2.show()+"  pot2="+pot2);
		Log.e("TAG", "MyScopeActivity3 onCreate:"+mRose.getName()+"  mRose="+mRose);
		Log.e("TAG", "MyScopeActivity3 onCreate:"+mRose2.getName()+"  mRose2="+mRose2);
	}
}
