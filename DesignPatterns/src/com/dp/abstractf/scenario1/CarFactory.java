package com.dp.abstractf.scenario1;

public class CarFactory {
	private CarFactory() {
		
	}
	
	public static Car buildCar(CarType type) {
		Car car=null;
		
		Location location = Location.INDIA;
		switch (location) {
		case USA:
			car = USACarFactory.buildCar(type);
			break;
		case INDIA:
			car = INDIACarFactory.buildCar(type);
			break;	
		default:
			car = DefaultCarFactory.buildCar(type);
		}
		
		return car;
	}
}
