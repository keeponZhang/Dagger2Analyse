package com.demo.lizejun.dagger2sample.chapter2;


import javax.inject.Inject;

public class DataRepository {

    @Inject
    //使用@Named也可以解决依赖注入迷失
//    @Named("Local")
    @Local
    Source mLocalSource;

    @Inject
//    @Named("Remote")
    @Remote
    Source mRemoteSource;

    public DataRepository() {
        //create 默认调的是new Builder().build()
        DaggerSourceComponent.create().inject(this);
        DaggerSourceComponent.builder().sourceModule(new SourceModule()).build().inject(this);
    }

    public String getLocalData() {
        return mLocalSource.getData();
    }

    public String getRemoteData() {
        return mRemoteSource.getData();
    }

}
