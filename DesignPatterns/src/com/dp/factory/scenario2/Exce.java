package com.dp.factory.scenario2;

public class Exce {
	public static void main(String[] args) {
		MobileFactory mf = new MobileFactory();
		Mobile mobile = mf.createMobile(Mobile.SAMSUNG);
	}
}
