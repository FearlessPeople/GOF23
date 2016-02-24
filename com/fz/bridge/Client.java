package com.fz.bridge;

public class Client {
	public static void main(String[] args) {
		//销售联想的笔记本
		Computer c = new Laptop(new Lenovo());
		c.sale();
	}
}
