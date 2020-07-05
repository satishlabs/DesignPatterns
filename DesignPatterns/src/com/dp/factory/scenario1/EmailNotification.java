package com.dp.factory.scenario1;

public class EmailNotification implements Notification{

	@Override
	public void notifyUser() {
		System.out.println("Sending an Email Notification");
	}

}
