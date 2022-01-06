package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author  GUITARRA JHON 
 */
public class Appointment {
    private int date;
    private int month;
    private String manePatient;
    private String nameDoctor;
    private int numRoom;

    @Override
    public String toString() {
        return "Appointment{" + "date=" + date + ", month=" + month + ", manePatient=" + manePatient + ", nameDoctor=" + nameDoctor + ", numRoom=" + numRoom + '}';
    }


    public Appointment(int date, int month, String manePatient, String nameDoctor, int numRoom) {
        this.date = date;
        this.month = month;
        this.manePatient = manePatient;
        this.nameDoctor = nameDoctor;
        this.numRoom = numRoom;
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
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the manePatient
     */
    public String getManePatient() {
        return manePatient;
    }

    /**
     * @param manePatient the manePatient to set
     */
    public void setManePatient(String manePatient) {
        this.manePatient = manePatient;
    }

    /**
     * @return the nameDoctor
     */
    public String getNameDoctor() {
        return nameDoctor;
    }

    /**
     * @param nameDoctor the nameDoctor to set
     */
    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    /**
     * @return the numRoom
     */
    public int getNumRoom() {
        return numRoom;
    }

    /**
     * @param numRoom the numRoom to set
     */
    public void setNumRoom(int numRoom) {
        this.numRoom = numRoom;
    }
        
    
   
}
