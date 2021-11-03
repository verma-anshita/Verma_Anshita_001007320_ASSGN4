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
public class EncounterHistory extends ModificationInfo{
    
    private List<Encounter> encountersList;

    public EncounterHistory(List<Encounter> encountersList,Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.encountersList = encountersList;
    }

    public List<Encounter> getEncounters() {
        return encountersList;
    }

    public void setEncounters(List<Encounter> encountersList) {
        this.encountersList = encountersList;
    }
    
}
