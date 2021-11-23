
package ec.edu.espe.MedicalPro.model;
/**
 *
 * @author Jose Guzman
 */
public class Appointment {
    private String Date;
    private String NamePatient;
    private String NameDoctor;
    private String ClinicRoom;
    
    public Schedule schedule(){
        return new Schedule();
    }
    public ConsultInfo description(){
        return new ConsultInfo();
    }
    
    private Availability free(){
        return new Availability();
    } 
}
