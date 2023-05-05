package com.catxu.tree.traversal.test;

import com.catxu.tree.create.BinaryTreeFactory;
import com.catxu.tree.create.BinaryTreeType;
import com.catxu.tree.node.TreeNode;
import com.catxu.tree.print.TreeNodePrinter;
import com.catxu.tree.traversal.BinaryTreeTraversal;

/**
 * @author catxu
 */
public class BinaryTreeTraversalTest {
    public static void main(String[] args) {
        Integer[] nums = {5, 3, 7, 1, -1, 9, 4, 6};
        BinaryTreeFactory factory = new BinaryTreeFactory();
        TreeNode bst = factory.createBinaryTree(nums, BinaryTreeType.BST);

        BinaryTreeTraversal.preOrderTraversal(bst);
        System.out.println();

        BinaryTreeTraversal.inOrderTraversal(bst);
        System.out.println();

        BinaryTreeTraversal.postOrderTraversalIterative(bst);
        System.out.println();

        TreeNodePrinter.print(bst);
    }
}