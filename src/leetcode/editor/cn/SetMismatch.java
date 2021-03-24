//集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有
//一个数字重复 。 
//
// 给定一个数组 nums 代表了集合 S 发生错误后的结果。 
//
// 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [1,2,2,4]
//输出：[2,3]
// 
//
// 示例 2： 
//
// 
//输入：nums = [1,1]
//输出：[1,2]
// 
//
// 
//
// 提示： 
//
// 
// 2 <= nums.length <= 104 
// 1 <= nums[i] <= 104 
// 
// Related Topics 哈希表 数学 
// 👍 156 👎 0

package leetcode.editor.cn;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

//Java：错误的集合
public class SetMismatch{
    public static void main(String[] args) {
        Solution solution = new SetMismatch().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        // 1,2,2,4  [2,3]
        // 2,2      [2,1]
    public int[] findErrorNums(int[] nums) {
        //1.暴力
        int dup = -1,missing = -1;
//        for (int i = 1; i <= nums.length; i++) {
//            int count = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[j] == i)
//                    count ++;
//            }
//            if(count == 2){
//                dup = i;
//            }
//            else if(count == 0){
//                missing = i;
//            }
//            if(dup > 0 && missing > 0){
//                break;
//            }
//        }
//        return new int[]{dup,missing};


        //2.排序
//        Arrays.sort(nums);
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i] == nums[i-1])
//                dup = nums[i];
//            else if(nums[i] > nums[i-1] + 1)
//                missing = nums[i-1] + 1;
//        }
//        missing = nums[nums.length - 1] == nums.length ? missing : nums.length;
//        return new int[]{dup,missing};

        //3.map
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            if(map.containsKey(i)){
                if(map.get(i) == 2)
                    dup = i;
            }else
                missing = i;
        }
       return new int[]{dup,missing};

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}