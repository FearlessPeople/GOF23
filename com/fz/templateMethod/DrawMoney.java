package com.fz.templateMethod;

/**
 * 子类实现模板方法：取款
 * @author FZ
 * @version 1.0  2015年11月18日 下午2:29:49
 */
public class DrawMoney extends BankTemplateMethod{
	@Override
	public void transact() {
		System.out.println("我要取款");
	}
}
