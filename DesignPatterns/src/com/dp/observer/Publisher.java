package com.dp.observer;

import java.util.Observable;

public class Publisher extends Observable{
	public void changeStateTo(String newStateName) {
		this.setChanged();
		this.notifyObservers(newStateName);
	}
}
