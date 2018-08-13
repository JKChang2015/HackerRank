package Strings;

/**
 * Created by jkchang
 * 13/08/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/java-substring/problem
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start,end));
    }


}
