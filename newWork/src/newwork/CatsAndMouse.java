/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newwork;

import java.util.Scanner;

public class CatsAndMouse {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int cat1 = s.nextInt();
        int cat2 = s.nextInt();
        int mouse = s.nextInt();
        int res1 = Math.abs(mouse-cat1);
        int res2 = Math.abs(mouse-cat2);
        if(res1>res2){
                    System.out.println("Cat B");
                System.out.println("Mouse");
        }
        else if(res2<res1)
        {
                    System.out.println("Cat A");
                System.out.println("Mouse");
        }
        else
        {
        System.out.println("Mouse");
        }
    }
}
