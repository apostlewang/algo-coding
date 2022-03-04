package practice.basicsort;
import java.util.Arrays;

public class SelectionSort {
    void selectionSort(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            //交换的第一方为arr[i]
            //交换的另一方为arr[minIdx]
            //minIdx为[i,n)区间内的最小值的index
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        new SelectionSort().selectionSort(new int[]{1,2,5,4,0},5);
        new SelectionSort().selectionSort(new int[]{0,1,5,4,0},5);
    }
}
