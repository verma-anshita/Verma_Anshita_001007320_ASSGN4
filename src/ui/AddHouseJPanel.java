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
import model.Community;
import model.Community;
import model.House;
import model.System;

/**
 *
 * @author anshitaverma
 */
public class AddHouseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddHouseJPanel
     */
    
    private JPanel displayJPanel;
    private System system;
    private Community community;
    
    public AddHouseJPanel(JPanel displayJPanel, System system, Community community) {
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.community=community;
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

        addHouseJLabel = new javax.swing.JLabel();
        houseNameJLabel = new javax.swing.JLabel();
        houseNameJTextField = new javax.swing.JTextField();
        addJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        addHouseJLabel.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        addHouseJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addHouseJLabel.setText("Add House");

        houseNameJLabel.setText("House Name :");

        addJButton.setText("Add");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });

        backJButton.setText("< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addHouseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(houseNameJLabel)
                            .addComponent(backJButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addJButton)
                            .addComponent(houseNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(addHouseJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(houseNameJLabel)
                    .addComponent(houseNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addJButton)
                    .addComponent(backJButton))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private boolean isValidName(String name){
        return (name==null)||name.isEmpty()||name.isBlank();
    }
    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        // TODO add your handling code here:
        String houseName = houseNameJTextField.getText();
       
        if(isValidName(houseName)){
            JOptionPane.showMessageDialog(this, "Enter House Number");

        }
        else if(community.getHouses()!=null){
           
             House house = new House(houseName, null, new Date(), new Date());
             community.getHouses().add(house);
             JOptionPane.showMessageDialog(this, "Successfully Saved");  
             
        }
      
        houseNameJTextField.setText("");
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        houseJPanel houseJPanel = (houseJPanel) component;
        houseJPanel.populateHouses();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addHouseJLabel;
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel houseNameJLabel;
    private javax.swing.JTextField houseNameJTextField;
    // End of variables declaration//GEN-END:variables
}
