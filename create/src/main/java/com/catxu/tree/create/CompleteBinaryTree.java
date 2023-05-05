package com.catxu.tree.create;

import com.catxu.tree.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author catxu
 */
public class CompleteBinaryTree {

    public static TreeNode arrayToCBT(Integer[] nums) {
        // 示例：创建一个简单的完全二叉树
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(nums[0]);
        queue.offer(root);

        for (int i = 1; i < nums.length; i += 2) {
            TreeNode parent = queue.poll();
            TreeNode left = new TreeNode(nums[i]);
            parent.setLeft(left);
            queue.offer(left);

            if (i + 1 < nums.length) {
                TreeNode right = new TreeNode(nums[i + 1]);
                parent.setRight(right);
                queue.offer(right);
            }
        }

        return root;
    }
}
