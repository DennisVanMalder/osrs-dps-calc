package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class capeslotwindow {

    @FXML
    private Button firecapebutton;

    @FXML
    private Button infernalcapebutton;

    @FXML
    void firecape(ActionEvent event) {
    	DPSMainCalc.capeopacityvalue =1;
    	DPSMainCalc.atkCapeCrushBonus = 1;
    	DPSMainCalc.atkCapeSlashBonus = 1;
    	DPSMainCalc.atkCapeStabBonus = 1;
    	DPSMainCalc.magicCapeBonus = 1;
    	DPSMainCalc.rangedattackCapeBonus = 1;
    	DPSMainCalc.strCapeBonus = 4;

		Stage stage =(Stage) firecapebutton.getScene().getWindow();
		stage.close();
    }

    @FXML
    void infernalcape(ActionEvent event) {
		DPSMainCalc.capeopacityvalue =1;
    	DPSMainCalc.atkCapeCrushBonus = 4;
    	DPSMainCalc.atkCapeSlashBonus = 4;
    	DPSMainCalc.atkCapeStabBonus = 4;
    	DPSMainCalc.magicCapeBonus = 1;
    	DPSMainCalc.rangedattackCapeBonus = 1;
    	DPSMainCalc.strCapeBonus = 8;

		Stage stage =(Stage) infernalcapebutton.getScene().getWindow();
		stage.close();
    }

}
