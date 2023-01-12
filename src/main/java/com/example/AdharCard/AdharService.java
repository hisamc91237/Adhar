package com.example.AdharCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AadharService {


    @Autowired
    AadharRepository aadharRepository;

    public void addAadhar(String aadharNumber, String name){
        aadharRepository.addNameAndNumber(aadharNumber, name);
    }

    public String getNameById(String aadharNumber){
        return aadharRepository.getNameById(aadharNumber);
    }
}
