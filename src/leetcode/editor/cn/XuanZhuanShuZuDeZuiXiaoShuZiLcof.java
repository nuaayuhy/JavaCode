//把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2
//] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。 
//
// 示例 1： 
//
// 输入：[3,4,5,1,2]
//输出：1
// 
//
// 示例 2： 
//
// 输入：[2,2,2,0,1]
//输出：0
// 
//
// 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-sor
//ted-array-ii/ 
// Related Topics 二分查找 
// 👍 263 👎 0

package leetcode.editor.cn;

import java.util.Arrays;

//Java：旋转数组的最小数字
public class XuanZhuanShuZuDeZuiXiaoShuZiLcof{
    public static void main(String[] args) {
        Solution solution = new XuanZhuanShuZuDeZuiXiaoShuZiLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minArray(int[] numbers) {
//        Arrays.sort(numbers);
//        return numbers[0];
        int n = numbers.length;
        if(n == 0)
            return 0;
        int l = 0,h = n - 1;
        while(l < h){
            int m = (l + h) / 2;
            //右区间有序
            if(numbers[m] == numbers[h] && numbers[l] == numbers[m]){
                return minNumber(numbers, l, h);//线性查找
            }else if(numbers[m] > numbers[h]){
                l= m + 1;
            }else
                h = m;
        }
        return numbers[l];
    }

    private int minNumber(int[] numbers, int l, int h) {
        for (int i = l; i < h ; i++) {
            if(numbers[i] > numbers[i + 1])
                return numbers[i+1];
        }
        return numbers[l];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}