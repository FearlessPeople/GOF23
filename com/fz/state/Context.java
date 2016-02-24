package com.fz.state;

/**
 * 上下文对象：用来引用一个State的实例，维护各个状态
 * @author FZ
 * @version 1.0  2015年11月18日 下午3:45:57
 */
public class Context {
	private State state;
	public void request(State s){
		System.out.print("当前状态：");
		this.state = s;
		state.handler();
	}
}
