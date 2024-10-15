
public class RotateArray {

    static void rotate(int[] arr, int k) {
        k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        if (start < end) {
            int temp = start;
            start = end;
            end = temp;
            start++;
            end--;
        }
    }

}