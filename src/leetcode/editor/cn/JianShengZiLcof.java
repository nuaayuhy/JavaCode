//给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。
//请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18
//。 
//
// 示例 1： 
//
// 输入: 2
//输出: 1
//解释: 2 = 1 + 1, 1 × 1 = 1 
//
// 示例 2: 
//
// 输入: 10
//输出: 36
//解释: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36 
//
// 提示： 
//
// 
// 2 <= n <= 58 
// 
//
// 注意：本题与主站 343 题相同：https://leetcode-cn.com/problems/integer-break/ 
// Related Topics 数学 动态规划 
// 👍 192 👎 0

package leetcode.editor.cn;
//Java：剪绳子
public class JianShengZiLcof{
    public static void main(String[] args) {
        Solution solution = new JianShengZiLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int cuttingRope(int n) {
        // 贪心法
//        if(n < 2){
//            return  0;
//        }
//        if(n == 2){
//            return 1;
//        }
//        if(n == 3){
//            return 2;
//        }
//        // 尽可能将绳子拆成3段，如果出现3，1，则把3 + 1变成 2 + 2
//        int timeOf3 = n / 3;
//        if(n - timeOf3 * 3 == 1)
//            timeOf3 --;
//        int timeOf2 = (n-timeOf3 * 3) / 2;
//        return (int) (Math.pow(3, timeOf3))* (int) (Math.pow(2, timeOf2));

        // 动态规划法:dp[n]表示长度为n的绳子的最大乘积.可以先尝试剪个长度j，剩下的i - j可剪可不剪
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                dp[i] = Math.max(dp[i],Math.max(j *(i - j), j * dp[i - j]));
            }
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}