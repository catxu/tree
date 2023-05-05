package com.catxu.tree.create.test;

import com.catxu.tree.create.BinaryTreeFactory;
import com.catxu.tree.create.BinaryTreeType;
import com.catxu.tree.node.TreeNode;
import com.catxu.tree.print.TreeNodePrinter;

/**
 * @author catxu
 */
public class BinaryTreeFactoryTest {

    public static void main(String[] args) {
        BinaryTreeFactory factory = new BinaryTreeFactory();

        Integer[] nums = {5, 3, 7, 1, -1, 9, 4, 6};
        TreeNode bst = factory.createBinaryTree(nums, BinaryTreeType.BST);
        TreeNodePrinter.print(bst);

        TreeNode cbt = factory.createBinaryTree(nums, BinaryTreeType.BT);
        TreeNodePrinter.print(cbt);
    }

}
