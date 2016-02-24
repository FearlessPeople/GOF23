package com.fz.strategy;

/**
 * 抽象算法接口：定义了所有支持算法的公共接口
 * @author FZ
 * @version 1.0  2015年11月18日 上午11:07:17
 */
public interface Strategy {
	//算法方法:打印商品的价格（不同的实现打不同的折扣）
	public double getPrice(double price);
}

