package pl.java.example.factorymethod.model;

import lombok.Builder;
import pl.java.example.factorymethod.service.OtherService;

@Builder
public class CdDisk implements Disk {

    private OtherService otherService;

    @Override
    public void play() {
        System.out.println(otherService.helperMethod() + "CD");
    }

}
