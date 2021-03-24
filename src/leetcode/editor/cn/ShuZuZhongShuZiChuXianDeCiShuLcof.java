//一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [4,1,4,6]
//输出：[1,6] 或 [6,1]
// 
//
// 示例 2： 
//
// 输入：nums = [1,2,10,4,1,4,3,3]
//输出：[2,10] 或 [10,2] 
//
// 
//
// 限制： 
//
// 
// 2 <= nums.length <= 10000 
// 
//
// 
// 👍 335 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

//Java：数组中数字出现的次数
public class ShuZuZhongShuZiChuXianDeCiShuLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] singleNumbers(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],1) + 1);
                //map.put(nums[i],2);
            }else
                map.put(nums[i],map.getOrDefault(nums[i],1));
                //map.put(nums[i],1);
        }
        int[] ret = new int[2];
        int index = 0;
        // i< map.size()时输出的结果为[1,0]
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == 1)
                ret[index ++] = nums[i];
        }
        return ret;
    }

    //位运算

}
//leetcode submit region end(Prohibit modification and deletion)

}