//输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。 
//
// 
//
// 示例 1: 
//
// 输入: [10,2]
//输出: "102" 
//
// 示例 2: 
//
// 输入: [3,30,34,5,9]
//输出: "3033459" 
//
// 
//
// 提示: 
//
// 
// 0 < nums.length <= 100 
// 
//
// 说明: 
//
// 
// 输出结果可能非常大，所以你需要返回一个字符串而不是整数 
// 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0 
// 
// Related Topics 排序 
// 👍 181 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

//Java：把数组排成最小的数
public class BaShuZuPaiChengZuiXiaoDeShuLcof{
    public static void main(String[] args) {
        Solution solution = new BaShuZuPaiChengZuiXiaoDeShuLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String minNumber(int[] nums) {
        //可以看成字符串排序，在比较两个字符串 S1 和 S2 的大小时，应该比较的是 S1+S2
        // S2+S1 的大小，如果 S1+S2 < S2+S1，那么应该把 S1 排在前面，否则应该把 S2 排在前面。
        if(nums == null || nums.length == 0)
            return "";
        int n = nums.length;
        String[] str = new String[n];
        //int[] --->String[]
        for (int i = 0; i < n; i++) {
            str[i] = nums[i] + "";
        }
        Arrays.sort(str,(s1,s2) -> (s1 + s2).compareTo(s2 + s1));
        String ret = "";
        for(String s:str){
            ret += s;
        }
        return ret;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}