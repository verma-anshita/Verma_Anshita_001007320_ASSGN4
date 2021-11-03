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
public class Person extends ModificationInfo{
    
    private String pname;
    
    private double age;
    
    private Patient patient;

    public Person(String pname, double age, Patient patient, Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.age = age;
        this.pname = pname;
        this.patient = patient;
    }

    public String getName() {
        return pname;
    }

    public void setName(String pname) {
        this.pname = pname;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return pname;
    }

}
