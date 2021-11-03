/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.House;
import model.Person;
import model.System;

/**
 *
 * @author anshitaverma
 */
public class AddPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPersonJPanel
     */
    private JPanel displayJPanel;
    private System system;
    private House house;
    
    public AddPersonJPanel(JPanel displayJPanel, System system, House house) {
        this.displayJPanel = displayJPanel;
        this.system = system;
        this.house = house;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        addPersonjLabel = new javax.swing.JLabel();
        namejLabel = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        agejLabel = new javax.swing.JLabel();
        agejTextField = new javax.swing.JTextField();
        addjButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        addPersonjLabel.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        addPersonjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPersonjLabel.setText("Add Person");

        namejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        namejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namejLabel.setText("Name :");

        agejLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        agejLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        agejLabel.setText("Age :");

        addjButton.setText("Add");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(addPersonjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(addPersonjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agejLabel)
                    .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addjButton)
                    .addComponent(backJButton))
                .addGap(77, 77, 77))
        );
    }// </editor-fold>//GEN-END:initComponents
    private boolean isValidName(String name){
    return (name==null)||!(name.matches("[A-Za-z]+( [A-Za-z]+)?"));
} 
    private boolean isValidAge(String age){
        return (age==null)||age.isEmpty()||age.isBlank();
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        PersonJPanel personJPanel = (PersonJPanel) component;
        personJPanel.populateTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
        // TODO add your handling code here:
        String name=namejTextField.getText();
        String age=agejTextField.getText();
        if(isValidName(name)){
                    JOptionPane.showMessageDialog(this, "Enter valid Name");
        }
        else if(isValidAge(age)){
                    JOptionPane.showMessageDialog(this, "Enter valid Age");

        }
        else{
            Person person = new Person(name, Double.valueOf(age), null ,
            new Date(), new Date());
            if(house.getPersons()!=null){
             house.getPersons().add(person);
             system.getPersonDirectory().getPersons().add(person);
             JOptionPane.showMessageDialog(this, "Successfully added Person");
            }
        }
        
        
        clear();
    }//GEN-LAST:event_addjButtonActionPerformed

    private void clear() {
        
        namejTextField.setText("");
        agejTextField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addPersonjLabel;
    private javax.swing.JButton addjButton;
    private javax.swing.JLabel agejLabel;
    private javax.swing.JTextField agejTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel namejLabel;
    private javax.swing.JTextField namejTextField;
    // End of variables declaration//GEN-END:variables
}
