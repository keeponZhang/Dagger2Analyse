package com.demo.lizejun.dagger2sample.chapter3.other;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.demo.lizejun.dagger2sample.R;
import com.demo.lizejun.dagger2sample.chapter3.DaggerDependencyComponent0;
import com.demo.lizejun.dagger2sample.chapter3.DependencyComponent0;
import com.demo.lizejun.dagger2sample.chapter3.DependencySource0;

import javax.inject.Inject;


public class DependencyComponentActivity2 extends AppCompatActivity {
	@Inject
	DependencySource1 mDependencySource;
	@Inject
	DependencySource0 mDependencySource0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dependency_component2);
		//1.实例化所依赖的Component。
		DependencyComponent1 dependencyComponent = DaggerDependencyComponent1.create();
		DependencyComponent0 dependencyComponent0 = DaggerDependencyComponent0.create();
		//DaggerSourceComponent0没有create方法，只能通过builder创建，并且要传入依赖的Component（dependencyComponent0）不能为空
		DaggerSourceComponent1.builder().dependencyComponent0(dependencyComponent0).dependencyComponent1(dependencyComponent).build().inject(this);
	}
}
