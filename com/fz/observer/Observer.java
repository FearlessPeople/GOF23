package com.fz.observer;

/**
 * 抽象观察者:为所有的观察者定义一个接口
 * @author FZ
 * @version 1.0  2015年11月18日 下午4:28:15
 */
public interface Observer {
	//传入主题对象,得到主题对象的通知时更新自己
	void upadte(Subject subject);
}
