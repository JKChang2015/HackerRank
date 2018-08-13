/**
 * Created by jkchang
 * 10/08/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;

public class Date_and_Time {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));

    }

}
