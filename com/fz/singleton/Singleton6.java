package com.fz.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 用于测试反射破解的单例类
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月29日 下午2:43:19<br>
 * @author FZ
 * @version 1.0
 */
public class Singleton6 implements Serializable {
	/**
	 * 1、提供一个静态变量。
	 * 当类加载器加载该类时，就new一个实例出来。从属于这个类。不管后面用不用这个类。所以没有延时加载功能
	 */
	private static Singleton6 instance = new Singleton6();
	/**
	 * 2、私有化构造器:外部是不能直接new该对象的
	 */
	private Singleton6(){
		if (instance != null) {
			//如果不是第一次构建，则直接抛出异常。不让创建
			throw new RuntimeException();
		}
	}
	/**
	 * 3、对外提供一个公共方法来获取这个唯一对象（方法没有使用synchronized则调用效率高）
	 * @return
	 */
	public static Singleton6 getInstance(){
		return instance;
	}
	
	/**
	 * 反序列化时，如果定义了readResolve()则直接返回该方法指定的实例。不会再单独创建新对象！
	 * @return
	 * @throws ObjectStreamException
	 */
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
	
}
