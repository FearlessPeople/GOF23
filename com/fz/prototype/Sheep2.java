package com.fz.prototype;

import java.util.Date;

/**
 * 原型模式:深克隆
 * Cloneable是一个空接口（标记接口），是一个规范。但是如果要克隆这个类对象的话必须实现Cloneable接口
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年11月4日 下午2:01:51<br>
 * @author FZ
 * @version 1.0
 */
public class Sheep2 implements Cloneable{
	private String sname;
	private Date birthday;
	
	/**
	 * 重写Object对象的clone方法
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//直接调用Object对象的clone方法
		Object obj = super.clone();
		
		//深克隆：把对象下的所有属性也克隆出来
		Sheep2 s = (Sheep2) obj;
		s.birthday = (Date) this.birthday.clone();
		return s;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
}
