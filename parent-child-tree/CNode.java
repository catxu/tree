package com.algorithm.tree;

public class CNode {
	int child;
	CNode node;
	public CNode(int child) {
		super();
		this.child = child;
		node = null;
	}
	public CNode(int child, CNode node) {
		super();
		this.child = child;
		this.node = node;
	}
	public int getChild() {
		return child;
	}
	public void setChild(int child) {
		this.child = child;
	}
	public CNode getNode() {
		return node;
	}
	public void setNode(CNode node) {
		this.node = node;
	}
	
}
