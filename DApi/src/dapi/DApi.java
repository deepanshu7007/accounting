package dapi;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
class DFrame extends JFrame implements KeyListener {
    ArrayList<JTextField> totalTextFields;
    ArrayList<JComboBox> totalComboBox;
    DFrame() {
        setSize(1200,400);
        
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setFocusable(true);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    ArrayList<JTextField> getAllTextFields() {
        totalTextFields = new ArrayList<JTextField>();
        for (Component co : getContentPane().getComponents()) {

            if (co.getClass().equals(JTextField.class)) {

                JTextField jt = (JTextField) co;
                totalTextFields.add(jt);
            }
        }
        return totalTextFields;
    }
    ArrayList<JComboBox> getAllComboBox() {
        totalComboBox = new ArrayList<JComboBox>();
        for (Component co : getContentPane().getComponents()) {
            if (co.getClass().equals(JComboBox.class)) {

                JComboBox jt = (JComboBox) co;
                totalComboBox.add(jt);
            }
        }
        return totalComboBox;
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
    }
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == (KeyEvent.VK_ESCAPE)) {
            System.out.println("Exiting the Frame");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }
}
class DPanel extends JPanel {
    JPanel titlePanel;
    JLabel titleLabel;
    JPanel contentPanel;
    DPanel(String str) {
        titlePanel = new JPanel();
        JLabel titleLabel = new JLabel(str);
        titleLabel.setFont(new Font("Serif",Font.BOLD,18));
        titleLabel.setForeground(Color.BLUE);
        titlePanel.add(titleLabel);
        titlePanel.setPreferredSize(new Dimension(WIDTH, HEIGHT + 50));
        titlePanel.setBackground(Color.gray);
        setLayout(new BorderLayout());
        add(titlePanel, BorderLayout.NORTH);
        
    }
    DPanel(String str,JPanel contentPanel)
    {
        this(str);
        this.contentPanel = contentPanel;
        this.contentPanel.setFocusable(true);
        this.contentPanel.requestFocus();
        this.contentPanel.setBackground(Color.lightGray);
        add(this.contentPanel, BorderLayout.CENTER);
    }
}
class DTextField extends JTextField {
    DTextField(){
    addKeyListener(new KeyAdapter() {
public void KeyReleased(KeyEvent event){
    if(event.getKeyChar() == KeyEvent.VK_ENTER){
        transferFocus();
    }
}
});
    }
}

public class DApi {
    public static void main(String[] args) {
        DFrame f = new DFrame();
        f.getContentPane().add(new DPanel("GST-MASTER",new GSTMaster()));
//        f.setUndecorated(true);
        f.setVisible(true);
    }
}
