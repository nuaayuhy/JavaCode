//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。 
//
// 进阶：你能尝试使用一趟扫描实现吗？ 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [1], n = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [1,2], n = 1
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// 链表中结点的数目为 sz 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
// Related Topics 链表 双指针 
// 👍 1285 👎 0

package leetcode.editor.cn;

import java.util.List;
import java.util.Stack;

//Java：删除链表的倒数第 N 个结点
public class RemoveNthNodeFromEndOfList{
    public static void main(String[] args) {
        Solution solution = new RemoveNthNodeFromEndOfList().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * */
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //两次遍历链表
        ListNode dummyNode = new ListNode(0,head);
        ListNode cur = dummyNode;
//        ListNode temp = head;
//        int length = 0;
//        while(temp != null){
//            length ++;
//            temp = temp.next;
//        }

//        for (int i = 1; i < length - n + 1; i++) {
//            cur = cur.next;
//        }
//        cur.next = cur.next.next;
//        return dummyNode.next;

        // 利用栈
//        Stack<ListNode> stack =  new Stack<>();
//        while (cur != null){
//            stack.push(cur);
//        }
//        for (int i = 0; i < n; i++) {
//            stack.pop();
//        }
//        ListNode temp = stack.peek();
//        temp.next = temp.next.next;
//        return dummyNode.next;

        //快慢指针
        ListNode fast = head;
        while(n -- > 0){
            fast = fast.next;
        }
        if(fast == null)
            return head.next;
        ListNode slow = head;
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        //此时slow所指节点即为待删除节点
        //删除节点
        slow.next = slow.next.next;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}