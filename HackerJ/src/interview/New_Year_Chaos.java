package interview;

/**
 * Created by jkchang
 * 06/09/2018
 * Tag:
 * Description:
 */

import java.util.Scanner;

public class New_Year_Chaos {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());
        while (T-- > 0) {
            final int n = sc.nextInt();
            final Person[] a = new Person[n];
            for (int i = 0; i < n; ++i) {
                a[i] = new Person(sc.nextInt());
            }

            final int n_dec = n - 1;
            int counter = 0;

            RECOVER:
            for (int i = 0; i < n_dec; ++i) {
                final int d = a[i].firstPosition - i;
                if (d > 3) {
                    counter = -1;
                    break;
                } else if (d != 1) {
                    for (int j = n_dec - 1; j >= i; --j) {
                        if (a[j].firstPosition > a[j + 1].firstPosition) {
                            if (!a[j].bribes()) {
                                counter = -1;
                                break RECOVER;
                            }
                            final Person temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                            ++counter;
                        }
                    }
                }
            }
            System.out.println(counter > -1 ? counter : "Too chaotic");
        }

    }

}

class Person {
    final int firstPosition;
    private int bribesChance = 2;

    Person(final int finalPosition) {
        this.firstPosition = finalPosition;
    }

    boolean bribes() {
        if (bribesChance == 0) {
            return false;
        }
        --bribesChance;
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(firstPosition);
    }

}
