package com.algorithm.tree;

public class CPTree {
	Node[] nodes;
	int size;
	int root;
	public CPTree(Node[] nodes, int size, int root) {
		super();
		this.root = root;
		this.nodes = nodes;
		this.size = size;
	}
	public Node[] getNodes() {
		return nodes;
	}
	public void setNodes(Node[] nodes) {
		this.nodes = nodes;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getRoot() {
		return root;
	}
	public void setRoot(int root) {
		this.root = root;
	}
}
