package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class helmslotwindowController {

	@FXML
	private Button neitiznotbutton;

	@FXML
	private Button slayerhelmbutton;

	@FXML
	void neitiznot(ActionEvent event) {
		DPSMainCalc.helmopacityvalue =1;
		DPSMainCalc.atkHelmStabBonus = 0;
		DPSMainCalc.atkHelmSlashBonus = 0;
		DPSMainCalc.atkHelmCrushBonus = 0;
		DPSMainCalc.atkHelmMageBonus = 0;
		DPSMainCalc.atkHelmRangeBonus = 0;
		DPSMainCalc.strHelmBonus = 3;
		Stage stage =(Stage) neitiznotbutton.getScene().getWindow();
		stage.close();

	}

	@FXML
	void slayerhelm(ActionEvent event) {
		DPSMainCalc.helmopacityvalue =1;
		DPSMainCalc.atkHelmStabBonus = 0;
		DPSMainCalc.atkHelmSlashBonus = 0;
		DPSMainCalc.atkHelmCrushBonus = 0;
		DPSMainCalc.atkHelmMageBonus = -6;
		DPSMainCalc.atkHelmRangeBonus = -2;
		DPSMainCalc.strHelmBonus = 0;
		Stage stage =(Stage) slayerhelmbutton.getScene().getWindow();
		stage.close();
	}

}

