package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/programming-language-detection/problem
 */

import java.util.*;
import java.util.regex.Pattern;


public class programming_language_detection {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        String code = readCode(in);

        if (Pattern.compile("^\\s*#include", Pattern.MULTILINE).matcher(code).find()) {
            System.out.println("C");
        } else if (Pattern.compile("^\\s*import java\\.", Pattern.MULTILINE).matcher(code).find()) {
            System.out.println("Java");
        } else {
            System.out.println("Python");
        }

        in.close();

    }
    static String readCode(Scanner sc) {
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }
        return sb.toString();
    }

}
