package regex;

/**
 * Created by jkchang
 * 10/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Find_hackerrank {
    static final Pattern START_PATTERN = Pattern.compile("^hackerrank", Pattern.CASE_INSENSITIVE);
    static final Pattern END_PATTERN = Pattern.compile("hackerrank$", Pattern.CASE_INSENSITIVE);
    static final Pattern START_END_PATTERN = Pattern.compile("^hackerrank$");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();

            if (START_END_PATTERN.matcher(line).find()) {
                System.out.println(0);
            } else if (START_PATTERN.matcher(line).find()) {
                System.out.println(1);
            } else if (END_PATTERN.matcher(line).find()) {
                System.out.println(2);
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }

}
