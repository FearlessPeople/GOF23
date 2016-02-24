package com.fz.factory.abstractFactory;

/**
 * 轮胎
 */
public interface Tyre {
	void revolve();//旋转
}
//高端轮胎
class LuxuryTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("轮胎转的快");
	}
}
//低端轮胎
class LowTyre implements Tyre{
	@Override
	public void revolve() {
		System.out.println("轮胎转的慢");
	}
}

