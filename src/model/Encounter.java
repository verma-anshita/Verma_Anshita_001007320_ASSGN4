/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author anshitaverma
 */
public class Encounter extends ModificationInfo{
    
    private VitalSigns vSigns;

    public Encounter(VitalSigns vSigns,Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.vSigns=vSigns;
    }

    public VitalSigns getVitalSigns() {
        return vSigns;
    }

    public void setVitalSigns(VitalSigns vSigns) {
        this.vSigns = vSigns;
    }
   
}
