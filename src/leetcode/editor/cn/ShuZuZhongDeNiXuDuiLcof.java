//在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。 
//
// 
//
// 示例 1: 
//
// 输入: [7,5,6,4]
//输出: 5 
//
// 
//
// 限制： 
//
// 0 <= 数组长度 <= 50000 
// 👍 359 👎 0

package leetcode.editor.cn;
//Java：数组中的逆序对
public class ShuZuZhongDeNiXuDuiLcof{
    public static void main(String[] args) {
        Solution solution = new ShuZuZhongDeNiXuDuiLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int cnt;
    private int[] tmp;//创建一个临时数组
    public int reversePairs(int[] nums) {
        // 1、暴力，o(n2)，超时
//        int n = nums.length;
//        int cnt = 0;
//        for(int i = 0;i<n;i++){
//            for (int j = i+1; j < n; j++) {
//                if(nums[i] > nums[j])
//                    cnt ++;
//            }
//        }
//        return cnt;

        // 2、归并排序，o(nlogn)
        int n = nums.length;
        tmp = new int[n];
        return mergeSort(nums,0,n - 1);
    }

    private int mergeSort(int[] nums,int l,int r){
        //终止条件
        if(l >=r)
            return 0;
        //递归划分
        int m = (l + r)/2;
        int cnt = mergeSort(nums,1, m) + mergeSort(nums,m+1, r);
        //合并阶段
        //int i = 1,j = m+1;
        int i = l,j = m+1;
        for (int k = l; k<= r ; k++) {
            tmp[k] = nums[k];
        }
        for (int k = l; k<= r ; k++) {
            if(i == m + 1){
                nums[k] = tmp[j++];
            } else if(j == r + 1 || tmp[i] <= tmp[j]){
                nums[k] = tmp[i++];
            } else{
                nums[k] = tmp[j ++];
                cnt += m - i + 1;//统计逆序对
            }
        }
        return cnt;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}