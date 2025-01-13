package SortingAlgo;

public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int small = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[small]>arr[j]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = { 2,6,8,2,9};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
