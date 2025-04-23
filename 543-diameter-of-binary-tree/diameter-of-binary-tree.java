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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       heightD(root);
       return maxDiameter; 
    }
    public int heightD(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftH = heightD(root.left);
        int rightH = heightD(root.right);
        maxDiameter = Math.max(maxDiameter, leftH + rightH);
        return Math.max(leftH,rightH) + 1; // find path at node..
    }
}