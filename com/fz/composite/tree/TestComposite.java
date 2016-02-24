package com.fz.composite.tree;

public class TestComposite {
	public static void main(String[] args) {
		TreeNode root = new TreeNode("root");
		TreeNode node11 = new TreeNode("node11");
		TreeNode node12 = new TreeNode("node12");
		TreeNode node1121 = new TreeNode("node1121");
		TreeNode node1122 = new TreeNode("node1122");
		TreeNode node1221 = new TreeNode("node1221");
		TreeNode node1222 = new TreeNode("node1222");
		
		root.addChildren(node11);
		root.addChildren(node12);
		
		node11.addChildren(node1121);
		node11.addChildren(node1122);
		node12.addChildren(node1221);
		node12.addChildren(node1222);
		root.display();
	}
}
