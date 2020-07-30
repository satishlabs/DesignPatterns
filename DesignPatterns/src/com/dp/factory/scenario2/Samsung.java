package com.dp.factory.scenario2;

public class Samsung implements Mobile{
	private int ramSize;
	private String processor;
	public Samsung(String processor) {
		this.processor = processor;
		this.ramSize = 2;
	}
	public Samsung(int ramSize) {
		super();
		this.ramSize = ramSize;
	}
	
}
