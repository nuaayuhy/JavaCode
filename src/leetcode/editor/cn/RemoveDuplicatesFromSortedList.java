//给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
//
// 示例 1: 
//
// 输入: 1->1->2
//输出: 1->2
// 
//
// 示例 2: 
//
// 输入: 1->1->2->3->3
//输出: 1->2->3 
// Related Topics 链表 
// 👍 494 👎 0

package leetcode.editor.cn;
//Java：删除排序链表中的重复元素
public class RemoveDuplicatesFromSortedList{
    public static void main(String[] args) {
        Solution solution = new RemoveDuplicatesFromSortedList().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 *  */
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //递归
//        if(head == null || head.next ==  null)
//            return head;
//        head.next = deleteDuplicates(head.next);
//        return head.val == head.next.val ? head.next : head;

        //非递归
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val != cur.next.val){
                cur = cur.next;
            }else{
                cur.next = cur.next.next;
            }
        }
        return head;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}