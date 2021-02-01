package accountingproject;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class Itempanel1 extends JPanel {

    JTextField GstField_1, MarginField,CodeBelField,SalesFactField,TaxField_1,DivisionField,CatagoryField,NameField,AliasField,
            HsnField,
            DescField,
            PurchaseField,
            SalesField,
            MrpField,
            Unit1Field,
            Unit2Field,
            ConvFactField;
    JComboBox TypeField, InventoryField;
    ArrayList<JTextField> ItemFields = new ArrayList<JTextField>();
    public Itempanel1() {
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{140, 0, 125, 139, 123, 131, 0};
        gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 40, 0, 0, 0, 0, 0, 0, 0};
        gridBagLayout.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        setLayout(gridBagLayout);

        JLabel lblName = new JLabel("NAME");
        GridBagConstraints gbc_lblName = new GridBagConstraints();
        gbc_lblName.anchor = GridBagConstraints.WEST;
        gbc_lblName.insets = new Insets(0, 0, 5, 5);
        gbc_lblName.gridx = 0;
        gbc_lblName.gridy = 0;
        add(lblName, gbc_lblName);

        JLabel lblNewLabel = new JLabel("GST\r\n");
        GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
        gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
        gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
        gbc_lblNewLabel.gridx = 3;
        gbc_lblNewLabel.gridy = 0;
        add(lblNewLabel, gbc_lblNewLabel);

        JLabel lblTax = new JLabel("TAX");
        GridBagConstraints gbc_lblTax = new GridBagConstraints();
        gbc_lblTax.anchor = GridBagConstraints.WEST;
        gbc_lblTax.insets = new Insets(0, 0, 5, 0);
        gbc_lblTax.gridx = 5;
        gbc_lblTax.gridy = 0;
        add(lblTax, gbc_lblTax);

        NameField = new JTextField();
        NameField.setColumns(10);
        GridBagConstraints gbc_NameField = new GridBagConstraints();
        gbc_NameField.gridwidth = 3;
        gbc_NameField.insets = new Insets(0, 0, 5, 5);
        gbc_NameField.fill = GridBagConstraints.HORIZONTAL;
        gbc_NameField.gridx = 0;
        gbc_NameField.gridy = 1;
        add(NameField, gbc_NameField);
        ItemFields.add(NameField);
        GstField_1 = new JTextField();
        GridBagConstraints gbc_GstField_1 = new GridBagConstraints();
        gbc_GstField_1.gridwidth = 2;
        gbc_GstField_1.insets = new Insets(0, 0, 5, 5);
        gbc_GstField_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_GstField_1.gridx = 3;
        gbc_GstField_1.gridy = 1;
        add(GstField_1, gbc_GstField_1);
        GstField_1.setColumns(10);
        ItemFields.add(GstField_1);
        TaxField_1 = new JTextField();
        TaxField_1.setColumns(10);
        GridBagConstraints gbc_TaxField_1 = new GridBagConstraints();
        gbc_TaxField_1.insets = new Insets(0, 0, 5, 0);
        gbc_TaxField_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_TaxField_1.gridx = 5;
        gbc_TaxField_1.gridy = 1;
        add(TaxField_1, gbc_TaxField_1);
        ItemFields.add(TaxField_1);
        JLabel lblAlias_1 = new JLabel("ALIAS");
        GridBagConstraints gbc_lblAlias_1 = new GridBagConstraints();
        gbc_lblAlias_1.anchor = GridBagConstraints.WEST;
        gbc_lblAlias_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblAlias_1.gridx = 0;
        gbc_lblAlias_1.gridy = 2;
        add(lblAlias_1, gbc_lblAlias_1);

        JLabel lblHsnCode_2 = new JLabel("HSN CODE");
        GridBagConstraints gbc_lblHsnCode_2 = new GridBagConstraints();
        gbc_lblHsnCode_2.anchor = GridBagConstraints.WEST;
        gbc_lblHsnCode_2.insets = new Insets(0, 0, 5, 5);
        gbc_lblHsnCode_2.gridx = 2;
        gbc_lblHsnCode_2.gridy = 2;
        add(lblHsnCode_2, gbc_lblHsnCode_2);

        JLabel lblAlias = new JLabel("TYPE");
        GridBagConstraints gbc_lblAlias = new GridBagConstraints();
        gbc_lblAlias.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblAlias.insets = new Insets(0, 0, 5, 5);
        gbc_lblAlias.gridx = 3;
        gbc_lblAlias.gridy = 2;
        add(lblAlias, gbc_lblAlias);

        JLabel lblHsnCode = new JLabel("Inventory\r\n");
        GridBagConstraints gbc_lblHsnCode = new GridBagConstraints();
        gbc_lblHsnCode.fill = GridBagConstraints.BOTH;
        gbc_lblHsnCode.insets = new Insets(0, 0, 5, 0);
        gbc_lblHsnCode.gridx = 5;
        gbc_lblHsnCode.gridy = 2;
        add(lblHsnCode, gbc_lblHsnCode);

        AliasField = new JTextField();
        AliasField.setColumns(10);
        GridBagConstraints gbc_AliasField = new GridBagConstraints();
        gbc_AliasField.insets = new Insets(0, 0, 5, 5);
        gbc_AliasField.fill = GridBagConstraints.HORIZONTAL;
        gbc_AliasField.gridx = 0;
        gbc_AliasField.gridy = 3;
        add(AliasField, gbc_AliasField);
        ItemFields.add(AliasField);
        HsnField = new JTextField();
        HsnField.setColumns(10);
        GridBagConstraints gbc_HsnField = new GridBagConstraints();
        gbc_HsnField.insets = new Insets(0, 0, 5, 5);
        gbc_HsnField.fill = GridBagConstraints.HORIZONTAL;
        gbc_HsnField.gridx = 2;
        gbc_HsnField.gridy = 3;
        add(HsnField, gbc_HsnField);
        ItemFields.add(HsnField);
        TypeField = new JComboBox();
        TypeField.setModel(new DefaultComboBoxModel(new String[]{"GOODS", "SERVICES"}));
        GridBagConstraints gbc_TypeField = new GridBagConstraints();
        gbc_TypeField.insets = new Insets(0, 0, 5, 5);
        gbc_TypeField.fill = GridBagConstraints.HORIZONTAL;
        gbc_TypeField.gridx = 3;
        gbc_TypeField.gridy = 3;
        add(TypeField, gbc_TypeField);
        
        InventoryField = new JComboBox();
        InventoryField.setModel(new DefaultComboBoxModel(new String[]{"YES", "NO"}));
        GridBagConstraints gbc_InventoryField = new GridBagConstraints();
        gbc_InventoryField.insets = new Insets(0, 0, 5, 0);
        gbc_InventoryField.fill = GridBagConstraints.HORIZONTAL;
        gbc_InventoryField.gridx = 5;
        gbc_InventoryField.gridy = 3;
        add(InventoryField, gbc_InventoryField);

        JLabel lblDescription = new JLabel("DESCRIPTION");
        GridBagConstraints gbc_lblDescription = new GridBagConstraints();
        gbc_lblDescription.anchor = GridBagConstraints.WEST;
        gbc_lblDescription.gridwidth = 3;
        gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
        gbc_lblDescription.gridx = 0;
        gbc_lblDescription.gridy = 4;
        add(lblDescription, gbc_lblDescription);

        JLabel lblHsnCode_1 = new JLabel("DIVISION\r\n");
        GridBagConstraints gbc_lblHsnCode_1 = new GridBagConstraints();
        gbc_lblHsnCode_1.anchor = GridBagConstraints.WEST;
        gbc_lblHsnCode_1.gridwidth = 3;
        gbc_lblHsnCode_1.insets = new Insets(0, 0, 5, 0);
        gbc_lblHsnCode_1.gridx = 3;
        gbc_lblHsnCode_1.gridy = 4;
        add(lblHsnCode_1, gbc_lblHsnCode_1);

        DescField = new JTextField();
        DescField.setColumns(10);
        GridBagConstraints gbc_DescField = new GridBagConstraints();
        gbc_DescField.gridheight = 3;
        gbc_DescField.gridwidth = 3;
        gbc_DescField.insets = new Insets(0, 0, 5, 5);
        gbc_DescField.fill = GridBagConstraints.BOTH;
        gbc_DescField.gridx = 0;
        gbc_DescField.gridy = 5;
        add(DescField, gbc_DescField);
        ItemFields.add(DescField);
        DivisionField = new JTextField();
        GridBagConstraints gbc_DivisionField = new GridBagConstraints();
        gbc_DivisionField.gridwidth = 3;
        gbc_DivisionField.insets = new Insets(0, 0, 5, 0);
        gbc_DivisionField.fill = GridBagConstraints.HORIZONTAL;
        gbc_DivisionField.gridx = 3;
        gbc_DivisionField.gridy = 5;
        add(DivisionField, gbc_DivisionField);
        DivisionField.setColumns(10);
        DivisionField.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                try {
                    transferFocusUpCycle();
                    searchPanel s = new searchPanel("DIVISIONMASTER");
                    DivisionField.setText(s.table.getValueAt(s.table.getSelectedRow(), 1).toString());
                } catch (Exception ex) {

                }
            }
            
            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        ItemFields.add(DivisionField);
        JLabel lblCatagory = new JLabel("CATAGORY\r\n");
        GridBagConstraints gbc_lblCatagory = new GridBagConstraints();
        gbc_lblCatagory.anchor = GridBagConstraints.WEST;
        gbc_lblCatagory.gridwidth = 3;
        gbc_lblCatagory.insets = new Insets(0, 0, 5, 0);
        gbc_lblCatagory.gridx = 3;
        gbc_lblCatagory.gridy = 6;
        add(lblCatagory, gbc_lblCatagory);

        CatagoryField = new JTextField();
        CatagoryField.setColumns(10);
        GridBagConstraints gbc_CatagoryField = new GridBagConstraints();
        gbc_CatagoryField.gridwidth = 3;
        gbc_CatagoryField.insets = new Insets(0, 0, 5, 0);
        gbc_CatagoryField.fill = GridBagConstraints.HORIZONTAL;
        gbc_CatagoryField.gridx = 3;
        gbc_CatagoryField.gridy = 7;
        add(CatagoryField, gbc_CatagoryField);
        ItemFields.add(CatagoryField);
        JLabel lblPurchaseRate = new JLabel("PURCHASE RATE\r\n");
        GridBagConstraints gbc_lblPurchaseRate = new GridBagConstraints();
        gbc_lblPurchaseRate.insets = new Insets(0, 0, 5, 5);
        gbc_lblPurchaseRate.gridx = 0;
        gbc_lblPurchaseRate.gridy = 8;
        add(lblPurchaseRate, gbc_lblPurchaseRate);

        JLabel lblSalesRate = new JLabel("SALES RATE\r\n");
        GridBagConstraints gbc_lblSalesRate = new GridBagConstraints();
        gbc_lblSalesRate.insets = new Insets(0, 0, 5, 5);
        gbc_lblSalesRate.gridx = 1;
        gbc_lblSalesRate.gridy = 8;
        add(lblSalesRate, gbc_lblSalesRate);

        JLabel lblMrp = new JLabel("MRP\r\n");
        GridBagConstraints gbc_lblMrp = new GridBagConstraints();
        gbc_lblMrp.insets = new Insets(0, 0, 5, 5);
        gbc_lblMrp.gridx = 2;
        gbc_lblMrp.gridy = 8;
        add(lblMrp, gbc_lblMrp);

        JLabel lblUnit = new JLabel("MARGIN%");
        GridBagConstraints gbc_lblUnit = new GridBagConstraints();
        gbc_lblUnit.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblUnit.insets = new Insets(0, 0, 5, 5);
        gbc_lblUnit.gridx = 3;
        gbc_lblUnit.gridy = 8;
        add(lblUnit, gbc_lblUnit);

        JLabel lblUnit_1 = new JLabel("CODE BELONGS");
        GridBagConstraints gbc_lblUnit_1 = new GridBagConstraints();
        gbc_lblUnit_1.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblUnit_1.insets = new Insets(0, 0, 5, 5);
        gbc_lblUnit_1.gridx = 4;
        gbc_lblUnit_1.gridy = 8;
        add(lblUnit_1, gbc_lblUnit_1);

        JLabel lblUnit_2 = new JLabel("SALES FACTOR");
        GridBagConstraints gbc_lblUnit_2 = new GridBagConstraints();
        gbc_lblUnit_2.fill = GridBagConstraints.HORIZONTAL;
        gbc_lblUnit_2.insets = new Insets(0, 0, 5, 0);
        gbc_lblUnit_2.gridx = 5;
        gbc_lblUnit_2.gridy = 8;
        add(lblUnit_2, gbc_lblUnit_2);

        PurchaseField = new JTextField();
        PurchaseField.setColumns(10);
        GridBagConstraints gbc_PurchaseField = new GridBagConstraints();
        gbc_PurchaseField.insets = new Insets(0, 0, 5, 5);
        gbc_PurchaseField.fill = GridBagConstraints.HORIZONTAL;
        gbc_PurchaseField.gridx = 0;
        gbc_PurchaseField.gridy = 9;
        add(PurchaseField, gbc_PurchaseField);
        ItemFields.add(PurchaseField);
        SalesField = new JTextField();
        SalesField.setColumns(10);
        GridBagConstraints gbc_SalesField = new GridBagConstraints();
        gbc_SalesField.insets = new Insets(0, 0, 5, 5);
        gbc_SalesField.fill = GridBagConstraints.HORIZONTAL;
        gbc_SalesField.gridx = 1;
        gbc_SalesField.gridy = 9;
        add(SalesField, gbc_SalesField);
