package Gui;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import javafx.stage.Stage;

public class weaponslotwindow extends MainLoader{


    @FXML
    private Button whipbutton;

	@FXML
	private Button tentaclewhipbutton;


    @FXML
    void whip(ActionEvent event) {
    	DPSMainCalc.attackSpeed = 2.4;
    	DPSMainCalc.atkWeaponSlashBonus = 82;
    	DPSMainCalc.atkWeaponCrushBonus = 0;
    	DPSMainCalc.atkWeaponStabBonus =0;
    	DPSMainCalc.rangedattackWeaponBonus =0;
    	DPSMainCalc.magicWeaponBonus = 0;
    	DPSMainCalc.strWeaponBonus = 82;
    	DPSMainCalc.weaponopacityvalue = 1;
    	Stage stage =(Stage) whipbutton.getScene().getWindow();
    	stage.close();
    }

    
    @FXML
    void tentwhip(ActionEvent event) {
    	DPSMainCalc.attackSpeed = 2.4;
    	DPSMainCalc.atkWeaponSlashBonus = 90;
    	DPSMainCalc.atkWeaponCrushBonus = 0;
    	DPSMainCalc.atkWeaponStabBonus =0;
    	DPSMainCalc.rangedattackWeaponBonus =0;
    	DPSMainCalc.magicWeaponBonus = 0;
    	DPSMainCalc.strWeaponBonus = 86;
		DPSMainCalc.weaponopacityvalue = 1;
    	Stage stage =(Stage) tentaclewhipbutton.getScene().getWindow();
    	stage.close();

    }
    



}
