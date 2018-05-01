package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class shieldslotwindowcontroller {

    @FXML
    private Button dfsbutton;

    @FXML
    private Button ddefbutton;

    @FXML
    void ddef(ActionEvent event) {
    	DPSMainCalc.atkShieldStabBonus = 25;
    	DPSMainCalc.atkShieldSlashBonus = 24;
    	DPSMainCalc.atkShieldCrushBonus = 23;
    	DPSMainCalc.magicShieldBonus = -3;
    	DPSMainCalc.rangedattackShieldBonus = -2;
    	DPSMainCalc.strShieldBonus = 6;
    	DPSMainCalc.shieldopacityvalue = 1;


    	Stage stage =(Stage) dfsbutton.getScene().getWindow();
    	stage.close();
    }

    @FXML
    void dfs(ActionEvent event) {
    	DPSMainCalc.atkShieldStabBonus = 0;
    	DPSMainCalc.atkShieldSlashBonus = 0;
    	DPSMainCalc.atkShieldCrushBonus = 0;
    	DPSMainCalc.magicShieldBonus = -10;
    	DPSMainCalc.rangedattackShieldBonus = -5;
    	DPSMainCalc.strShieldBonus = 7;
		DPSMainCalc.shieldopacityvalue = 1;

    	Stage stage =(Stage) ddefbutton.getScene().getWindow();
    	stage.close();
    }

}
