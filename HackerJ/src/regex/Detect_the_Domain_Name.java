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

public class Detect_the_Domain_Name {
    static final Pattern PATTERN = Pattern.compile("https?://(www\\.|ww2\\.)?([a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+)");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();

        String html = readHtml(in, N);

        SortedSet<String> domainNames = new TreeSet<String>();
        Matcher matcher = PATTERN.matcher(html);

        while (matcher.find()) {
            String domainName = matcher.group(2);
            domainNames.add(domainName);
        }

        System.out.println(String.join(";", domainNames.stream().collect(Collectors.toList())));

        in.close();

    }

    static String readHtml(Scanner sc, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sc.nextLine());
        }
        return sb.toString();
    }

}
