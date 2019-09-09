package com.demo.lizejun.dagger2sample.scope.bean;

public class Pot {


	private String mName;

    public Pot(String name) {
		mName = name;
	}

    public String show() {
        return "Pot="+mName;
    }
}