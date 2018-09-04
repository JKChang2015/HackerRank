package Strings;

/**
 * Created by jkchang
 * 04/09/2018
 * Tag: String
 * Description: https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 * <p>
 * Input Format
 * The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string
 * of any printable characters representing the pattern of a regex.
 * <p>
 * Output Format
 * For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid.
 * Do not print the quotes.
 */


import java.util.Scanner;
import java.util.regex.Pattern;

public class Pattern_Syntax_Checker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern pat = Pattern.compile(pattern);
                System.out.println("Valid");

            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}




