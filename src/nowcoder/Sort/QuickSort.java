package nowcoder.Sort;

import java.util.Arrays;

/**
 * @author Breeze
 * @date 2021/3/24 20:33
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,45,78,64,52,11,64,55,99,11,18};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right){
        //排序序列中key的左边或右边没有元素时，应当返回
        if(left > right){
           return ;
        }
        //key存放的是基准数
        int key = arr[left];
        int i = left;
        int j = right;
        while(i != j){
            while(arr[j] >= key && i < j){
                j --;
            }
            while(arr[i] <= key && i < j){
                i ++;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //将i处的值与key交换
        arr[left] = arr[i];
        arr[i] = key;

        quickSort(arr, left, i - 1);//处理右边的数
        quickSort(arr, i+1, right);//处理左边的数
        return ;
    }
}
