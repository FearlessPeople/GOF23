package com.fz.mediator;

public class Client {

	public static void main(String[] args) {
		Mediator m = new President();//构建中介者对象：总经理
		Market market = new Market(m);//构建市场部
		market.selfAction();
		market.outAction();//市场部和财务部交互
	}
}
