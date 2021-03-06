/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.BloodPressureStatusHelper;
import model.City;
import model.Community;
import model.House;
import model.Person;
import model.System;

/**
 *
 * @author anshitaverma
 */
public class AbnormalVSJPanel extends javax.swing.JPanel {

    /**
     * Creates new form trackJPanel
     */
    private System system;
    private JPanel displayJpanel;
    
    public AbnormalVSJPanel(JPanel displayJpanel,System system) {
        this.displayJpanel=displayJpanel;
        this.system = system;
        initComponents();
        initializeData();

    }
    
    private void initializeData() {
        
       
        List<City> cities = system.getCities();
          for(City c:cities){
              cityCmb.addItem(c.getCityName().name());
          }
        cityCmb.setSelectedIndex(0);
                

        
    }
    
    
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerjLabel = new javax.swing.JLabel();
        cityjLabel = new javax.swing.JLabel();
        cityCmb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        manageSystemJLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        headerjLabel.setFont(new java.awt.Font("Malayalam Sangam MN", 1, 18)); // NOI18N
        headerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerjLabel.setText(" Abnormal Vital Signs Records");

        cityjLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cityjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cityjLabel.setText("Select City :");

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        manageSystemJLabel.setFont(new java.awt.Font("Malayalam MN", 1, 36)); // NOI18N
        manageSystemJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        manageSystemJLabel.setText("Health Plus ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cityjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cityCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(338, 338, 338))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(manageSystemJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(manageSystemJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityjLabel)
                    .addComponent(headerjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(jButton1)
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    
         String selectedCity = String.valueOf(cityCmb.getSelectedItem());
         City selectedCityObj=null;
          for(City c: system.getCities()){
              if(c.getCityName().name().equalsIgnoreCase(selectedCity)){
              selectedCityObj=c;
              continue;
              }
              
          }
         
        AbnormalPatientsJPanel abnormalJPanel = new AbnormalPatientsJPanel(displayJpanel, system ,selectedCityObj);
        displayJpanel.add("ViewAbnormalSignsPanel", abnormalJPanel);
        CardLayout layout = (CardLayout) displayJpanel.getLayout();
        layout.next(displayJpanel);

    }//GEN-LAST:event_jButton1ActionPerformed

   

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cityCmb;
    private javax.swing.JLabel cityjLabel;
    private javax.swing.JLabel headerjLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel manageSystemJLabel;
    // End of variables declaration//GEN-END:variables
}
