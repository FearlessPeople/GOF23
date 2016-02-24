package com.fz.state;

/**
 * 具体状态：空闲
 * @author FZ
 * @version 1.0  2015年11月18日 下午3:32:15
 */
public class FreeState implements State{
	@Override
	public void handler() {
		System.out.println("房间空闲中，可以预定！");
	}
}
