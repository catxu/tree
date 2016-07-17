package com.algorithm.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @author catxu
 * @date 2016.07.17
 */
public class TreeImpl {
	public static void main(String[] args) {
		String node0 = new String("root");
		int parent = -1;
		PNode pnode = new PNode(node0, parent);
		System.out.println(pnode.getParent() + ", " + pnode.getData());

		ParentTree ptree = new ParentTree(pnode, 100);

		System.out.println(ptree.getSize());

		String s2 = "node1";
		PNode pnode2 = new PNode(s2);
		ptree.addNode(pnode2, pnode);

		// System.out.println(ptree.getParent(pnode2));
		System.out
				.println(ptree.getSize() + ", " + ptree.getRoot().getParent());
		System.out.println("Depth: " + ptree.getDeep());
		List<PNode> list = new ArrayList<PNode>();
		list = ptree.geChildren(pnode);
		for (PNode pNode3 : list) {
			System.out.println(pNode3.getData());
		}
	}

}
