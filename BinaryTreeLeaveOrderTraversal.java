/**
 * Definition for a binary tree node.*/
import java.util.*;
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

    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList();
        if(root==null) return result;       

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> visited=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode curr=q.poll();
                visited.add(curr.val);

                if(curr.left!=null){
                    q.add(curr.left);
                }

                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            result.add(visited);

        }
        return result;
    }
}
public class BinaryTreeLeaveOrderTraversal {
    public static void main(String[] args){
        Solution var1 = new Solution();
        System.out.println("test case 1:");
        TreeNode var2 = new TreeNode(3);
        var2.left=new TreeNode(9);
        var2.right=new TreeNode(20);
        var2.right.left=new TreeNode(15);
        var2.right.right=new TreeNode(7);
        List<List<Integer>> var3 = var1.levelOrder(var2);
        for(List<Integer> list:var3){
            for(Integer i:list){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
