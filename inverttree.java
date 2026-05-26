/**
 * Definition for a binary tree node.*/
import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if(curr.left!=null){
                q.offer(curr.left);
            }
            
            if(curr.right!=null){
                q.offer(curr.right);
            }
        }

        return root;
    }
}

public class inverttree {

    public static void printTree(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            System.out.print(curr.val + " ");
            
            if(curr.left != null) {
                q.offer(curr.left);
            }
            if(curr.right != null) {
                q.offer(curr.right);
            }
        }
        System.out.println();
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.print("Original tree: ");
        printTree(root);
        
        Solution var1 = new Solution();
        var1.invertTree(root);
        
        System.out.print("Inverted tree: ");
        printTree(root);
    }
}