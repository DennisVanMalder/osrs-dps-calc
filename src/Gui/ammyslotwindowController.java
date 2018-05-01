package Gui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ammyslotwindowController {

    @FXML
    private Button torturebutton;

    @FXML
    private Button furybutton;

    @FXML
    void torture(ActionEvent event) {
		DPSMainCalc.ammyopacityvalue =1;
    	DPSMainCalc.atkAmmyCrushBonus = 15;
    	DPSMainCalc.atkAmmyStabBonus = 15;
    	DPSMainCalc.atkAmmySlashBonus = 15;
    	DPSMainCalc.magicAmmyBonus = 0;
    	DPSMainCalc.rangedattackAmmyBonus = 0;
    	DPSMainCalc.strAmmyBonus = 10;

		Stage stage =(Stage) torturebutton.getScene().getWindow();
		stage.close();
    }

    @FXML
    void fury(ActionEvent event) {
		DPSMainCalc.ammyopacityvalue =1;
    	DPSMainCalc.atkAmmyCrushBonus = 15;
    	DPSMainCalc.atkAmmyStabBonus = 15;
    	DPSMainCalc.atkAmmySlashBonus = 15;
    	DPSMainCalc.magicAmmyBonus = 10;
    	DPSMainCalc.rangedattackAmmyBonus = 10;
    	DPSMainCalc.strAmmyBonus = 10;

		Stage stage =(Stage) furybutton.getScene().getWindow();
		stage.close();
    }

}
