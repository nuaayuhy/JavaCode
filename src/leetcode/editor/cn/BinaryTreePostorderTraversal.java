//给定一个二叉树，返回它的 后序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [3,2,1] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 
// 👍 545 👎 0

package leetcode.editor.cn;

import com.sun.org.apache.bcel.internal.generic.RET;
import sun.reflect.generics.tree.Tree;

import java.util.*;

//Java：二叉树的后序遍历
public class BinaryTreePostorderTraversal{
    public static void main(String[] args) {
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
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
    public List<Integer> postorderTraversal(TreeNode root) {
        //1. 递归写法
//        List<Integer> ret = new ArrayList<>();
//        if(root == null)
//            return ret;
//        postorderTraversal(root.left);
//        postorderTraversal(root.right);
//        ret.add(root.val);
//        return ret;

        //2. 迭代写法
        List<Integer> ret = new ArrayList<>();
        if(root == null)
            return ret;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.peek();
            if((curr.left == null && curr.right == null) || (pre != null && (pre == curr.left || pre == curr.right))){
                ret.add(curr.val);
                pre = curr;
                stack.pop();
            }else{
                if(curr.right != null)
                    stack.push(curr.right);
                if(curr.left != null)
                    stack.push(curr.left);
            }
        }
        return ret;

        //3.利用前序遍历
//        List<Integer> ret = new ArrayList<>();
//        Stack<TreeNode> stack = new Stack<>();
//        stack.push(root);
//        while(!stack.isEmpty()){
//            TreeNode node = stack.pop();
//            if(node == null) continue;
//            stack.push(node.left);  // 先左后右，保证右子树先遍历
//            stack.push(node.right);
//            ret.add(node.val);
//        }
//        //先序"根左右"，后序"根右左"，反转list，得到"左右根"
//        Collections.reverse(ret);
//        return ret;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}