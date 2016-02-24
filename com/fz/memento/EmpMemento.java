package com.fz.memento;

/**
 * 备忘录：
 * @author FZ
 * @version 1.0  2015年11月19日 上午9:38:19
 */
public class EmpMemento {
	//自身属性
	private String ename;
	private int age;
	private double salary;
	
	//构造备忘录对象时，需要传入一个需要备忘的对象（发起人）
	public EmpMemento(EmpOriginator emp) {
		this.ename = emp.getEname();
		this.age = emp.getAge();
		this.salary = emp.getSalary();
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
