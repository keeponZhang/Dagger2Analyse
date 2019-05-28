package com.demo.lizejun.dagger2sample.chapter4_0.bean;

public class Pot {


	private String mName;

    public Pot(String name) {
		mName = name;
	}

    public String show() {
        return "Pot="+mName;
    }
}