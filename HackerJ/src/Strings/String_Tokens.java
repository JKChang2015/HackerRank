package Strings;

/**
 * Created by jkchang
 * 04/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/java-string-tokens/problem
 * <p>
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 */

import java.util.Scanner;

public class String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] a = scan.nextLine().trim().split("[ !,?\\._'@]+");
        if (a.length == 1 && a[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(a.length);
            for (String s : a)
                System.out.println(s);
        }
        // Write your code here.
        scan.close();
    }
}





