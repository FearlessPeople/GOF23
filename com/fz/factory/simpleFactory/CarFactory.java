package com.fz.factory.simpleFactory;

import com.fz.factory.noFactory.Audi;
import com.fz.factory.noFactory.Byd;
import com.fz.factory.noFactory.Car;

/**
 * 汽车工厂
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月30日 上午10:14:28<br>
 * @author FZ
 * @version 1.0
 */
public class CarFactory {
	/**
	 * 创建汽车
	 * @param type
	 * @return
	 */
	public static Car createCar(String type){
		//该方法还会有问题，假如以后有很多汽车都需要工厂来创建。则又得修改源代码，违反了OCP开闭原则
		if ("audi".equals(type)) {
			return new Audi();
		}else if ("byd".equals(type)) {
			return new Byd();
		}else{
			return null;
		}
	}
}
