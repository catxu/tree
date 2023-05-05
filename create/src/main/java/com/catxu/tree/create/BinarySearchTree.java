package com.catxu.tree.create;

import com.catxu.tree.node.TreeNode;

import java.util.Arrays;

/**
 * @author catxu
 */
public class BinarySearchTree {

    /**
     * 二叉查找树要么是一棵空树，要么是一棵具有如下性质的非空二叉树：
     * <p>
     * 若左子树非空，则左子树上的所有结点的关键字值均小于根结点的关键字值。
     * <p>
     * 若右子树非空，则右子树上的所有结点的关键字值均大于根结点的关键字值。
     * <p>
     * 左、右子树本身也分别是一棵二叉查找树（二叉排序树）。
     *
     * @param array
     * @return
     */
    public static TreeNode arrayToBST(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        Arrays.sort(array);
        return buildBST(array, 0, array.length - 1);
    }

    private static TreeNode buildBST(Integer[] array, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(array[mid]);

        node.setLeft(buildBST(array, start, mid - 1));
        node.setRight(buildBST(array, mid + 1, end));

        return node;
    }
}
