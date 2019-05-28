package com.demo.lizejun.dagger2sample.chapter4_0.bean;

public class Rose {

    public String getName() {
        return  "Rose="+ name;
    }

    String name;

    public Rose(String name) {
        this.name = name;
    }
}