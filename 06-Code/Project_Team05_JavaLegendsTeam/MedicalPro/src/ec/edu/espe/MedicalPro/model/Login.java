/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author Jose Guzman
 */
public class Login {
    private String nameUser;
    private String passwordUser;

    @Override
    public String toString() {
        return "Login{" + "nameUser=" + nameUser + ", passwordUser=" + passwordUser + '}';
    }
    
    public Login(String nameUser, String passwordUser) {
        this.nameUser = nameUser;
        this.passwordUser = passwordUser;
    }
    
    public void userAccount(){       
    }
    
    public void lostPassword(){
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
    
}
