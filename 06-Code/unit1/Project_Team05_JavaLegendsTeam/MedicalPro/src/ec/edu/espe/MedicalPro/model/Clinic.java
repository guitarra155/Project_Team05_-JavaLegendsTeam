/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author mateo
 */
public class Clinic {
    private String name;
    private String address;
    private int capacity;
    private boolean parking;
    private int availability;

    @Override
    public String toString() {
        return "Clinic{" + "name=" + name + ", address=" + address + ", capacity=" + capacity + ", parking=" + parking + ", availability=" + availability + '}';
    }

    public Clinic(String name, String address, int capacity, boolean parking, int availability) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.parking = parking;
        this.availability = availability;
    }

    private void list (){
    }
    private void inform (){
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    

   
}
