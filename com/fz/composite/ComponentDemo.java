package com.fz.composite;

/**
 * 抽象构件接口
 * @author FZ
 * @version 1.0  2015年11月6日 下午2:43:11
 */
public interface ComponentDemo {
	void operation();
}
/*
interface Leaf extends ComponentDemo{
}
interface Composite extends ComponentDemo{
	void add(ComponentDemo c);
	void remove(ComponentDemo c);
	ComponentDemo getChild(int index);
}*/