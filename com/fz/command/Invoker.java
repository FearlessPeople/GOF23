package com.fz.command;

/**
 * 请求者/调用者：发起执行命令请求的对象
 * @author FZ
 * @version 1.0  2015年11月18日 上午10:07:26
 */
public class Invoker {
	private Command command;
	public Invoker(Command command) {
		super();
		this.command = command;
	}
	public void call(){
		//请求者调用命令对象执行命令方法
		command.execute();
	}
}
