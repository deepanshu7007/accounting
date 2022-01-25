/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newwork;

import java.util.Scanner;

/**
 *
 * @author deepa
 */
public class FLOW22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = 3, once, last = 0, temp;
        while (val--) {
            temp = s.nextInt();
            once = temp % 10;
            last=0;
            while (temp != 0) {
                
                last = temp % 10;
            temp = temp / 10;
            }
            System.out.println(once + last);
        }
    }
}