ItemFields.add(SalesField);
        MrpField = new JTextField();
        MrpField.setColumns(10);
        GridBagConstraints gbc_MrpField = new GridBagConstraints();
        gbc_MrpField.insets = new Insets(0, 0, 5, 5);
        gbc_MrpField.fill = GridBagConstraints.HORIZONTAL;
        gbc_MrpField.gridx = 2;
        gbc_MrpField.gridy = 9;
        add(MrpField, gbc_MrpField);
ItemFields.add(MrpField);
        MarginField = new JTextField();
        MarginField.setColumns(10);
        GridBagConstraints gbc_MarginField = new GridBagConstraints();
        gbc_MarginField.insets = new Insets(0, 0, 5, 5);
        gbc_MarginField.fill = GridBagConstraints.HORIZONTAL;
        gbc_MarginField.gridx = 3;
        gbc_MarginField.gridy = 9;
        add(MarginField, gbc_MarginField);
ItemFields.add(MarginField);
        CodeBelField = new JTextField();
        CodeBelField.setColumns(10);
        GridBagConstraints gbc_CodeBelField = new GridBagConstraints();
        gbc_CodeBelField.insets = new Insets(0, 0, 5, 5);
        gbc_CodeBelField.fill = GridBagConstraints.HORIZONTAL;
        gbc_CodeBelField.gridx = 4;
        gbc_CodeBelField.gridy = 9;
        add(CodeBelField, gbc_CodeBelField);
