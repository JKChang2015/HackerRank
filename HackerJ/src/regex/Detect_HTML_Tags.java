package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/detect-html-tags/problem
 */

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Detect_HTML_Tags {
    static final Pattern PATTERN = Pattern.compile("<\\s*(\\w+)[^<>]*>",Pattern.MULTILINE);
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        String html = readHtml(in,N);

        SortedSet<String> tags = new TreeSet<String>();
        Matcher matcher = PATTERN.matcher(html);
        while(matcher.find()){
            String tag = matcher.group(1);
            tags.add(tag);
        }
        System.out.println(String.join(";", tags.toArray(new String[0])));
        in.close();

    }
    static String readHtml(Scanner sc, int N){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            sb.append(sc.nextLine());
        }
        return sb.toString();
    }

}
