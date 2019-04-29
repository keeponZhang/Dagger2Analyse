package com.demo.lizejun.dagger2sample.chapter1;


import javax.inject.Inject;

public class RemoteSource {

    private String mData;

    @Inject
    public RemoteSource(){
        mData = "使用 @Inject 的方式，获取到了网络数据";
    }
    //优先是由module方式
    public RemoteSource(String module){
        mData = "使用 @Module 的方式，获取到了网络数据";
    }
    public String getData() {

        return mData;
    }
}
