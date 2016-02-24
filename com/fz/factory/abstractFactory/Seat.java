package com.fz.factory.abstractFactory;

/**
 * 座椅
 */
public interface Seat {
	void massage();//按摩
}
//高端座椅
class LuxurySeat implements Seat{
	@Override
	public void massage() {
		System.out.println("可以自动按摩");
	}
}
//低端座椅
class LowSeat implements Seat{
	@Override
	public void massage() {
		System.out.println("不能按摩");
	}
}