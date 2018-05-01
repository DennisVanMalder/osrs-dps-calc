package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class bootslotwindowcontroller {

    @FXML
    private Button dbootsbutton;

    @FXML
    private Button primordialbutton;

    @FXML
    void primboots(ActionEvent event) {
    	DPSMainCalc.bootsopacityvalue =1;
    	DPSMainCalc.atkBootsStabBonus = 2;
    	DPSMainCalc.atkBootsSlashBonus = 2;
    	DPSMainCalc.atkBootsCrushBonus = 2;
    	DPSMainCalc.magicBootBonus = -4;
    	DPSMainCalc.rangedattackBootBonus = -1;
    	DPSMainCalc.strBootsBonus = 5;

		Stage stage =(Stage) primordialbutton.getScene().getWindow();
		stage.close();

    }

    @FXML
    void dboots(ActionEvent event) {
		DPSMainCalc.bootsopacityvalue =1;
    	DPSMainCalc.atkBootsStabBonus = 0;
    	DPSMainCalc.atkBootsSlashBonus = 0;
    	DPSMainCalc.atkBootsCrushBonus = 0;
    	DPSMainCalc.magicBootBonus = -3;
    	DPSMainCalc.rangedattackBootBonus = -1;
    	DPSMainCalc.strBootsBonus = 4;

		Stage stage =(Stage) dbootsbutton.getScene().getWindow();
		stage.close();
    }

}
