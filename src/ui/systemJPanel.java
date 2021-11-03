/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.System;
import model.CityName;

/**
 *
 * @author anshitaverma
 */
public class systemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form systemJPanel
     */
    
    private System system;
    private JPanel displayJpanel;
    
    public systemJPanel(JPanel displayJpanel, System system) {
        this.displayJpanel = displayJpanel;
        this.system = system;
        initComponents();
        initializeCities();
    }
    
    private void initializeCities() {
        
        String [] cities = CityName.getCitiesArray();
        for(String city:cities){
            cityJComboBox.addItem(city);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageSystemJLabel = new javax.swing.JLabel();
        chooseCityJLabel = new javax.swing.JLabel();
        cityJComboBox = new javax.swing.JComboBox<>();
        goJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        manageSystemJLabel.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        manageSystemJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSystemJLabel.setText("Health Plus ");

        chooseCityJLabel.setText("Select City :");

        cityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityJComboBoxActionPerformed(evt);
            }
        });

        goJButton.setText("Proceed");
        goJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(chooseCityJLabel)
                        .addGap(18, 18, 18)
                        .addComponent(cityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(goJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(manageSystemJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(manageSystemJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseCityJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cityJComboBox))
                .addGap(18, 18, 18)
                .addComponent(goJButton)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {chooseCityJLabel, cityJComboBox});

    }// </editor-fold>//GEN-END:initComponents

    private void goJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goJButtonActionPerformed
        // TODO add your handling code here:
        String selectedCity = String.valueOf(cityJComboBox.getSelectedItem());
        communityJPanel communityJPanel = new communityJPanel(displayJpanel, system, selectedCity);
        displayJpanel.add("CommunityManagePanel", communityJPanel);
        CardLayout layout = (CardLayout) displayJpanel.getLayout();
        layout.next(displayJpanel);
        
    }//GEN-LAST:event_goJButtonActionPerformed

    private void cityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chooseCityJLabel;
    private javax.swing.JComboBox<String> cityJComboBox;
    private javax.swing.JButton goJButton;
    private javax.swing.JLabel manageSystemJLabel;
    // End of variables declaration//GEN-END:variables
}
