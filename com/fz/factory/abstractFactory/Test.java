package com.fz.factory.abstractFactory;

public class Test {

	public static void main(String[] args) {
		//想要好车
		CarFactory factory = new LuxuryCarFactory();
		Engine engine = factory.createEngine();//创建高端发动机
		engine.run();
		engine.start();
		
		//想要差一点的车
		CarFactory factory2 = new LowCarFactory();
		Engine e2= factory2.createEngine();
		Seat s2 = factory2.createSeat();
		Tyre t2 = factory2.createTyre();
		e2.run();
		e2.start();
		//以后想要中等车的话可以增加相应中等配件的接口
	}
}
