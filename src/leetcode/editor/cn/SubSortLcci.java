//给定一个整数数组，编写一个函数，找出索引m和n，只要将索引区间[m,n]的元素排好序，整个数组就是有序的。注意：n-m尽量最小，也就是说，找出符合条件的最短
//序列。函数返回值为[m,n]，若不存在这样的m和n（例如整个数组是有序的），请返回[-1,-1]。 
// 示例： 
// 输入： [1,2,4,7,10,11,7,12,6,7,16,18,19]
//输出： [3,9]
// 
// 提示： 
// 
// 0 <= len(array) <= 1000000 
// 
// Related Topics 排序 数组 
// 👍 64 👎 0

package leetcode.editor.cn;

import sun.security.util.Length;

//Java：部分排序
public class SubSortLcci{
    public static void main(String[] args) {
        Solution solution = new SubSortLcci().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //滑动窗口思想
    //1,2,4,7,10,{11,7,12,6},7,16,18,19   左起有序中最大的数，右起有序中最小的数
    //1,2,4,{7,10,11,7,12,6,7},16,18,19
    public int[] subSort(int[] array) {
        if(array == null || array.length < 2)
            return new int[]{-1,-1};
        int len = array.length;
        int i = 0;
        while(i < len - 1 && array[i] <= array[i+1]){
            ++ i;
        }
        int j = len - 1;
        while(j > 0 && array[j] >= array[j-1]){
            j --;
        }
        if(j < i)
            return new int[]{-1,-1};
        int m = i;
        int n = j;
        //调整m,n
        for(int k = i;k <=j;k++){
            while(m > 0 && array[k] < array[m - 1])
                m --;
            while(n < len - 1 && array[k] > array[n + 1])
                n ++;
        }
        return new int[]{m,n};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}