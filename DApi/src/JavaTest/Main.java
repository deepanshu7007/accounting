/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaTest;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame {
  public Main() throws HeadlessException {
    setSize(200, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout(FlowLayout.LEFT));

    JLabel usernameLabel = new JLabel("Username: ");
    JTextField usernameTextField = new JTextField();
    usernameTextField.setPreferredSize(new Dimension(100, 20));
    add(usernameLabel);
    add(usernameTextField);

    usernameTextField.addKeyListener(new KeyAdapter() {
      public void keyReleased(KeyEvent e) {
       System.out.println("Hello world");
      }

      public void keyTyped(KeyEvent e) {
      }

      public void keyPressed(KeyEvent e) {
      }
    });
  }

  public static void main(String[] args) {
    new Main().setVisible(true);
  }
}