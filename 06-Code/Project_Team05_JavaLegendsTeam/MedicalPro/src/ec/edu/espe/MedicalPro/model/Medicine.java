
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author Jonathan Insuasti
 */
public class Medicine {
    private String name;
    private float price;
    private boolean availabity;
    private String effects;
    private String prescripcion;
    private float amount;
    
    public void medicine(){
        
    }
    
    public void sell(){
        
    }
    
    public void stock(){
        
    }
    
    public void promotions(){
        
    }
    
    @Override
    public String toString() {
        return "Medicine{" + "name=" + name + ", price=" + price + ", availabity=" + availabity + ", effects=" + effects + ", prescripcion=" + prescripcion + ", amount=" + amount + '}';
    }

    public Medicine(String name, float price, boolean availabity, String effects, String prescripcion, float amount) {
        this.name = name;
        this.price = price;
        this.availabity = availabity;
        this.effects = effects;
        this.prescripcion = prescripcion;
        this.amount = amount;
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
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the availabity
     */
    public boolean isAvailabity() {
        return availabity;
    }

    /**
     * @param availabity the availabity to set
     */
    public void setAvailabity(boolean availabity) {
        this.availabity = availabity;
    }

    /**
     * @return the effects
     */
    public String getEffects() {
        return effects;
    }

    /**
     * @param effects the effects to set
     */
    public void setEffects(String effects) {
        this.effects = effects;
    }

    /**
     * @return the prescripcion
     */
    public String getPrescripcion() {
        return prescripcion;
    }

    /**
     * @param prescripcion the prescripcion to set
     */
    public void setPrescripcion(String prescripcion) {
        this.prescripcion = prescripcion;
    }

    /**
     * @return the amount
     */
    public float getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    
    
    
}
