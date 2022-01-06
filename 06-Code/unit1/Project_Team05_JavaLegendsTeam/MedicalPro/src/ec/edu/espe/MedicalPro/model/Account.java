/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.MedicalPro.model;
import java.util.ArrayList;
/**
 *
 * @author Jose Guzman
 */
public class Account {
    private String nameUser;
    private String password;
    private ArrayList<Account> accounts;
    
    public void add(Account account){
        accounts.add(account);
    }
    
    public void remove(Account account){
        accounts.remove(account);
    }
    
    public int countAccounts(){
        return accounts.size();
    }
    
    @Override
    public String toString() {
        return "Account{" + "nameUser=" + nameUser + ", password=" + password + '}';
    }
    
    public Account(String nameUser, String password) {
        this.nameUser = nameUser;
        this.password = password;
    }
    
    public Login login(){
        return null;
    }
    
    public Register register(){
        return null;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
