package com.algorithm.tree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author catxu
 * @date 2016.07.17
 */
// 双亲表示法
public class ParentTree implements Serializable {
	private static final long serialVersionUID = 1L;
	// private final int DEFAULT_TREE_SIZE = 100;
	PNode[] nodes;
	private int parent;
	private int size; // record the number of Tree
	private int nodeNum;

	// @SuppressWarnings("unchecked")
	// public ParentTree(PNode[] date, int length) { //Alt + Shift + S
	public ParentTree(PNode date, int length) {
		size = length;
		nodes = new PNode[size];
		// String nodeData = date.getData();
		nodes[0] = new PNode(date.getData(), -1);
		nodeNum++;
	}

	// 为指定父节点添加 子节点
	public void addNode(PNode node, PNode parent) {
		for (int i = 0; i < size; i++) {
			if (nodes[i] == null) {
				nodes[i] = new PNode(node.getData(), getPos(parent));
				nodeNum++;
				return;
			}
		}
		throw new RuntimeException("filled!");
	}

	// 返回指定节点在树中的位置
	private int getPos(PNode node) {
		// System.out.println("[DEBUG]" + node.getData());
		// System.out.println("[DEBUG]" + nodes[0].getData());
		for (int i = 0; i < nodeNum; i++) {
			if (nodes[i].equals(node)) {
				// System.out.println("[expect]" + node.getData() + ", "
				// + nodes[i].hashCode() + ", " + node.hashCode());
				return i;
			}
		}
		System.out.println("[DEBUG]" + node.getData());
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

	public List<PNode> geChildren(PNode parent) {
		List<PNode> list = new ArrayList<PNode>();
		for (int i = 0; i < size; i++) {
			if (nodes[i] != null && (nodes[i].getParent() == getPos(parent))) {
				list.add(nodes[i]);
			}
		}
		return list;
	}

	/**
	 * 返回该树的深度
	 * 
	 * @return
	 */
	public int getDeep() {
		// 用于记录结点的最大深度
		int max = 0;
		for (int i = 0; i < size && nodes[i] != null; i++) {
			// 初始化本结点的深度
			int dep = 1;
			// m 记录当前结点的父结点的位置
			int m = nodes[i].getParent();
			// 如果其父结点存在
			while (m != -1 && nodes[m] != null) {
				// 向上继续搜索父结点
				m = nodes[m].getParent();
				dep++;
			}
			if (max < dep) {
				max = dep;
			}
		}
		// 返回最大深度
		return max;
	}
}
