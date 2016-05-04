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
    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root,0);
    }
    int sum = 0;
    public int sumNumbersHelper(TreeNode root, int path){
        if(root == null){
            return sum;
        }
        path = path * 10 + root.val;
        if(root.left == null && root.right == null){
            sum += path;
        }
        if(root.left != null){
            sumNumbersHelper(root.left, path);
        }
        if(root.right != null){
            sumNumbersHelper(root.right, path);
        }
        return sum;
    }
}