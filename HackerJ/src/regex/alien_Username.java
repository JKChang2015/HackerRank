package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/alien-username/problem
 */

import java.util.Scanner;

public class alien_Username {
    static final String REGEX = "^[_.]\\d+[a-zA-Z]*_?$";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String userName = in.nextLine();
            System.out.println(isValid(userName) ? "VALID" : "INVALID");
        }
        in.close();
    }

    static boolean isValid(String username) {
        return username.matches(REGEX);
    }
}
