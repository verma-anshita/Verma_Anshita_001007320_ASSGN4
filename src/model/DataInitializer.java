/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author anshitaverma
 */
public class DataInitializer {
    
    public static System initializeSystem(){
        
        
        //Boston
        //JamaicaPlain
        //Person1
        //VitalSigns(weight,bloodPressure,height,bodyTemperate,pulseRate,respirationRate,oxygenSaturation,createdDate,lastUpdatedDate)
        VitalSigns vsJPPerson1visit1 = new VitalSigns(63.20,110.5,6.00,38.8,90,19,97.50,new Date(),new Date());
        VitalSigns vsJPPerson1visit2 = new VitalSigns(63.45,112.5,6.00,37.7,80,18,99.50,new Date(),new Date());
        VitalSigns vsJPPerson1visit3 = new VitalSigns(63.21,122.5,6.00,39.5,75,18,98.00,new Date(),new Date());
        
        //hillside
        VitalSigns vshsPerson1visit1 = new VitalSigns(56.20,115.5,5.11,38.8,90,19,97.50,new Date(),new Date());
        VitalSigns vshsPerson1visit2 = new VitalSigns(56.45,120.5,5.11,37.7,86,18,98.50,new Date(),new Date());
        VitalSigns vshsPerson1visit3 = new VitalSigns(56.21,119.5,5.11,38.5,80,19,98.00,new Date(),new Date());

        Encounter jPPerson1Encounter1 = new Encounter(vsJPPerson1visit1,new Date(),new Date());
        Encounter jPPerson1Encounter2 = new Encounter(vsJPPerson1visit2,new Date(),new Date());
        Encounter jPPerson1Encounter3 = new Encounter(vsJPPerson1visit3,new Date(),new Date());
        
        Encounter hsPerson1Encounter1 = new Encounter(vshsPerson1visit1,new Date(),new Date());
        Encounter hsPerson1Encounter2 = new Encounter(vshsPerson1visit2,new Date(),new Date());
        Encounter hsPerson1Encounter3 = new Encounter(vshsPerson1visit3,new Date(),new Date());

        List<Encounter> jPPerson1Encounters = new ArrayList<Encounter>();
        jPPerson1Encounters.add(jPPerson1Encounter1);
        jPPerson1Encounters.add(jPPerson1Encounter2);
        jPPerson1Encounters.add(jPPerson1Encounter3);
        EncounterHistory jPPerson1encounterHistory = new EncounterHistory(jPPerson1Encounters,new Date(),new Date());
        
        List<Encounter> hsPerson1Encounters = new ArrayList<Encounter>();
        hsPerson1Encounters.add(hsPerson1Encounter1);
        hsPerson1Encounters.add(hsPerson1Encounter2);
        hsPerson1Encounters.add(hsPerson1Encounter3);
        EncounterHistory hsPerson1encounterHistory = new EncounterHistory(hsPerson1Encounters,new Date(),new Date());
        
        Patient jPPatient1 = new Patient(jPPerson1encounterHistory,new Date(),new Date());
        Person jPPerson1 = new Person("Rick",23.5,jPPatient1,new Date(),new Date());
        
        Patient hsPatient1 = new Patient(hsPerson1encounterHistory,new Date(),new Date());
        Person hsPerson1 = new Person("Hillary",23.5,hsPatient1,new Date(),new Date());
        
        Patient stPatient1 = new Patient(jPPerson1encounterHistory,new Date(),new Date());
        Person stPerson1 = new Person("Ross",40.5,stPatient1,new Date(),new Date());
        
        Patient sjPatient1 = new Patient(hsPerson1encounterHistory,new Date(),new Date());
        Person sjPerson1 = new Person("Monica",30.5,sjPatient1,new Date(),new Date());
        
        //Person2
        VitalSigns vsJPPerson2visit1 = new VitalSigns(65.20,112.5,5.70,39.8,94,19,95.58,new Date(),new Date());
        VitalSigns vsJPPerson2visit2 = new VitalSigns(64.60,120.5,5.70,40.5,93,20,97.78,new Date(),new Date());
        VitalSigns vsJPPerson2visit3 = new VitalSigns(66.80,122.5,5.70,38.3,96,18,99.50,new Date(),new Date());
        
        VitalSigns vshsPerson2visit1 = new VitalSigns(56.20,121.5,5.11,38.8,90,19,97.50,new Date(),new Date());
        VitalSigns vshsPerson2visit2 = new VitalSigns(56.45,122.5,5.11,37.7,86,18,98.50,new Date(),new Date());
        VitalSigns vshsPerson2visit3 = new VitalSigns(56.21,118.5,5.11,38.5,80,19,98.00,new Date(),new Date());
        
        Encounter jPPerson2Encounter1 = new Encounter(vsJPPerson2visit1,new Date(),new Date());
        Encounter jPPerson2Encounter2 = new Encounter(vsJPPerson2visit2,new Date(),new Date());
        Encounter jPPerson2Encounter3 = new Encounter(vsJPPerson2visit3,new Date(),new Date());
        
        Encounter hsPerson2Encounter1 = new Encounter(vshsPerson2visit1,new Date(),new Date());
        Encounter hsPerson2Encounter2 = new Encounter(vshsPerson2visit2,new Date(),new Date());
        Encounter hsPerson2Encounter3 = new Encounter(vshsPerson2visit3,new Date(),new Date());
        

        List<Encounter> jPPerson2Encounters = new ArrayList<Encounter>();
        jPPerson2Encounters.add(jPPerson2Encounter1);
        jPPerson2Encounters.add(jPPerson2Encounter2);
        jPPerson2Encounters.add(jPPerson2Encounter3);
        EncounterHistory jPPerson2encounterHistory = new EncounterHistory(jPPerson2Encounters,new Date(),new Date());
        
        List<Encounter> hsPerson2Encounters = new ArrayList<Encounter>();
        hsPerson1Encounters.add(hsPerson2Encounter1);
        hsPerson1Encounters.add(hsPerson2Encounter2);
        hsPerson1Encounters.add(hsPerson2Encounter3);
        EncounterHistory hsPerson2encounterHistory = new EncounterHistory(hsPerson1Encounters,new Date(),new Date());
        
        
       
        Patient jPPatient2 = new Patient(jPPerson2encounterHistory,new Date(),new Date());
        Person jPPerson2 = new Person("Trent",26.0,jPPatient2,new Date(),new Date());
        
              
        Patient hsPatient2 = new Patient(hsPerson2encounterHistory,new Date(),new Date());
        Person hsPerson2 = new Person("Emma",23.5,hsPatient2,new Date(),new Date());
        
        Patient stPatient2 = new Patient(jPPerson1encounterHistory,new Date(),new Date());
        Person stPerson2 = new Person("Daniel",40.5,stPatient2,new Date(),new Date());
        
        Patient sjPatient2 = new Patient(hsPerson1encounterHistory,new Date(),new Date());
        Person sjPerson2 = new Person("Rachel",30.5,sjPatient2,new Date(),new Date());
        
        List<Person> house1Persons = new ArrayList<>();
        house1Persons.add(jPPerson1);
        house1Persons.add(jPPerson2);
        
        List<Person> house2Persons = new ArrayList<>();
        house2Persons.add(hsPerson1);
        house2Persons.add(hsPerson2);
        
        List<Person> house3Persons = new ArrayList<>();
        house3Persons.add(stPerson1);
        house3Persons.add(stPerson2);
        
        List<Person> house4Persons = new ArrayList<>();
        house4Persons.add(sjPerson1);
        house4Persons.add(sjPerson2);
        
        House jPHouse1 = new House("750 GreenST",house1Persons,new Date(),new Date());
        List<House> jphouses = new ArrayList<>();
        jphouses.add(jPHouse1);
        
        House hsHouse2 = new House("Allahgany ST",house2Persons,new Date(),new Date());
        List<House> hshouses = new ArrayList<>();
        hshouses.add(hsHouse2);
        
        House stHouse2 = new House("455 Brooklyn St ",house3Persons,new Date(),new Date());
        List<House> sthouses = new ArrayList<>();
        sthouses.add(stHouse2);
        
        House sjHouse2 = new House("130 -BV",house4Persons,new Date(),new Date());
        List<House> sjhouses = new ArrayList<>();
        sjhouses.add(sjHouse2);
        
        Community jpCommunity = new Community("White Plain",jphouses, new Date(),new Date());
        List<Community> jpCommunities = new ArrayList<>();
        jpCommunities.add(jpCommunity);
        
        Community hsCommunity = new Community("Hill Side",hshouses, new Date(),new Date());
        List<Community> hsCommunities = new ArrayList<>();
        hsCommunities.add(hsCommunity);
        
        Community stCommunity = new Community("Mission Park ",sthouses, new Date(),new Date());
        List<Community> stCommunities = new ArrayList<>();
        stCommunities.add(stCommunity);
        
        Community sjCommunity = new Community("Beach View ",sjhouses, new Date(),new Date());
        List<Community> sjCommunities = new ArrayList<>();
        sjCommunities.add(sjCommunity);
        
        City bostonCity = new City(CityName.Boston, jpCommunities,  new Date(),new Date());
        
        City MiamiCity = new City(CityName.Miami, hsCommunities,  new Date(),new Date());
        
        City SeattleCity = new City(CityName.Seattle, stCommunities,  new Date(),new Date());
        
        City SanJoseCity = new City(CityName.SanJose, sjCommunities,  new Date(),new Date());
        
        
        //MissionHill
        //Person1
        VitalSigns vsMHPerson1visit1 = new VitalSigns(55.20,112.5,6.00,38.8,95,19,97.50,new Date(),new Date());
        VitalSigns vsMHPerson1visit2 = new VitalSigns(56.45,132.5,6.00,37.7,96,19,98.50,new Date(),new Date());
        VitalSigns vsMHPerson1visit3 = new VitalSigns(57.21,112.5,6.00,39.5,97,19,99.50,new Date(),new Date());
        
        Encounter mhPerson1Encounter1 = new Encounter(vsMHPerson1visit1,new Date(),new Date());
        Encounter mhPerson1Encounter2 = new Encounter(vsMHPerson1visit2,new Date(),new Date());
        Encounter mhPerson1Encounter3 = new Encounter(vsMHPerson1visit3,new Date(),new Date());
        
        List<Encounter> mhPerson1Encounters = new ArrayList<Encounter>();
        mhPerson1Encounters.add(mhPerson1Encounter1);
        mhPerson1Encounters.add(mhPerson1Encounter2);
        mhPerson1Encounters.add(mhPerson1Encounter3);
        EncounterHistory mhPerson1encounterHistory = new EncounterHistory(mhPerson1Encounters,new Date(),new Date());
        

        //Person2
        VitalSigns vsMHPerson2visit1 = new VitalSigns(65.20,117.5,5.70,39.8,94,19,95.58,new Date(),new Date());
        VitalSigns vsMHPerson2visit2 = new VitalSigns(64.60,135.5,5.70,40.5,93,20,97.78,new Date(),new Date());
        
        Encounter mhPerson2Encounter1 = new Encounter(vsMHPerson2visit1,new Date(),new Date());
        Encounter mhPerson2Encounter2 = new Encounter(vsMHPerson2visit2,new Date(),new Date());
        
        
        List<Encounter> mhPerson2Encounters = new ArrayList<Encounter>();
        mhPerson2Encounters.add(mhPerson2Encounter1);
        mhPerson2Encounters.add(mhPerson2Encounter2);
        EncounterHistory mhPerson2encounterHistory = new EncounterHistory(mhPerson2Encounters,new Date(),new Date());
        

        
        
        //Roxubory
        //Person1
        VitalSigns vsRBPerson1visit1 = new VitalSigns(46.20,140.5,5.10,38.8,95,19,99.50,new Date(),new Date());
        VitalSigns vsRBPerson1visit2 = new VitalSigns(48.45,114.5,5.10,38.7,96,19,98.50,new Date(),new Date());
        VitalSigns vsRBPerson1visit3 = new VitalSigns(48.45,123.5,5.10,38.7,96,19,98.50,new Date(),new Date());
        
        Encounter rbPerson1Encounter1 = new Encounter(vsRBPerson1visit1,new Date(),new Date());
        Encounter rbPerson1Encounter2 = new Encounter(vsRBPerson1visit2,new Date(),new Date());
        Encounter rbPerson1Encounter3 = new Encounter(vsRBPerson1visit3,new Date(),new Date());
        
        List<Encounter> rbPerson1Encounters = new ArrayList<Encounter>();
        rbPerson1Encounters.add(rbPerson1Encounter1);
        rbPerson1Encounters.add(rbPerson1Encounter2);
        rbPerson1Encounters.add(rbPerson1Encounter3);
        EncounterHistory rbPerson1encounterHistory = new EncounterHistory(rbPerson1Encounters,new Date(),new Date());
        
        //Person2
        VitalSigns vsRBPerson2visit1 = new VitalSigns(55.20,134.5,5.20,38.8,95,19,97.50,new Date(),new Date());
        VitalSigns vsRBPerson2visit2 = new VitalSigns(55.20,112.5,5.20,38.8,95,19,97.50,new Date(),new Date());
        VitalSigns vsRBPerson2visit3 = new VitalSigns(55.20,120.5,5.20,38.8,95,19,97.50,new Date(),new Date());
        
        Encounter rbPerson2Encounter1 = new Encounter(vsRBPerson2visit1,new Date(),new Date());
        Encounter rbPerson2Encounter2 = new Encounter(vsRBPerson2visit2,new Date(),new Date());
        Encounter rbPerson2Encounter3 = new Encounter(vsRBPerson2visit3,new Date(),new Date());
        
        List<Encounter> rbPerson2Encounters = new ArrayList<Encounter>();
        rbPerson2Encounters.add(rbPerson2Encounter1);
        rbPerson2Encounters.add(rbPerson2Encounter2);
        rbPerson2Encounters.add(rbPerson2Encounter3);
        EncounterHistory rbPerson2encounterHistory = new EncounterHistory(rbPerson2Encounters,new Date(),new Date());
        
        
        Patient mhPatient1 = new Patient(mhPerson1encounterHistory,new Date(),new Date());
        Person mhPerson1 = new Person("John",23.5,mhPatient1,new Date(),new Date());
        
        Patient mhPatient2 = new Patient(mhPerson2encounterHistory,new Date(),new Date());
        Person mhPerson2 = new Person("Denise",23.5,mhPatient2,new Date(),new Date());
        
        Patient rbPatient1 = new Patient(rbPerson1encounterHistory,new Date(),new Date());
        Person rbPerson1 = new Person("Robert",40.5,rbPatient1,new Date(),new Date());
        
        Patient rbPatient2 = new Patient(rbPerson2encounterHistory,new Date(),new Date());
        Person rbPerson2 = new Person("Ruby",30.5,rbPatient2,new Date(),new Date());

        
        List<Person> mhhouse1Persons = new ArrayList<>();
        mhhouse1Persons.add(mhPerson1);
        mhhouse1Persons.add(mhPerson2);
        
        List<Person> rbhouse1Persons = new ArrayList<>();
        rbhouse1Persons.add(rbPerson1);
        rbhouse1Persons.add(rbPerson2);
        
        House mhHouse1 = new House("700 WhiteST",mhhouse1Persons,new Date(),new Date());
        List<House> mhhouses = new ArrayList<>();
        mhhouses.add(mhHouse1);
        
        House rbHouse1 = new House("65 Street",rbhouse1Persons,new Date(),new Date());
        List<House> rbhouses = new ArrayList<>();
        rbhouses.add(rbHouse1);
        
        Community mhCommunity = new Community("Coopley",mhhouses, new Date(),new Date());
        List<Community> mhCommunities = new ArrayList<>();
        mhCommunities.add(mhCommunity);
        
        Community rbCommunity = new Community("Charles River",rbhouses, new Date(),new Date());
        List<Community> rbCommunities = new ArrayList<>();
        rbCommunities.add(rbCommunity);
        
         City bostonCity2 = new City(CityName.Boston, mhCommunities,  new Date(),new Date());
         City bostonCity3 = new City(CityName.Boston, rbCommunities,  new Date(),new Date());

        
        List<City> cities = new ArrayList<>();
        cities.add(bostonCity);
   //     cities.add(bostonCity2);
//        cities.add(bostonCity3);
        cities.add(MiamiCity);
        cities.add(SeattleCity);
        cities.add(SanJoseCity);
        
        
        
        List<Person> parentsList = new ArrayList<>();
        parentsList.add(jPPerson1);
        parentsList.add(jPPerson2);
        PersonDirectory personDirectory = new PersonDirectory(parentsList,new Date(),new Date());
        
        List<Patient> patientsList = new ArrayList<>();
        patientsList.add(jPPatient1);
        patientsList.add(jPPatient2);
        PatientDirectory patientDirectory = new PatientDirectory(patientsList,new Date(),new Date());
        System system = new System(cities, personDirectory, patientDirectory, new Date(),new Date());
        
        return system;
    }
    
}
