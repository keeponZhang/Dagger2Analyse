package com.demo.lizejun.dagger2sample.chapter4_0.bean;

public  class Flower {
    private String mName;

    public Flower(String name) {
        mName = name;
    }

    public String show() {
        return "Flower="+mName==null?"空":mName;
    }
}