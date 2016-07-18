package com.algorithm.tree;

public class Node {
	String data;
	int parent;
	CNode childNode;
	public Node(String data, int parent, CNode childNode) {
		super();
		this.data = data;
		this.parent = parent;
		this.childNode = childNode;
	}
	public Node(String data, int parent) {
		super();
		this.data = data;
		this.parent = parent;
	}
	public Node(String data) {
		super();
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getParent() {
		return parent;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public CNode getChildNode() {
		return childNode;
	}
	public void setChildNode(CNode childNode) {
		this.childNode = childNode;
	}
	
}
