package com.fz.factory.simpleFactory;

import com.fz.factory.noFactory.Car;

/**
 * 测试简单工厂方法
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月30日 上午10:17:57<br>
 * @author FZ
 * @version 1.0
 */
public class TestSimpleFactoryCar {//调用者
	public static void main(String[] args) {
		//创建汽车
		Car audi = CarFactory.createCar("audi");//创建者
		Car byd = CarFactory.createCar("byd");
		audi.run();
		byd.run();
	}
}
