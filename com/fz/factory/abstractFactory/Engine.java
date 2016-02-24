package com.fz.factory.abstractFactory;


/**
 * 发动机接口
 */
public interface Engine {
	void run();
	void start();
}
/**
 * 好的发动机
 */
class LuxuryEngine implements Engine{
	@Override
	public void run() {
		System.out.println("好发动机转的快");
	}
	@Override
	public void start() {
		System.out.println("启动快，自动启停");
	}
}
/**
 * 差的发动机
 */
class LowEngine implements Engine{
	@Override
	public void run() {
		System.out.println("转的慢");
	}
	@Override
	public void start() {
		System.out.println("启动慢");
	}
}
