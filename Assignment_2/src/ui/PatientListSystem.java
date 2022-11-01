/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import data.Gender;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HealthSystem;
import model.Hospital;
import model.House;
import model.Patient;

/**
 *
 * @author gorubhambhani
 */
public class PatientListSystem extends javax.swing.JPanel {
    private HealthSystem healthSystem;
    private String lastUsername;
    /**
     * Creates new form PatientListSystem
     */
    public PatientListSystem(HealthSystem healthSystem) {
        initComponents();
        this.healthSystem = healthSystem;
        this.lastUsername = "";
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient List");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "First Name", "Last Name", "Age", "Gender", "Cell Number", "Address", "Password"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Age");

        jLabel5.setText("Gender");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "UNKNOWN" }));

        jLabel6.setText("Cell Number");

        jLabel7.setText("Username");

        jLabel8.setText("Password");

        jLabel9.setText("Address");

        jButton4.setText("Create");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(287, 287, 287))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton4)
                .addGap(97, 97, 97)
                .addComponent(jButton2)
                .addGap(62, 62, 62)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(jLabel5))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jComboBox1, 0, 151, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addGap(55, 55, 55)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField6)
                                .addComponent(jTextField7)
                                .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(210, 210, 210))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(265, 265, 265)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel7)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(266, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a patient to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Patient patient = (Patient) model.getValueAt(selectedRowIndex, 0);

        jTextField1.setText(patient.getFname());
        jTextField2.setText(patient.getLname());
        jTextField3.setText(String.valueOf(patient.getAge()));
        jTextField5.setText(String.valueOf(patient.getCellNumber()));
        jTextField6.setText(patient.getUserName());
        jTextField7.setText(patient.getPassword());
        jTextField8.setText(patient.getResidence().getAddress());

        this.lastUsername = patient.getUserName();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String fname = jTextField1.getText();

        if (fname.isBlank() || fname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a first name");
            return;
        }

        String lname = jTextField2.getText();

        if (lname.isBlank() || lname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Last name");
            return;
        }

        String age = jTextField3.getText();
        int ageInt = 0;
        try {
            ageInt = Integer.parseInt(age);
            if (ageInt <= 0) {
                JOptionPane.showMessageDialog(this, "Age cant be negative");
                return;
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age");
            return;
        }

        String cell = jTextField5.getText();
        long cellLong = 0;
        if (cell.length() != 10) {
            JOptionPane.showMessageDialog(this, "Cell number should be 10 digits");
            return;
        }
        try {
            cellLong = Long.parseLong(cell);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid cell number");
            return;
        }

        String username = jTextField6.getText();
        if (username.isBlank() || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username");
            return;
        }

        for (Patient p: this.healthSystem.getPatientDirectory().getPatients()) {
            if (p.getUserName().equals(username)) {
                JOptionPane.showMessageDialog(this, "Username already taken");
                return;
            }
        }

        String password = jTextField7.getText();
        if (password.isBlank() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a password");
            return;
        }

        String address = jTextField8.getText();
        if (address.isBlank() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an address");
            return;
        }

        if (jComboBox1.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a gender");
            return;
        }

        String gender = jComboBox1.getSelectedItem().toString();
        Gender g = null;
        if (gender.equals("MALE")) {
            g = Gender.M;
        } else if (gender.equals("FEMALE")) {
            g = Gender.F;
        } else {
            g = Gender.OTHERS;
        }

        Patient patient = new Patient(fname, lname, ageInt, g, new House(address),
            cellLong, username, password);
        this.healthSystem.getPatientDirectory().addPatients(patient);

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        populateTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        String fname = jTextField1.getText();

        if (fname.isBlank() || fname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a first name");
            return;
        }

        String lname = jTextField2.getText();

        if (lname.isBlank() || lname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Last name");
            return;
        }

        String age = jTextField3.getText();
        int ageInt = 0;
        try {
            ageInt = Integer.parseInt(age);
            if (ageInt <= 0) {
                JOptionPane.showMessageDialog(this, "Age cant be negative");
                return;
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age");
            return;
        }

        String cell = jTextField5.getText();
        long cellLong = 0;
        if (cell.length() != 10) {
            JOptionPane.showMessageDialog(this, "Cell number should be 10 digits");
            return;
        }
        try {
            cellLong = Long.parseLong(cell);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid cell number");
            return;
        }

        String username = jTextField6.getText();
        if (username.isBlank() || username.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username");
            return;
        }

        String password = jTextField7.getText();
        if (password.isBlank() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a password");
            return;
        }

        String address = jTextField8.getText();
        if (address.isBlank() || address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an address");
            return;
        }

        if (jComboBox1.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Please select a gender");
            return;
        }

        String gender = jComboBox1.getSelectedItem().toString();
        Gender g = null;
        if (gender.equals("MALE")) {
            g = Gender.M;
        } else if (gender.equals("FEMALE")) {
            g = Gender.F;
        } else {
            g = Gender.OTHERS;
        }

        Patient selectedPatient = null;
        for (Patient p: this.healthSystem.getPatientDirectory().getPatients()) {
            if (p.getUserName().equals(this.lastUsername)) {
                selectedPatient = p;
            }
        }

        if (!this.lastUsername.equals(username)) {
            for (Patient p: this.healthSystem.getPatientDirectory().getPatients()) {
                if (p.getUserName().equals(username)) {
                    JOptionPane.showMessageDialog(this, "Username already exists");
                    return;
                }
            }
        }

        selectedPatient.setAge(ageInt);
        selectedPatient.setFname(fname);
        selectedPatient.setLname(lname);
        selectedPatient.setCellNumber(cellLong);
        selectedPatient.setGender(g);
        selectedPatient.setPassword(password);
        selectedPatient.setUserName(username);
        selectedPatient.setResidence(new House(address));

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a patient to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Patient patient = (Patient) model.getValueAt(selectedRowIndex, 0);

        this.healthSystem.getPatientDirectory().getPatients().remove(patient);
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Patient hs : this.healthSystem.getPatientDirectory().getPatients()) {
            Object[] row = new Object[8];
            row[0] = hs;                     
            row[1] = hs.getFname();
            row[2] = hs.getLname();
            row[3] = hs.getAge();
            row[4] = hs.getGender().getName();
            row[5] = hs.getCellNumber();
            row[6] = hs.getResidence().getAddress();
            row[7] = hs.getPassword();
            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
