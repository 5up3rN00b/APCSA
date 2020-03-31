package Diag2020FRE.Diag2020FRE4;

public class ArrayUtil {
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
    }
}
