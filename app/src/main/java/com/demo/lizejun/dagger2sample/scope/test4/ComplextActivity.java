package com.demo.lizejun.dagger2sample.scope.test4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.scope.bean.Human;

import javax.inject.Inject;

public class ComplextActivity extends AppCompatActivity {
	@Inject
	Human mHuman;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_complext);
		FlowerComponent flowerComponent = DaggerFlowerComponent.create();
		DaggerComplexComponent.builder().
				flowerComponent(flowerComponent).
				complexModule(new ComplexModule("human")).build().inject(this);

		Log.e("TAG", "ComplextActivity onCreate Human:"+mHuman);
	}
}
