package com.demo.lizejun.dagger2sample.chapter3;


import android.util.Log;

import javax.inject.Inject;

public class DataRepository {

    @Inject
    DependencySource mDependencySource;


    DependencySource mDependencySource2;
    private static final String TAG = "MyRepository";
    public DataRepository() {
        //1.实例化所依赖的Component。
        DependencyComponent dependencyComponent = DaggerDependencyComponent.create();
        //2.在构建时传入依赖的Component实例。
        //传进去的dependencyComponent跟真正构建的不是一个，传进去的builder里
        //Component中依赖另一个component，必须在构建是赋值
        DaggerSourceComponent.builder().dependencyComponent(dependencyComponent).build().inject(this);
        mDependencySource2 = dependencyComponent.getDependencySource();

        Log.e(TAG, "MyRepository mDependencySource:"+mDependencySource);
        Log.e(TAG, "MyRepository mDependencySource2:"+mDependencySource2);
    }

    public String getDependencyData() {
        return mDependencySource.getData();
    }
}
