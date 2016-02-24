package com.fz.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚集类
 * @author FZ
 * @version 1.0  2015年11月17日 下午3:28:24
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<>();
	public void addObject(Object obj){
		this.list.add(obj);
	}
	public void removeObject(Object obj){
		this.list.remove(obj);
	}
	public List<Object> getList() {
		return list;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	//获得迭代器
	public MyIterator createIterator(){
		return new ConcreteIterator();
	}
	
	//使用内部类来定义迭代器，好处就是可以直接使用外部类的属性
	private class ConcreteIterator implements MyIterator{
		private int cursor;//定义一个迭代器游标
		@Override
		public void first() {
			cursor = 0;
		}
		@Override
		public void next() {
			if (cursor<list.size()) {
				cursor++;
			}
		}
		@Override
		public boolean hasNext() {
			//如果游标<list的大小，则说明还有下一个
			if (cursor<list.size()) {
				return true;
			}
			return false;
		}
		@Override
		public boolean isFirst() {
			return cursor==0?true:false;
		}
		@Override
		public boolean isLast() {
			//判断游标是否是容器的最后一个
			return cursor==(list.size()-1)?true:false;
		}
		@Override
		public Object getCurrentObj() {
			return list.get(cursor);//获取当前游标指向的元素
		}
	}
	
}
