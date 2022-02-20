package 集合;

/**
 * @author 吕二宁
 * @version 1.0
 * @description: TODO(冒泡排序)
 * @date 2022/2/20 15:23
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 9, 8};

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
