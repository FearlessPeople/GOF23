package com.fz.decorator;

public class Client {
	public static void main(String[] args) {
		Car car = new Car();
		car.move();//这里打印未增加新功能的时候：汽车移动
		
		System.out.println("--------增加飞行功能-------");
		FlayCar flyCar = new FlayCar(car);//将真实对象传入装饰对象中
		flyCar.move();//这里就是增加了飞行后的装饰
		
		System.out.println("--------增加潜水功能-------");
		WaterCar waterCar = new WaterCar(car);//将真实对象传入装饰对象中
		waterCar.move();//这里就是增加了潜水功能后的装饰
		
	}
}
