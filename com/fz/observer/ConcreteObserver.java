package com.fz.observer;

/**
 * 具体的观察者
 * @author FZ
 * @version 1.0  2015年11月18日 下午4:38:52
 */
public class ConcreteObserver implements Observer{
	private int state;//state对象需要和subject中的state保持一致
	@Override
	public void upadte(Subject subject) {
		//当目标对象（主题对象）状态发生改变时，观察者也发生改变。
		this.state = ((ConcreteSubject)subject).getState();		
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
