package com.fz.flyWeight;

/**
 * 享元类接口：可以共享的有颜色，大小，形状
 * FlyWeight（抽象享元类）：通常是一个接口或者抽象类，声明公共方法，
 * 这些方法可以向外界提供对象的内部状态，设置外部状态。
 * @author FZ
 * @version 1.0  2015年11月13日 下午2:36:23
 */
public interface ChessFlyWeight {
	//这里只设置一个颜色,大小和形状省略
	void setColor(String c);
	String getColor();
	void display(Coordinate c);//显示棋子
}
//享元的具体实现：ConcreteFlyWeight（具体享元类）：为内部状态提供成员变量进行存储
class concreteFlyWeight implements ChessFlyWeight{
	private String color;//这里就是为内部状态提供成员变量进行存储
	//构造的时候初始化color属性
	public concreteFlyWeight(String color) {
		super();
		this.color = color;
	}
	@Override
	public void setColor(String c) {
		this.color = c;
	}
	@Override
	public String getColor() {
		return color;
	}
	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色："+color);
		System.out.println("棋子位置：("+c.getX()+","+c.getY()+")");
	}
}