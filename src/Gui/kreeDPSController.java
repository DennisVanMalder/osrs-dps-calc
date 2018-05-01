package Gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class kreeDPSController extends MainLoader{

    @FXML
    private Button gobacktodpsbutton;

    @FXML
    void gobacktodps(ActionEvent event) throws IOException {
    	showDPSPage();
    }

}
