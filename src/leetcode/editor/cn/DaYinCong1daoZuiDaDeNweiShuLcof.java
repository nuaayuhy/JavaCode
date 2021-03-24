//输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。 
//
// 示例 1: 
//
// 输入: n = 1
//输出: [1,2,3,4,5,6,7,8,9]
// 
//
// 
//
// 说明： 
//
// 
// 用返回一个整数列表来代替打印 
// n 为正整数 
// 
// Related Topics 数学 
// 👍 98 👎 0

package leetcode.editor.cn;

import sun.security.util.Length;

import java.util.ArrayList;

//Java：打印从1到最大的n位数
public class DaYinCong1daoZuiDaDeNweiShuLcof{
    public static void main(String[] args) {
        Solution solution = new DaYinCong1daoZuiDaDeNweiShuLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[] res;
    char[] nums;
    char[] loop = {'0','1','2','3','4','5','6','7','8','9'};
    int count = 0;//数组计数索引
    int x = 0;//x表示递归到第几层
    public int[] printNumbers(int n) {
        //不考虑大数越界
//        int end = (int) Math.pow(10, n) - 1;
//        int[] res = new int[end];
//        for (int i = 0; i < end; i++) {
//            res[i] = i + 1;
//        }
//        return res;

        //考虑大数越界情况下的打印
        //short/int/long取值范围有限，应考虑字符串String类型
        nums = new char[n];
        res = new int[(int)Math.pow(10, n) - 1];//Math.pow返回的是double
        dfs(x,n);//如dfs(0,3)
        return res;

    }

    private void dfs(int x, int n){ //x表示递归到第几层
        //递归终止条件,x == n,此时要向结果数组res中添加数字
        if(x == n){
            String str = String.valueOf(nums);//把字符数组转换为字符串,['0','0','1'] --->"001"
            int temp = Integer.valueOf(str);//字符串转为整数,"001"--->1
            if(temp != 0){//跳过0
                res[count] = temp;
                count ++;
                return ;
            }
            return ;
        }
        for(char ch : loop){
            nums[x] = ch;
            dfs(x+1,n);
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}