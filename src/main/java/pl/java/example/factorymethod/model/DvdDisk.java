package pl.java.example.factorymethod.model;

public class DvdDisk implements Disk {

    @Override
    public void play() {
        System.out.println("DVD");
    }

}
