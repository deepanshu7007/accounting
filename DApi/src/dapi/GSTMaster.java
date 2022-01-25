package dapi;

import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;

import javax.swing.JTextField;

import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

import javax.swing.JLabel;

/**
 * TODO Put here a description of what this class does.
 *
 * @author deepa. Created Feb 9, 2021.
 */
public class GSTMaster extends JPanel {

    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField textField_12;
    private JTextField textField_13;
    private JTextField textField_14;
    private JTextField textField_15;
    private JTextField textField_16;
    private JTextField textField_17;

    /**
     * Create the panel.
     */
    public GSTMaster() {
        textField_1 = new JTextField();
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{176, 99, 171, 123, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);

        JLabel lblNewLabel = new JLabel("Name\r\n");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 0;
        gbc_lblNewLabel.gridy = 0;
        add(lblNewLabel, gbc_lblNewLabel);
        
        textField = new JTextField();
        textField.requestFocusInWindow();
        GridBagConstraints gbc_textField = new GridBagConstraints();
        gbc_textField.insets = new Insets(0, 0, 5, 5);
        gbc_textField.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField.gridx = 1;
        gbc_textField.gridy = 0;
        add(textField, gbc_textField);
        textField.setColumns(20);
        textField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                System.out.println("Hello world");
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    
                    textField_1.requestFocus();
                }
            }
        });
//textField.addKeyListener(new KeyAdapter() {
//      public void keyReleased(KeyEvent e) {
//       System.out.println("Hello world");
//      }});

        JLabel lblIgstInputAc = new JLabel("IGST INPUT A/C");
        GridBagConstraints gbc_lblIgstInputAc = new GridBagConstraints();
        gbc_lblIgstInputAc.anchor = GridBagConstraints.EAST;
        gbc_lblIgstInputAc.insets = new Insets(0, 0, 5, 5);
        gbc_lblIgstInputAc.gridx = 2;
        gbc_lblIgstInputAc.gridy = 0;
        add(lblIgstInputAc, gbc_lblIgstInputAc);

        
        textField_1.setColumns(10);
        GridBagConstraints gbc_textField_1 = new GridBagConstraints();
        gbc_textField_1.insets = new Insets(0, 0, 5, 0);
        gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_1.gridx = 3;
        gbc_textField_1.gridy = 0;
        add(textField_1, gbc_textField_1);
        textField_1.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_2.requestFocus();
                }
            }
        });
        JLabel lblTaxAge = new JLabel("TAX% age\r\n");
        GridBagConstraints gbc_lblTaxAge = new GridBagConstraints();
        gbc_lblTaxAge.anchor = GridBagConstraints.WEST;
        gbc_lblTaxAge.insets = new Insets(0, 0, 5, 5);
        gbc_lblTaxAge.gridx = 0;
        gbc_lblTaxAge.gridy = 1;
        add(lblTaxAge, gbc_lblTaxAge);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        GridBagConstraints gbc_textField_2 = new GridBagConstraints();
        gbc_textField_2.insets = new Insets(0, 0, 5, 5);
        gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_2.gridx = 1;
        gbc_textField_2.gridy = 1;
        add(textField_2, gbc_textField_2);
textField_2.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_3.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_1_1 = new JLabel("IGST OUTPUT A/C\r\n");
        GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_1_1.gridx = 2;
        gbc_lblNewLabel_1_1.gridy = 1;
        add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        GridBagConstraints gbc_textField_3 = new GridBagConstraints();
        gbc_textField_3.insets = new Insets(0, 0, 5, 0);
        gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_3.gridx = 3;
        gbc_textField_3.gridy = 1;
        add(textField_3, gbc_textField_3);
textField_3.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_4.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1 = new JLabel("CESS %\r\n");
        GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1.gridx = 0;
        gbc_lblNewLabel_2_1.gridy = 2;
        add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        GridBagConstraints gbc_textField_4 = new GridBagConstraints();
        gbc_textField_4.insets = new Insets(0, 0, 5, 5);
        gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_4.gridx = 1;
        gbc_textField_4.gridy = 2;
        add(textField_4, gbc_textField_4);
textField_4.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_5.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_1 = new JLabel("CGST INPUT");
        GridBagConstraints gbc_lblNewLabel_2_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_1.gridx = 2;
        gbc_lblNewLabel_2_1_1.gridy = 2;
        add(lblNewLabel_2_1_1, gbc_lblNewLabel_2_1_1);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        GridBagConstraints gbc_textField_5 = new GridBagConstraints();
        gbc_textField_5.insets = new Insets(0, 0, 5, 0);
        gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_5.gridx = 3;
        gbc_textField_5.gridy = 2;
        add(textField_5, gbc_textField_5);
textField_5.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_6.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_2 = new JLabel("IGST");
        GridBagConstraints gbc_lblNewLabel_2_1_2 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_2.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2_1_2.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_2.gridx = 0;
        gbc_lblNewLabel_2_1_2.gridy = 3;
        add(lblNewLabel_2_1_2, gbc_lblNewLabel_2_1_2);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        GridBagConstraints gbc_textField_6 = new GridBagConstraints();
        gbc_textField_6.insets = new Insets(0, 0, 5, 5);
        gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_6.gridx = 1;
        gbc_textField_6.gridy = 3;
        add(textField_6, gbc_textField_6);
