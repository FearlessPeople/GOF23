package com.fz.adapter;

/**
 * 具体的适配器的实现（相当于各国的翻译）
 */
public class Adapter extends Adaptee implements Target{
	//这里需要和被适配对象关联起来：1.继承   2.组合(推荐)
	private Adaptee adaptee;
	@Override
	public void handleReq() {
		adaptee.request();
	}
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
}
