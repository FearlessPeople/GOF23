package com.fz.templateMethod;

public class Client {
	public static void main(String[] args) {
		//定义子类方式实现模板方法
		BankTemplateMethod template = new DrawMoney();
		template.process();
		System.out.println("----------------------");
		//使用内部类方式实现模板方法
		BankTemplateMethod template1 = new BankTemplateMethod() {
			//这里使用匿名内部类实现:只需实现具体业务部分，其他部分则使用模板方法定义好的骨架
			@Override
			public void transact() {
				System.out.println("我要存钱");
			}
		};
		template1.process();
	}
}
