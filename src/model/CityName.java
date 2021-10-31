/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author anshitaverma
 */
public enum CityName {
    Boston,NewYork,Florida;
    
        public static List<String> getCitiesList(){
       
        return Stream.of(CityName.values()).map(CityName::name).collect(Collectors.toList());
    }
    
    public static String[] getCitiesArray() {
        
        return Arrays.stream(CityName.values()).map(CityName::name).toArray(String[]::new);
    }

}
