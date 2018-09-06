package interview;

/**
 * Created by jkchang
 * 06/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

import java.util.Scanner;


public class Array_Manipulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        long[] myArray = new long[n + 1];
        int a, b, k;

        // Loop through all the operations, creating our difArray in-place
        for (int i = 0; i < m; i++) {
            a = in.nextInt();
            b = in.nextInt();
            k = in.nextInt();

            myArray[a] += k;

            // we don't care of tracking N+1
            if (b + 1 <= n) {
                myArray[b + 1] -= k;
            }
        }
        long max = 0;
        long sum = 0;

        for (int j = 0; j <= n; j++) {
            sum += myArray[j];
            if (max < sum) {
                max = sum;
            }
            System.out.println(max);
        }
    }
}
