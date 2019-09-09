package com.demo.lizejun.dagger2sample.scope.bean;

public  class Flower {
    private String mName;

    public Flower(String name) {
        mName = name;
    }

    public String show() {
        return "Flower="+mName==null?"空":mName;
    }
}