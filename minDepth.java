/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution{
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int remain;
        if(root.left == null && root.right == null){
            remain = 0;
        }
        else if(root.left == null){
            remain = minDepth(root.right);
        }
        else if(root.right == null){
            remain = minDepth(root.left);
        }
        else{
            remain = Math.min(minDepth(root.left),minDepth(root.right));
        }
        return 1 + remain;
    }
    
}