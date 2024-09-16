import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SalaryCalculator extends JFrame implements ActionListener {
    private JTextField txtHours, txtPayRate, txtSales, txtGrossSalary, txtNetSalary;
    private JButton btnCalculate, btnClear, btnExit;

    public SalaryCalculator() {
        setTitle("Salary and Commission Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        JLabel lblHours = new JLabel("Hours Worked:");
        txtHours = new JTextField();
        add(lblHours);
        add(txtHours);

        JLabel lblPayRate = new JLabel("Hourly Pay Rate:");
        txtPayRate = new JTextField();
        add(lblPayRate);
        add(txtPayRate);

        JLabel lblSales = new JLabel("Sales:");
        txtSales = new JTextField();
        add(lblSales);
        add(txtSales);

        JLabel lblGrossSalary = new JLabel("Gross Salary:");
        txtGrossSalary = new JTextField();
        txtGrossSalary.setEditable(false);
        add(lblGrossSalary);
        add(txtGrossSalary);

        JLabel lblNetSalary = new JLabel("Net Salary:");
        txtNetSalary = new JTextField();
        txtNetSalary.setEditable(false);
        add(lblNetSalary);
        add(txtNetSalary);

        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);
        add(btnCalculate);

        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        add(btnClear);

        btnExit = new JButton("Exit");
        btnExit.addActionListener(this);
        add(btnExit);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            calculateSalary();
        } else if (e.getSource() == btnClear) {
            clearFields();
        } else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    private void calculateSalary() {
        double hours = Double.parseDouble(txtHours.getText());
        double payRate = Double.parseDouble(txtPayRate.getText());
        double sales = Double.parseDouble(txtSales.getText());

        double grossSalary = payRate * hours;
        double commission = calculateCommission(sales);
        double netSalary = grossSalary - (grossSalary * 0.1) + commission;

        txtGrossSalary.setText(String.valueOf(grossSalary));
        txtNetSalary.setText(String.valueOf(netSalary));
    }

    private double calculateCommission(double sales) {
        if (sales >= 0 && sales <= 9) {
            return 250.0;
        } else if (sales >= 10 && sales <= 15) {
            return 275.0;
        } else if (sales >= 16 && sales <= 20) {
            return 300.0;
        } else {
            return 325.0;
        }
    }

    private void clearFields() {
        txtHours.setText("");
        txtPayRate.setText("");
        txtSales.setText("");
        txtGrossSalary.setText("");
        txtNetSalary.setText("");
    }

    public static void main(String[] args) {
        new SalaryCalculator();
    }
}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtHours = new javax.swing.JTextField();
        txtPayRate = new javax.swing.JTextField();
        txtSales = new javax.swing.JTextField();
        txtGrossSalary = new javax.swing.JTextField();
        txtNetSalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCalculate.setText("Calculate");

        btnClear.setText("Clear");

        btnExit.setText("Exit");

        txtHours.setText("Hours");

        txtPayRate.setText("Pay Rate");

        txtSales.setText("Sales");

        txtGrossSalary.setText("GrossSalary");

        txtNetSalary.setText("NetSalary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtPayRate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCalculate)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnClear)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnExit)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtGrossSalary)
                            .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNetSalary))))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPayRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtGrossSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNetSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JTextField txtGrossSalary;
    private javax.swing.JTextField txtHours;
    private javax.swing.JTextField txtNetSalary;
    private javax.swing.JTextField txtPayRate;
    private javax.swing.JTextField txtSales;
    // End of variables declaration//GEN-END:variables

