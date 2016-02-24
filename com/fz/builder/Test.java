package com.fz.builder;

public class Test {
	
	public static void main(String[] args) {
		
		AirShipDirector shipDirector = new FzAirShipDirector(new FzAirShipBuilder());
		
		shipDirector.directorAirShip();//构建对象
		
	}
}
