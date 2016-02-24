package com.fz.bridge;

/**
 * 品牌维度：联想，戴尔，华硕....
 * <br><br><strong>时间:</strong>2015年11月6日 下午1:56:11<br>
 * @author FZ
 * @version 1.0
 */
public interface Brand {
	void sale();//销售电脑
}
class Lenovo implements Brand{
	@Override
	public void sale() {
		System.out.println("联想");
	}
}
class Dell implements Brand{
	@Override
	public void sale() {
		System.out.println("戴尔");
	}
}
