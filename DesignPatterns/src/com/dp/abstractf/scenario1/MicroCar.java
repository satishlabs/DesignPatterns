package com.dp.abstractf.scenario1;

public class MicroCar extends Car{

	MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to Micro car");
	}

}
