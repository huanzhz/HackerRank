package Java8.Easy;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        double positive = 0;
        double negative = 0;
        double zero = 0;
        int totalcount = arr.length;
        for(int i = 0; i<totalcount; i++)
        {
            positive += arr[i]>0 ? 1:0;
            negative += arr[i]<0 ? 1:0;
            zero     += arr[i]==0 ? 1:0;
        }
        System.out.printf("%.6f \n",positive/totalcount);
        System.out.printf("%.6f \n",negative/totalcount);
        System.out.printf("%.6f",zero/totalcount);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
