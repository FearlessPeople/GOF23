package com.fz.composite.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private String name;//当前节点名称
	private TreeNode parent;//父节点
	private List<TreeNode> children = new ArrayList<TreeNode>();//子节点
	//构造节点的时候需要传入节点名称
	public TreeNode(String name) {
		this.name = name;
	}
	/**
	 * 添加子节点
	 * @param node
	 */
	public void addChildren(TreeNode node){
		children.add(node);
		node.setParent(this);
	}
	/**
	 * 显示树形结构
	 */
	public void display(){
		for (TreeNode node : this.getChildren()) {
			System.out.println(this.getName());
			
			if (node.getChildren() !=null) {
				StringBuffer str = new StringBuffer("----"+node.getParent().getName());
				System.out.println(str.toString());
				System.out.println(str.toString()+"-->"+node.getName());
				node.display();
			}else{
				System.out.println(node.getName());
			}
		}
		
	}
	
	public String toString() {
//		return "TreeNode [parent="+(null==parent?"":parent.getName())+",name="+name+",children"+children.toString()+"]";
//		System.out.println(name);
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeNode getParent() {
		return parent;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	public List<TreeNode> getChildren() {
		return children;
	}
	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}
	
}
