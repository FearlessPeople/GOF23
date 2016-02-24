package com.fz.command;

/**
 * 接收者：真正执行命令的对象
 * @author FZ
 * @version 1.0  2015年11月18日 上午10:02:07
 */
public class Receiver {
	public void action(){
		System.out.println("命令执行了.......");
	}
}
