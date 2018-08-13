package Introduction; /**
 * Created by jkchang
 * 10/08/2018
 * Tag:
 * Description: https://www.hackerrank.com/challenges/java-date-and-time/problem
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Date_and_Time {

    static String getDay(String day, String month, String year) {
        LocalDate dt = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        return dt.getDayOfWeek().toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

}
