//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。 
//
// 
//
// 示例 1： 
//
// 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
//输出：[1,2,3,6,9,8,7,4,5]
// 
//
// 示例 2： 
//
// 输入：matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//输出：[1,2,3,4,8,12,11,10,9,5,6,7]
// 
//
// 
//
// 限制： 
//
// 
// 0 <= matrix.length <= 100 
// 0 <= matrix[i].length <= 100 
// 
//
// 注意：本题与主站 54 题相同：https://leetcode-cn.com/problems/spiral-matrix/ 
// Related Topics 数组 
// 👍 211 👎 0

package leetcode.editor.cn;


import jdk.nashorn.internal.ir.SplitReturn;

//Java：顺时针打印矩阵
public class ShunShiZhenDaYinJuZhenLcof{
    public static void main(String[] args) {
        Solution solution = new ShunShiZhenDaYinJuZhenLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0){
            return new int[0];
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int n = rows * cols;
        int[] res = new int[n];
        int index = 0;
        int r1 = 0,r2 = matrix.length -1;//行边界值
        int c1 =0, c2 = matrix[0].length -1;//列边界值
        while(r1 <=r2 && c1<=c2){
            for(int i = c1;i <= c2;i++){
               res[index ++] = matrix[r1][i];
            }
            for(int i = r1 + 1;i <= r2;i++){
                res[index ++] = matrix[i][c2];
            }
            if(r1 != r2){
                for(int i = c2 - 1;i >= c1;i--){
                    res[index ++] = matrix[r2][i];
                }
            }
            if(c1 != c2){
                for (int i = r2 - 1; i > r1; i--) {
                    res[index ++] = matrix[i][c1];
                }
            }
            r1 ++;
            r2 --;
            c1 ++;
            c2 --;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}