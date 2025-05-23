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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p==q;
        }
     //boolean isleftsam = isSameTree(p.left, q.left);
   // boolean isrightsam = isSameTree(p.right, q.right);
      
     // return isleftsam && isrightsam && p.val == q.val;  
     return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}