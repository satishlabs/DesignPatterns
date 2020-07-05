package com.dp.factory.scenario1;

public class NotificationService {
	public static void main(String[] args) {
		NotifcationFactory notifcationFactory = new NotifcationFactory();
		Notification smsNotification = notifcationFactory.createNotifcation("SMS");
		smsNotification.notifyUser();
		
		Notification emailNotification = notifcationFactory.createNotifcation("Email");
		emailNotification.notifyUser();
		
		Notification pushNotification = notifcationFactory.createNotifcation("Push");
		pushNotification.notifyUser();
	}
}
