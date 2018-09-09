package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_the_Phone_Numbers {

    static final Pattern PATTERN = Pattern.compile("(?<CountryCode>\\d{1,3})[- ](?<LocalAreaCode>\\d{1,3})[- ](?<Number>\\d{4,10})");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            Matcher matcher = PATTERN.matcher(line);
            String countryCode = matcher.group("CountryCode").trim();
            String localAreaCode = matcher.group("LocalAreaCode").trim();
            String number = matcher.group("Number").trim();

            System.out.println(
                    String.format("CountryCode=%s,LocalAreaCode=%s,Number=%s", countryCode, localAreaCode, number));
        }
        in.close();
    }
}
