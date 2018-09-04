/**
 * Created by jkchang
 * 13/08/2018
 * Tag:
 * Description:
 */

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str = "This is an example string, right?  Yes!";
        String delims = "[ .,?!]+";
        String[] token = str.split(delims);
        System.out.println(Arrays.toString(token));
    }
}
