package com.demo.lizejun.dagger2sample.scope.bean;

public class Rose {

    public String getName() {
        return  "Rose="+ name;
    }

    String name;

    public Rose(String name) {
        this.name = name;
    }
}