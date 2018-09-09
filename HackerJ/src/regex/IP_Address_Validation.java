package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/ip-address-validation/problem
 */

import java.util.Scanner;


public class IP_Address_Validation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            if (isIP4(line)) {
                System.out.println("IPv4");
            } else if (isIP6(line)) {
                System.out.println("IPv6");
            } else {
                System.out.println("Neither");
            }
        }
        in.close();
    }

    static boolean isIP4(String text) {
        String part = "((25[0-5])|(2[0-4][0-9])|([0-1]{0,1}[0-9]{1,2}))";
        String regx = String.format("%s\\.%s\\.%s\\.%s", part, part, part, part);
        return text.matches(regx);

    }

    static boolean isIP6(String text) {
        String part = "[0-9a-f]{1,4}";
        String regx = String.format("%s:%s:%s:%s:%s:%s:%s:%s", part, part,
                part, part, part, part, part, part);
        return text.matches(regx);
    }

}
