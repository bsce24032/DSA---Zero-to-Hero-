import java.util.*;

public class part2 {
    public static int MaxSubArray_BruteForce(int arr[]) { // brute force
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                curr = 0;
                for (int k = start; k <= end; k++) {
                    curr += arr[k];
                }
                if (curr > max) {
                    max = curr;
                }
            }
        }
        return max;
    }

    public static int MaxSubArray_PrefixSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                curr = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (curr > max) {
                    max = curr;
                }
            }
        }
        return max;
    }

    public static int MaxSubArray_Kadans(int arr[]) {  
        int curr = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i],curr+arr[i]);
            max = Math.max(curr,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 11, 4 };
        // System.out.println(arr.length);
        // System.out.println("hello world");
        int max = MaxSubArray_BruteForce(arr);
        int max2 = MaxSubArray_PrefixSum(arr);
        int max3 = MaxSubArray_Kadans(arr);
        System.out.println(max);
        System.out.println(max2);
        System.out.println(max3);
    }
}