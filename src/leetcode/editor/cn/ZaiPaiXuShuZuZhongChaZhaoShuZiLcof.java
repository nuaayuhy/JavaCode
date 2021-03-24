//统计一个数字在排序数组中出现的次数。 
//
// 
//
// 示例 1: 
//
// 输入: nums = [5,7,7,8,8,10], target = 8
//输出: 2 
//
// 示例 2: 
//
// 输入: nums = [5,7,7,8,8,10], target = 6
//输出: 0 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
//
// 
//
// 注意：本题与主站 34 题相同（仅返回值不同）：https://leetcode-cn.com/problems/find-first-and-last-
//position-of-element-in-sorted-array/ 
// Related Topics 数组 二分查找 
// 👍 107 👎 0

package leetcode.editor.cn;

import javax.swing.text.html.HTML;
import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

//Java：在排序数组中查找数字 I
public class ZaiPaiXuShuZuZhongChaZhaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new ZaiPaiXuShuZuZhongChaZhaoShuZiLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        //1、如果数组无序
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num : nums){
//            if(map.containsKey(num)){
//                map.put(num,map.get(num) + 1);
//            }else{
//                map.put(num, 1);
//            }
//        }
//        for(Map.Entry<Integer,Integer> i : map.entrySet()){
//            if(i.getKey() == target){
//                return i.getValue();
//            }
//        }
//        return 0;
        //2、如果数组有序：二分查找
        return solve(nums,target) - solve(nums,target - 1);
    }
    private  int solve(int[] nums,int target){
        int l = 0,h = nums.length - 1;
        while(l <= h){
            int m = (l + h) / 2;
            if(target < nums[m]){
                h = m -1;
            }else
                l = m + 1;
        }
        return l;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}