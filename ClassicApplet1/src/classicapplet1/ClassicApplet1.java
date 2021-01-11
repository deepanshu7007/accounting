/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classicapplet1;

import javacard.framework.*;
import.awt.*;
import java.applet.Applet;
import java.awt.event.*;
/*<applet code="RepaintJavaExample.class" width="350" height="150"> </applet>*/
public class RepaintJavaExample extends Applet implements MouseListener
{
        private int mouseX, mouseY;
        private boolean mouseclicked = false;
        public void init()
        {
          setBackground(Color.CYAN);
          addMouseListener(this);
        }
        public void mouseClicked(MouseEvent e)
        {
          mouseX = e.getX();
          mouseY=e.getY();
          mouseclicked = true;
          repaint();
        }
        public void mouseEntered(MouseEvent e){};
        public void mousePressed(MouseEvent e){};
        public void mouseReleased(MouseEvent e){};
        public void mouseExited(MouseEvent e){};
        public void paint( Graphics g )
        {
           String str;
           g.setColor(Color.RED);
           if (mouseclicked)
           {
             str = "X="+ mouseX + "," + "Y="+ mouseY ;
             g.drawString(str,mouseX,mouseY);
             mouseclicked = false;    
           }
        }
}