package com.demo.lizejun.dagger2sample.chapter4_2.my;


public class MyData {

    private String mData;

//    @PerScopeData
//    @Inject
    public MyData(){
        mData = "MyData使用 @Inject 的方式，获取到了网络数据";
    }

    public MyData(String module){
        mData = "MyData使用 @Module 的方式，获取到了网络数据";
    }

    public String getData() {

        return mData;
    }
}
