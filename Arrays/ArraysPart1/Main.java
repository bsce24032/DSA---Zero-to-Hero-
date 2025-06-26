// import java.util.*;
public class Main {
    public static int LinearSearch(int[] marks, int key) {
        int res = 0;
        for (int i = 0; i < marks.length; i++) {
            if (key == marks[i]) {
                res = i;
            }
        }
        if (res == 0) {
            return -1;
        }
        return res + 1;
    }

    public static int Max(int[] marks) {
        int max = marks[0];
        for (int index = 0; index < marks.length; index++) {
            if (marks[index] >= max) {
                max = marks[index];
            }
        }
        return max;
    }

    public static int BinarySearch(int[] marks, int key) {
        int start = 0;
        int end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (marks[mid] == key) {
                return mid;
            } else if (marks[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void ReverseArr(int[] marks) {
        int first = 0;
        int last = marks.length - 1;
        while (first < last) {
            int temp = marks[last];
            marks[last] = marks[first];
            marks[first] = temp;
            first++;
            last--;
        }
        for (int index = 0; index < marks.length; index++) {
            System.out.println(marks[index]);
        }
    }

    public static void PairsArr(int[] marks) {
        for (int i = 0; i < marks.length; i++) {
            int curr = marks[i];
            for (int j = i + 1; j < marks.length; j++) {
                System.out.print("(" + curr + "," + marks[j] + ")");
            }
            System.out.println();
        }
    }

    public static void SubArr(int[] marks) {
        int ts=0;
        for (int i = 0; i < marks.length; i++) {
            for (int j = i; j < marks.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(marks[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total Sub arrays : " + ts);
    }

    public static void main(String[] args) {
        int[] marks = { 2, 4, 6, 8, 10 };
        SubArr(marks);
        // PairsArr(marks);
        // ReverseArr(marks);
        // int key=2;
        // int res = LinearSearch(marks, key);
        // int res = LinearSearch(marks, key);
        // int res = Max(marks);
        // int res = BinarySearch(marks, key);
        // System.out.println(res);
        // for (int i = 0; i < marks.length; i++) {
        // System.out.println(marks[i]);
        // }
    }
}