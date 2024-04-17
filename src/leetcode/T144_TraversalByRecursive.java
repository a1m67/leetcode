package leetcode;


import java.util.ArrayList;
import java.util.List;

public class T144_TraversalByRecursive {
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preTravel(root,result);
        return result;
    }
    private static void preTravel(TreeNode root,List<Integer> result) {
        if (root == null) return;
            result.add(root.val);
            preTravel(root.left,result);
            preTravel(root.right,result);
    }
    private static void midTravel(TreeNode root,List<Integer> result) {
        if (root == null) return;
        midTravel(root.left,result);
        result.add(root.val);
        midTravel(root.right,result);
    }

    private static void postTravel(TreeNode root,List<Integer> result) {
        if (root == null) return;
        postTravel(root.left,result);
        postTravel(root.right,result);
        result.add(root.val);
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        root.right = treeNode2;
        treeNode2.left = treeNode3;
        System.out.println(preorderTraversal(root));
    }
}