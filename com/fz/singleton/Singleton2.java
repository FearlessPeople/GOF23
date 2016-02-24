package com.fz.singleton;

/**
 * 懒汉式单例：比较懒，一开始不初始化实例。等什么时候用就什么时候初始化.避免资源浪费
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月29日 下午2:50:44<br>
 * @author FZ
 * @version 1.0
 */
public class Singleton2 {
	/**
	 * 1、声明一个静态实例，不给它初始化。等什么时候用就什么时候初始化。节省资源
	 */
	private static Singleton2 instance;
	/**
	 * 2、依然私有化构造器，对外不让new
	 */
	private Singleton2(){}
	/**
	 * 3、对外提供一个获取实例的方法，因为静态属性没有实例化。
	 * 假如高并发的时候，有可能会同时调用该方法。造成new出多个实例。所以需要加上同步synchronized，因此调用效率不高
	 * 在方法上加同步，是整个方法都同步。效率不高
	 * @return
	 */
	public synchronized static Singleton2 getInstance(){
		if (instance == null ) {//第一次调用时为空，则直接new一个
			instance = new Singleton2();
		}
		//之后第二次再调用的时候就已经初始化了，不用再new。直接返回
		return instance;
	}
}
