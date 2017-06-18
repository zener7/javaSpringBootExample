package pl.java.example.factorymethod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.java.example.factorymethod.model.CdDisk;
import pl.java.example.factorymethod.model.Disk;
import pl.java.example.factorymethod.model.DvdDisk;

@Component
public class DiskFactory {

    @Autowired
    private OtherService otherService;
    
    public Disk disk(String disk) {
        if (disk.equals("cd")) {
            return CdDisk.builder().otherService(otherService).build();
        } else if (disk.equals("dvd")) {
            return new DvdDisk();
        }
        return null;
    }

}
