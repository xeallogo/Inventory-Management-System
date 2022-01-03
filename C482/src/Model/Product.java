package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Model of a product, which may contain associated parts.
 *
 * @author Alexander Gool
 *
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;
    private ObservableList<Part> associatedParts = FXCollections.observableArrayList();

    /**
     * Constructor for new Product objects
     *
     * @param id the product's ID
     * @param name the product's name
     * @param price the product's price
     * @param stock the product's inventory level
     * @param min the product's minimum level
     * @param max the product's maximum level
     */
    public Product(int id, String name, double price, int stock, int min, int max) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    /**
     * The getter for the id
     *
     * @return the product's ID
     */
    public int getId() {
        return id;
    }

    /**
     * The setter for the id
     *
     * @param id the product's ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * The getter for the name
     *
     * @return the product's name
     */
    public String getName() {
        return name;
    }

    /**
     * The setter for the name
     *
     * @param name the product's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The getter for the price
     *
     * @return the product's price
     */
    public double getPrice() {
        return price;
    }

    /**
     * The setter for the price
     *
     * @param price the product's price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * The getter for the stock
     *
     * @return the product's inventory level
     */
    public int getStock() {
        return stock;
    }

    /**
     * The setter for the stock
     *
     * @param stock the product's inventory level
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * The getter for the min
     *
     * @return the product's minimum level
     */
    public int getMin() {
        return min;
    }

    /**
     * The setter for the min
     *
     * @param min the product's minimum level
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * The getter for max
     *
     * @return the product's maximum level
     */
    public int getMax() {
        return max;
    }

    /**
     * The setter for the max
     *
     * @param max the product's maximum level
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * A part is added to the product's associated parts list.
     *
     * @param part The part we are adding
     */
    public void  addAssociatedPart(Part part) {
        associatedParts.add(part);
    }

    /**
     * A part is deleted from the product's associated parts list.
     *
     * @param selectedAssociatedPart The part we are deleting
     * @return a boolean value showing status of part deletion
     */
    public boolean deleteAssociatedPart(Part selectedAssociatedPart) {
        if (associatedParts.contains(selectedAssociatedPart)) {
            associatedParts.remove(selectedAssociatedPart);
            return true;
        }
        else
            return false;
    }

    /**
     * Getter for product's associated parts list.
     *
     * @return the list of parts
     */
    public ObservableList<Part> getAllAssociatedParts() {
        return associatedParts;
    }
}
