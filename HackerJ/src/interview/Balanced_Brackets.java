package interview;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;
import java.util.Stack;


public class Balanced_Brackets {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int tc = 0; tc < n; tc++) {
            String s = sc.next();
            System.out.println(isBalanced(s) ? "YES" : "NO");
        }

        sc.close();
    }


    private static boolean isBalanced(String A) {
        Stack<Character> stack = new Stack<Character>();

        for (char bracket : A.toCharArray()) {
            //Check if opening a parenthesis
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
                continue;
            }
            //Check if closing without any open parenthesis
            if (stack.isEmpty()) {
                return false;
            }

            //Check if closing without matching open parenthesis
            //Remove parenthesis from stack if closed correctly
            final char p = stack.pop();
            if ((bracket == '}' && p != '{') ||
                    (bracket == ']' && p != '[') ||
                    (bracket == ')' && p != '(')) {
                return false;
            }
        }
        //Check if all parentheses closed correctly
        return stack.isEmpty();
    }
}