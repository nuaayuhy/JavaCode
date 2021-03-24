//给定一个二叉树，在树的最后一行找到最左边的值。 
//
// 示例 1: 
//
// 
//输入:
//
//    2
//   / \
//  1   3
//
//输出:
//1
// 
//
// 
//
// 示例 2: 
//
// 
//输入:
//
//        1
//       / \
//      2   3
//     /   / \
//    4   5   6
//       /
//      7
//
//输出:
//7
// 
//
// 
//
// 注意: 您可以假设树（即给定的根节点）不为 NULL。 
// Related Topics 树 深度优先搜索 广度优先搜索 
// 👍 161 👎 0

package leetcode.editor.cn;

import javafx.scene.transform.Rotate;

import java.util.LinkedList;
import java.util.Queue;

//Java：找树左下角的值
public class FindBottomLeftTreeValue{
    public static void main(String[] args) {
        Solution solution = new FindBottomLeftTreeValue().new Solution();
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
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            root = queue.poll();
            //注意先是右孩子入队
            if(root.right != null)
                queue.add(root.right);
            if(root.left != null)
                queue.add(root.left);
        }
        return root.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}