//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。 
//
// 
//
// 示例 1： 
//
// 输入：nums = [3,4,3,3]
//输出：4
// 
//
// 示例 2： 
//
// 输入：nums = [9,1,7,9,7,9,7]
//输出：1 
//
// 
//
// 限制： 
//
// 
// 1 <= nums.length <= 10000 
// 1 <= nums[i] < 2^31 
// 
//
// 
// 👍 149 👎 0

package leetcode.editor.cn;

import java.util.HashMap;

//Java：数组中数字出现的次数 II
public class ShuZuZhongShuZiChuXianDeCiShuIiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongShuZiChuXianDeCiShuIiLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i],3);
            }else
                map.put(nums[i],1);
        }
        int[] ret = new int[2];
        int index = 0;
        // i< map.size()时输出的结果为[1,0]
        for (int i = 0; i < nums.length; i++) {
            if(map.get(nums[i]) == 1)
                ret[index ++] = nums[i];
        }
        return ret[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}