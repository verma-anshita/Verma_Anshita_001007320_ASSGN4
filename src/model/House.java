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
public class House extends ModificationInfo{
 
    private String houseNumber;
    
    private List<Person> personsList;

    public House(String houseNumber, List<Person> personsList, Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.houseNumber=houseNumber;
        this.personsList=personsList;
    }

    public String getHouseName() {
        return houseNumber;
    }

    public void setHouseName(String houseNumber) {
        this.houseNumber = houseNumber;
    }
    
    public List<Person> getPersons() {
        return personsList;
    }

    public void setPersons(List<Person> personsList) {
        this.personsList = personsList;
    }

    @Override
    public String toString() {
        return houseNumber;
    }
    
}
