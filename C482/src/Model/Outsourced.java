package Model;

/**
 * Model of an Outsourced part.
 *
 * @author Alexander Gool
 *
 */
public class Outsourced extends Part {
    private String companyName;

    /**
     * Constructor for new instances of an OutSourced part.
     *
     * @param id ID for the part
     * @param name name of the part
     * @param price price of the part
     * @param stock inventory level of the part
     * @param min minimum level of the part
     * @param max maximum level of the part
     * @param companyName name of the outsourced company
     */
    public Outsourced(int id, String name, double price, int stock, int min, int max, String companyName) {
        super(id, name, price, stock, min, max);
        this.companyName = companyName;
    }

    /**
     * Setter for companyName
     *
     * @param companyName name of the outsourced company
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * Getter for companyName
     *
     * @return name of the outsourced company
     */
    public String getCompanyName() {
        return companyName;
    }
}
