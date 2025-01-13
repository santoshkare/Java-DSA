package Array;

public class MaxArr{
    public static void main(String[] args) {
        int[] arr = { 2,6,8,2,9};
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            large = Math.max(large, arr[i]);
        }
        System.out.println(large);
    }
}