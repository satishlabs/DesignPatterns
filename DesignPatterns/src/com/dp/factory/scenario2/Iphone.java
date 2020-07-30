package com.dp.factory.scenario2;

public class Iphone implements Mobile{
	private int ramSize;
	private String processor;
	private String GPU;
	public Iphone(int ramSize, String processor, String gPU) {
		this.ramSize = ramSize;
		this.processor = processor;
		GPU = gPU;
	}
}
