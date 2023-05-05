package com.catxu.tree.print;

import com.catxu.tree.node.TreeNode;

/**
 * @author catxu
 */
public class TreeNodePrinter {

    public static void print(TreeNode tree) {
        if (tree == null) {
            System.out.println("null");
            return;
        }
        // 得到树的深度
        int treeDepth = getTreeDepth(tree);

        // 作为整个二维数组的宽度
        int arrayHeight = treeDepth * 2 - 1;
        // 最后一行的宽度为2的（n - 1）次方乘3，再加1
        int arrayWidth = (2 << (treeDepth - 2)) * 3 + 1;
        // 用一个字符串数组来存储每个位置应显示的元素
        String[][] res = new String[arrayHeight][arrayWidth];
        // 对数组进行初始化，默认为一个空格
        for (int i = 0; i < arrayHeight; i++) {
            for (int j = 0; j < arrayWidth; j++) {
                res[i][j] = " ";
            }
        }

        // 从根节点开始，递归处理整个树
        writeArray(tree, 0, arrayWidth / 2, res, treeDepth);

        // 此时，已经将所有需要显示的元素储存到了二维数组中，将其拼接并打印即可
        for (String[] line : res) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < line.length; i++) {
                sb.append(line[i]);
                if (line[i].length() > 1 && i <= line.length - 1) {
                    i += line[i].length() > 4 ? 2 : line[i].length() - 1;
                }
            }
            System.out.println(sb);
        }
    }

    // 用于获得树的层数
    private static int getTreeDepth(TreeNode node) {
        return node == null ? 0 : (1 + Math.max(getTreeDepth(node.getLeft()), getTreeDepth(node.getRight())));
    }

    private static void writeArray(TreeNode currNode, int rowIndex, int columnIndex, String[][] res, int treeDepth) {
        // 保证输入的树不为空
        if (currNode == null || columnIndex < 0 || columnIndex >= res[0].length) return;
        // 先将当前节点保存到二维数组中
        res[rowIndex][columnIndex] = String.valueOf(currNode.getVal());

        // 计算当前位于树的第几层
        int currLevel = ((rowIndex + 1) / 2);
        // 若到了最后一层，则返回
        if (currLevel == treeDepth) return;
        // 计算当前行到下一行，每个元素之间的间隔（下一行的列索引与当前元素的列索引之间的间隔）
        int gap = treeDepth - currLevel - 1;

        // 对左子树节点进行判断，若有左子树节点，则记录相应的"/"与左子树节点的值
        if (currNode.getLeft() != null) {
            res[rowIndex + 1][columnIndex - gap] = "/";
            writeArray(currNode.getLeft(), rowIndex + 2, columnIndex - gap * 2, res, treeDepth);
        }

        // 对右子树节点进行判断，若有右子树节点，则记录相应的"\"与右子树节点的值
        if (currNode.getRight() != null) {
            res[rowIndex + 1][columnIndex + gap] = "\\";
            writeArray(currNode.getRight(), rowIndex + 2, columnIndex + gap * 2, res, treeDepth);
        }
    }
}
