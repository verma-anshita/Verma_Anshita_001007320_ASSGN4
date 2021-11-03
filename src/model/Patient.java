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
public class Patient extends ModificationInfo{
 
    private EncounterHistory encounteredHistory;

    public Patient(EncounterHistory encounteredHistory, Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.encounteredHistory = encounteredHistory;
    }

    public EncounterHistory getEncounterHistory() {
        return encounteredHistory;
    }

    public void setEncounterHistory(EncounterHistory encounteredHistory) {
        this.encounteredHistory = encounteredHistory;
    }
    
}
