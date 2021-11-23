package ec.edu.espe.MedicalPro.model;
/**
 *
 * @author Jose Guzman
 */
public class Register {
    private String NamePatient;
    private String LastNamePatient;
    private String NameUser;
    private int Age;
    private String PasswordUser;
    private String PassWordUserVerification;
    private String UserEmail;
    
    private void UserCreateAccount(){
    }
    
    private UserRegistrationInfo UserInfo(){
        return new UserRegistrationInfo();
    }
    
    private EmailVerification EmailVerificationCode(){
        return new EmailVerification();
    }
}
