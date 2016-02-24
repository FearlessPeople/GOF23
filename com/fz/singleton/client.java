package com.fz.singleton;

/**
 * 测试单例
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月29日 下午3:22:01<br>
 * @author FZ
 * @version 1.0
 */
public class client {

	public static void main(String[] args) {
		/**
		 * 
		 */
		Singleton4 s1 = Singleton4.getInstance();
		Singleton4 s2 = Singleton4.getInstance();
		System.out.println(s1==s2);
		
		System.out.println(Singleton5.INSTANCE == Singleton5.INSTANCE);
		
		
	}
}
