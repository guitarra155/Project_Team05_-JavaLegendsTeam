
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author jhona
 */
public class Patient {
    private String name;
    private int age;
    private float weight;
    private float meight;
    private int telephone;
    
    public Dates dates(){
        return new Dates();
    }
    public buyMedicate medicine(){
        return new buyMedicate();
    }

    public Patient(String name, int age, float weight, float meight, int telephone) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.meight = meight;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", age=" + age + ", weight=" + weight + ", meight=" + meight + ", telephone=" + telephone + '}';
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
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the meight
     */
    public float getMeight() {
        return meight;
    }

    /**
     * @param meight the meight to set
     */
    public void setMeight(float meight) {
        this.meight = meight;
    }

    /**
     * @return the telephone
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * @param telephone the telephone to set
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
}
