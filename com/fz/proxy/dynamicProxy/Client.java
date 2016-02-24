package com.fz.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		//真实角色
		Star realStar = new RealStar();
		//处理器
		StarHandler handler = new StarHandler(realStar);
		//代理类
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, handler);
		proxy.sing();//调用代理类的唱歌方法：其实调用的是真实角色的唱歌方法
	}
}
