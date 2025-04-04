import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
import mysqlCONN.CONN;  
import java.sql.*;  
import javax.swing.table.DefaultTableModel;  
import javax.swing.table.TableModel;  
import javax.swing.table.TableRowSorter;  
import java.util.Vector;  
public class AdminHome extends JFrame {  
 public AdminHome() throws Exception {  
  super("Admin Home");  
  Vector row;  
  Vector data = new Vector();  
  CONN ob = new CONN();  
  Connection con = ob.c();  
  Statement stm = con.createStatement();  
  ResultSet rst = stm.executeQuery("select * from employee");  
  while (rst.next()) {  
   row = new Vector();  
   row.add(rst.getString("EmpID"));  
   row.add(rst.getString("username"));  
   row.add(rst.getString("password"));  
   row.add(rst.getString("name"));  
   row.add(rst.getString("address"));  
   row.add(rst.getString("contact"));  
   row.add(rst.getString("salary"));  
   data.add(row);  
  }  
  Vector cols = new Vector();  
  cols.add("Employee ID");  
  cols.add("Username");  
  cols.add("Password");  
  cols.add("Name");  
  cols.add("Address");  
  cols.add("Contact");  
  cols.add("Salary");  
  TableModel model = new DefaultTableModel(data, cols);  
  JTable table = new JTable(model);  
  final TableRowSorter < TableModel > sorter;  
  sorter = new TableRowSorter < TableModel > (model);  
  table.setRowSorter(sorter);  
  getContentPane().add(new JScrollPane(table));  
  JPanel pnl = new JPanel();  
  pnl.add(new JLabel("Search expression"));  
  final JTextField txtFE = new JTextField(25);  
  pnl.add(txtFE);  
  final JButton btnSetFE = new JButton("Search");  
  final JButton btnAdd = new JButton("Add Emp");  
  ActionListener a1;  
  a1 = new ActionListener() {  
   public void actionPerformed(ActionEvent e) {  
    if (e.getSource() == btnSetFE) {  
     String expr = txtFE.getText();  
     sorter.setRowFilter(RowFilter.regexFilter(expr));  
     sorter.setSortKeys(null);  
    }  
    if (e.getSource() == btnAdd) {}  
   }  
  };  
  btnSetFE.addActionListener(a1);  
  btnAdd.addActionListener(a1);  
  pnl.add(btnSetFE);  
  pnl.add(btnAdd);  
  getContentPane().add(pnl, BorderLayout.SOUTH);  
  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();  
  this.setSize(dim.width, dim.height - 40);  
  this.setVisible(true);  
  this.setLayout(null);  
  this.setResizable(true);  
  this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
 }  
}  
 
CONN.java
import java.sql.*;  
public class CONN {  
 public Connection c() throws Exception {  
  Class.forName("com.mysql.jdbc.Driver");  
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");  
  return con;  
 }  
}   