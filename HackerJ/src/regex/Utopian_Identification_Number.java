package regex;

/**
 * Created by jkchang
 * 10/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Utopian_Identification_Number {
    static final Pattern PATTERN = Pattern.compile("^[a-z]{0,3}[0-9]{2,8}[A-Z]{3,}$");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            System.out.println(PATTERN.matcher(line).matches() ? "VALID" : "INVALID");
        }
        in.close();

    }

}
