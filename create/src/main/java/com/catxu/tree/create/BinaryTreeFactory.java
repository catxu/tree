package com.catxu.tree.create;

import com.catxu.tree.node.TreeNode;

/**
 * @author catxu
 */
public class BinaryTreeFactory {

    public TreeNode createBinaryTree(Integer[] nums, BinaryTreeType type) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        switch (type) {
            case BST:
                return createBST(nums);
            case BT:
                return createCBT(nums);
            default:
                throw new IllegalArgumentException("Invalid binary tree type");
        }
    }

    private TreeNode createBST(Integer[] nums) {
        // 使用 BinarySearchTree 类创建 BST
        return BinarySearchTree.arrayToBST(nums);
    }

    private TreeNode createCBT(Integer[] nums) {
        return CompleteBinaryTree.arrayToCBT(nums);
    }
}
