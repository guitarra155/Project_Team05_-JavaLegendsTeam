package ec.edu.espe.MedicalPro.model;
/**
 *
 * @author Jose Guzman
 */
public class Login {
    private String NameUser;
    private String PasswordUser;
    
    private void UserAccountAccess(){
    }
    
    private LostPassword EmailRecuperationCode(){
        return new LostPassword();
    }
}
