package Model;

/**
 * Model of an in-house part.
 *
 * @author Alexander Gool
 *
 */
public class InHouse extends Part {
    private int machineId;

    /**
     * Constructor for new instances of an InHouse part.
     *
     * @param id ID for the part
     * @param name name of the part
     * @param price price of the part
     * @param stock inventory level of the part
     * @param min minimum level of the part
     * @param max maximum level of the part
     * @param machineId machine ID of the part
     */
    public InHouse(int id, String name, double price, int stock, int min, int max, int machineId) {
        super(id, name, price, stock, min, max);
        this.machineId = machineId;
    }

    /**
     * Setter for machineId
     *
     * @param machineId the part's machine ID
     */
    public void setMachineId(int machineId) {
        this.machineId = machineId;
    }

    /**
     * Getter for machineId
     *
     * @return machineId of the part
     */
    public int getMachineId() {
        return machineId;
    }
}

