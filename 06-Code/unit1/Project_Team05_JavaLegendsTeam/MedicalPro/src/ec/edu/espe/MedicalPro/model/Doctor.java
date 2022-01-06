/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author Daniel Lincango
 */
public class Doctor {
    private String name;
    private int age;
    private String specialty;
    private int workingDay;

    public Doctor(String name, int age, String specialty, int workingDay) {
        this.name = name;
        this.age = age;
        this.specialty = specialty;
        this.workingDay = workingDay;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name=" + name + ", age=" + age + ", specialty=" + specialty + ", workingDay=" + workingDay + '}';
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
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the specialty
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * @param specialty the specialty to set
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * @return the workingDay
     */
    public int getWorkingDay() {
        return workingDay;
    }

    /**
     * @param workingDay the workingDay to set
     */
    public void setWorkingDay(int workingDay) {
        this.workingDay = workingDay;
    }
    
    
}
