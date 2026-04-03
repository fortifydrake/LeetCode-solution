import java.util.*;
/*
// Definition for a Node.*/
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


class Solution {
    public Node connect(Node root) {
        if(root==null)return root;
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node prev=null;
            for(int i=q.size();i>0;i--){
                Node curr=q.poll();
                if(prev!=null){
                    prev.next=curr;
               }
                prev=curr;
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        return root;
    }
}
public class PopulatingNextRightPointersin_Each_Node {
    public static void main(String[] args){
        Solution var1 = new Solution();
        System.out.println("test case 1:");
        Node var2 = new Node(1);
        var2.left=new Node(2);
        var2.right=new Node(3);
        var2.left.left=new Node(4);
        var2.left.right=new Node(5);
        var2.right.left=new Node(6);
        var2.right.right=new Node(7);
        Node var3 = var1.connect(var2);
        System.out.println("output:");
        while(var3!=null){
            Node curr=var3;
            while(curr!=null){
                System.out.print(curr.val+" ");
                if(curr.next==null){
                    System.out.print("# ");
                }
                else{
                    System.out.print("-> ");
                }
                curr=curr.next;

            }
            System.out.println("");
            var3=var3.left;
        }
    }
}
