package com.fz.strategy;

/**
 * 具体的算法:注册用户：打9折
 * @author FZ
 * @version 1.0  2015年11月18日 上午11:24:03
 */
public class RegisterUser implements Strategy{
	@Override
	public double getPrice(double price) {
		System.out.println("注册用户：打9折");
		return price*0.9;
	}
}