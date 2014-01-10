/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CardGameSystem;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Andrew Haeger
 */
public class CardGameSystem extends Application {

    public static String screen1ID = "main";
    public static String screen1File = "GUIS/MainGUI.fxml";
    public static String screen2ID = "login";
    public static String screen2File = "GUIS/LoginGUI.fxml";
    public static String screen3ID = "tables";
    public static String screen3File = "GUIS/TablesGUI.fxml";
    public static String screen4ID = "holdem";
    public static String screen4File = "GUIS/HoldEmGUI.fxml";
    public static String screen5ID = "fivecarddraw";
    public static String screen5File = "GUIS/FiveCardDrawGUI.fxml";
    public static String screen6ID = "euchre";
    public static String screen6File = "GUIS/EuchreGUI.fxml";
    public static String screen7ID = "blackjack";
    public static String screen7File = "GUIS/BlackjackGUI.fxml";

    @Override
    public void start(Stage stage) throws Exception {
        ScreensController container = new ScreensController();
        container.loadScreen(CardGameSystem.screen1ID, CardGameSystem.screen1File);
        container.loadScreen(CardGameSystem.screen2ID, CardGameSystem.screen2File);
        container.loadScreen(CardGameSystem.screen3ID, CardGameSystem.screen3File);
        container.loadScreen(CardGameSystem.screen4ID, CardGameSystem.screen4File);
        container.loadScreen(CardGameSystem.screen5ID, CardGameSystem.screen5File);
        container.loadScreen(CardGameSystem.screen6ID, CardGameSystem.screen6File);
        container.loadScreen(CardGameSystem.screen7ID, CardGameSystem.screen7File);

        container.setScreen(CardGameSystem.screen1ID);

        Group root = new Group();
        root.getChildren().addAll(container);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        stage.setWidth(1256);
        stage.setHeight(800);
        stage.getIcons().add(new Image(CardGameSystem.class.getResourceAsStream("CardGameIcon.png")));
        stage.setTitle("Legion Games");
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
