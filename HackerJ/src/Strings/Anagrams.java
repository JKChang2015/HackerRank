package Strings;

/**
 * Created by jkchang
 * 13/08/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/java-anagrams/problem
 * <p>
 * Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
 * For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
 * Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise,
 * print "Not Anagrams" instead.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {



    public static boolean isAnagram(String a, String b) {
        if (a == null || b == null || a.equals("") || b.equals(""))
            throw new IllegalArgumentException();

        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        // created a hashmap for b frequency
        for (int k = 0; k < b.length(); k++) {
            char letter = b.charAt(k);

            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                Integer freq = map.get(letter);
                map.put(letter, ++freq);
            }
        }


        // using hashmap to check a
        for (int k = 0; k < b.length(); k++) {
            char letter = a.charAt(k);
            if (!map.containsKey(letter)) {
                return false;
            }

            Integer fre = map.get(letter);
            if (fre == 0)
                return false;
            else
                map.put(letter, --fre);
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");


    }

}
