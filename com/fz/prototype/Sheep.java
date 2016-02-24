package com.fz.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型模式:浅克隆
 * Cloneable是一个空接口（标记接口），是一个规范。但是如果要克隆这个类对象的话必须实现Cloneable接口
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年11月4日 下午2:01:51<br>
 * @author FZ
 * @version 1.0
 */
public class Sheep implements Cloneable,Serializable{
	private String sname;
	private Date birthday;
	
	/**
	 * 重写Object对象的clone方法
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//直接调用Object对象的clone方法
		Object obj = super.clone();
		return obj;
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
	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
}
