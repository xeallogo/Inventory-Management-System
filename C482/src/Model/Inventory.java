package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * Models the inventory of Parts & Products.
 *
 * @author Alexander Gool
 */
public class Inventory {
    private static int partId = 0;
    private static int productId = 0;
    private static ObservableList<Part> allParts = FXCollections.observableArrayList();
    private static ObservableList<Product> allProducts = FXCollections.observableArrayList();

    /**
     * A new Part is added to list of all Parts in Inventory.
     *
     * @param newPart the new part
     */
    public static void addPart(Part newPart) {
        allParts.add(newPart);
    }

    /**
     * A new Product is added to list of all Products in Inventory.
     *
     * @param newProduct the new product
     */
    public static void addProduct(Product newProduct) {
        allProducts.add(newProduct);
    }

    /**
     * Generates new part ID.
     *
     * @return new part ID.
     */
    public static int getNewPartId() {
        return ++partId;
    }

    /**
     * Generates new product ID.
     *
     * @return new product ID.
     */
    public static int getNewProductId() {
        return ++productId;
    }

    /**
     * Looks up the Part that matches the given Part ID.
     *
     * @param partId the part id
     * @return the part
     */
    public Part lookupPart(int partId) {
        // iterate through Parts list and return index of the matching part
        for (Part allPart : allParts) {
            if (allPart.getId() == partId) {
                return allPart;
            }
        }
        return null;
    }

    /**
     * Looks up the Parts whose name(s) fully or partially matches the given string.
     *
     * @param partName the part name
     * @return the observable list
     */
    public ObservableList<Part> lookupPart(String partName) {
        // iterate through Parts list and return a new list with results containing the string query
        ObservableList<Part> searchResults = FXCollections.observableArrayList();
        for (Part allPart : allParts) {
            if (allPart.getName().contains(partName)) {
                searchResults.add(allPart);
            }
        }
        return searchResults;
    }

    /**
     * Looks up the Product that matches the given Product ID.
     *
     * @param productId the product id
     * @return the product
     */
    public Product lookupProduct(int productId) {
        // iterate through Products list and return the index the matching Product
        for (Product allProduct : allProducts) {
            if (allProduct.getId() == productId) {
                return allProduct;
            }
        }
        return null;
    }

    /**
     * Looks up the Products that have their names containing a part of the String passed
     *
     * @param productName the product name
     * @return the observable list
     */
    public ObservableList<Product> lookupProduct(String productName) {
        ObservableList<Product> searchResults = FXCollections.observableArrayList();
        // iterate through Products list and return a new list with results containing the string query
        for (Product allProduct : allProducts) {
            if (allProduct.getName().contains(productName)) {
                searchResults.add(allProduct);
            }
        }
        return searchResults;
    }


    /**
     * Product is updated with the new Part at the given index, which is also given in this method.
     *
     * @param index   Part index that will be updated.
     * @param newPart the new Part
     */
    public void updatePart(int index, Part newPart) {
        allParts.set(index, newPart);
    }

    /**
     * Product is updated with the new Product at the given index, which is also given in this method.
     *
     * @param index      Product index that will be updated.
     * @param newProduct the new Product
     */
    public void updateProduct(int index, Product newProduct) {
        allProducts.set(index, newProduct);
    }

    /**
     * Removes selected Part from Inventory, returns if the deletion was successful
     *
     * @param selectedPart the selected part
     * @return boolean true if Part was successfully deleted
     */
    public static boolean deletePart(Part selectedPart) {
        return allParts.remove(selectedPart);
    }

    /**
     * Removes selected Product from Inventory, returns if the deletion was successful
     *
     * @param selectedProduct the selected product
     * @return boolean true if Product was successfully deleted
     */
    public static boolean deleteProduct(Product selectedProduct) {
        return allProducts.remove(selectedProduct);
    }

    /**
     * Gets list of all Parts.
     *
     * @return all Parts
     */
    public static ObservableList<Part> getAllParts() {
        return allParts;
    }

    /**
     * Gets list of all Products.
     *
     * @return all Products
     */
    public static ObservableList<Product> getAllProducts() {
        return allProducts;
    }
}
