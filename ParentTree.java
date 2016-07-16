
package com.alg.coco;

import java.io.Serializable;

/**
 * @author catxu
 * @date 2016.07.17
 */
//双亲表示法
public class ParentTree implements Serializable{
	private static final long serialVersionUID = 1L;
//	private final int DEFAULT_TREE_SIZE = 100;
	PNode[] nodes;
	private int parent;
	private int size;	//record the number of Tree
	private int nodeNum;

	@SuppressWarnings("unchecked")
//	public ParentTree(PNode[] date, int length) { //Alt + Shift + S 
	public ParentTree(PNode date, int length) {
		size = length;
		nodes = new PNode[size];
		nodes[0] = new PNode(date, -1);
		nodeNum++;
	}
	
	public void addNode(PNode node, PNode parent) {
		for(int i = 0; i <= size; i++){
			if(nodes[i] == null) {
				nodes[i] = new PNode(node, getPos(parent));
				nodeNum++;
				return;
			}
		}
		throw new RuntimeException("filled!");
	}

	private int getPos(PNode node) {
		for (int i = 0; i < nodeNum; i++) {
			if(node.getData().equals(nodes[i]))
				return i;
		}
		return -1;
	}

	public PNode getParent(PNode node) {
		if (node != null) {
			return nodes[node.getParent()];
		}
		return null;
	}
	public void setParent(int parent) {
		this.parent = parent;
	}
	public PNode getRoot() {
		if (isEmpty())
			return null;
		return nodes[0];
	}
	public int getSize() {
		return nodeNum;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isEmpty() {
		return nodes[0] == null;
	}
}