ItemFields.add(CodeBelField);
        SalesFactField = new JTextField();
        SalesFactField.setColumns(10);
        GridBagConstraints gbc_SalesFactField = new GridBagConstraints();
        gbc_SalesFactField.insets = new Insets(0, 0, 5, 0);
        gbc_SalesFactField.fill = GridBagConstraints.HORIZONTAL;
        gbc_SalesFactField.gridx = 5;
        gbc_SalesFactField.gridy = 9;
        add(SalesFactField, gbc_SalesFactField);
ItemFields.add(SalesFactField);
        JLabel lblUnit_3 = new JLabel("UNIT 1\r\n");
        GridBagConstraints gbc_lblUnit_3 = new GridBagConstraints();
        gbc_lblUnit_3.insets = new Insets(0, 0, 5, 5);
        gbc_lblUnit_3.gridx = 0;
        gbc_lblUnit_3.gridy = 10;
        add(lblUnit_3, gbc_lblUnit_3);

        JLabel lblUnit_4 = new JLabel("UNIT 2 ");
        GridBagConstraints gbc_lblUnit_4 = new GridBagConstraints();
        gbc_lblUnit_4.insets = new Insets(0, 0, 5, 5);
        gbc_lblUnit_4.gridx = 1;
        gbc_lblUnit_4.gridy = 10;
        add(lblUnit_4, gbc_lblUnit_4);

        JLabel lblConversionFactor = new JLabel("CONVERSION FACTOR\r\n");
        GridBagConstraints gbc_lblConversionFactor = new GridBagConstraints();
        gbc_lblConversionFactor.insets = new Insets(0, 0, 5, 5);
        gbc_lblConversionFactor.gridx = 2;
        gbc_lblConversionFactor.gridy = 10;
        add(lblConversionFactor, gbc_lblConversionFactor);

        Unit1Field = new JTextField();
        Unit1Field.setColumns(10);
        GridBagConstraints gbc_Unit1Field = new GridBagConstraints();
        gbc_Unit1Field.insets = new Insets(0, 0, 0, 5);
        gbc_Unit1Field.fill = GridBagConstraints.HORIZONTAL;
        gbc_Unit1Field.gridx = 0;
        gbc_Unit1Field.gridy = 11;
        add(Unit1Field, gbc_Unit1Field);
ItemFields.add(Unit1Field);
        Unit2Field = new JTextField();
        Unit2Field.setColumns(10);
        GridBagConstraints gbc_Unit2Field = new GridBagConstraints();
        gbc_Unit2Field.insets = new Insets(0, 0, 0, 5);
        gbc_Unit2Field.fill = GridBagConstraints.HORIZONTAL;
        gbc_Unit2Field.gridx = 1;
        gbc_Unit2Field.gridy = 11;
        add(Unit2Field, gbc_Unit2Field);
ItemFields.add(Unit2Field);
        ConvFactField = new JTextField();
        ConvFactField.setColumns(10);
        GridBagConstraints gbc_ConvFactField = new GridBagConstraints();
        gbc_ConvFactField.insets = new Insets(0, 0, 0, 5);
        gbc_ConvFactField.fill = GridBagConstraints.HORIZONTAL;
        gbc_ConvFactField.gridx = 2;
        gbc_ConvFactField.gridy = 11;
        add(ConvFactField, gbc_ConvFactField);
ItemFields.add(ConvFactField);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Itempanel1 ip = new Itempanel1();
        frame.getContentPane().add(ip);
        frame.pack();
        
        frame.setVisible(true);
        System.out.println(ip.ItemFields.size());
    }

}
