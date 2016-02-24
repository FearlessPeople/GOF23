package com.fz.prototype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年11月4日 下午2:22:12<br>
 * @author FZ
 * @version 1.0
 */
public class Test {
	public static void main(String[] args) throws Exception {
		Date date = new Date(1274397294739L);
		Sheep s1 = new Sheep("原型羊",date);
		Sheep s2 = (Sheep) s1.clone();//克隆一个羊
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println("原日期："+s1.getBirthday());
		date.setTime(34732834827389L);//改变原有date的值
		System.out.println("改变后的日期："+date.toString());
		
		//克隆羊的信息
		System.out.println("---------------------------------");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());//此时的birthday日期使用的是改变后的日期对象引用
		
		
	}
}
