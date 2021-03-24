//请判断一个链表是否为回文链表。 
//
// 示例 1: 
//
// 输入: 1->2
//输出: false 
//
// 示例 2: 
//
// 输入: 1->2->2->1
//输出: true
// 
//
// 进阶： 
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？ 
// Related Topics 链表 双指针 
// 👍 912 👎 0

package leetcode.editor.cn;

import java.time.chrono.IsoEra;
import java.util.ArrayList;
import java.util.List;

//Java：回文链表
public class PalindromeLinkedList{
    public static void main(String[] args) {
        Solution solution = new PalindromeLinkedList().new Solution();
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
    public boolean isPalindrome(ListNode head) {
        //复制到数组，然后使用双指针
//        List<Integer> array = new ArrayList<>();
//        ListNode cur = head;
//        while(cur != null){
//            array.add(cur.val);
//            cur = cur.next;
//        }
//        for (int i = 0,j = array.size() - 1; i <= j; i++,j--) {
//            if(!array.get(i).equals(array.get(j)))
//                return false;
//        }
//        return true;

        // 快慢指针：切成两半，把后半段反转，然后比较两半是否相等
        if(head == null || head.next == null)
            return true;
        ListNode slow = head,fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
            slow = slow.next;
        cut(head,slow);
        return isEqual(head,reverse(slow));
    }
    private void cut (ListNode head,ListNode cutNode){
        while(head.next != cutNode){
            head = head.next;
        }
        head.next = null;
    }

    private ListNode reverse(ListNode head){
        ListNode pre = null;
        while(head != null){
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    private boolean isEqual(ListNode l1,ListNode l2){
        while(l1 != null && l1 != null){
            if(l1.val != l1.val)
                return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}