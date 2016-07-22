package com.catxu.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author catxu
 *
 */
public class ParentChildTree {
	private Node[] nodes;
	private int size;
	private int num;
	// private ChildNode chNode;

	// 初始化一棵有 length 个节点的 parent-child 树，并指定其root节点。
	public ParentChildTree(String data, int length) {
		super();
		this.size = length;
		nodes = new Node[size];
		// System.out.println(size);
		nodes[0] = new Node();
		nodes[0].setData(data);
		nodes[0].setParent(-1);
		num++;
	}

	// // 添加节点，并指定其父节点
	// public void addNode(Node pnode, String data) {
	// int parent = getPos(pnode);
	// for (int i = 0; i < size; i++) {
	// if (nodes[i] == null) {
	// nodes[i] = new Node(parent, data);
	// if (pnode.getFirstChild() == null) {
	// pnode.setFirstChild(new ChildNode(i, null));
	// } else {
	// ChildNode chnode = pnode.getFirstChild();
	// // chnode = chnode.getNextChNode();
	// while (chnode != null) {
	// chnode = chnode.getNextChNode();
	// }
	// // chnode.ncNode = new ChildNode(i, null);
	// chnode = new ChildNode(i, null);
	// }
	// num++;
	// return;
	// }
	// }
	// throw new RuntimeException("树已满");
	// }

	public void addNode(int parent, String data) {
		// int parent = getPos(pnode);
		for (int i = 0; i < size; i++) {
			if (nodes[i] == null) {
				nodes[i] = new Node(parent, data);
				if (nodes[parent].getFirstChild() == null) {
					nodes[parent].setFirstChild(new ChildNode(i, null));
				} else {
					ChildNode chnode = nodes[parent].getFirstChild();
					// chnode = chnode.getNextChNode();
					while (chnode != null) {
						if (chnode.getNextChNode() == null) {
							ChildNode cNode = new ChildNode(i, null);
							chnode.setNextChNode(cNode);
							break;
						}
						chnode = chnode.getNextChNode();
					}
					// ChildNode cNode = new ChildNode(i, null);
					// chnode.setNextChNode(cNode);
				}
				System.out.println("here!!");
				num++;
				return;
			}
		}
		throw new RuntimeException("树已满");
	}

	public int getPos(Node node) {
		for (int i = 0; i < size; i++) {
			if (nodes[i].equals(node)) {
				return i;
			}
		}
		return -1;
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

	// public List<Node> getChildNode(Node node) {
	// ChildNode cn = node.getFirstChild();
	// List<Node> list = new ArrayList<Node>();
	// while (cn.getNextChNode() != null) {
	// // int i = cn.index;
	// list.add(nodes[cn.index]);
	// cn = cn.getNextChNode();
	// }
	// return list;
	// }

	public List<Node> getChildNode(int parent) {
		ChildNode cn = nodes[parent].getFirstChild();
		// System.out.println(nodes[parent].getFirstChild().index);
		List<Node> list = new ArrayList<Node>();
		// while (cn.getNextChNode() != null) {
		while (cn != null) {
			// int i = cn.index;
			list.add(nodes[cn.index]);
			System.out.println("[Debug - getChildNode] " + cn.index);
			cn = cn.getNextChNode(); // 需要在代码里设置 setNextChNode();
			System.out.println("[Debug - getChildNode] " + cn);
		}
		return list;
	}

	public void listAllNodes() {
//		System.out.println(nodes.length);
		System.out.println("List all nodes: ");
		for (int i = 0; i < num; i++) {
			System.out.println(nodes[i].getData());
		}
	}
}
