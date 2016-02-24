package com.fz.composite;

/**
 * Component（抽象构件）：抽象构件中定义了叶子和容器构件的共同点。比如，有公共的添加删除叶子功能，有显示节点功能。
 * @author FZ
 * @version 1.0  2015年11月19日 下午2:37:31
 */
public abstract class Component {
	protected String name;
	public Component(String name) {
		super();
		this.name = name;
	}
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}
