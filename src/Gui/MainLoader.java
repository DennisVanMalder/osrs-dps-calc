package Gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URL;



import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.Glow;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainLoader extends Application{
	//css
	String bandoscss = this.getClass().getResource("bandoscss.css").toExternalForm();
	//Layout variables
	private Stage primaryStage;
	private static BorderPane mainLayout; 
	
	//Effect Variables
	public Bloom BloomOFF = new Bloom(1.0);
    public Bloom BloomON = new Bloom (0.0);
    
    public Glow GlowON = new Glow (1.0);
    public Glow GlowOFF = new Glow (0.0);
    
    //COMBAT CALC FORM VARIABLES
    //MAX HIT GEDEELTE
    //efstr
    static double effStr;
    double strLevel;
    double strPotionBonus;
    double strPrayerBonus;
    double strOtherBonus;
    double strStyleBonus;
    
    //basedamage
    static double baseDamage;
    
    static double strBonus;
    
    static double strWeaponBonus;
    static double strShieldBonus;
    static double strCapeBonus;
    static double strHelmBonus;
    static double strAmmyBonus;
    static double strBodyBonus;
    static double strLegsBonus;
    static double strBootsBonus;
    static double strGlovesBonus;
    static double strRingBonus;
    
    //maxhit
    static double maxHit;
    static double Accuracy;
    
    //ACCURACY GEDEELTE
    static double effAtk;
    double atkLevel;
    //stabBonus
    static double atkStabBonus;
    
    static double atkWeaponStabBonus;
    static double atkShieldStabBonus;
    static double atkCapeStabBonus;
    static double atkHelmStabBonus;
    static double atkAmmyStabBonus;
    static double atkBodyStabBonus;
    static double atkLegsStabBonus;
    static double atkBootsStabBonus;
    static double atkRingStabBonus;
    static double atkGlovesStabBonus;  
    
    static double atkSlashBonus;
    
    static double atkWeaponSlashBonus;
    static double atkShieldSlashBonus;
    static double atkCapeSlashBonus;
    static double atkHelmSlashBonus;
    static double atkAmmySlashBonus;
    static double atkBodySlashBonus;
    static double atkLegsSlashBonus;
    static double atkBootsSlashBonus;
    static double atkRingSlashBonus;
    static double atkGlovesSlashBonus;
    
    static double atkCrushBonus;
    
    static double atkWeaponCrushBonus;
    static double atkShieldCrushBonus;
    static double atkCapeCrushBonus;
    static double atkHelmCrushBonus;
    static double atkAmmyCrushBonus;
    static double atkBodyCrushBonus;
    static double atkLegsCrushBonus;
    static double atkBootsCrushBonus;
    static double atkRingCrushBonus;
    static double atkGlovesCrushBonus;
    
    static double magicBonus;
    
    static double magicWeaponBonus;
    static double magicShieldBonus;
    static double magicCapeBonus;
    static double atkHelmMageBonus;
    static double magicAmmyBonus;
    static double magicBodyBonus;
    static double magicLegsBonus;
    static double magicBootBonus;
    static double magicRingBonus;
    static double magicGlovesBonus;
    
    static double rangedattackBonus;
    
    static double rangedattackWeaponBonus;
    static double rangedattackShieldBonus;
    static double rangedattackCapeBonus;
    static double atkHelmRangeBonus;
    static double rangedattackAmmyBonus;
    static double rangedattackBodyBonus;
    static double rangedattackLegsBonus;
    static double rangedattackBootBonus;
    static double rangedattackRingBonus;
    static double rangedattackGlovesBonus;
    
    
    
    
    double atkPotionBonus;
    double atkPrayerBonus;
    double atkOtherBonus;
    double atkStyleBonus;
    
    //DEFENCE GEDEELTE
    double defLevel;
    double defStabBonus;
    double defSlashBonus;
    double defCrushBonus;
    double defPrayerBonus;
    double defOtherBonus;
    double defStyleBonus;
    
    //DPS variables
    static double attackSpeed;
    static double maxAtk;
    static double dps;
    static double dpt;


	static double effDefLevel;
	static double maxDef;
	static double maxDefCrush;
	static double maxDefSlash;
	static double maxDefStab;
	static double bossDefenceLevel;
	static double bossStabDefence;
	static double bossSlashDefence;
	static double bossCrushDefence;
	static double bossMagicDefence;
	static double bossRangedDefence;
	static double bossStyleBonus = 1;

	int ats;
    
    
    
	
	//URLS
	String urlString = "https://www.youtube.com/watch?v=a01QQZyl-_I";
	String urlTwitch = "http://twitch.tv";
	String urlZammyGuide = "https://www.youtube.com/watch?v=WGZgiL59OjI";
	String urlZammyWiki = "http://oldschoolrunescape.wikia.com/wiki/K%27ril_Tsutsaroth";

	//STAGES
	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage= primaryStage;
		this.primaryStage.setTitle("DPS Calc");
		showHomePage();
	}
	
	
	protected void showHomePage() throws IOException{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainLoader.class.getResource("HomePage.fxml"));
		mainLayout =loader.load();		
		Scene scene = new Scene (mainLayout);		
		primaryStage.setScene(scene);		
		FadeTransition ft = new FadeTransition(Duration.millis(2000), mainLayout);
		ft.setFromValue(0.25);
		ft.setToValue(1);
		ft.play();
		primaryStage.show();			
	}
	
	protected void returntohomepage() throws IOException {
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(MainLoader.class.getResource("HomePage.fxml"));    	
    	BorderPane page = loader.load();
    	FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
    	mainLayout.setCenter(page);
	}
	
	
	protected void showDPSPage() throws IOException{
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(MainLoader.class.getResource("DPSPage.fxml"));
    	BorderPane page = loader.load();
    	page.getStylesheets().add(MainLoader.class.getResource("overview.css").toExternalForm());
    	FadeTransition ft = new FadeTransition(Duration.millis(2000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
    	mainLayout.setCenter(page);

	}
	
	protected void showZammyPage() throws IOException{
		//zammydefence stats
		DPSMainCalc.bossDefenceLevel=270;
		DPSMainCalc.bossCrushDefence=80;
		DPSMainCalc.bossSlashDefence=80;
		DPSMainCalc.bossStabDefence=80;
		DPSMainCalc.bossMagicDefence=130;
		DPSMainCalc.bossRangedDefence=80;
		//pagesetup
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
    	BorderPane page = loader.load();
    	//stylesheet
		page.getStylesheets().add(MainLoader.class.getResource("zammycss.css").toExternalForm());
		//transition
    	FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
		//showpage
    	mainLayout.setCenter(page);
	}
	
	protected void showKreePage() throws IOException{
		/*
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(MainLoader.class.getResource("kreeDPS.fxml"));
    	BorderPane page = loader.load();
    	FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
    	mainLayout.setCenter(page);
    	*/
	}
	
	protected void showBandosPage() throws IOException{
		DPSMainCalc.bossDefenceLevel=250;
		DPSMainCalc.bossCrushDefence=90;
		DPSMainCalc.bossSlashDefence=90;
		DPSMainCalc.bossStabDefence=90;
		DPSMainCalc.bossMagicDefence=298;
		DPSMainCalc.bossRangedDefence=90;
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
    	BorderPane page = loader.load();
    	page.getStylesheets().add(bandoscss);
    	FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
    	mainLayout.setCenter(page);
	}
	
	protected void showSaraPage() throws IOException{
		DPSMainCalc.bossDefenceLevel=300;
		DPSMainCalc.bossCrushDefence=100;
		DPSMainCalc.bossSlashDefence=100;
		DPSMainCalc.bossStabDefence=100;
		DPSMainCalc.bossMagicDefence=10;
		DPSMainCalc.bossRangedDefence=100;
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
    	BorderPane page = loader.load();
		page.getStylesheets().add(MainLoader.class.getResource("saracss.css").toExternalForm());
    	FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
    	mainLayout.setCenter(page);
	}

	protected void showCalistoPage() throws IOException{
		/*
		DPSMainCalc.bossDefenceLevel=440;
		DPSMainCalc.bossCrushDefence=175;
		DPSMainCalc.bossSlashDefence=104;
		DPSMainCalc.bossStabDefence=135;
		DPSMainCalc.bossMagicDefence=900;
		DPSMainCalc.bossRangedDefence=230;
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
		BorderPane page = loader.load();
		page.getStylesheets().add(MainLoader.class.getResource("calistocss.css").toExternalForm());
		FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
		mainLayout.setCenter(page);
		*/

	}

	protected void showCerberusPage() throws IOException{
		//zammydefence stats
		DPSMainCalc.bossDefenceLevel=100;
		DPSMainCalc.bossCrushDefence=25;
		DPSMainCalc.bossSlashDefence=100;
		DPSMainCalc.bossStabDefence=50;
		DPSMainCalc.bossMagicDefence=100;
		DPSMainCalc.bossRangedDefence=100;
		//pagesetup
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
		BorderPane page = loader.load();
		//stylesheet
		page.getStylesheets().add(MainLoader.class.getResource("cerberus.css").toExternalForm());
		//transition
		FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
		//showpage
		mainLayout.setCenter(page);
	}

	protected void showChaoselePage() throws IOException{
		//defence stats
		DPSMainCalc.bossDefenceLevel=270;
		DPSMainCalc.bossCrushDefence=70;
		DPSMainCalc.bossSlashDefence=70;
		DPSMainCalc.bossStabDefence=70;
		DPSMainCalc.bossMagicDefence=70;
		DPSMainCalc.bossRangedDefence=70;
		//pagesetup
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
		BorderPane page = loader.load();
		//stylesheet
		page.getStylesheets().add(MainLoader.class.getResource("chaosele.css").toExternalForm());
		//transition
		FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
		//showpage
		mainLayout.setCenter(page);
	}

	protected void showCorpPage()throws IOException{
		/*
		//TODO
		*/
	}

	protected void showkbdPage()throws IOException{
		//defence stats
		DPSMainCalc.bossDefenceLevel=240;
		DPSMainCalc.bossCrushDefence=90;
		DPSMainCalc.bossSlashDefence=90;
		DPSMainCalc.bossStabDefence=70;
		DPSMainCalc.bossMagicDefence=80;
		DPSMainCalc.bossRangedDefence=70;
		//pagesetup
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
		BorderPane page = loader.load();
		//stylesheet
		page.getStylesheets().add(MainLoader.class.getResource("kbd.css").toExternalForm());
		//transition
		FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
		//showpage
		mainLayout.setCenter(page);
	}

	protected void showKqPage()throws IOException{
		/*
		//TODO
		*/
	}

	protected void showKrakenPage()throws IOException{
		/*
		//TODO
		*/
	}

	protected void showMolePage() throws IOException{
		//defence stats
		DPSMainCalc.bossDefenceLevel=200;
		DPSMainCalc.bossCrushDefence=100;
		DPSMainCalc.bossSlashDefence=80;
		DPSMainCalc.bossStabDefence=60;
		DPSMainCalc.bossMagicDefence=80;
		DPSMainCalc.bossRangedDefence=60;
		//pagesetup
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
		BorderPane page = loader.load();
		//stylesheet
		page.getStylesheets().add(MainLoader.class.getResource("mole.css").toExternalForm());
		//transition
		FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
		//showpage
		mainLayout.setCenter(page);
	}

	protected void showthermyPage() throws IOException{
		//defence stats
		DPSMainCalc.bossDefenceLevel=360;
		DPSMainCalc.bossCrushDefence=9;
		DPSMainCalc.bossSlashDefence=4;
		DPSMainCalc.bossStabDefence=11;
		DPSMainCalc.bossMagicDefence=800;
		DPSMainCalc.bossRangedDefence=900;
		//pagesetup
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(MainLoader.class.getResource("DPSView.fxml"));
		BorderPane page = loader.load();
		//stylesheet
		page.getStylesheets().add(MainLoader.class.getResource("thermy.css").toExternalForm());
		//transition
		FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
		//showpage
		mainLayout.setCenter(page);
	}

	protected void showVenePage()throws IOException{
		/*
		//TODO
		*/
	}

	protected void showZulrahPage()throws IOException{
		/*
		//TODO
		*/
	}

	protected void showVorkyPage()throws IOException{
		/*
		//TODO
		*/
	}


	protected void showZammyDropLoggerPage() throws IOException{
		FXMLLoader loader = new FXMLLoader();
    	loader.setLocation(MainLoader.class.getResource("zammyDropLogger.fxml"));
    	BorderPane page = loader.load();
    	FadeTransition ft = new FadeTransition(Duration.millis(1000), mainLayout);
		ft.setFromValue(0.75);
		ft.setToValue(1);
		ft.play();
    	mainLayout.setCenter(page);
	}






	
	//item slots
	
	public void openweaponslotview() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("weaponslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openshieldslotview() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("shieldslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openammyslotview() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ammyslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openbodyslotwindow() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bodyslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openlegsslotwindow() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("legsslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openbootslotwindow() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("bootslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openringslotwindow() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ringslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openglovesslotwindow() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("gloveslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void openhelmslotwindow() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("helmslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }
	
	public void opencapeslotwindow() throws IOException {
    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("capeslotwindow.fxml"));
    	Parent root1 = (Parent) fxmlLoader.load();
    	Stage stage = new Stage();
    	stage.setScene(new Scene(root1));  
    	stage.showAndWait();    	
    }















	
	
	

	
	protected void openLink(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String[] args) {
		launch(args);
	}
}
