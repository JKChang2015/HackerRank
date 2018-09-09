package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/stack-exchange-scraper/problem
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Build_a_Stack_Exchange_Scraper {
    static final Pattern PATTERN = Pattern.compile(
            "id=\"question-summary-(?<id>\\d+)\".*?class=\"question-hyperlink\">(?<title>.+?)</a>.*?class=\"relativetime\">(?<time>.+?)</span>");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String html = readHtml(in);

        Matcher matcher = PATTERN.matcher(html);
        while (matcher.find()) {
            String id = matcher.group("id").trim();
            String title = matcher.group("title").trim();
            String time = matcher.group("time").trim();
            System.out.println(String.join(";", id, title, time));
        }


    }

    static String readHtml(Scanner in) {
        StringBuilder sb = new StringBuilder();
        while (in.hasNextLine()) {
            sb.append(in.nextLine());
        }
        return sb.toString();
    }

}
