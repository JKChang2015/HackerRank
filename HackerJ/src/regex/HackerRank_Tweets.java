package regex;

/**
 * Created by jkchang
 * 10/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class HackerRank_Tweets {
    static final Pattern PATTERN = Pattern.compile("hackerank", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int res = 0;
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();

            if (PATTERN.matcher(line).find()) {
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
