package Gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ringslotwindowcontroller {

    @FXML
    private Button berserkerringimbuedbutton;

    @FXML
    private Button warriorringimbued;

    @FXML
    void bringi(ActionEvent event) {
    	DPSMainCalc.atkRingCrushBonus = 0;
    	DPSMainCalc.atkRingSlashBonus =0;
    	DPSMainCalc.atkRingStabBonus =0;
    	DPSMainCalc.rangedattackRingBonus=0;
    	DPSMainCalc.magicRingBonus=0;
    	DPSMainCalc.strRingBonus=8;
    	DPSMainCalc.ringopacityvalue = 1;
    	
    	Stage stage =(Stage) berserkerringimbuedbutton.getScene().getWindow();
    	stage.close();

    }

    @FXML
    void wringi(ActionEvent event) {
    	DPSMainCalc.atkRingCrushBonus = 0;
    	DPSMainCalc.atkRingSlashBonus =8;
    	DPSMainCalc.atkRingStabBonus =0;
    	DPSMainCalc.rangedattackRingBonus=0;
    	DPSMainCalc.magicRingBonus=0;
    	DPSMainCalc.strRingBonus=0;
		DPSMainCalc.ringopacityvalue = 1;
    	
    	Stage stage =(Stage) warriorringimbued.getScene().getWindow();
    	stage.close();
    }

}
