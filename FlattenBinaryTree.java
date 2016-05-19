/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left != null){
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = null;
            root.right = left;
            TreeNode right1 = root.right;
            while(right1.right != null){
                right1 = right1.right;
            }
            right1.right = right;
        }
        flatten(root.right);
    }
}