//给定一个二进制数组， 计算其中最大连续 1 的个数。 
//
// 
//
// 示例： 
//
// 
//输入：[1,1,0,1,1,1]
//输出：3
//解释：开头的两位和最后的三位都是连续 1 ，所以最大连续 1 的个数是 3.
// 
//
// 
//
// 提示： 
//
// 
// 输入的数组只包含 0 和 1 。 
// 输入数组的长度是正整数，且不超过 10,000。 
// 
// Related Topics 数组 
// 👍 218 👎 0

package leetcode.editor.cn;

import javafx.scene.shape.Circle;

import java.util.Currency;

//Java：最大连续 1 的个数
public class MaxConsecutiveOnes{
    public static void main(String[] args) {
        Solution solution = new MaxConsecutiveOnes().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /*
        给定一个二进制数组，计算其中最大连续1的个数
    */
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur = 0;
        int max = 0;
        for(int num: nums){
            cur = num == 0 ? 0 : cur + 1;
            max = Math.max(max, cur);
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}