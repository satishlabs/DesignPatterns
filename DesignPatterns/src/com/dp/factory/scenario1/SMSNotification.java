package com.dp.factory.scenario1;

public class SMSNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending an SMS Notification");
	}

}
