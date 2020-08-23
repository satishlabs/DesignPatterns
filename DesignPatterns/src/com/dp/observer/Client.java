package com.dp.observer;

public class Client {
	public static void main(String[] args) {
		Publisher publisher = new Publisher();
		publisher.addObserver(new Subscriber1());
		publisher.addObserver(new Subscriber2());
		publisher.changeStateTo("assigned");
	}
}
