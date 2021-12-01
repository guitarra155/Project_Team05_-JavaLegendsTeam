/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author Jose Guzman
 */
public class Register {
    private String namePatient;
    private String lastNamePatient;
    private int age;
    private String nameUser;
    private String passwordUser;
    private String passwordUserVerification;
    private String userEmail;

    @Override
    public String toString() {
        return "Register{" + "namePatient=" + namePatient + ", lastNamePatient=" + lastNamePatient + ", age=" + age + ", nameUser=" + nameUser + ", passwordUser=" + passwordUser + ", passwordUserVerification=" + passwordUserVerification + ", userEmail=" + userEmail + '}';
    }
    
    public Register(String namePatient, String lastNamePatient, int age, String nameUser, String passwordUser, String passwordUserVerification, String userEmail) {
        this.namePatient = namePatient;
        this.lastNamePatient = lastNamePatient;
        this.age = age;
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
        this.passwordUserVerification = passwordUserVerification;
        this.userEmail = userEmail;
    }
    
    public void userCreateAccount(){        
    }
    
    public void userRegisterInfo(){
    }
    
    public void emailVerification(){
    }

    /**
     * @return the namePatient
     */
    public String getNamePatient() {
        return namePatient;
    }

    /**
     * @param namePatient the namePatient to set
     */
    public void setNamePatient(String namePatient) {
        this.namePatient = namePatient;
    }

    /**
     * @return the lastNamePatient
     */
    public String getLastNamePatient() {
        return lastNamePatient;
    }

    /**
     * @param lastNamePatient the lastNamePatient to set
     */
    public void setLastNamePatient(String lastNamePatient) {
        this.lastNamePatient = lastNamePatient;
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
     * @return the nameUser
     */
    public String getNameUser() {
        return nameUser;
    }

    /**
     * @param nameUser the nameUser to set
     */
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    /**
     * @return the passwordUser
     */
    public String getPasswordUser() {
        return passwordUser;
    }

    /**
     * @param passwordUser the passwordUser to set
     */
    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    /**
     * @return the passwordUserVerification
     */
    public String getPasswordUserVerification() {
        return passwordUserVerification;
    }

    /**
     * @param passwordUserVerification the passwordUserVerification to set
     */
    public void setPasswordUserVerification(String passwordUserVerification) {
        this.passwordUserVerification = passwordUserVerification;
    }

    /**
     * @return the userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail the userEmail to set
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
}
