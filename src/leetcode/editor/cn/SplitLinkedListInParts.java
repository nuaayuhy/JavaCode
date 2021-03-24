//给定一个头结点为 root 的链表, 编写一个函数以将链表分隔为 k 个连续的部分。 
//
// 每部分的长度应该尽可能的相等: 任意两部分的长度差距不能超过 1，也就是说可能有些部分为 null。 
//
// 这k个部分应该按照在链表中出现的顺序进行输出，并且排在前面的部分的长度应该大于或等于后面的长度。 
//
// 返回一个符合上述规则的链表的列表。 
//
// 举例： 1->2->3->4, k = 5 // 5 结果 [ [1], [2], [3], [4], null ] 
//
// 示例 1： 
//
// 
//输入: 
//root = [1, 2, 3], k = 5
//输出: [[1],[2],[3],[],[]]
//解释:
//输入输出各部分都应该是链表，而不是数组。
//例如, 输入的结点 root 的 val= 1, root.next.val = 2, \root.next.next.val = 3, 且 root.ne
//xt.next.next = null。
//第一个输出 output[0] 是 output[0].val = 1, output[0].next = null。
//最后一个元素 output[4] 为 null, 它代表了最后一个部分为空链表。
// 
//
// 示例 2： 
//
// 
//输入: 
//root = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], k = 3
//输出: [[1, 2, 3, 4], [5, 6, 7], [8, 9, 10]]
//解释:
//输入被分成了几个连续的部分，并且每部分的长度相差不超过1.前面部分的长度大于等于后面部分的长度。
// 
//
// 
//
// 提示: 
//
// 
// root 的长度范围： [0, 1000]. 
// 输入的每个节点的大小范围：[0, 999]. 
// k 的取值范围： [1, 50]. 
// 
//
// 
// Related Topics 链表 
// 👍 126 👎 0

package leetcode.editor.cn;

import java.util.List;

//Java：分隔链表
public class SplitLinkedListInParts{
    public static void main(String[] args) {
        Solution solution = new SplitLinkedListInParts().new Solution();
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
    public ListNode[] splitListToParts(ListNode root, int k) {
        int N = 0;
        ListNode cur = root;
        while(cur != null){
            N ++;
            cur = cur.next;
        }
        int size = N / k;
        int mod = N % k;
        ListNode[] ret = new ListNode[k];
        cur = root;
        for(int i = 0;cur != null && i<k;i++){
            ret[i] = cur;
            //确定分隔数组大小
            int curSize = size + (mod > 0 ? 1 : 0);
            mod --;
            for (int j = 0; j < curSize - 1; j++) {
                cur = cur.next;//定位下一个分隔数组的位置
            }
            //分隔
            ListNode next = cur.next;
            cur.next = null;
            cur = next;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}