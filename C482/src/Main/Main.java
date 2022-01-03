package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Model.InHouse;
import Model.Inventory;
import Model.Outsourced;
import Model.Product;



/**
 * This Inventory Management system is an application for managing products and their associated parts.
 *
 * FUTURE ENHANCEMENT: A feature suitable for a future version or update
 * to this application would be adding the functionality to give parts/products custom attributes,
 * such as the user creating a new text field to add different/specific values for certain parts or products.
 *
 * Javadocs folder can be found in the C482 folder. The PATH should be C482/javadoc.
 *
 * @author Alexander Gool
 *
 */
public class Main extends Application {

    /**
     * FXML stage is created and initial scene is loaded.
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../Views/MainScreen.fxml"));
        primaryStage.setTitle("Inventory Management System");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * The main method is the entry point of the application.
     * Sample data is created and the application is launched here.
     *
     * @param args
     */
    public static void main(String[] args) {

        //Sample parts are added here to the main screen
        int partId = Inventory.getNewPartId();
        InHouse Screen = new InHouse(partId,"Screen", 300.00, 5, 1, 20,
                101);
        partId = Inventory.getNewPartId();
        InHouse tvStand = new InHouse(partId,"TV Stand", 100.00, 5, 1, 20,
                101);
        partId = Inventory.getNewPartId();
        InHouse powerAdapter = new InHouse(partId,"Power Adapter", 2.99, 5, 1, 20,
                101);
        partId = Inventory.getNewPartId();
        Outsourced remoteControl = new Outsourced(partId, "Remote Control",29.99, 50, 30,
                100, "LG");
        Inventory.addPart(Screen);
        Inventory.addPart(tvStand);
        Inventory.addPart(powerAdapter);
        Inventory.addPart(remoteControl);

        //Sample product is added to the main screen
        int productId = Inventory.getNewProductId();
        Product television = new Product(productId, "TV Set", 499.99, 20, 20,
                100);
        television.addAssociatedPart(Screen);
        television.addAssociatedPart(tvStand);
        television.addAssociatedPart(powerAdapter);
        television.addAssociatedPart(remoteControl);
        Inventory.addProduct(television);

        launch(args);
    }
}
