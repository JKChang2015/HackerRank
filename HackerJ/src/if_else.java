/**
 * Created by jkchang
 * 10/08/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/java-if-else/problem
 */

import java.util.Scanner;

public class if_else {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");

        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        }

        scan.close();
    }

}
