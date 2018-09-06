package interview;

/**
 * Created by jkchang
 * 06/09/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */


import java.io.*;
import java.util.*;

public class Array_left_rotation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[size];


        for(int i = 0; i < size; i++) {
            if(n > i)
                arr[size - n + i] = in.nextInt();
            else
                arr[i - n] = in.nextInt();
        }


    }

}
