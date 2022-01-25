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
public class atoi {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        
        Long val = Long.parseLong(str.trim());
        
        
        if(val>Integer.MAX_VALUE)
        {
            val=(long)Integer.MAX_VALUE;
            
        }
        if(val<Integer.MIN_VALUE)
        {
            val=(long)Integer.MIN_VALUE;
            
        }
        System.out.println(val);
    }
}
