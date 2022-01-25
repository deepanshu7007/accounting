/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newwork;

public class TimeConversion {

    public static void main(String[] args) {
        String time = "12:45:54PM";
        if (time.endsWith("PM")) {
            time = time.replace("PM", "");
            String[] timeArr = time.split(":", 2);
            int hh = Integer.parseInt(timeArr[0]);
            hh += 12;
            String newTime = String.valueOf(hh) +":" +timeArr[1];
            System.out.println(newTime);
        } else {
            time = time.replace("AM", "");
            if(time.startsWith("12"))
            {
            time = time.replace("12","00");
            }
            System.out.println(time);
        }
    }
}
