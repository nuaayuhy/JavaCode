//给定一个非空且只包含非负数的整数数组 nums，数组的度的定义是指数组里任一元素出现频数的最大值。 
//
// 你的任务是在 nums 中找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。 
//
// 
//
// 示例 1： 
//
// 
//输入：[1, 2, 2, 3, 1]
//输出：2
//解释：
//输入数组的度是2，因为元素1和2的出现频数最大，均为2.
//连续子数组里面拥有相同度的有如下所示:
//[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
//最短连续子数组[2, 2]的长度为2，所以返回2.
// 
//
// 示例 2： 
//
// 
//输入：[1,2,2,3,1,4,2]
//输出：6
// 
//
// 
//
// 提示： 
//
// 
// nums.length 在1到 50,000 区间范围内。 
// nums[i] 是一个在 0 到 49,999 范围内的整数。 
// 
// Related Topics 数组 
// 👍 327 👎 0

package leetcode.editor.cn;

import java.nio.file.FileStore;
import java.util.HashMap;
import java.util.Map;

//Java：数组的度
public class DegreeOfAnArray{
    public static void main(String[] args) {
        Solution solution = new DegreeOfAnArray().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> numsCnt = new HashMap<>();
        Map<Integer,Integer> FirstIndex = new HashMap<>();
        Map<Integer,Integer> LastIndex = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            int num = nums[i];
            numsCnt.put(num, numsCnt.getOrDefault(num, 0) + 1);
            LastIndex.put(num, i);
            if(!FirstIndex.containsKey(num)){
                FirstIndex.put(num, i);
            }
        }
        int max = 0;
        int ret = nums.length;
        for(int num:nums){
            max = Math.max(numsCnt.get(num), max);
        }
        for(int i = 0;i< nums.length;i++){
            if(numsCnt.get(nums[i]) != max)
                continue;
            //num == max的值可能不止一个。因此应当遍历完整个数组，找出最短的
            //length = LastIndex - FirstIndex + 1
            ret = Math.min(LastIndex.get(nums[i]) - FirstIndex.get(nums[i]) + 1,ret);
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}