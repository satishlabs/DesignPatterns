package com.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber2 implements Observer{
	String currentPublisherState;
	
	@Override
	public void update(Observable observable, Object obj) {
		System.out.println("Nrew State receviced by Subscriber 2  "+obj.toString());
		this.currentPublisherState = (String)obj;
	}

}
