package test;

/**
 * Created by jkchang
 * 06/09/2018
 * Tag:
 * Description: https://www.includehelp.com/java-programs/minimum-swaps-required-to-sort-an-array.aspx
 */

import java.util.Scanner;

public class Swap {

    static int minimumSwaps(int[] arr) {
        int swap = 0;
        boolean visted[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int j = i;
            int cycle = 0;

            while (!visted[j]) {
                visted[j] = true;
                j = arr[j] - 1;
                cycle++;

            }
            if (cycle != 0) {
                swap += cycle - 1;
            }

        }
        return swap;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = minimumSwaps(arr);
        System.out.println(res);
        scanner.close();
    }

}
