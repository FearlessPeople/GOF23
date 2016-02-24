package com.fz.factory.factoryMethod;

/**
 * 创建奥迪的工厂
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月30日 上午10:46:21<br>
 * @author FZ
 * @version 1.0
 */
public class AudiFactory implements CarFactory {
	@Override
	public Car createCar() {
		return new Audi();
	}
}
