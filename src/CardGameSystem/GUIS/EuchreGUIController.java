/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CardGameSystem.GUIS;

import CardGameSystem.CardGameSystem;
import CardGameSystem.ControlledScreen;
import CardGameSystem.ScreensController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Andrew Haeger
 */
public class EuchreGUIController implements Initializable, ControlledScreen {

    ScreensController controller;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @Override
    public void setScreenParent(ScreensController screenParent) {
        controller = screenParent;
    }
    
    @FXML
    private void goToTablesScreen(ActionEvent event) {
        controller.setScreen(CardGameSystem.screen3ID);
    }
    
    @FXML
    private void goToLoginScreen(ActionEvent event) {
        controller.setScreen(CardGameSystem.screen2ID);
    }
}
