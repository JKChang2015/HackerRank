package regex;

/**
 * Created by jkchang
 * 10/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Saying_Hi {
    static final Pattern PATTERN = Pattern.compile("^[Hh][Ii]\\s[^Dd].*$");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            Matcher matcher = PATTERN.matcher(line);
            if (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        in.close();
    }
}
