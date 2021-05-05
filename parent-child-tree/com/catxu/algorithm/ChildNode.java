package com.catxu.algorithm;

/**
 * @author catxu
 *
 */
public class ChildNode {
	int index;
	ChildNode ncNode;

	public ChildNode() {
		super();
	}

	public ChildNode(int index) {
		super();
		this.index = index;
		this.ncNode = null;
	}

	public ChildNode(int index, ChildNode ncNode) {
		super();
		this.index = index;
		this.ncNode = ncNode;
	}

	public ChildNode getNextChNode() {
		return ncNode;
	}

	public void setNextChNode(ChildNode cNode) {
		this.ncNode = cNode;
	}

	// public static void main(String[] args) {
	// ChildNode[] cNode1 = new ChildNode[5];
	// for (int i = 0; i < 5; i++) {
	// cNode1[i] = new ChildNode();
	// System.out.println(i);
	// }
	// }
}
