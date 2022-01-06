package ec.edu.espe.MedicalPro.view;

import ec.edu.espe.MedicalPro.model.Login;
import ec.edu.espe.MedicalPro.model.Account;
import java.util.Scanner;
<<<<<<< HEAD
import ec.edu.espe.MedicalPro.model.Account;
import ec.edu.espe.MedicalPro.model.Appointment;
import ec.edu.espe.MedicalPro.model.Clinic;
import ec.edu.espe.MedicalPro.model.Doctor;
import ec.edu.espe.MedicalPro.model.History;
import ec.edu.espe.MedicalPro.model.Itinerary;
import ec.edu.espe.MedicalPro.model.List;
import ec.edu.espe.MedicalPro.model.Login;
import ec.edu.espe.MedicalPro.model.Medicine;
import ec.edu.espe.MedicalPro.model.Patient;
import ec.edu.espe.MedicalPro.model.Register;

    

import java.util.ArrayList;

/**
 *
 * @author GProject_Team05_JavaLegendsTeam
 */

public class Medical {
    public static void main(String[] args) {
        String nameUser = "null";
        String passwordUser = "null";
        
        Login login = new Login(nameUser,passwordUser);
        Scanner read = new Scanner(System.in);
        System.out.println ("Please enter data for User");
        System.out.println ("Please enter User name ------>");
        nameUser = read.next();
        System.out.println ("Please enter pasword ------>");
        passwordUser = read.next();
        login = new Login(nameUser,passwordUser);
        System.out.println("Data of User --> "+ login);


    }
}
