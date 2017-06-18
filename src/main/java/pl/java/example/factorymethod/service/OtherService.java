package pl.java.example.factorymethod.service;

import org.springframework.stereotype.Service;

@Service
public class OtherService {

    public String helperMethod(){
        return "Hello !!";
    }
}
