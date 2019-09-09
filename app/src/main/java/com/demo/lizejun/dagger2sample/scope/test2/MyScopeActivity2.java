package com.demo.lizejun.dagger2sample.scope.test2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.scope.bean.Flower;
import com.demo.lizejun.dagger2sample.scope.bean.Pot;

import javax.inject.Inject;

public class MyScopeActivity2 extends AppCompatActivity {
	@Inject
	Pot pot;

	@Inject
	Pot pot2;

//	@Inject
	Flower mFlower;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scope2);
		DenpencyPotComponent2 potComponent2 = DaggerDenpencyPotComponent2.create();
		DaggerMyScope2Component.builder().denpencyPotComponent2(potComponent2).build().inject(this);
		Log.e("TAG", "MyScopeActivity2 onCreate:"+pot.show()+"  pot="+pot);
		Log.e("TAG", "MyScopeActivity2 onCreate:"+pot2.show()+"  pot2="+pot2);

//		Log.e("TAG", "MyScopeActivity2 onCreate Flower:"+mFlower==null?"无":mFlower.show());
	}
	public void jump(View view) {
		Intent intent = new Intent(this, MyScopeActivity2_1.class);
		startActivity(intent);
	}
}
