package com.fz.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 通过反射破解单例模式
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月29日 下午3:43:46<br>
 * @author FZ
 * @version 1.0
 */
public class TestReflect {
	public static void main(String[] args) throws Exception {
		Singleton6 s1 = Singleton6.getInstance();
		Singleton6 s2 = Singleton6.getInstance();
//		System.out.println(s1 == s2);//true
		
//		//通过反射破解
//		Class<Singleton6> clazz = (Class<Singleton6>) Class.forName(Singleton6.class.getName());
//		Constructor<Singleton6> c = clazz.getDeclaredConstructor(null);//获得无参构造器
//		c.setAccessible(true);//跳过检查：可以访问private构造器
//		Singleton6 s3 = c.newInstance();//此时会报错：没有权限访问私有构造器
//		Singleton6 s4 = c.newInstance();
////		System.out.println(s3==s4);//不加c.setAccessible(true)则会报错。此时的结果就是false，获得的就是两个对象
//		
		//通过反序列化构建对象：通过序列化将s1存储到硬盘上，然后再通过反序列化把s1再构建出来
		FileOutputStream fos = new FileOutputStream("e:/a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		//通过反序列化将s1对象再构建出来
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:/a.txt"));
		Singleton6 s5 = (Singleton6) ois.readObject();
		System.out.println(s5);
		System.out.println(s1==s5);
		
	}
}
