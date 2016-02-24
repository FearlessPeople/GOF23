package com.fz.mediator;

/**
 * 抽象同事类，
 * @author FZ
 * @version 1.0  2015年11月17日 下午5:15:44
 */
public interface Department {
	void selfAction();//做本部门的事
	void outAction();//向上级汇报，也就是向总经理发出申请
}
