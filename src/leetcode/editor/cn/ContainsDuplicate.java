//给定一个整数数组，判断是否存在重复元素。 
//
// 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。 
//
// 
//
// 示例 1: 
//
// 
//输入: [1,2,3,1]
//输出: true 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4]
//输出: false 
//
// 示例 3: 
//
// 
//输入: [1,1,1,3,3,4,3,2,4,2]
//输出: true 
// Related Topics 数组 哈希表 
// 👍 375 👎 0

package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

//Java：存在重复元素
public class ContainsDuplicate{
    public static void main(String[] args) {
        Solution solution = new ContainsDuplicate().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsDuplicate(int[] nums) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int num : nums){
//            if(map.containsKey(num)){
//                map.put(num, map.get(num) + 1);
//            }else {
//                map.put(num, 1);
//            }
//            if(map.get(num) >=2)
//                return true;
//        }
//        return false;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        return set.size() < nums.length;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}