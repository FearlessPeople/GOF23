package com.fz.factory.factoryMethod;

/**
 * 测试工厂方法
 * <br><br><strong>时间:</strong><br>
 * &nbsp;&nbsp;&nbsp;&nbsp;2015年10月30日 上午10:48:34<br>
 * @author FZ
 * @version 1.0
 */
public class TestFactoryMethod {
	public static void main(String[] args) {
		/**
		 * 工厂方法模式好处在于，以后如果再增加一辆车。只需再实现CarFactory接口即可。避免了OCP开闭原则
		 * 不用在原来的代码上修改，只需新增类即可。
		 * 例如:增加一辆奔驰，增加一个奔驰工厂即可。更好扩展
		 * BenzFactory
		 */
		Car audi = new AudiFactory().createCar();
		Car byd = new BydFactory().createCar();
		audi.run();
		byd.run();
	}
	
}
