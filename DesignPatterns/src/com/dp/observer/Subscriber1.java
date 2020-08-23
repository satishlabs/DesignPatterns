package com.dp.observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber1 implements Observer{
	String currentPublisherState;
	@Override
	public void update(Observable obser, Object obj) {
		System.out.println("New State recevied by Subscriber 1 :"+obj.toString());
		this.currentPublisherState = (String)obj;
	}
	
}
