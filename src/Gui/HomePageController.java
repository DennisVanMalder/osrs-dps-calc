package Gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomePageController extends MainLoader{

	  @FXML
	    private Button gotodpsbutton;

	    @FXML
	    void gotodps(ActionEvent event) throws IOException {
	    	showDPSPage();
	    }
}