textField_6.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_7.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_1_1 = new JLabel("CGST OUTPUT A/C");
        GridBagConstraints gbc_lblNewLabel_2_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_1_1.gridx = 2;
        gbc_lblNewLabel_2_1_1_1.gridy = 3;
        add(lblNewLabel_2_1_1_1, gbc_lblNewLabel_2_1_1_1);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        GridBagConstraints gbc_textField_7 = new GridBagConstraints();
        gbc_textField_7.insets = new Insets(0, 0, 5, 0);
        gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_7.gridx = 3;
        gbc_textField_7.gridy = 3;
        add(textField_7, gbc_textField_7);
textField_7.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_8.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_2_1 = new JLabel("CGST\r\n");
        GridBagConstraints gbc_lblNewLabel_2_1_2_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_2_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2_1_2_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_2_1.gridx = 0;
        gbc_lblNewLabel_2_1_2_1.gridy = 4;
        add(lblNewLabel_2_1_2_1, gbc_lblNewLabel_2_1_2_1);

        textField_8 = new JTextField();
        textField_8.setColumns(10);
        GridBagConstraints gbc_textField_8 = new GridBagConstraints();
        gbc_textField_8.insets = new Insets(0, 0, 5, 5);
        gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_8.gridx = 1;
        gbc_textField_8.gridy = 4;
        add(textField_8, gbc_textField_8);
textField_8.addKeyListener(new KeyAdapter() {
    public void keyReleased(KeyEvent evt)
    {
        if(evt.getKeyChar() == KeyEvent.VK_ENTER)
        {
            textField_9.requestFocus();
        }
    }
});
        JLabel lblNewLabel_2_1_1_1_1 = new JLabel("SGST INPUT A/C");
        GridBagConstraints gbc_lblNewLabel_2_1_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_1_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2_1_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_1_1_1.gridx = 2;
        gbc_lblNewLabel_2_1_1_1_1.gridy = 4;
        add(lblNewLabel_2_1_1_1_1, gbc_lblNewLabel_2_1_1_1_1);

        textField_9 = new JTextField();
        textField_9.setColumns(10);
        GridBagConstraints gbc_textField_9 = new GridBagConstraints();
        gbc_textField_9.insets = new Insets(0, 0, 5, 0);
        gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_9.gridx = 3;
        gbc_textField_9.gridy = 4;
        add(textField_9, gbc_textField_9);
textField_9.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_10.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_2_1_1 = new JLabel("SGST");
        GridBagConstraints gbc_lblNewLabel_2_1_2_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_2_1_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2_1_2_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_2_1_1.gridx = 0;
        gbc_lblNewLabel_2_1_2_1_1.gridy = 5;
        add(lblNewLabel_2_1_2_1_1, gbc_lblNewLabel_2_1_2_1_1);

        textField_10 = new JTextField();
        textField_10.setColumns(10);
        GridBagConstraints gbc_textField_10 = new GridBagConstraints();
        gbc_textField_10.insets = new Insets(0, 0, 5, 5);
        gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_10.gridx = 1;
        gbc_textField_10.gridy = 5;
        add(textField_10, gbc_textField_10);
textField_10.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_11.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("SGST OUTPUT A/C\r\n");
        GridBagConstraints gbc_lblNewLabel_2_1_1_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_1_1_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_1_1_1_1.gridx = 2;
        gbc_lblNewLabel_2_1_1_1_1_1.gridy = 5;
        add(lblNewLabel_2_1_1_1_1_1, gbc_lblNewLabel_2_1_1_1_1_1);

        textField_14 = new JTextField();
        textField_14.setColumns(10);
        GridBagConstraints gbc_textField_14 = new GridBagConstraints();
        gbc_textField_14.insets = new Insets(0, 0, 5, 0);
        gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_14.gridx = 3;
        gbc_textField_14.gridy = 5;
        add(textField_14, gbc_textField_14);
