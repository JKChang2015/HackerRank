package interview;

/**
 * Created by jkchang
 * 06/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */

import java.io.IOException;
import java.util.Scanner;

public class _2D_Array {

    public static void main(String[] args) throws IOException {

        // load the array
        int[][] arr = new int[6][6];
        int max = -63;
        int sum = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        // for each hourglasses
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (max < sum)
                    max = sum;
            }
        }

        System.out.println(max);

    }

}
