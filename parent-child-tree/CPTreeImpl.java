package com.algorithm.tree;

public class CPTreeImpl {
	public static void main(String[] args) {
		Node[] nodes = new Node[9];
		for(int i = 0; i < 9; i++) {
			nodes[i] = new Node("str" + i);
		}
		for (int i = 1; i < 4; i++) {
			nodes[i].setParent(0);
		}
		CNode cnode1 = new CNode(1);
		CNode cnode2 = new CNode(1);
		CNode cnode3 = new CNode(1);
		cnode1.setNode(cnode2);
		cnode2.setNode(cnode3);
//		cnode.setNode(node);
		nodes[0].setChildNode(cnode1);
		CPTree tree = new CPTree(nodes, 9, 0);
//		System.out.println(nodes[nodes[3].getParent()].getData());
		int i = 0;
		while(nodes[0].getChildNode() != null) {
			nodes[0].childNode = nodes[0].childNode.getNode();
			i++;
		}
		System.out.println(i);
	}
}
