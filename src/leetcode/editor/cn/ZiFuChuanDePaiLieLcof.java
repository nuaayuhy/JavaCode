//输入一个字符串，打印出该字符串中字符的所有排列。 
//
// 
//
// 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。 
//
// 
//
// 示例: 
//
// 输入：s = "abc"
//输出：["abc","acb","bac","bca","cab","cba"]
// 
//
// 
//
// 限制： 
//
// 1 <= s 的长度 <= 8 
// Related Topics 回溯算法 
// 👍 212 👎 0

package leetcode.editor.cn;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

//Java：字符串的排列
public class ZiFuChuanDePaiLieLcof{
    public static void main(String[] args) {
        Solution solution = new ZiFuChuanDePaiLieLcof().new Solution();
        // TO TEST
    } 
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    //dfs，考虑重复的情况，剪枝
    List<String> res = new LinkedList<>();
    char[] ch;
    public String[] permutation(String s) {
        ch = s.toCharArray();// ch = ['a','b','c']
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int x){
        if(x == ch.length - 1){
            res.add(String.valueOf(ch));//添加排列方案
            return ;
        }
        HashSet<Character> set = new HashSet<>();//set只是为了避免重复
        for (int i = x; i < ch.length; i++) {
            if(set.contains(ch[i]))
                continue;           //重复，因此剪枝
            set.add(ch[i]);
            swap(i,x);              //交换，将ch[i]固定在第x位
            dfs(x + 1);           //开始固定第x + 1位
            swap(i,x);              //恢复交换
        }

    }

    private void swap(int a,int b){
        char tmp = ch[a];
        ch[a] = ch[b];
        ch[b] = tmp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}