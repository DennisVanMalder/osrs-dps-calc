package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class bodyslotwindowcontroller {

    @FXML
    private Button bandoschestbutton;

    @FXML
    private Button karilstopbutton;

    @FXML
    void bandoschest(ActionEvent event) {
    	DPSMainCalc.atkBodyCrushBonus = 0;
    	DPSMainCalc.atkBodySlashBonus = 0;
    	DPSMainCalc.atkBodyStabBonus = 0;
    	DPSMainCalc.magicBodyBonus = -15;
    	DPSMainCalc.rangedattackBodyBonus = -10;
    	DPSMainCalc.strBodyBonus = 4;
    	DPSMainCalc.bodyopacityvalue =1;

		Stage stage =(Stage) bandoschestbutton.getScene().getWindow();
		stage.close();
    }

    @FXML
    void karilstop(ActionEvent event) {
    	DPSMainCalc.atkBodyCrushBonus = 0;
    	DPSMainCalc.atkBodySlashBonus = 0;
    	DPSMainCalc.atkBodyStabBonus = 0;
    	DPSMainCalc.magicBodyBonus = -15;
    	DPSMainCalc.rangedattackBodyBonus = +30;
    	DPSMainCalc.strBodyBonus = 0;
		DPSMainCalc.bodyopacityvalue =1;

		Stage stage =(Stage) karilstopbutton.getScene().getWindow();
		stage.close();
    }

}
