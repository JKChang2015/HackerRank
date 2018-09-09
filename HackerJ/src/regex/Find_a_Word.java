package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/find-a-word/problem
 */


import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Find_a_Word {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        String sentences = readSentences(in, N);
        int T = in.nextInt();
        for (int tc = 0; tc < T; tc++) {
            String word = in.next();
            System.out.println(findOccurrenceNum(sentences, word));
        }

        in.close();
    }

    static String readSentences(Scanner sc, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }
        return sb.toString();
    }

    static int findOccurrenceNum(String sentences, String word){
        Pattern pattern = Pattern.compile("(?<![a-zA-Z0-9_])" + word + "(?![a-zA-Z0-9_])");
        Matcher matcher = pattern.matcher(sentences);
        int occurrenceNum = 0;
        while (matcher.find()) {
            occurrenceNum++;
        }
        return occurrenceNum;
    }
}
