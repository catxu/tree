package com.catxu.tree.traversal;

import com.catxu.tree.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author catxu
 */
public class BinaryTreeTraversal {
    /**
     * 前序遍历（递归实现）
     *
     * @param node
     */
    public static void preOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getVal() + " ");
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }

    /**
     * 前序遍历（非递归实现）
     *
     * @param root
     */
    public static void preOrderTraversalIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {
            if (currentNode != null) {
                System.out.print(currentNode.getVal() + " ");
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else {
                currentNode = stack.pop();
                currentNode = currentNode.getRight();
            }
        }
        System.out.println();
    }


    /**
     * 中序遍历（递归实现）
     *
     * @param node
     */
    public static void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.getLeft());
        System.out.print(node.getVal() + " ");
        inOrderTraversal(node.getRight());
    }

    /**
     * 中序遍历（非递归实现）
     *
     * @param root
     */
    public static void inOrderTraversalIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else {
                currentNode = stack.pop();
                System.out.print(currentNode.getVal() + " ");
                currentNode = currentNode.getRight();
            }
        }
    }

    /**
     * 后序遍历（递归实现）
     *
     * @param node
     */
    public static void postOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        System.out.print(node.getVal() + " ");
    }

    /**
     * 后序遍历（非递归实现）
     *
     * @param root
     */
    public static void postOrderTraversalIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        TreeNode lastVisited = null;

        while (currentNode != null || !stack.isEmpty()) {
            if (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            } else {
                TreeNode peekNode = stack.peek();
                if (peekNode.getRight() != null && lastVisited != peekNode.getRight()) {
                    currentNode = peekNode.getRight();
                } else {
                    System.out.print(peekNode.getVal() + " ");
                    lastVisited = stack.pop();
                }
            }
        }
    }

    /**
     * 层序遍历
     *
     * @param root
     */
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                System.out.print(currentNode.getVal() + " ");

                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            }
            System.out.println();
        }
    }

}