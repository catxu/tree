package com.catxu.algorithm;

/**
 * @author catxu
 *
 */
public class Node {
	private int parent;
	private String data;
	private ChildNode firstChild;

	public Node() {
		super();
	}

	public Node(String data) {
		super();
		this.data = data;
	}

	public Node(int parent, String data) {
		super();
		this.parent = parent;
		this.data = data;
	}
	// public Node(int parent, String data, ChildNode child) {
	// super();
	// this.parent = parent;
	// this.data = data;
	// this.firstChild = child;
	// }

	public int getParent() {
		return parent;
	}

	public void setParent(int parent) {
		this.parent = parent;
	}

	public ChildNode getFirstChild() {
		return firstChild;
	}

	public void setFirstChild(ChildNode child) {
		this.firstChild = child;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
