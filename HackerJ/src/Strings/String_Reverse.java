package Strings;

/**
 * Created by jkchang
 * 13/08/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/java-string-reverse/problem
 */


import java.util.Scanner;

public class String_Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder builder = new StringBuilder();

        String B = builder.append(A).reverse().toString();

        System.out.printf(B.equals(A) ? "Yes" : "No");

    }
}
