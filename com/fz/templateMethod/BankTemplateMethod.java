package com.fz.templateMethod;

/**
 * 模板抽象方法
 * @author FZ
 * @version 1.0  2015年11月18日 下午2:27:53
 */
public abstract class BankTemplateMethod {
	//模板方法中其他业务逻辑
	//1.取号排队
	public void takeNumber(){
		System.out.println("取号排队");
	}
	//2.办理具体的业务：这里留给子类来实现！！！
	public abstract void transact();
	//3.给客服评分
	public void evaluate(){
		System.out.println("反馈评分");
	}
	//模板方法
	public final void process(){
		this.takeNumber();
		this.transact();//这里则是具体的模板方法函数
		this.evaluate();
	}
}
