package com.fz.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();//构建一个备忘录管理者
		//构建发起人
		EmpOriginator emp = new EmpOriginator("张三", 20, 4000);
		System.out.println("第一次："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		//第1次备份
		taker.mementoEmp(emp.memento());
		
		//备份完了后再修改
		emp.setEname("李四");
		emp.setAge(30);
		emp.setSalary(50000);
		//然后再次打印
		System.out.println("1修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		//第2次备份
		taker.mementoEmp(emp.memento());
		
		//备份完了后再修改
		emp.setEname("李四2");
		emp.setAge(32);
		emp.setSalary(52000);
		//然后再次打印
		System.out.println("2修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		//第3次备份
		taker.mementoEmp(emp.memento());

		//备份完了后再修改
		emp.setEname("李四3");
		emp.setAge(33);
		emp.setSalary(32000);
		//然后再次打印
		System.out.println("3修改后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		//第4次备份
		taker.mementoEmp(emp.memento());
		
		//开始恢复
		taker.getEmpForStackAndRemove();//删除最近一次的备份
		taker.getEmpForStackAndRemove();//删除最近一次的备份
		emp.recovery(taker.getEmpForStack());//此时获取的是原来未删除时倒数第二次的备份
		System.out.println("恢复后："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
	}
}
