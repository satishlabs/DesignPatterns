package com.dp.factory.scenario2;

public class MobileFactory {
	public Mobile createMobile(String type) {
		if(type.equals(Mobile.IPHONE)) {
			return new Iphone(6, "Apple", "2");
		}else if(type.equals(Mobile.SAMSUNG)) {
			return new Samsung(32);
		}else if(type.equals(Mobile.SONY)) {
			return new Sony(16, "Intel");
		}else {
			return null;
		}
	}
}
