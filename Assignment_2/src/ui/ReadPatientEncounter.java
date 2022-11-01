/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.Encounter;
import model.HealthSystem;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author gorubhambhani
 */
public class ReadPatientEncounter extends javax.swing.JPanel {
    private HealthSystem healthSystem;

    /**
     * Creates new form ReadPatientEncounter
     */
    public ReadPatientEncounter(HealthSystem healthSystem) {
        initComponents();
        this.healthSystem = healthSystem;
        populateTable();
        populateDoctorComboBox();
        populatePatientComboBox();
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
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        createCounterBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Encounters");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Enc Id", "Dr Name", "Dr Username", "Patient Name", "Patient Username", "Apt Date", "Apt Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Dr Username");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Patient Username");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Apt Date");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022" }));

        jLabel9.setText("Apt Time");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        createCounterBtn.setText("Create ");
        createCounterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createCounterBtnActionPerformed(evt);
            }
        });

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(262, 262, 262))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(createCounterBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createCounterBtn)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter encounter = (Encounter) model.getValueAt(selectedRowIndex, 0);

        int docIndex = 0;
        for(int i = 0; i < this.healthSystem.getDoctorDirectory().getDoctors().size(); i++){
            Doctor doc = this.healthSystem.getDoctorDirectory().getDoctors().get(i);
            if (encounter.getDoctorId().equals(doc)) {
                docIndex = i;
                break;
            }
        }
        jComboBox1.setSelectedIndex(docIndex);

        int patIndex = 0;
        for(int i = 0; i < this.healthSystem.getPatientDirectory().getPatients().size(); i++){
            Patient doc = this.healthSystem.getPatientDirectory().getPatients().get(i);
            if (encounter.getPatientId().equals(doc)) {
                patIndex = i;
                break;
            }
        }
        jComboBox2.setSelectedIndex(patIndex);

        Calendar c = Calendar.getInstance();
        c.setTime(encounter.getDate());

        // setting up the values from object of calender
        jComboBox3.setSelectedItem(String.valueOf(c.get(Calendar.DATE)));
        jComboBox4.setSelectedIndex(c.get(Calendar.MONTH));
        jComboBox5.setSelectedItem(String.valueOf(c.get(Calendar.YEAR)));

        String[] splitTime = encounter.getTime().split(" ");

        jComboBox6.setSelectedItem(String.valueOf(splitTime[0]));
        jComboBox7.setSelectedItem(String.valueOf(splitTime[1]));

    }//GEN-LAST:event_jButton3ActionPerformed

    private void createCounterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createCounterBtnActionPerformed
        // TODO add your handling code here:
        if (jComboBox1.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a doctor first");
            return;
        }

        if (jComboBox2.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a patient first");
            return;
        }

        if (jComboBox3.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid date");
            return;
        }

        if (jComboBox4.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid date");
            return;
        }

        if (jComboBox5.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid date");
            return;
        }

        if (jComboBox6.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid time");
            return;
        }

        if (jComboBox7.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid time");
            return;
        }

        String docUsername = jComboBox1.getSelectedItem().toString();
        String patientUsername = jComboBox2.getSelectedItem().toString();

        String time = jComboBox6.getSelectedItem().toString();
        String ampm = jComboBox7.getSelectedItem().toString();

        String day = jComboBox3.getSelectedItem().toString();
        int month = jComboBox4.getSelectedIndex();
        String year = jComboBox5.getSelectedItem().toString();

        /*Calender class for parsing day,month,and year*/
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), month, Integer.parseInt(day), 0, 0, 0);
        String timeStr = time + " " + ampm;

        SimpleDateFormat s = new SimpleDateFormat("yyyy-dd-MM");

        for (Encounter encounter: this.healthSystem.getEncounterHistory().getEncounterHistory()) {
            if (encounter.getDoctorId().equals(docUsername)
                && s.format(encounter.getDate()).equals(s.format(c.getTime()))
                && encounter.getTime().equals(timeStr)) {
                JOptionPane.showMessageDialog(this, "Doctor already has an appointment at this time");
                return;
            }

            if (encounter.getPatientId().equals(patientUsername)
                && s.format(encounter.getDate()).equals(s.format(c.getTime()))
                && encounter.getTime().equals(timeStr)) {
                JOptionPane.showMessageDialog(this, "Patient already has an appointment at this time");
                return;
            }
        }

        Encounter encounter = new Encounter(new VitalSigns(), "",
            timeStr, c.getTime(), System.currentTimeMillis(),
            docUsername, patientUsername);

        this.healthSystem.getEncounterHistory().addEncounter(encounter);

        populateTable();
    }//GEN-LAST:event_createCounterBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter encounter = (Encounter) model.getValueAt(selectedRowIndex, 0);

        if (jComboBox1.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a doctor first");
            return;
        }

        if (jComboBox2.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a patient first");
            return;
        }

        if (jComboBox3.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid date");
            return;
        }

        if (jComboBox4.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid date");
            return;
        }

        if (jComboBox5.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid date");
            return;
        }

        if (jComboBox6.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid time");
            return;
        }

        if (jComboBox7.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a valid time");
            return;
        }

        String docUsername = jComboBox1.getSelectedItem().toString();
        String patientUsername = jComboBox2.getSelectedItem().toString();

        String time = jComboBox6.getSelectedItem().toString();
        String ampm = jComboBox7.getSelectedItem().toString();

        String day = jComboBox3.getSelectedItem().toString();
        int month = jComboBox4.getSelectedIndex();
        String year = jComboBox5.getSelectedItem().toString();

        /*Calender class for parsing day,month,and year*/
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), month, Integer.parseInt(day), 0, 0, 0);
        String timeStr = time + " " + ampm;

        SimpleDateFormat s = new SimpleDateFormat("yyyy-dd-MM");

        for (Encounter en: this.healthSystem.getEncounterHistory().getEncounterHistory()) {
            if (en.getEncId() == encounter.getEncId()) {
                continue;
            }

            if (en.getDoctorId().equals(docUsername)
                && s.format(en.getDate()).equals(s.format(c.getTime())) && en.getTime().equals(timeStr)) {
                JOptionPane.showMessageDialog(this, "Doctor already has an appointment at this time");
                return;
            }

            if (en.getPatientId().equals(patientUsername)
                && s.format(en.getDate()).equals(s.format(c.getTime()))
                && en.getTime().equals(timeStr)) {
                JOptionPane.showMessageDialog(this, "Patient already has an appointment at this time");
                return;
            }
        }

        encounter.setDate(c.getTime());
        encounter.setDoctorId(docUsername);
        encounter.setPatientId(patientUsername);
        encounter.setTime(timeStr);

        populateTable();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Encounter encounter = (Encounter) model.getValueAt(selectedRowIndex, 0);

        this.healthSystem.getEncounterHistory().getEncounterHistory().remove(encounter);
        populateTable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void populateDoctorComboBox() {
        
        jComboBox1.removeAllItems();
        
        for(Doctor c : this.healthSystem.getDoctorDirectory().getDoctors()){
            jComboBox1.addItem(c.getUserName());
        }
        
    }
    
    private void populatePatientComboBox() {
        
        jComboBox2.removeAllItems();
        
        for(Patient c : this.healthSystem.getPatientDirectory().getPatients()){
            jComboBox2.addItem(c.getUserName());
        }
        
    }
    
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (Encounter hs : this.healthSystem.getEncounterHistory().getEncounterHistory()) {
            Object[] row = new Object[7];
            row[0] = hs;                     
            row[1] = hs.getDoctorId();
            row[2] = hs.getDoctorId();
            row[3] = hs.getPatientId();
            row[4] = hs.getPatientId();
            row[5] = hs.getDate();
            row[6] = hs.getTime();
            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createCounterBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
