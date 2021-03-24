//输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。 
//
// 
//
// 示例 1： 
//
// 输入：head = [1,3,2]
//输出：[2,3,1] 
//
// 
//
// 限制： 
//
// 0 <= 链表长度 <= 10000 
// Related Topics 链表 
// 👍 113 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;

//Java：从尾到头打印链表
public class CongWeiDaoTouDaYinLianBiaoLcof{
    public static void main(String[] args) {
        Solution solution = new CongWeiDaoTouDaYinLianBiaoLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 *  */
public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }

class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode currNode = head;
        int len = 0;
        while(currNode !=null){
            len ++;
            currNode = currNode.next;
        }
        int[] ret = new int[len];
        if(head ==null)
            return new int[0];
        currNode = head;
        while(currNode !=null){
            ret[len - 1] = currNode.val;
            len --;
            currNode = currNode.next;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}