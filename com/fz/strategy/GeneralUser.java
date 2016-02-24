package com.fz.strategy;

/**
 * 具体的算法:普通用户，不打折
 * @author FZ
 * @version 1.0  2015年11月18日 上午11:23:16
 */
public class GeneralUser implements Strategy {
	@Override
	public double getPrice(double price) {
		System.out.println("普通用户，不打折");
		return price;
	}
}
