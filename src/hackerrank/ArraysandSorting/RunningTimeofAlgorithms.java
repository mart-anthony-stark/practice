package hackerrank.ArraysandSorting;

import java.util.Scanner;

/**
 * Created by Anthony on 2014/7/1.
 */
public class RunningTimeofAlgorithms {
    public static void insertionSort(int[] A) {
        int shifts = 0;
        for (int i = 1; i < A.length; i++) {
            int value = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > value) {    //原来j > 0有问题
                A[j + 1] = A[j];
                j = j - 1;
                shifts++;
            }
            A[j + 1] = value;
        }
        System.out.println(shifts);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        insertionSort(ar);
    }
}