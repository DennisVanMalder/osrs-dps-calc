package Gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class DPSPageController extends MainLoader{


    @FXML
    private Button gotodpszammy;

    @FXML
    private Button gotodpskreebutton;

    @FXML
    private Button gotobandosdpsbutton;

    @FXML
    private Button gotosaradpsbutton;

    @FXML
    private Button returntohomepagebutton;

    @FXML
    private Button kbddpsbutton;

    @FXML
    private Button callisto;

    @FXML
    private Button cerberus;

    @FXML
    private Button chaosele;

    @FXML
    private Button corp;

    @FXML
    private Button kq;

    @FXML
    private Button kraken;

    @FXML
    private Button thermy;

    @FXML
    private Button zulrah;

    @FXML
    private Button vorkath;

    @FXML
    private Button mole;

    @FXML
    private Button vene;



    @FXML
    void gotodpszammy(ActionEvent event) throws IOException {
    	showZammyPage();
    }
    
    @FXML
    void gotodpskree(ActionEvent event) throws IOException{
    	showKreePage();
    }
    
    @FXML
    void gotodpsbandos(ActionEvent event) throws IOException {
    	showBandosPage();
    }
    
    @FXML
    void gotodpssara(ActionEvent event) throws IOException {
    	showSaraPage();
    }
    @FXML
    void returntohomepage(ActionEvent event) throws IOException {
    	returntohomepage();
    }

    @FXML
    void calistodps(ActionEvent event) throws IOException {
        showCalistoPage();
    }

    @FXML
    void cerberusdps(ActionEvent event) throws IOException{
        showCerberusPage();
    }

    @FXML
    void chaoseledps(ActionEvent event) throws IOException{
        showChaoselePage();
    }

    @FXML
    void corpdps(ActionEvent event) throws IOException{
        showCorpPage();
    }

    @FXML
    void kbddps(ActionEvent event) throws IOException{
        showkbdPage();
    }

    @FXML
    void kqdps(ActionEvent event) throws IOException{
        showKqPage();
    }

    @FXML
    void krakendps(ActionEvent event) throws IOException{
        showKrakenPage();
    }

    @FXML
    void moledps(ActionEvent event) throws IOException{
        showMolePage();
    }


    @FXML
    void thermydps(ActionEvent event) throws IOException{
        showthermyPage();
    }

    @FXML
    void venedps(ActionEvent event) throws IOException{
        showVenePage();
    }

    @FXML
    void vorkathdps(ActionEvent event) throws IOException{
        showVorkyPage();
    }

    @FXML
    void zulrahdps(ActionEvent event) throws IOException{
        showZulrahPage();
    }
    

}
