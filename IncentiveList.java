import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class IncentiveList {
    public void start(){
        JFrame frame = new JFrame();
        frame.setTitle("Incentive List");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponent(panel);
        frame.setVisible(true);
    }

    private void placeComponent(JPanel panel) {
        panel.setLayout(null);
        JButton create = new JButton("Create");
        create.setBounds(50, 25, 80, 25);
        panel.add(create);
        JButton edit = new JButton("Edit");
        edit.setBounds(180, 25, 80, 25);
        panel.add(edit);
        JButton delete = new JButton("Delete");
        delete.setBounds(310, 25, 80, 25);
        panel.add(delete);
        String[] tableTitle = {"Title", "Start", "End", "Disclaimer"};
        Object[][] tableData = new Object[0][4];
        DefaultTableModel tableModel = new DefaultTableModel(tableData, tableTitle);
        JTable table = new JTable(tableModel);
        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(50, 65, 350, 400);
        panel.add(pane);
    }
}
