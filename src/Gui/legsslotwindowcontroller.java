package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class legsslotwindowcontroller {

    @FXML
    private Button karilsskirtbutton;

    @FXML
    private Button tassetsbutton;

    @FXML
    void tassets(ActionEvent event) {
    	DPSMainCalc.legsopacityvalue = 1;
    	DPSMainCalc.atkLegsStabBonus = 0;
    	DPSMainCalc.atkLegsSlashBonus = 0;
    	DPSMainCalc.atkLegsCrushBonus = 0;
    	DPSMainCalc.magicLegsBonus = -21;
    	DPSMainCalc.rangedattackLegsBonus = -7;
    	DPSMainCalc.strLegsBonus = 2;

		Stage stage =(Stage) tassetsbutton.getScene().getWindow();
		stage.close();
    }

    @FXML
    void kskirt(ActionEvent event) {
		DPSMainCalc.legsopacityvalue = 1;
    	DPSMainCalc.atkLegsStabBonus = 0;
    	DPSMainCalc.atkLegsSlashBonus = 0;
    	DPSMainCalc.atkLegsCrushBonus = 0;
    	DPSMainCalc.magicLegsBonus = -10;
    	DPSMainCalc.rangedattackLegsBonus = 17;
    	DPSMainCalc.strLegsBonus = 0;

		Stage stage =(Stage) karilsskirtbutton.getScene().getWindow();
		stage.close();
    }

}
