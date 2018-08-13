package Strings;

/**
 * Created by jkchang
 * 13/08/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/java-string-compare/problem?h_r=next-challenge&h_v=zen
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        List<String> sub = new ArrayList<String>();
        for (int i = 0; i <= (s.length() - k); i++) {
            sub.add(s.substring(i, k + i));
        }
        Collections.sort(sub);

        return sub.get(0) + "\n" + sub.get(sub.size() - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
