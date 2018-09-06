package test; /**
 * Created by jkchang
 * 13/08/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int n = in.nextInt();
        int arr[] = new int[size];

        for (int a_i = 0; a_i < size; a_i++) {
            arr[a_i] = in.nextInt();
        }

        int[] rotated = new int[size];
        for (int i = 0; i < size; i++) {
            rotated[(i + size - n) % size] = arr[i];
        }

        for(int i=0; i < size; i++){
            System.out.print(rotated[i] + " ");
        }


    }
}
