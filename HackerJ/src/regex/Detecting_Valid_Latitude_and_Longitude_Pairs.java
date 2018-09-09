package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/detecting-valid-latitude-and-longitude/problem
 */


import java.util.Scanner;
import java.util.regex.Pattern;


public class Detecting_Valid_Latitude_and_Longitude_Pairs {
    static final Pattern PATTERN = Pattern.compile(
            "^\\(" +
                    "[+-]?(90(\\.0+)?|([1-8][0-9]|[1-9])(\\.\\d+)?)" +
                    ", " +
                    "[+-]?(180(\\.0+)?|(1[0-7][0-9]|[1-9][0-9]|[1-9])(\\.\\d+)?)" +
                    "\\)$"
    );

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            System.out.println(PATTERN.matcher(line).matches() ? "Valid" : "Invalid");
        }
        in.close();
    }


}
