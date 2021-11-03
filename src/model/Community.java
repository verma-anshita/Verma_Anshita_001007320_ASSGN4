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
public class Community extends ModificationInfo{
    
    private String cmntyName;
    
    private List<House> housesList;

    public Community(String cmntyName, List<House> housesList, Date createdDate, Date lastUpdatedDate) {
        super(createdDate, lastUpdatedDate);
        this.cmntyName = cmntyName;
        this.housesList = housesList;
    }

    public String getCommunityName() {
        return cmntyName;
    }

    public void setCommunityName(String cmntyName) {
        this.cmntyName = cmntyName;
    }
    
    public List<House> getHouses() {
        return housesList;
    }

    public void setHouses(List<House> housesList) {
        this.housesList = housesList;
    }

    @Override
    public String toString() {
        return cmntyName;
    }
    
}
