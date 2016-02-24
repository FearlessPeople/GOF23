package com.fz.memento;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("张三1");
		stack.push("张三2");
		stack.push("张三3");
		
		if (!stack.empty()) {
			for (String str : stack) {
				System.out.println(str+"---"+stack.search(str));
				System.out.println("--------------------------");
				System.out.println(stack.peek());
			}
		}
		
	}
}
