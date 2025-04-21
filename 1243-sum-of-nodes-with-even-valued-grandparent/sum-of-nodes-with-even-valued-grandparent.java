/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, null, null);
        return sum;
    }
    public void dfs(TreeNode currNode, TreeNode parent, TreeNode grandparent){
        if(currNode == null){
            return;
        }
        if(grandparent != null && grandparent.val % 2 == 0){
          sum += currNode.val;
        }
        dfs(currNode.left , currNode, parent); // cuurnode become parent and parent node become grandparent..
        dfs(currNode.right, currNode, parent);
    }
}