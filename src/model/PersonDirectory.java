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
public class PersonDirectory extends ModificationInfo{
    
    private List<Person> personsList;

    public PersonDirectory(List<Person> personsList, Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.personsList=personsList;
    }

    public List<Person> getPersons() {
        return personsList;
    }

    public void setPersons(List<Person> personsList) {
        this.personsList = personsList;
    }
    
}
