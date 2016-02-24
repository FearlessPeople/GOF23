package com.fz.memento;

/**
 * 发起人：发起人内部有自身的内部状态，并且发起人可以创建备忘录和恢复备忘录
 * @author FZ
 * @version 1.0  2015年11月19日 上午9:35:35
 */
public class EmpOriginator {
	//自身属性
	private String ename;
	private int age;
	private double salary;
	
	//备份
	public EmpMemento memento(){
		return new EmpMemento(this);//将当前自身对象备份
	}
	
	//恢复
	public void recovery(EmpMemento emp){
		this.ename = emp.getEname();
		this.age = emp.getAge();
		this.salary = emp.getSalary();
	}
	
	public EmpOriginator(String ename, int age, double salary) {
		super();
		this.ename = ename;
		this.age = age;
		this.salary = salary;
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
