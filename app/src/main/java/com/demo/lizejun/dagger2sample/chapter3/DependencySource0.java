package com.demo.lizejun.dagger2sample.chapter3;

import javax.inject.Inject;

public class DependencySource0 {
    private String mS;

    @Inject
    public DependencySource0(String s) {
        mS = s;
    }
    public DependencySource0() {
    }

    public String getData() {
        return mS+" DependencySource0 通过依赖方式，获取到依赖数据";
    }
}
