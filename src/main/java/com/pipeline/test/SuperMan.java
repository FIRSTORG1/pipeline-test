package com.pipeline.test;

public interface SuperMan {
	default void fly() {
		System.out.println("*************YES SUPERMAN CAN FLY************ :)");
	}
}
