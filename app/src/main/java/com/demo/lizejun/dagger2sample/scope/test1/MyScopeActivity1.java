package com.demo.lizejun.dagger2sample.scope.test1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.scope.bean.Pot;

import javax.inject.Inject;

public class MyScopeActivity1 extends AppCompatActivity {
	@Inject
	Pot pot;

	@Inject
	Pot pot2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scope1);
		DaggerPotComponent1.create().inject(this);
		Log.e("TAG", "MyScopeActivity1 onCreate:"+pot.show()+"  pot="+pot);
		Log.e("TAG", "MyScopeActivity1 onCreate:"+pot2.show()+"  pot2="+pot2);
	}
}
