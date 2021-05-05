package com.catxu.tree.traversal;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class TraversalTest01 {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree.setVal(4);
        TreeNode left01 = new TreeNode();
        left01.setVal(2);
        TreeNode left02 = new TreeNode();
        left02.setVal(1);
        left01.setLeft(left02);
        tree.setLeft(left01);
        TreeNode rigth01 = new TreeNode();
        rigth01.setVal(5);
        tree.setRight(rigth01);
        TreeNode left01right = new TreeNode();
        left01right.setVal(3);
        left01.setRight(left01right);
        List<Integer> result = new ArrayList<>();
        preorder(tree, result);
        System.out.println(result);
    }

    private static void preorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.getVal());
        preorder(root.getLeft(), result);
        preorder(root.getRight(), result);
    }
}
