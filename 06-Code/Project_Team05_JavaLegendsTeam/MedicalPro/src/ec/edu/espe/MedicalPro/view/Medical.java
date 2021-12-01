package ec.edu.espe.MedicalPro.view;

import ec.edu.espe.MedicalPro.model.Login;
import java.util.Scanner;

/**
 *
 * @author GUITARRA JHON
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
