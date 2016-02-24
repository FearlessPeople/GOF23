package com.fz.decorator;

/**
 * ICar表示Component：
 * @author FZ
 * @version 1.0  2015年11月9日 下午3:27:51
 */
public interface ICar {
	void move();//汽车移动
}
//ConcreteComponent：具体的对象
class Car implements ICar{
	@Override
	public void move() {
		System.out.println("汽车移动");
	}
}
//Decorator：装饰抽象类
class SuperCar implements ICar{
	protected ICar car;//持有一个真实对象的引用
	@Override
	public void move() {
		car.move();//这里调用真实对象的移动方法
	}
	//构造的时候传参
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}
}
//ConcreteDecorator：就是具体的装饰对象
class FlayCar extends SuperCar {
	public FlayCar(ICar car) {
		super(car);
	}
	//这里就是新增的功能
	public void flay(){
		System.out.println("---天上飞");
	}
	@Override
	public void move() {
		super.move();
		flay();//在原有移动的基础上，装饰了一个fly的功能
	}
}
//ConcreteDecorator：就是具体的装饰对象
class WaterCar extends SuperCar {
	public WaterCar(ICar car) {
		super(car);
	}
	//这里就是新增的功能
	public void swim(){
		System.out.println("---水里游");
	}
	@Override
	public void move() {
		super.move();
		swim();//在原有移动的基础上，装饰了一个swim的功能
	}
}