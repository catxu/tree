package com.catxu.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author catxu
 *
 */
public class PCTreeImpl {

	public static void main(String[] args) {
		// ChildNode chNode = new ChildNode(1);
		// ChildNode chNode1 = new ChildNode(2);
		// ChildNode chNode2 = new ChildNode(3);
		// chNode.setNextChNode(chNode1);
		// chNode1.setNextChNode(chNode2);
		//
		// ChildNode chNode3 = new ChildNode(4);
		// ChildNode chNode4 = new ChildNode(5);
		// ChildNode chNode5 = new ChildNode(6);
		// chNode3.setNextChNode(chNode4);
		// chNode4.setNextChNode(chNode5);
		//
		// ChildNode chNode7 = new ChildNode(8);
		// ChildNode chNode8 = new ChildNode(9);
		// chNode7.setNextChNode(chNode8);
		System.out.println("Start");
		// Node node = new Node(-1, "A", chNode);
		int length = 100;
		ParentChildTree pcTree = new ParentChildTree("A", length);
		pcTree.addNode(0, "B");
		pcTree.addNode(0, "C");
		pcTree.addNode(0, "D");

		List<Node> list = new ArrayList<Node>();
		list = pcTree.getChildNode(0);
		for (Node node : list) {
			System.out.println(node.getData());
		}
		System.out.println("Done");
	}
}