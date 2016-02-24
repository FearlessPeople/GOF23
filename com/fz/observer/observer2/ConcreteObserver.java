package com.fz.observer.observer2;

import java.util.Observable;
import java.util.Observer;

/**
 * 通过实现jdk提供的Observer接口作为一个抽象观察者，创建具体的观察者
 * @author FZ
 * @version 1.0  2015年11月18日 下午5:23:45
 */
public class ConcreteObserver implements Observer{
	private int state;//具体观察者中的状态和目标对象的状态保持一致
	@Override
	public void update(Observable o, Object arg) {
		state = ((ConcreteSubject)o).getState();
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
