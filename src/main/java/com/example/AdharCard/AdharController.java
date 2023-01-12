package com.example.AdharCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AadharController {

    @Autowired
    AadharService aadharService;

    @PostMapping("/addAadharNum")
    public ResponseEntity<String> saveAadharNum(@RequestParam("id") String aadharNumber, @RequestParam("name") String name){
        aadharService.addAadhar(aadharNumber, name);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }

    @GetMapping("/getNameById")
    public ResponseEntity<String> getNameById(@RequestParam("aadharNumber") String aadharNumber){
        String name = aadharService.getNameById(aadharNumber);
        return new ResponseEntity<>(name, HttpStatus.ACCEPTED);
    }
}
