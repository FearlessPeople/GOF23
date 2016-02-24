package com.fz.prototype;
/**
 * 测试clone对象的效率
 */
public class TestClone {
	//new 对象
	public static void testNew(int size){
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			Laptop l = new Laptop();
		}
		long end = System.currentTimeMillis();
		System.out.println("new 对象耗时："+(end-start));
	}
	//clone 对象
	public static void testClone(int size){
		long start = System.currentTimeMillis();
		Laptop l = new Laptop();
		for (int i = 0; i < size; i++) {
			try {
				Laptop temp = (Laptop) l.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("clone 对象耗时："+(end-start));
	}
	public static void main(String[] args) {
		testNew(1000);
		testClone(1000);
	}
}

class Laptop implements Cloneable{
	public Laptop() {
		//模拟创建Laptop对象的时候比较耗时
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}