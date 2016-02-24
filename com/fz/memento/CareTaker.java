package com.fz.memento;

import java.util.Stack;

/**
 * 管理者：管理备忘录对象
 * @author FZ
 * @version 1.0  2015年11月19日 上午9:46:59
 */
public class CareTaker {
	//需要管理的备忘录对象，这里也可以使用一个list容器来存储。这样可以备份多个点
	//或者使用一个Stack栈来保存，因为Stack是先进后出的
	private EmpMemento empMemento;
	
	private Stack<EmpMemento> stack = new Stack<EmpMemento>();

	//备份emp数据到栈中
	public void mementoEmp(EmpMemento emp){
		stack.push(emp);
	}
	//从栈中获取最近一次备份的emp数据
	public EmpMemento getEmpForStack(){
		return stack.peek();
	}
	//从栈中获取最近一次备份的emp数据,并且从栈中删除该数据
	public EmpMemento getEmpForStackAndRemove(){
		if (!stack.empty()) {
			return stack.pop();
		}else{
			return null;
		}
			
	}
	public EmpMemento getEmpMemento() {
		return empMemento;
	}
	public void setEmpMemento(EmpMemento empMemento) {
		this.empMemento = empMemento;
	}
	
}
