package com.fz.iterator;

/**
 * 迭代器接口
 * @author FZ
 * @version 1.0  2015年11月17日 下午2:57:20
 */
public interface MyIterator {
	void first();//将游标指向第一个元素
	void next();//将游标指向下一个元素
	boolean hasNext();//判断是否有下一个元素
	
	boolean isFirst();//判断是否是第一个元素
	boolean isLast();//判断是否是最后一个元素
	Object getCurrentObj();//获取当前对象
}
