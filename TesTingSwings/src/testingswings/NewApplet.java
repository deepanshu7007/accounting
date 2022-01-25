/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testingswings;
import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
public class NewApplet extends Applet {

    @Override
    public void init() {   
        System.out.println("Inside init");
        setBackground(Color.RED);
    }
    public void start(){
    System.out.println("Inside start");
    }
    public void paint(Graphics g)
    {
        System.out.println("Inside Paint");
        g.setFont(new Font("Serif",Font.BOLD,18));
        g.drawString("Hello World",getPreferredSize().width,getPreferredSize().height+20);
    }
    public void stop(){
    System.out.println("Indise Stop");
    }
    public void destroy()
    {
    System.out.println("Inside destoyed");
    System.out.println(getCodeBase());
    System.out.println(getDocumentBase());
    }
}
