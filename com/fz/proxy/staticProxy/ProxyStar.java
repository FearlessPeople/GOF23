package com.fz.proxy.staticProxy;

/**
 * 代理角色（明星经纪人）：
 * <br><br><strong>时间:</strong>2015年11月5日 下午3:13:46<br>
 * @author FZ
 * @version 1.0
 */
public class ProxyStar implements Star{
	private Star star;//真实对象（明星）
	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
	}

	@Override
	public void sing() {
		star.sing();//真实对象的操作
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
	}

	public ProxyStar(Star star) {
		this.star = star;
	}

}
