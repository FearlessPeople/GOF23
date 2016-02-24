package com.fz.strategy;

public class Client {
	public static void main(String[] args) {
		double price = 998;//商品价格
		Strategy generalUser = new GeneralUser();//普通用户
		Strategy registerUser = new RegisterUser();//注册用户
		Strategy registerVip = new RegisterVip();//普通会员
		Strategy oldVip = new OldVip();//老会员
		
		//根据不同的用户打不同的折扣
		Context c1 = new Context(generalUser);
		c1.printPrice(price);
		Context c2 = new Context(registerUser);
		c2.printPrice(price);
		Context c3 = new Context(registerVip);
		c3.printPrice(price);
		Context c4 = new Context(oldVip);
		c4.printPrice(price);
	}
}
