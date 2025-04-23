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
        maxPath(root);
        return maxDiameter;
    }
    public int maxPath(TreeNode node){
        if(node == null){
            return 0;
        }
        int leftPath = maxPath(node.left);
        int rightPath = maxPath(node.right);

        maxDiameter = Math.max(leftPath + rightPath, maxDiameter);
        return Math.max(leftPath,rightPath) + 1;
    }
}