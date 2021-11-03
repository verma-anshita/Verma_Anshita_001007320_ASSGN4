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
public class System extends ModificationInfo{
    
    private List<City> citiesList;
    
    private PersonDirectory personDirectory;
    
    private PatientDirectory patientDirectory;

    public System(List<City> citiesList,PersonDirectory personDirectory, PatientDirectory patientDirectory, Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.citiesList= citiesList;
        this.personDirectory=personDirectory;
        this.patientDirectory=patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public List<City> getCities() {
        return citiesList;
    }

    public void setCities(List<City> citiesList) {
        this.citiesList = citiesList;
    }
   
}
