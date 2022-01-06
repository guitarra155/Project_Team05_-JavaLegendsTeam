/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author Daniel Lincango
 */
public class Itinerary {
    private String name;
    private int date;
    private int hour;
    private int telefone;
    private String address;

    public Itinerary(String name, int date, int hour, int telefone, String address) {
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.telefone = telefone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Itinerary{" + "name=" + name + ", date=" + date + ", hour=" + hour + ", telefone=" + telefone + ", address=" + address + '}';
    }
  
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date
     */
    public int getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
    
    
}
