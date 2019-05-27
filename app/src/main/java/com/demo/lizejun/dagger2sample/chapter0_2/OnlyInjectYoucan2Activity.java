package com.demo.lizejun.dagger2sample.chapter0_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class OnlyInjectYoucan2Activity extends AppCompatActivity {
	@Inject
	LocalSource02 mLocalSource;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_only_inject);
		DaggerOnlyInjectYouCanComponent2.create().inject(this);

	}

	public void getData(View view) {
		String data = mLocalSource.getData();
		Log.e("TAG", "OnlyInjectYoucan2Activity getData:" + data);
	}
}
