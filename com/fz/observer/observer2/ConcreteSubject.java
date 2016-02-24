package com.fz.observer.observer2;

import java.util.Observable;

/**
 * 使用jdk提供的Observable类作为一个抽象主题，创建具体的目标对象
 * @author FZ
 * @version 1.0  2015年11月18日 下午5:21:19
 */
public class ConcreteSubject extends Observable{
	private int state;
	public void updateState(int s){
		state = s;//目标对象发生了改变
		setChanged();//Observable类中的setChanged()方法，表示目标对象发生了更改
		notifyObservers(state);//通知所有观察者对象
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
