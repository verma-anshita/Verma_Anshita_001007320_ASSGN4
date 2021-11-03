/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author anshitaverma
 */
 public class PatientDirectory extends ModificationInfo{
    
    private List<Patient> patientsList;

    public PatientDirectory(List<Patient> patientsList, Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.patientsList=patientsList;
    }

    public List<Patient> getPatients() {
        return patientsList;
    }

    public void setPatients(List<Patient> patientsList) {
        this.patientsList = patientsList;
    }
    
}