textField_14.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_15.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_2_1_1_1 = new JLabel("Purchase Account(LOCAL)");
        GridBagConstraints gbc_lblNewLabel_2_1_2_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_2_1_1_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2_1_2_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_2_1_1_1.gridx = 0;
        gbc_lblNewLabel_2_1_2_1_1_1.gridy = 6;
        add(lblNewLabel_2_1_2_1_1_1, gbc_lblNewLabel_2_1_2_1_1_1);

        textField_11 = new JTextField();
        textField_11.setColumns(10);
        GridBagConstraints gbc_textField_11 = new GridBagConstraints();
        gbc_textField_11.insets = new Insets(0, 0, 5, 5);
        gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_11.gridx = 1;
        gbc_textField_11.gridy = 6;
        add(textField_11, gbc_textField_11);
        textField_11.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_12.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("CESS A/C\r\n");
        GridBagConstraints gbc_lblNewLabel_2_1_1_1_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_1_1_1_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_1_1_1_1_1.gridx = 2;
        gbc_lblNewLabel_2_1_1_1_1_1_1.gridy = 6;
        add(lblNewLabel_2_1_1_1_1_1_1, gbc_lblNewLabel_2_1_1_1_1_1_1);

        textField_15 = new JTextField();
        textField_15.setColumns(10);
        GridBagConstraints gbc_textField_15 = new GridBagConstraints();
        gbc_textField_15.insets = new Insets(0, 0, 5, 0);
        gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_15.gridx = 3;
        gbc_textField_15.gridy = 6;
        add(textField_15, gbc_textField_15);
        textField_15.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_16.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_2_1_1_1_1 = new JLabel("Sales Account(LOCAL)");
        GridBagConstraints gbc_lblNewLabel_2_1_2_1_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_2_1_1_1_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2_1_2_1_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_2_1_1_1_1.gridx = 0;
        gbc_lblNewLabel_2_1_2_1_1_1_1.gridy = 7;
        add(lblNewLabel_2_1_2_1_1_1_1, gbc_lblNewLabel_2_1_2_1_1_1_1);

        textField_12 = new JTextField();
        textField_12.setColumns(10);
        GridBagConstraints gbc_textField_12 = new GridBagConstraints();
        gbc_textField_12.insets = new Insets(0, 0, 5, 5);
        gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_12.gridx = 1;
        gbc_textField_12.gridy = 7;
        add(textField_12, gbc_textField_12);
textField_12.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_13.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Purchase Account(INTER STATE)");
        GridBagConstraints gbc_lblNewLabel_2_1_1_1_1_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_1_1_1_1_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_1_1_1_1_1_1.gridx = 2;
        gbc_lblNewLabel_2_1_1_1_1_1_1_1.gridy = 7;
        add(lblNewLabel_2_1_1_1_1_1_1_1, gbc_lblNewLabel_2_1_1_1_1_1_1_1);

        textField_16 = new JTextField();
        textField_16.setColumns(10);
        GridBagConstraints gbc_textField_16 = new GridBagConstraints();
        gbc_textField_16.insets = new Insets(0, 0, 5, 0);
        gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_16.gridx = 3;
        gbc_textField_16.gridy = 7;
        add(textField_16, gbc_textField_16);
textField_16.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_17.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_2_1_1_1_1_1 = new JLabel("Sales Account(INTER STATE)");
        GridBagConstraints gbc_lblNewLabel_2_1_2_1_1_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_2_1_1_1_1_1.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel_2_1_2_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_2_1_1_1_1_1.gridx = 0;
        gbc_lblNewLabel_2_1_2_1_1_1_1_1.gridy = 8;
        add(lblNewLabel_2_1_2_1_1_1_1_1, gbc_lblNewLabel_2_1_2_1_1_1_1_1);

        textField_13 = new JTextField();
        textField_13.setColumns(10);
        GridBagConstraints gbc_textField_13 = new GridBagConstraints();
        gbc_textField_13.insets = new Insets(0, 0, 5, 5);
        gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_13.gridx = 1;
        gbc_textField_13.gridy = 8;
        add(textField_13, gbc_textField_13);
textField_13.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_14.requestFocus();
                }
            }
        });
        JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("New label");
        GridBagConstraints gbc_lblNewLabel_2_1_1_1_1_1_1_1_1 = new GridBagConstraints();
        gbc_lblNewLabel_2_1_1_1_1_1_1_1_1.anchor = GridBagConstraints.EAST;
        gbc_lblNewLabel_2_1_1_1_1_1_1_1_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel_2_1_1_1_1_1_1_1_1.gridx = 2;
        gbc_lblNewLabel_2_1_1_1_1_1_1_1_1.gridy = 8;
        add(lblNewLabel_2_1_1_1_1_1_1_1_1, gbc_lblNewLabel_2_1_1_1_1_1_1_1_1);

        textField_17 = new JTextField();
        textField_17.setColumns(10);
        GridBagConstraints gbc_textField_17 = new GridBagConstraints();
        gbc_textField_17.insets = new Insets(0, 0, 5, 0);
        gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
        gbc_textField_17.gridx = 3;
        gbc_textField_17.gridy = 8;
        add(textField_17, gbc_textField_17);
        textField_17.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt){
                if(evt.getKeyChar() == KeyEvent.VK_ENTER)
                {
                    textField_1.requestFocus();
                }
            }
        });
        JButton btnNewButton = new JButton("SAVE");
        GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
        gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnNewButton.gridwidth = 2;
        gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
        gbc_btnNewButton.gridx = 0;
        gbc_btnNewButton.gridy = 9;
        add(btnNewButton, gbc_btnNewButton);

        JButton btnCancel = new JButton("CANCEL\r\n");
        GridBagConstraints gbc_btnCancel = new GridBagConstraints();
        gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
        gbc_btnCancel.gridwidth = 2;
        gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
        gbc_btnCancel.gridx = 2;
        gbc_btnCancel.gridy = 9;
        add(btnCancel, gbc_btnCancel);

    }
public static void main(String[] args)
{
    JFrame frame = new JFrame();frame.add(new GSTMaster());
    frame.setVisible(true);
}
}
