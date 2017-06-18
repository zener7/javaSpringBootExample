package pl.java.example.factorymethod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiskService{
    
    @Autowired
    private DiskFactory disk;


    public void play(String val){
        disk.disk(val).play();
    }
}
