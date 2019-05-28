package com.demo.lizejun.dagger2sample.chapter4_2.my;


import android.util.Log;

import javax.inject.Inject;

public class MyRepository {


    //一个对象中注入两个类型一样的对象时，保持一致
    @Inject
    MyData mMyData;
    @Inject
    MyData mMyData2;
    public MyRepository() {
        //create 默认调的是new Builder().build()
    }

    private static final String TAG = "MyRepository";
    public String getMyData() {
        Log.e(TAG, "getMyData mMyData:"+mMyData+ " mMyData2:"+mMyData2);
        return mMyData.toString();
    }


}
