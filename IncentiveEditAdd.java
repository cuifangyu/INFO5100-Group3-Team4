package Team4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class IncentiveEditAdd {

    public void start(){
        JFrame frame = new JFrame();
        frame.setSize(450, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponent(panel);
        frame.setVisible(true);
    }

    public static void placeComponent(JPanel panel){
        panel.setLayout(null);
        JLabel title = new JLabel("Title");
        title.setBounds(50, 25, 200, 25);
        panel.add(title);
        JTextField titleText = new JTextField();
        titleText.setBounds(150, 25, 250, 25);
        panel.add(titleText);
        panel.setLayout(null);
        JLabel startDate = new JLabel("Start Date");
        startDate.setBounds(50, 65, 200, 25);
        panel.add(startDate);
        JTextField startDateText = new JTextField();
        startDateText.setBounds(150, 65, 250, 25);
        panel.add(startDateText);
        JLabel endDate = new JLabel("End Date");
        endDate.setBounds(50, 105, 200, 25);
        panel.add(endDate);
        JTextField endDateText = new JTextField();
        endDateText.setBounds(150, 105, 250, 25);
        panel.add(endDateText);
        JLabel disclaimer = new JLabel("Disclaimer");
        disclaimer.setBounds(50, 145, 200, 25);
        panel.add(disclaimer);
        JTextField disclaimerText = new JTextField();
        disclaimerText.setBounds(150, 145, 250, 75);
        panel.add(disclaimerText);
        JLabel offer = new JLabel("Offer");
        offer.setBounds(50, 235, 200, 25);
        panel.add(offer);
        JComboBox offerChoice = new JComboBox();
        offerChoice.setBounds(150, 235, 115, 25);
        offerChoice.addItem("");
        offerChoice.addItem("Discount");
        offerChoice.addItem("Cashback");
        panel.add(offerChoice);
        JTextField offerText = new JTextField();
        offerText.setBounds(285, 235, 115, 25);
        panel.add(offerText);
        JLabel conditions = new JLabel("Conditions");
        conditions.setBounds(50, 295, 200, 25);
        panel.add(conditions);
        JButton create = new JButton("Create");
        create.setBounds(150, 295, 80, 25);
        panel.add(create);
        JButton edit = new JButton("Edit");
        edit.setBounds(235, 295, 80, 25);
        panel.add(edit);
        JButton delete = new JButton("Delete");
        delete.setBounds(320, 295, 80, 25);
        panel.add(delete);
        String[] tableTitle = {"Name", "Type", "Value"};
        Object[][] tableData = new Object[0][3];
        DefaultTableModel tableModel = new DefaultTableModel(tableData, tableTitle);
        JTable table = new JTable(tableModel);
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(50, 350, 350, 150);
        panel.add(pane);
        JButton cancel = new JButton("Cancel");
        cancel.setBounds(90, 520, 120, 25);
        panel.add(cancel);
        JButton ok = new JButton("OK");
        ok.setBounds(240, 520, 120, 25);
        panel.add(ok);
    }
}
