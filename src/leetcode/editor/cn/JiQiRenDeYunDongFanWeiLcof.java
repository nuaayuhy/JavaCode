//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一
//格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但
//它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？ 
//
// 
//
// 示例 1： 
//
// 输入：m = 2, n = 3, k = 1
//输出：3
// 
//
// 示例 2： 
//
// 输入：m = 3, n = 1, k = 0
//输出：1
// 
//
// 提示： 
//
// 
// 1 <= n,m <= 100 
// 0 <= k <= 20 
// 
// 👍 248 👎 0

package leetcode.editor.cn;
//Java：机器人的运动范围
public class JiQiRenDeYunDongFanWeiLcof{
    public static void main(String[] args) {
        Solution solution = new JiQiRenDeYunDongFanWeiLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int m,n;
    int [][] visited;
    public int movingCount(int m, int n, int k) {
        //dfs
        this.m = m;
        this.n = n;
        visited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if((i/10 + i%10 + j/10 + j%10) > k){
                    visited[i][j] = 1;
                }
            }
        }
        return dfs(0,0);
    }

    private int dfs(int x,int y){
        if(x < 0 ||x >= m || y < 0 || y >= n || visited[x][y] == 1){
            return 0;
        }
        visited[x][y] = 1;
        return 1 + dfs(x, y + 1) + dfs(x + 1, y);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}