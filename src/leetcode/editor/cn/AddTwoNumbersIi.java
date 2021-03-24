//给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。 
//
// 你可以假设除了数字 0 之外，这两个数字都不会以零开头。 
//
// 
//
// 进阶： 
//
// 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。 
//
// 
//
// 示例： 
//
// 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 8 -> 0 -> 7
// 
// Related Topics 链表 
// 👍 356 👎 0

package leetcode.editor.cn;

import java.util.List;
import java.util.Stack;
import java.util.zip.CRC32;

//Java：两数相加 II
public class AddTwoNumbersIi{
    public static void main(String[] args) {
        Solution solution = new AddTwoNumbersIi().new Solution();
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //逆序首先想到栈
        Stack<Integer> l1Stack = buildStack(l1);
        Stack<Integer> l2Stack = buildStack(l2);
        ListNode head = new ListNode(-1);//哑节点
        int carry = 0;
        while(!l1Stack.isEmpty() || !l2Stack.isEmpty()){
            int n1 = l1Stack.isEmpty() ? 0 : l1Stack.pop();
            int n2 = l2Stack.isEmpty() ? 0 : l2Stack.pop();
            int sum = n1 + n2 + carry;
            ListNode node = new ListNode(sum % 10);
            node.next = head.next;
            head.next = node;
            carry = sum / 10;
        }
        return head.next;
        //2、反转链表求和，退化为两数之和。
    }

    private Stack<Integer> buildStack(ListNode l){
        Stack<Integer> stack = new Stack<>();
        while(l != null){
            stack.push(l.val);
        }
        return stack;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}