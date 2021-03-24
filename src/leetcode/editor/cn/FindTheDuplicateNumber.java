//给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。 
//
// 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,3,4,2,2]
//输出：2
// 
//
// 示例 2： 
//
// 
//输入：nums = [3,1,3,4,2]
//输出：3
// 
//
// 示例 3： 
//
// 
//输入：nums = [1,1]
//输出：1
// 
//
// 示例 4： 
//
// 
//输入：nums = [1,1,2]
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 2 <= n <= 3 * 104 
// nums.length == n + 1 
// 1 <= nums[i] <= n 
// nums 中 只有一个整数 出现 两次或多次 ，其余整数均只出现 一次 
// 
//
// 
//
// 进阶： 
//
// 
// 如何证明 nums 中至少存在一个重复的数字? 
// 你可以在不修改数组 nums 的情况下解决这个问题吗？ 
// 你可以只用常量级 O(1) 的额外空间解决这个问题吗？ 
// 你可以设计一个时间复杂度小于 O(n2) 的解决方案吗？ 
// 
// Related Topics 数组 双指针 二分查找 
// 👍 1138 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

//Java：寻找重复数
public class FindTheDuplicateNumber{
    public static void main(String[] args) {
        Solution solution = new FindTheDuplicateNumber().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        //不修改数组，不额外使用空间
    public int findDuplicate(int[] nums) {
        //map:占用O(n)的空间
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num : nums){
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for(int num :nums){
//            if(map.get(num) >= 2)
//                return num;
//        }
//        return -1;

        //二分查找法：很常见的做法，使用二分查找法确定一个数的范围
        int l = 1,h = nums.length - 1;
        while(l <= h){
            int mid = (l + h) / 2;//不要把 l写成1啦！！！
            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] <= mid)
                    cnt ++;
            }
            if(cnt > mid)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return l;

        //双指针
//        int slow = nums[0], fast = nums[nums[0]];
//        while (slow != fast) {
//            slow = nums[slow];
//            fast = nums[nums[fast]];
//        }
//        fast = 0;
//        while (slow != fast) {
//            slow = nums[slow];
//            fast = nums[fast];
//        }
//        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}