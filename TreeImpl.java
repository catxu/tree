package com.alg.coco;

/**
 * @author catxu
 * @date 2016.07.17
 */
public class TreeImpl {
	public static void main(String[] args) {
 		String node0 = new String("root");
 		int parent = -1;
		PNode<String> pnode = new PNode<String>(node0, parent);
		System.out.println(pnode.getParent() + ", " + pnode.getData());

		ParentTree ptree = new ParentTree(pnode, 100);
		
		System.out.println(ptree.getSize());

		String s2 = "node1";
		PNode<String> pnode2 = new PNode<String>(s2);
		ptree.addNode(pnode2, pnode);

		System.out.println(ptree.getParent(pnode2));
		System.out.println(ptree.getRoot());
		System.out.println(ptree.getSize());
	}

}
