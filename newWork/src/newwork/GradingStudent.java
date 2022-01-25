package newwork;

import java.util.Scanner;

public class GradingStudent {

    public static void main(String[] args) {
        int val = 4, div, quo, res, rem;
        Scanner s = new Scanner(System.in);
        while (val-- > 0) {
            div = s.nextInt();
            quo = div / 5;
            if (quo <= 6) {
                res = div;
            } else {
                rem = div % 5;
                if (rem < 3) {
                    res = (quo + 1) * 5;
                } else {
                    res = div;
                }
            }
            System.out.println(res);
        }
    }
}
