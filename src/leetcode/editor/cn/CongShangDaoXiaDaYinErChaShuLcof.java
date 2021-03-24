//从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。 
//
// 
//
// 例如: 
//给定二叉树: [3,9,20,null,null,15,7], 
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回： 
//
// [3,9,20,15,7]
// 
//
// 
//
// 提示： 
//
// 
// 节点总数 <= 1000 
// 
// Related Topics 树 广度优先搜索 
// 👍 68 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//Java：从上到下打印二叉树
public class CongShangDaoXiaDaYinErChaShuLcof{
    public static void main(String[] args) {
        Solution solution = new CongShangDaoXiaDaYinErChaShuLcof().new Solution();
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
    //使用队列来层次遍历
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        ArrayList<Integer> ret = new ArrayList<>();
        while(!queue.isEmpty()){
            int cnt = queue.size();
            while(cnt -- > 0){
                TreeNode t = queue.poll();
                if(t == null){
                    continue;
                }
                ret.add(t.val);
                queue.offer(t.left);
                queue.offer(t.right);
            }
        }
        int[] ans = new int[ret.size()];
        for (int i = 0; i < ret.size() ; i++) {
            ans[i] = ret.get(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}