package com.fz.state;

/**
 * 具体状态：已入住
 * @author FZ
 * @version 1.0  2015年11月18日 下午3:32:15
 */
public class CheckedInState implements State{
	@Override
	public void handler() {
		System.out.println("房间已入住！");
	}
}
