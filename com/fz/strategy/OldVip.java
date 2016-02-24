package com.fz.strategy;

/**
 * 具体的算法：老会员：打5折
 * @author FZ
 * @version 1.0  2015年11月18日 上午11:24:31
 */
public class OldVip implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("老会员：打5折");
		return price*0.5;
	}
}