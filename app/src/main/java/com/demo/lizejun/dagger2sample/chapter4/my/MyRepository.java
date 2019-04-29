package com.demo.lizejun.dagger2sample.chapter4.my;


import javax.inject.Inject;

public class MyRepository {



    @Inject
    MyData mMyData;

    public MyRepository() {
        //create 默认调的是new Builder().build()
    }

    public String getMyData() {
        return mMyData.toString();
    }


}
