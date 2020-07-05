package com.dp.factory.scenario1;

public class PushNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending an Push Notification");
	}

}
