package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class glovesslotwindowcontroller {

    @FXML
    private Button barrowsglovesbutton;

    @FXML
    void bgloves(ActionEvent event) {
    	DPSMainCalc.glovesOpacityvalue = 1;
    	DPSMainCalc.atkGlovesStabBonus = 12;
    	DPSMainCalc.atkGlovesSlashBonus = 12;
    	DPSMainCalc.atkGlovesCrushBonus = 12;
    	DPSMainCalc.magicGlovesBonus =6;
    	DPSMainCalc.rangedattackGlovesBonus = 12;
    	DPSMainCalc.strGlovesBonus = 12;
		Stage stage =(Stage) barrowsglovesbutton.getScene().getWindow();
		stage.close();
    }

}
