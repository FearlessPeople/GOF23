package com.fz.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题对象：把所有观察者对象都保存到一个集合里，每个主题都可以任何数量的观察者
 * 抽象主题对象提供了增加和删除观察者对象的方法
 * @author FZ
 * @version 1.0  2015年11月18日 下午4:30:06
 */
public class Subject {
	//保存该主题下所有的观察者
	protected List<Observer> list = new ArrayList<Observer>();
	//添加观察者
	public void registerObserver(Observer observer){
		list.add(observer);
	}
	//删除观察者
	public void removerObserver(Observer observer){
		list.remove(observer);
	}
	//通知所有观察者
	public void notifyAllObserver(){
		for (Observer obs : list) {
			obs.upadte(this);//更新当前主题（subject）对象的信息到所有观察者中
		}
	}
}
