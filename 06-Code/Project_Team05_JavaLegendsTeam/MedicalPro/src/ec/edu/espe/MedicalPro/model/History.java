
package ec.edu.espe.MedicalPro.model;

/**
 *
 * @author Jonathan Insuasti
 */
public class History {
    private boolean registered;
    private boolean operated;
    private String alleragie;
    private boolean intership;
    private String deseasses;

    public History(boolean registered, boolean operated, String alleragie, boolean intership, String deseasses) {
        this.registered = registered;
        this.operated = operated;
        this.alleragie = alleragie;
        this.intership = intership;
        this.deseasses = deseasses;
    }

    @Override
    public String toString() {
        return "History{" + "registered=" + registered + ", operated=" + operated + ", alleragie=" + alleragie + ", intership=" + intership + ", deseasses=" + deseasses + '}';
    }

    /**
     * @return the registered
     */
    public boolean isRegistered() {
        return registered;
    }

    /**
     * @param registered the registered to set
     */
    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    /**
     * @return the operated
     */
    public boolean isOperated() {
        return operated;
    }

    /**
     * @param operated the operated to set
     */
    public void setOperated(boolean operated) {
        this.operated = operated;
    }

    /**
     * @return the alleragie
     */
    public String getAlleragie() {
        return alleragie;
    }

    /**
     * @param alleragie the alleragie to set
     */
    public void setAlleragie(String alleragie) {
        this.alleragie = alleragie;
    }

    /**
     * @return the intership
     */
    public boolean isIntership() {
        return intership;
    }

    /**
     * @param intership the intership to set
     */
    public void setIntership(boolean intership) {
        this.intership = intership;
    }

    /**
     * @return the deseasses
     */
    public String getDeseasses() {
        return deseasses;
    }

    /**
     * @param deseasses the deseasses to set
     */
    public void setDeseasses(String deseasses) {
        this.deseasses = deseasses;
    }
    
}
