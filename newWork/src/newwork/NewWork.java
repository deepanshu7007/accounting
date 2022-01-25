/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newwork;

/**
 *
 * @author deepa
 */
public class NewWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10, loop = 0, group = 1;
        for (int i = 2; i <= n + 1; i++) {
            loop = 0;
            for (int j = 2; j <= n + 1; j++) {
                if (i == j) {
                } else {
                    if (i % j == 0 || j % i == 0) {
                        loop = 1;
                    }
                }
            }
            if (loop == 0) {
                group++;
                System.out.println(i);
            }
        }
        System.out.println(group);
    }

}
