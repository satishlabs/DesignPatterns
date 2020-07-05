package com.dp.factory.scenario1;

public class NotifcationFactory {
	public Notification createNotifcation(String channel) {
		if(channel == null || channel.isEmpty()) {
			return null;
		}else if(channel.equals("SMS")) {
			return new SMSNotification();
		}else if(channel.equals("Email")){
			return new EmailNotification();
		}else if(channel.equals("Push")){
			return new PushNotification();
		}else
		return null;
		
	}
}
