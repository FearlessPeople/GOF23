package com.fz.command;

/**
 * 抽象命令类：抽象的命令，可以根据不同类型的命令写出不同的实现
 * @author FZ
 * @version 1.0  2015年11月18日 上午10:03:09
 */
public interface Command {
	//调用命令
	void execute();
}
//具体命令类
class ConcreteCommand implements Command{
	private Receiver receiver;
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	@Override
	public void execute() {
		//调用接收者执行命令的方法
		receiver.action();
	}
}