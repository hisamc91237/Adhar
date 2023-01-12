package com.example.AdharCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class AadharRepository {

    HashMap<String, String> aadharDb;

    public AadharRepository() {
        this.aadharDb = new HashMap<>();
    }

    public void addNameAndNumber(String aadharNumber, String name){
        aadharDb.put(aadharNumber, name);
    }

    public String getNameById(String aadharNumber){
        if(aadharDb.containsKey(aadharNumber)){
            return aadharDb.get(aadharNumber);
        }
        return "Not in the database";
    }

}
