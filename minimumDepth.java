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
    public int minDepth(TreeNode root) {
        if(root==null)return 0;
        int min = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            min++;
            for(int i=0;i<n;i++){
                TreeNode curr = q.poll();
                if(curr.left == null && curr.right == null) return min;
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
            
        }

        return 0;
    }
}
public class minimumDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution sol = new Solution();
        int minDepth = sol.minDepth(root);
        System.out.println("Minimum Depth of the Binary Tree: " + minDepth);
    }
}
