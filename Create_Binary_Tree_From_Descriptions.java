/*You are given a 2D integer array descriptions where descriptions[i] = [parenti, childi, isLefti] indicates that parenti is the parent of childi in a binary tree of unique values. Furthermore,

If isLefti == 1, then childi is the left child of parenti.
If isLefti == 0, then childi is the right child of parenti.
Construct the binary tree described by descriptions and return its root.

The test cases will be generated such that the binary tree is valid.
Input: descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
Output: [50,20,80,15,17,19]
Explanation: The root node is the node with value 50 since it has no parent.
The resulting binary tree is shown in the diagram.
 */
//Definition for a binary tree node.
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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> nodes = new HashMap<>();
        // A set to keep track of all children nodes.
        Set<Integer> children = new HashSet<>();

        // Step 1: Populate the map with nodes and establish parent-child relationships.
        for (int[] description : descriptions) {
            int parentVal = description[0];
            int childVal = description[1];
            int isLeft = description[2];

            // Add the child to the set of all children.
            children.add(childVal);

            // Get or create the parent node.
            TreeNode parentNode = nodes.getOrDefault(parentVal, new TreeNode(parentVal));
            nodes.put(parentVal, parentNode);

            // Get or create the child node.
            TreeNode childNode = nodes.getOrDefault(childVal, new TreeNode(childVal));
            nodes.put(childVal, childNode);

            // Link the parent and child nodes.
            if (isLeft == 1) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
        }

        // Step 2: Find the root node.
        // The root is a node that is a parent but never a child.
        for (int parentVal : nodes.keySet()) {
            if (!children.contains(parentVal)) {
                return nodes.get(parentVal);
            }
        }
        return null; 
    }
}


public class Create_Binary_Tree_From_Descriptions {
    
}
