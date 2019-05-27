package com.demo.lizejun.dagger2sample.chapter3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.demo.lizejun.dagger2sample.R;

import javax.inject.Inject;

public class DependencyComponentActivity extends AppCompatActivity {
	@Inject
	DependencySource0 mDependencySource;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dependency_component);
		//1.实例化所依赖的Component。
		DependencyComponent0 dependencyComponent = DaggerDependencyComponent0.create();
		DaggerSourceComponent0.builder().dependencyComponent0(dependencyComponent).build().inject(this);
		Log.e("TAG", "DependencyComponentActivity onCreate:" + mDependencySource.getData());
	}
}
