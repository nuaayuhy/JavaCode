//计算给定二叉树的所有左叶子之和。 
//
// 示例： 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
//
//在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24 
//
// 
// Related Topics 树 
// 👍 296 👎 0

package leetcode.editor.cn;

import javax.xml.soap.Node;

//Java：左叶子之和
public class SumOfLeftLeaves{
    public static void main(String[] args) {
        Solution solution = new SumOfLeftLeaves().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 *  */
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        //递归
//        if(root == null)
//            return 0;
//        if(isLeaf(root.left))
//            return  root.left.val + sumOfLeftLeaves(root.right);
//        return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        //迭代
        return root != null ? dfs(root) : 0;

    }

    private int dfs(TreeNode node){
        int ans = 0;
        if(node.left != null){
            ans += isLeaf(node.left) ? node.left.val : dfs(node.left);
        }
        if(node.right != null && !isLeaf(node.right)){
            ans += dfs(node.right);
        }
        return ans;
    }
    private boolean isLeaf(TreeNode node){
        if(node == null){
            return false;
        }
        return node.left == null && node.right == null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}