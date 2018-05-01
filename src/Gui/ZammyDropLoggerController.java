package Gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class ZammyDropLoggerController extends MainLoader{
	//kc
	int zammykc = 0;
	//current drop value
	int dropvalue = 0;
	//total value
	int totalmoneymade = 0;
	
	//counter of items
		int adamantarrowpppCounter = 0;
		int runeScimCounter = 0;
		int dragondaggerpppCounter = 0;
		int steambstaffCounter = 0;
		int zamorakianSpearCounter = 0;
		int runeSwordCounter = 0;
		int sotdCounter = 0;
		int runeplatelegsCounter = 0;
		int adamantplatebodyCounter = 0;
		int supersetCounter = 0;
		int zammybrewandrestsCounter = 0;
		int coinsCounter = 0;
		int raredroptableCounter = 0;
		int deathruneCounter = 0;
		int bloodruneCounter = 0;
		int grimylantadymeCounter = 0;
		int lantadymeseedCounter = 0;
		int gsshardCounter = 0;
		int zamorakhiltCounter = 0;
		int clueCounter =0 ;
		int petCounter = 0;
		
	
	
	//value of items
	int adamantarrowppp = 17200;
	int runeScim = 15000;
	int dragondaggerppp = 17500;
	int steambstaff = 390000;
	int zamorakianSpear = 9500000;
	int runeSword = 12200;
	int sotd = 6800000;
	int runeplatelegs = 37900;
	int adamantplatebody = 9600;
	int superset = 4500;
	int zammybrewandrests = 25000;
	int coins = 19750;
	int raredroptable = 10000;
	int deathrune = 29000;
	int bloodrune = 20000;
	int grimylantadyme = 17000;
	int lantadymeseed = 5000;
	int gsshard = 158000;
	int zamorakhilt = 4200000;
	int pet = 0;
	
	private int calculateTotalMoneyMade() {
		totalmoneymade = 
				(adamantarrowpppCounter * adamantarrowppp) +
				(runeScimCounter * runeScim ) +
				(dragondaggerpppCounter*dragondaggerppp)+
				(steambstaffCounter*steambstaff)+
				(zamorakianSpearCounter*zamorakianSpear)+
				(runeSwordCounter*runeSword)+
				(sotdCounter*sotd)+
				(runeplatelegsCounter*runeplatelegs)+
				(adamantplatebodyCounter* adamantplatebody)+
				(supersetCounter* superset)+
				(zammybrewandrestsCounter * zammybrewandrests)+
				(coinsCounter * coins)+
				(raredroptableCounter * raredroptable)+
				(deathruneCounter * deathrune)+
				(bloodruneCounter * bloodrune) +
				(grimylantadymeCounter * grimylantadyme)+
				(lantadymeseedCounter* lantadymeseed)+
				(gsshardCounter * gsshard)+
				(zamorakhiltCounter * zamorakhilt)+
				(petCounter * petCounter);
		return totalmoneymade;
		
	}
	
	private void updateLabels() {
		totalmoneylabel.setText(Integer.toString(totalmoneymade));
		zammykclabel.setText(Integer.toString(zammykc));
		updateitemcountlabels();
	}
	
	private void AllButtonsInactive() {
		//Activity of buttons
    	gobacktozammydpsbutton.setEffect(BloomOFF);
    	puresetbutton.setEffect(BloomOFF);
    	zamorakhiltbutton.setEffect(BloomOFF);
    	youtubeGuideButton.setEffect(BloomOFF);
    	steambattlestaffbutton.setEffect(BloomOFF);
    	adamantPlatebodyButton.setEffect(BloomOFF);
    	runePlatelegButton.setEffect(BloomOFF);
    	grimylantadymeButton.setEffect(BloomOFF);
    	runeSwordButton.setEffect(BloomOFF);
    	deathrunebutton.setEffect(BloomOFF);
    	wikiguidebutton.setEffect(BloomOFF);
    	zamorakspearbutton.setEffect(BloomOFF);
    	coinsButton.setEffect(BloomOFF);
    	raredropbutton.setEffect(BloomOFF);
    	playlistbutton.setEffect(BloomOFF);
    	lantadymeseedsbutton.setEffect(BloomOFF);
    	twitchbutton.setEffect(BloomOFF);
    	RuneScimButton.setEffect(BloomOFF);
    	adamantArrowsButton.setEffect(BloomOFF);
    	zammybrewbutton.setEffect(BloomOFF);
    	gsshardbutton.setEffect(BloomOFF);
    	dragonDaggerButton.setEffect(BloomOFF);
    	sotdbutton.setEffect(BloomOFF);
    	BloodRuneButton.setEffect(BloomOFF);
	}
	
	private void linkButtonsInactive() {
		playlistbutton.setEffect(BloomOFF);
	    wikiguidebutton.setEffect(BloomOFF);
	    twitchbutton.setEffect(BloomOFF);
	    youtubeGuideButton.setEffect(BloomOFF);
		
	}
	
	private void updateitemcountlabels() {
		raredropcountlabel.setText(Integer.toString(raredroptableCounter));
		runeswordcountlabel.setText(Integer.toString(runeSwordCounter));
		puresetcountlabel.setText(Integer.toString(supersetCounter));
		brewsandrestscountlabel.setText(Integer.toString(zammybrewandrestsCounter));
		sotdcountlabel.setText(Integer.toString(sotdCounter));
		seedcountlabel.setText(Integer.toString(lantadymeseedCounter));
		cluecountlabel.setText(Integer.toString(clueCounter));
		ddpcountlabel.setText(Integer.toString(dragondaggerpppCounter));
		runelegcountlabel.setText(Integer.toString(runeplatelegsCounter));
		deathrunecountlabel.setText(Integer.toString(deathruneCounter));
		bloodcountlabel.setText(Integer.toString(bloodruneCounter));
		herbcountlabel.setText(Integer.toString(grimylantadymeCounter));
		steambstaffcountlabel.setText(Integer.toString(steambstaffCounter));
		arrowcountlabel.setText(Integer.toString(adamantarrowpppCounter));
		addyplatecountlabel.setText(Integer.toString(adamantplatebodyCounter));
		cashcountlabel.setText(Integer.toString(coinsCounter));
		gsshardcountlabel.setText(Integer.toString(gsshardCounter));
		runescimcountlabel.setText(Integer.toString(runeScimCounter));
		spearcountlabel.setText(Integer.toString(zamorakianSpearCounter));
		zhiltcountlabel.setText(Integer.toString(zamorakhiltCounter));	
	}
	    @FXML
	    private Label bloodcountlabel;

	    @FXML
	    private ImageView ddpimage;

	    @FXML
	    private ImageView bloodruneimage;

	    @FXML
	    private Label deathrunecountlabel;

	    @FXML
	    private Label herbcountlabel;

	    @FXML
	    private Label steambstaffcountlabel;

	    @FXML
	    private Label arrowcountlabel;

	    @FXML
	    private ImageView cashimage;

	    @FXML
	    private Label addyplatecountlabel;

	    @FXML
	    private Label cashcountlabel;

	    @FXML
	    private ImageView spearimage;

	    @FXML
	    private Label ddpcountlabel;

	    @FXML
	    private Label runelegcountlabel;

	    @FXML
	    private Label gsshardcountlabel;

	    @FXML
	    private Label runescimcountlabel;

	    @FXML
	    private Label spearcountlabel;

	    @FXML
	    private Label zhiltcountlabel;

	    @FXML
	    private ImageView clueimage;

	    @FXML
	    private Label seedcountlabel;

	    @FXML
	    private Label cluecountlabel;

	    @FXML
	    private ImageView zhiltimage;

	    @FXML
	    private Label sotdcountlabel;

	    @FXML
	    private ImageView herbimage;

	    @FXML
	    private ImageView gsshardimage;

	    @FXML
	    private ImageView deathruneimage;

	    @FXML
	    private ImageView steambstaffimage;

	    @FXML
	    private ImageView sotdimage;

	    @FXML
	    private ImageView puresetimage;

	    @FXML
	    private ImageView runescimimage;

	    @FXML
	    private Label puresetcountlabel;

	    @FXML
	    private Label brewsandrestscountlabel;

	    @FXML
	    private ImageView runeswordimage;

	    @FXML
	    private ImageView zbrewsandrestimage;

	    @FXML
	    private Label raredropcountlabel;

	    @FXML
	    private Label runeswordcountlabel;
	
	@FXML
    private ImageView arrowimage;

    @FXML
    private ImageView raredropimage;

    @FXML
    private ImageView adamantplateimage;

    @FXML
    private ImageView seedimage;

    @FXML
    private ImageView runelegsimage;

	
	@FXML
	private ImageView petimage;
	
	@FXML
    private Label zammykclabel;

	@FXML
    private Label moneylastdroplabel;
	
	@FXML
    private Label totalmoneylabel;

    @FXML
    private Button elitecluebutton;
    
    @FXML
    private Button gobacktozammydpsbutton;

    @FXML
    private Button puresetbutton;

    @FXML
    private Button zamorakhiltbutton;

    @FXML
    private Button youtubeGuideButton;

    @FXML
    private Button steambattlestaffbutton;

    @FXML
    private Button adamantPlatebodyButton;

    @FXML
    private Button runePlatelegButton;

    @FXML
    private Button grimylantadymeButton;

    @FXML
    private Button runeSwordButton;

    @FXML
    private Button deathrunebutton;

    @FXML
    private Button wikiguidebutton;

    @FXML
    private Button zamorakspearbutton;

    @FXML
    private Button coinsButton;

    @FXML
    private Button raredropbutton;

    @FXML
    private Button playlistbutton;

    @FXML
    private Button lantadymeseedsbutton;

    @FXML
    private Button zamorakpetbutton;

    @FXML
    private Button twitchbutton;

    @FXML
    private Button RuneScimButton;

    @FXML
    private Button adamantArrowsButton;

    @FXML
    private Button zammybrewbutton;

    @FXML
    private Button gsshardbutton;

    @FXML
    private Button dragonDaggerButton;

    @FXML
    private Button sotdbutton;

    @FXML
    private Button BloodRuneButton;

    @FXML
    void RuneScimButtonPushed(ActionEvent event) {
    	runeScimCounter++;
    	moneylastdroplabel.setText(Integer.toString(runeScim));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	RuneScimButton.setEffect(BloomON);
    	runescimcountlabel.setTextFill(Color.GREEN);
    	
    	
    }

    @FXML
    void dragonDaggerButtonPressed(ActionEvent event) {
    	dragondaggerpppCounter++;
    	moneylastdroplabel.setText(Integer.toString(dragondaggerppp));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	dragonDaggerButton.setEffect(BloomON);
    	ddpcountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void runeSwordButtonPressed(ActionEvent event) {
    	runeSwordCounter++;
    	moneylastdroplabel.setText(Integer.toString(runeSword));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	runeSwordButton.setEffect(BloomON);
    	runeswordcountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void runePlatelegButtonPressed(ActionEvent event) {
    	runeplatelegsCounter++;
    	moneylastdroplabel.setText(Integer.toString(runeplatelegs));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	runePlatelegButton.setEffect(BloomON);
    	runelegcountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void adamantPlatebodyButtonPressed(ActionEvent event) {
    	adamantplatebodyCounter++;
    	moneylastdroplabel.setText(Integer.toString(adamantplatebody));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	adamantPlatebodyButton.setEffect(BloomON);
    	addyplatecountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void adamantArrowsButton(ActionEvent event) {
    	adamantarrowpppCounter++;
    	moneylastdroplabel.setText(Integer.toString(adamantarrowppp));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	adamantArrowsButton.setEffect(BloomON);
    	arrowcountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void puresetbuttonpressed(ActionEvent event) {
    	supersetCounter++;
    	moneylastdroplabel.setText(Integer.toString(superset));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	puresetbutton.setEffect(BloomON);
    	puresetcountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void zammybrewbuttonpressed(ActionEvent event) {
    	zammybrewandrestsCounter++;
    	moneylastdroplabel.setText(Integer.toString(zammybrewandrests));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	zammybrewbutton.setEffect(BloomON);
    	brewsandrestscountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void deathrunebuttonpressed(ActionEvent event) {
    	deathruneCounter++;
    	moneylastdroplabel.setText(Integer.toString(deathrune));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	deathrunebutton.setEffect(BloomON);
    	deathrunecountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void BloodRuneButtonPressed(ActionEvent event) {
    	bloodruneCounter++;
    	moneylastdroplabel.setText(Integer.toString(bloodrune));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	BloodRuneButton.setEffect(BloomON);
    	bloodcountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void grimylantadymeButtonpressed(ActionEvent event) {
    	grimylantadymeCounter++;
    	moneylastdroplabel.setText(Integer.toString(grimylantadyme));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	grimylantadymeButton.setEffect(BloomON);
    	herbcountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void lantadymeseedsbuttonpressed(ActionEvent event) {
    	lantadymeseedCounter++;
    	moneylastdroplabel.setText(Integer.toString(lantadymeseed));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	lantadymeseedsbutton.setEffect(BloomON);
    	seedcountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void coinsButtonPressed(ActionEvent event) {
    	coinsCounter++;
    	moneylastdroplabel.setText(Integer.toString(coins));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	coinsButton.setEffect(BloomON);
    	cashcountlabel.setTextFill(Color.GREEN);
    }

    @FXML
    void raredropbuttonpressed(ActionEvent event) {
    	raredroptableCounter++;
    	moneylastdroplabel.setText(Integer.toString(raredroptable));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	raredropbutton.setEffect(BloomON);
    	raredropcountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void steambattlestaffbuttonpressed(ActionEvent event) {
    	steambstaffCounter++;
    	moneylastdroplabel.setText(Integer.toString(steambstaff));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	steambattlestaffbutton.setEffect(BloomON);
    	steambstaffcountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void zamorakspearbuttonpressed(ActionEvent event) {
    	zamorakianSpearCounter++;
    	moneylastdroplabel.setText(Integer.toString(zamorakianSpear));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomON);
    	AllButtonsInactive();
    	zamorakspearbutton.setEffect(BloomON);
    	spearcountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void sotdbuttonpressed(ActionEvent event) {
    	sotdCounter++;
    	moneylastdroplabel.setText(Integer.toString(sotd));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomON);
    	AllButtonsInactive();
    	sotdbutton.setEffect(BloomON);
    	sotdcountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void gsshardbuttonpressed(ActionEvent event) {
    	gsshardCounter++;
    	moneylastdroplabel.setText(Integer.toString(gsshard));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomOFF);
    	AllButtonsInactive();
    	gsshardbutton.setEffect(BloomON);
    	gsshardcountlabel.setTextFill(Color.GREEN);

    }

    @FXML
    void zamorakhiltbuttonpressed(ActionEvent event) {
    	zamorakhiltCounter++;
    	moneylastdroplabel.setText(Integer.toString(zamorakhilt));
    	zammykc++;
    	calculateTotalMoneyMade();
    	updateLabels();
    	moneylastdroplabel.setEffect(BloomON);
    	AllButtonsInactive();
    	zamorakhiltbutton.setEffect(BloomON);
    	zhiltcountlabel.setTextFill(Color.GREEN);
    	
    }
    
    @FXML
    void zamorakpetbuttonpressed(ActionEvent event) {
    	petCounter++;
    	petimage.setEffect(BloomON);
    	petimage.setOpacity(1);
    	zamorakpetbutton.setEffect(BloomON);
    	
    }
    
    
    
    @FXML
    void elitecluebuttonpressed(ActionEvent event) {
    	clueCounter++;	
    	elitecluebutton.setEffect(BloomON);
    	updateLabels();
    	cluecountlabel.setTextFill(Color.GREEN);
    	
    	
    }

    @FXML
    void youtubeGuideButtonpressed(ActionEvent event) {    	
    	openLink(urlZammyGuide);
    	linkButtonsInactive();
    	youtubeGuideButton.setEffect(BloomON);
    }

    @FXML
    void twitchbuttonpressed(ActionEvent event) {
    	openLink(urlTwitch);
    	linkButtonsInactive();
    	twitchbutton.setEffect(BloomON);
   
    }

    @FXML
    void wikiguidebuttonpressed(ActionEvent event) {
    	openLink(urlZammyWiki);
    	linkButtonsInactive();
    	wikiguidebutton.setEffect(BloomON);

    }

    @FXML
    void playlistbuttonpressed(ActionEvent event) {
    	openLink(urlString);
    	linkButtonsInactive();
    	playlistbutton.setEffect(BloomON);
    }
    
    
    @FXML
    void gotozammydps(ActionEvent event) throws IOException {
    	showZammyPage();
    }

    

}
