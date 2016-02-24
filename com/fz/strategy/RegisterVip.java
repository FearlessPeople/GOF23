package com.fz.strategy;

/**
 * 具体的算法：普通会员：打8折
 * @author FZ
 * @version 1.0  2015年11月18日 上午11:22:25
 */
public class RegisterVip implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("普通会员：打8折");
		return price*0.8;
	}
}