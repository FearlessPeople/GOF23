package com.fz.facade;
/**
 * 外观模式：封装子系统，对外提供一个门面方法
 * @author FZ
 * @version 1.0  2015年11月10日 下午2:16:39
 */
public class Facade {
	//所有子系统的引用
	private SubSystemClass s1 = null;
	private SubSystemClass2 s2 = null;
	private SubSystemClass3 s3 = null;
	//构造子系统的引用
	public Facade() {
		this.s1 = new SubSystemClass();
		this.s2 = new SubSystemClass2();
		this.s3 = new SubSystemClass3();
	}
	/**
	 * 具体的门面方法
	 */
	public void facade(){
		s1.methodOne();
		s2.methodTwo();
		s3.methodThree();
	}
}
