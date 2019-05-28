package com.demo.lizejun.dagger2sample.chapter4_0.bean;

import javax.inject.Inject;

/**
 * createBy	 keepon
 */
public class Human {
	private  String name;
	private Flower mFlower;

	@Inject
	public Human(String name, Flower flower) {
		this.name = name;
		mFlower = flower;
	}

	@Override
	public String toString() {
		return "Human{" +
				"name='" + name + '\'' +
				", mFlower=" + mFlower.show() +
				'}';
	}
}
