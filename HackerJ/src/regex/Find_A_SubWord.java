package regex;

/**
 * Created by jkchang
 * 09/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/find-substring/problem
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Find_A_SubWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        String sentences = readLines(in, N);

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            String substring = in.next();
            System.out.println(findOccuranceNum(sentences, substring));
        }
        in.close();

    }

    static String readLines(Scanner sc, int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }
        return sb.toString();
    }

    static int findOccuranceNum(String sentences, String substring) {
        int occurenceNum = 0;
        Pattern pattern = Pattern.compile("\\w" + substring + "\\w");
        Matcher matcher = pattern.matcher(sentences);
        while (matcher.find()) {
            occurenceNum++;
        }
        return occurenceNum;

    }

}
