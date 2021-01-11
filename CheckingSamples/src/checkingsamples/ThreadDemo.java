package checkingsamples;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreadDemo extends JFrame {
    JLabel label;

    public ThreadDemo() {
        super("Thread Demo");
        setSize(300,50);

        this.getContentPane().setLayout(new GridLayout(1,2));

        label = new JLabel();
        label.setText(Thread.currentThread().getName());
            System.out.println(EventQueue.getCurrentEvent());    
        this.getContentPane().add(label);

        JButton button = new JButton();
        button.setText("Get Thread");
        
        ActionListener listener = new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
               label.setText(Thread.currentThread().getName());
               e.
            }
        };
        
        button.addActionListener(listener);
        this.getContentPane().add(button);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new ThreadDemo();
    }
}
     
