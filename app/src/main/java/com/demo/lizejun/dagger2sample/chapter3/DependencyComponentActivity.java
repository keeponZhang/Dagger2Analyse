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
		//DaggerSourceComponent0没有create方法，只能通过builder创建，并且要传入依赖的Component（dependencyComponent0）不能为空
		DaggerSourceComponent0.builder().dependencyComponent0(dependencyComponent).build().inject(this);
		//会报错
		//		DaggerSourceComponent0.builder().build().inject(this);
		Log.e("TAG", "DependencyComponentActivity onCreate:" + mDependencySource.getData());
	}
}
