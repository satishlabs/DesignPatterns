package com.dp.abstractf.scenario1;

public class MiniCar extends Car{

	MiniCar( Location location) {
		super(CarType.MINI, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to mini car");
	}

}
