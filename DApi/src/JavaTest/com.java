
package JavaTest;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.text.JTextComponent;

class JavaTest extends JFrame
{
    JavaTest(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        String[] str={"Deepanshu","Choudhary","Kumar"};
JFrame frame = new JFrame("Welcome!!");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JComboBox cmb = new JComboBox();
cmb.setModel(new DefaultComboBoxModel(str));
cmb.setEditable(true);
JComboBox jc = new JComboBox();
jc.setEditable(true);
cmb.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {


    public void keyReleased(KeyEvent event) {
        if (event.getKeyChar() == KeyEvent.VK_ENTER) {
            if (((JTextComponent) ((JComboBox) ((Component) event
                    .getSource()).getParent()).getEditor()
                    .getEditorComponent()).getText().isEmpty())
                System.out.println("please dont make me blank");
            jc.requestFocus();
        }
    }
});
jc.getEditor().getEditorComponent().addKeyListener(new KeyAdapter() {


    public void keyReleased(KeyEvent event) {
         if (event.getKeyChar() == KeyEvent.VK_ENTER) {
            cmb.requestFocus();}
        }
    
});
jc.setModel(new DefaultComboBoxModel(str));
jc.addKeyListener(new KeyAdapter() {
public void KeyReleased(KeyEvent event){
    if(event.getKeyChar() == KeyEvent.VK_LEFT){
        cmb.transferFocus();
    }
}
});
frame.setLayout(new FlowLayout(FlowLayout.CENTER));
frame.add(cmb);
frame.add(jc);
frame.setLocationRelativeTo(null);
frame.setSize(300, 50);
frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        JavaTest java = new JavaTest();
       
    }
}
