package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Detect_the_Email_Addresses {

    static final Pattern PATTERN = Pattern.compile("[a-zA-Z0-9_]+@[a-zA-Z0-9_]+");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        String text = readText(in, N);

        SortedSet<String> emails = new TreeSet<String>();
        Matcher matcher = PATTERN.matcher(text);
        while (matcher.find()) {
            String email = matcher.group();
            emails.add(email);
        }
        System.out.println(String.join(";", emails.stream().collect(Collectors.toList())));

        in.close();
    }

    static String readText(Scanner sc, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }
        return sb.toString();
    }

}
