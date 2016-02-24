package com.fz.mediator;
/**
 * 抽象中介者
 * @author FZ
 * @version 1.0  2015年11月17日 下午5:12:52
 */
public interface Mediator {
	void register(String dname,Department d);//注册
	void command(String dname);//通过部门名称，发出命令
}
