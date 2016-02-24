package com.fz.proxy.staticProxy;

/**
 * 真实角色（明星艺人）：
 * <br><br><strong>时间:</strong>2015年11月5日 下午3:12:01<br>
 * @author FZ
 * @version 1.0
 */
public class RealStar implements Star{
	@Override
	public void confer() {
		System.out.println("RealStar.confer()");
	}
	@Override
	public void signContract() {
		System.out.println("RealStar.signContract()");
	}
	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket()");
	}
	@Override
	public void sing() {
		System.out.println("张学友.sing()");
	}
	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney()");
	}
}
