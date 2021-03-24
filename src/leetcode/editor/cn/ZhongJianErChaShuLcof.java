//输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。 
//
// 
//
// 例如，给出 
//
// 前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7] 
//
// 返回如下的二叉树： 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7 
//
// 
//
// 限制： 
//
// 0 <= 节点个数 <= 5000 
//
// 
//
// 注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-
//preorder-and-inorder-traversal/ 
// Related Topics 树 递归 
// 👍 363 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//Java：重建二叉树
public class ZhongJianErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new ZhongJianErChaShuLcof().new Solution();
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
    //缓存中序遍历数组每个值对应的索引
    private Map<Integer,Integer> indexForInOrders = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i = 0;i< inorder.length;i++)
            indexForInOrders.put(inorder[i],i);
        return reConstructBinaryTree(preorder,0,preorder.length - 1,0);
    }
    private TreeNode reConstructBinaryTree(int[] preorder, int preL,int preR,int inL){
        if(preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preL]);
        int index = indexForInOrders.get(root.val);
        int leftTreeSize = index - inL;
        root.left = reConstructBinaryTree(preorder,preL + 1 , preL + leftTreeSize,inL);
        root.right = reConstructBinaryTree(preorder,preL + leftTreeSize + 1,preR,inL + leftTreeSize + 1);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}