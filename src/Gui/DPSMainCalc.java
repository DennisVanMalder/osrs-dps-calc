package Gui;

import java.io.IOException;
import java.text.DecimalFormat;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class DPSMainCalc extends MainLoader {
	//Image weaponImage = new Image("Gui/whip.png");
	DecimalFormat decForPercentage = new DecimalFormat("##.##");
	DecimalFormat decForDPSDPT = new DecimalFormat("##.###");
	static double   weaponopacityvalue = 0;
	static double   helmopacityvalue = 0;
	static double   legsopacityvalue = 0;
	static double	ammyopacityvalue = 0;
	static double	bodyopacityvalue = 0;
	static double	ringopacityvalue = 0;
	static double	bootsopacityvalue = 0;
	static double	capeopacityvalue = 0;
	static double	shieldopacityvalue = 0;
	static double 	glovesOpacityvalue = 0;


	//enum
	int ats =0; //stab -> slash -> crush > range > mage (0-1-2-3-4)
	int defs = 0;
	//button counts
	int strpotionbuttoncount = 0;
	int atkpotionbuttoncount = 0;
	int rangedpotionbuttoncount = 0;
	int pietybuttoncount = 0;
	int rigourbuttoncount = 0;
	int augurybuttoncount = 0;
	int sts = 0;
	int sls=0;
	int cs=0;
	int rs =0;
	int ms=0;
	int dsts = 0;
	int dsls=0;
	int dcs=0;
	int drs =0;
	int dms=0;
	//boss stat variables
	static double bossDefenceLevel;
	static double bossStabDefence;
	static double bossSlashDefence;
	static double bossCrushDefence;
	static double bossMagicDefence;
	static double bossRangedDefence;

	//zamorak boss stat variables
	/*
	double bossDefenceLevel = 270;
	double bossStabDefence = 80;
	double bossSlashDefence = 80;
	double bossCrushDefence = 80;
	double bossMagicDefence = 130;
	double bossRangedDefence = 80;
	*/



	//default values eff str
	double strOtherBonus = 1;
	double strLevel = 99;
	double strPrayerBonus = 1;
	double strStyleBonus = 0;
	double strPotionBonus = 0;
	
	//Default values of basedamage
	static double strBonus = 0;
	
	//default value accuracy
	double atkPotionBonus =0;
	static double effAtk =0;
	static double maxAtk = 0;
	
	double atkLevel = 99;
	double atkOtherBonus = 1;
	double atkPrayerBonus = 1;




	@FXML
	private Label MaxHitLabel;

	@FXML
	private Label DPSLabel;

	@FXML
	private Label AccuracyLabel;

	@FXML
	private Label DPTLabel;

	@FXML
	private Button gobacktodpsButton;

	@FXML
	private Button gotozammydroploggerbutton;

	@FXML
	private Button calculatedpsbutton;

	@FXML
	private ImageView superattackimage;

	@FXML
	private ImageView superstrimageView;

	@FXML
	private ImageView rangedpotimage;

	@FXML
	private Button accurateattackstylebutton;

	@FXML
	private Button agrostylebutton;

	@FXML
	private Button controlledstylebutton;

	@FXML
	private Button defstylebutton;

	@FXML
	private ImageView accurateStyleImageView;

	@FXML
	private ImageView agroStyleImageView;

	@FXML
	private ImageView controlStyleImageView;

	@FXML
	private ImageView defStyleImageView;

	@FXML
	private ImageView pietyimageview;

	@FXML
	private ImageView rigourimageview;

	@FXML
	private ImageView auguryimageview;

	@FXML
	private Button pietybutton;

	@FXML
	private Button rigourbutton;

	@FXML
	private Button augurybutton;

	@FXML
	private TextField attackLevelTextfield;

	@FXML
	private TextField strleveltf;

	@FXML
	private Button rangepotbutton;

	@FXML
	private Button superattackbutton;

	@FXML
	private Button superstrbutton;

	@FXML
	private ImageView slashimageview;

	@FXML
	private ImageView stabimageview;

	@FXML
	private ImageView crushimageview;

	@FXML
	private ImageView rangedimageview;

	@FXML
	private ImageView mageimageview;

	@FXML
	private Button stabstylebutton;

	@FXML
	private Button slashstylebutton;

	@FXML
	private Button rangedstylebutton;

	@FXML
	private Button magestylebutton;

	@FXML
	private Button crushstylebutton;

	@FXML
	private Label atkStabBonusLabel;

	@FXML
	private Label atkSlashBonusLabel;

	@FXML
	private Label atkCrushBonusLabel;

	@FXML
	private Label atkMagicBonusLabel;

	@FXML
	private Label atkStrengthBonusLabel;

	@FXML
	private Label atkRanedBonusLabel;

	@FXML
	private Button weaponslotbutton;

	@FXML
	private Button helmslotbutton;

	@FXML
	private Button capeslotbutton;

	@FXML
	private Button ammyslotbutton;

	@FXML
	private Button bodyslotbutton;

	@FXML
	private Button legslotbutton;

	@FXML
	private Button gloveslotbutton;

	@FXML
	private Button bootslotbutton;

	@FXML
	private Button ringslotbutton;

	@FXML
	private Button shieldslotbutton;

	@FXML
	private ImageView checkmarkimageweapon;

	@FXML
	private ImageView checkmarkimagehelm;

	@FXML
	private ImageView checkmarkimageammy;

	@FXML
	private ImageView checkmarkimagebody;

	@FXML
	private ImageView checkmarkimagelegs;

	@FXML
	private ImageView checkmarkimageboots;

	@FXML
	private ImageView checkmarkimagegloves;

	@FXML
	private ImageView checkmarkimagering;

	@FXML
	private ImageView checkmarkimageshield;

	@FXML
	private ImageView checkmarkimagecape;

    @FXML
    public void openweaponslot() throws IOException {
    	openweaponslotview();
    }

    @FXML
    void openhelmslot(ActionEvent event) throws IOException {
    	openhelmslotwindow();
    }

    @FXML
    void opencapeslot(ActionEvent event) throws IOException {
    	opencapeslotwindow();

    }

    @FXML
    void openammyslot(ActionEvent event) throws IOException {
    	openammyslotview();
    }

    @FXML
    void openbodyslot(ActionEvent event) throws IOException{
    	openbodyslotwindow();
    }

    @FXML
    void legsslot(ActionEvent event) throws IOException{
    	openlegsslotwindow();
    }

    @FXML
    void openglovesslot(ActionEvent event) throws IOException{
    	openglovesslotwindow();
    }

    @FXML
    void bootslot(ActionEvent event) throws IOException{
    	openbootslotwindow();
    }

    @FXML
    void ringslot(ActionEvent event) throws IOException{
    	openringslotwindow();
    }

    @FXML
    void openshieldslot(ActionEvent event) throws IOException{
    	openshieldslotview();
    }
	    
	public void resetattackstyleLabelsandimages() {
		agroStyleImageView.setOpacity(0);
		accurateStyleImageView.setOpacity(0);
		controlStyleImageView.setOpacity(0);
		defStyleImageView.setOpacity(0);		
	}
	
	public void resetprayerbonusLabelandimages() {
		auguryimageview.setOpacity(0);	
		rigourimageview.setOpacity(0);	
		pietyimageview.setOpacity(0);	
	}

	public void resetdefaultvaluesprayerbonus() {
		strPrayerBonus =1;
		atkPrayerBonus =1;
	}
	
	public void resetdefaultvalueStyleBonus() {
		strStyleBonus =0;
		atkStyleBonus= 0;
	}

	public void resetpotionviews() {
		superstrimageView.setOpacity(0.3);	
		rangedpotimage.setOpacity(0.3);	
		superattackimage.setOpacity(0.3);	
	}
	
	@FXML
    void gobacktodpspage(ActionEvent event) throws IOException {
		showDPSPage();
    }

	@FXML
    void gotozammydroplogger(ActionEvent event) throws IOException {
		showZammyDropLoggerPage();
    }
    
    @FXML
    void setstylebonustoaccurate(ActionEvent event) {    	
    	resetattackstyleLabelsandimages();
    	accurateStyleImageView.setOpacity(1);
    	resetdefaultvalueStyleBonus();
    	atkStyleBonus = 3;
    	strStyleBonus = 0;
    	
    	updatingdps();
    	

    }

    @FXML
    void setstylebonustoagro(ActionEvent event) {    	
    	resetattackstyleLabelsandimages();
    	agroStyleImageView.setOpacity(1);
    	resetdefaultvalueStyleBonus();
    	strStyleBonus = 3;
    	atkStyleBonus = 0;
    	updatingdps();

    }

    @FXML
    void setstylebonustocontrol(ActionEvent event) {
    	resetattackstyleLabelsandimages();
    	controlStyleImageView.setOpacity(1);
    	resetdefaultvalueStyleBonus();
    	strStyleBonus = 1;
    	atkStyleBonus = 1;
    	
    	updatingdps();

    }

    @FXML
    void setstylebonustodefensive(ActionEvent event) {
    	resetattackstyleLabelsandimages();
    	defStyleImageView.setOpacity(1);
    	resetdefaultvalueStyleBonus();
    	strStyleBonus = 0;
    	atkStyleBonus = 0;
    	updatingdps();
    }

    @FXML
    void pietyprayerbonus(ActionEvent event) {
    	pietybuttoncount++;
    	rigourbuttoncount=0;
    	augurybuttoncount =0;    	
    	if (pietybuttoncount % 2  > 0) {
    		//count++    		
    		//images
    		pietyimageview.setOpacity(1);
    		rigourimageview.setOpacity(0.0);
    		auguryimageview.setOpacity(0.0);    		
    		//vars
    		strPrayerBonus = 1.23;
    		atkPrayerBonus = 1.20;
    		getTextfieldvalues();
        	updatingdps();
    	} else {
    		pietyimageview.setOpacity(0.0);
    		getTextfieldvalues();
    		strPrayerBonus = 1.0;
    		atkPrayerBonus = 1.0;
        	updatingdps();
    	}
    }

    @FXML
    void rigourprayerbonus(ActionEvent event) {
    	rigourbuttoncount++;
    	pietybuttoncount =0;
    	augurybuttoncount =0;    	
    	if (rigourbuttoncount % 2  > 0) {
    		//count++
    		
    		//images
    		rigourimageview.setOpacity(1);
    		auguryimageview.setOpacity(0.0);
    		pietyimageview.setOpacity(0.0);
    		//variables
    		strPrayerBonus = 1.0;
    		
    		getTextfieldvalues();
        	updatingdps();
    	} else {
    		rigourimageview.setOpacity(0.0);
    		getTextfieldvalues();
        	updatingdps();
    	}
    }

    @FXML
    void auguryprayerbonus(ActionEvent event) {    	
    	augurybuttoncount++;
    	rigourbuttoncount=0;
    	pietybuttoncount=0;
    	
    	if (augurybuttoncount % 2  > 0) {
    		//count++
    		
    		//images
    		pietyimageview.setOpacity(0.0);
        	rigourimageview.setOpacity(0.0);
    		auguryimageview.setOpacity(1.0);
    		
    		//Vars
    		getTextfieldvalues();
        	updatingdps();
    	} else {
    		auguryimageview.setOpacity(0.0);
    		getTextfieldvalues();
        	updatingdps();
    	}
    }
 
    @FXML
    void rangepot(ActionEvent event) {
    	rangedpotionbuttoncount++;
    	if (rangedpotionbuttoncount % 2  > 0) {
    		rangedpotimage.setOpacity(1);
    		getTextfieldvalues();
        	updatingdps();
    	} else {
    		rangedpotimage.setOpacity(0.3);
    		getTextfieldvalues();
        	updatingdps();
    	}
    }

    @FXML
    void superattack(ActionEvent event) {
    	atkpotionbuttoncount++;
    	if (atkpotionbuttoncount % 2  > 0) {
    		superattackimage.setOpacity(1);
    		getTextfieldvalues();
        	atkPotionBonus=(5+(0.15*atkLevel));
        	atkPotionBonus = Math.floor(atkPotionBonus * 1)/1;
        	updatingdps();
    	} else {
    		superattackimage.setOpacity(0.3);
    		atkPotionBonus=0;
    		getTextfieldvalues();
        	updatingdps();
    	}
    }

    @FXML
    void superstr(ActionEvent event) {
    	strpotionbuttoncount++;
    	if (strpotionbuttoncount % 2  > 0) {
    		superstrimageView.setOpacity(1);
    		getTextfieldvalues();
        	strPotionBonus=(5+(0.15*strLevel));
        	strPotionBonus = Math.floor(strPotionBonus * 1)/1;
        	updatingdps();
    	} else {
    		superstrimageView.setOpacity(0.3);
    		getTextfieldvalues();
    		strPotionBonus=0;
        	updatingdps();
    	}

    }
 
    @FXML
    void stabstyle(ActionEvent event) {
    	sts++;
    	sls=0;
    	cs=0;
    	rs =0;
    	ms=0;
    	if (sts % 2  > 0) {
    		stabimageview.setOpacity(1);
    		slashimageview.setOpacity(0.5);
    		rangedimageview.setOpacity(0.5);
    		crushimageview.setOpacity(0.5);
    		mageimageview.setOpacity(0.5);
    		ats=0;		
    	} else {
    		stabimageview.setOpacity(0.5);
    	}
    	

    }

    @FXML
    void slashstyle(ActionEvent event) {
    	sts = 0;
    	sls++;
    	cs=0;
    	rs =0;
    	ms=0;
    	if (sls % 2  > 0) {
    		slashimageview.setOpacity(1); 
    		stabimageview.setOpacity(0.5);
    		rangedimageview.setOpacity(0.5);
    		crushimageview.setOpacity(0.5);
    		mageimageview.setOpacity(0.5);
    		ats=1;	
    	} else {
    		slashimageview.setOpacity(0.5);
    	}
    }

    @FXML
    void rangedstyle(ActionEvent event) {
    	sts = 0;
    	sls=0;
    	cs=0;
    	rs++;
    	ms=0;
    	if (rs % 2  > 0) {
    		rangedimageview.setOpacity(1); 
    		stabimageview.setOpacity(0.5);
    		slashimageview.setOpacity(0.5);
    		crushimageview.setOpacity(0.5);
    		mageimageview.setOpacity(0.5);
    		ats=3;
    	} else {
    		rangedimageview.setOpacity(0.5);
    	}
    }

    @FXML
    void magestyle(ActionEvent event) {
    	sts = 0;
    	sls=0;
    	cs=0;
    	rs =0;
    	ms++;
    	if (ms % 2  > 0) {
    		mageimageview.setOpacity(1); 
    		stabimageview.setOpacity(0.5);
    		slashimageview.setOpacity(0.5);
    		rangedimageview.setOpacity(0.5);
    		crushimageview.setOpacity(0.5);
    		ats=4;
    	} else {
    		mageimageview.setOpacity(0.5);		
    	}
    }

    @FXML
    void crushstyle(ActionEvent event) {
    	sts = 0;
    	sls=0;
    	cs++;
    	rs =0;
    	ms=0;
    	if (cs % 2  > 0) {
    		crushimageview.setOpacity(1); 
    		stabimageview.setOpacity(0.5);
    		slashimageview.setOpacity(0.5);
    		rangedimageview.setOpacity(0.5);
    		mageimageview.setOpacity(0.5);
    		ats=2;
    	} else {
    		crushimageview.setOpacity(0.5);
    		
    	}
    }

	//calcs

	public static double calculateEffectiveStrength(double StrengthLevel, double potionBonus, double prayerBonus, double otherBonus, double styleBonus) {
		effStr = ((StrengthLevel+potionBonus) * prayerBonus * otherBonus) + styleBonus;
		//System.out.println(effectiveStrength);
		effStr = Math.floor(effStr*1)/1;
		return effStr;
	}

	public static double calculateBaseDamage(double effectiveStrength,double strengthBonus) {
		baseDamage= 1.3 +((effectiveStrength/10) + (strengthBonus / 80)) + ((effectiveStrength*strengthBonus)/640);
		return baseDamage;
	}

	public static double calculateMaxHit(double baseDamage) {
		maxHit = Math.floor(baseDamage*1)/1;
		return maxHit;
	}

	public static double calculateEffectiveAttackLevel(double attackLevel, double aPotionBonus,double atkPrayerBonus,double atkOtherBonus,double atkStyleBonus) {
		effAtk = ((attackLevel + aPotionBonus)* atkPrayerBonus);
		effAtk = Math.floor(effAtk *1)/1;
		effAtk = effAtk * atkOtherBonus + 8 + atkStyleBonus;
    	/*
    	 * wrong !
    	effAtk = ((attackLevel + aPotionBonus ) * atkPrayerBonus * atkOtherBonus + 8  + atkStyleBonus);
		//System.out.println(effectiveAttackLevel);
		effAtk =  Math.floor(effAtk*1)/1;
		*
		*/

		return effAtk;
	}

	public static double calculateMaxAttackStabRol(double effAtk, double atkStabBonus) {

		maxAtk = (effAtk * (atkStabBonus+64));
		return maxAtk;
	}

	public static double calculateMaxAttackSlashRol(double effAtk, double atkSlashBonus) {

		maxAtk = (effAtk * (atkSlashBonus+64));
		return maxAtk;

	}

	public static double calculateMaxAttackCrushRol(double effAtk, double atkCrushBonus) {

		maxAtk = (effAtk * (atkCrushBonus+64));
		return maxAtk;
	}

	public static double calculateEffectiveDefenceLevel(double bossDefenceLevel,double bossStyleBonus) {
		effDefLevel = (bossDefenceLevel + bossStyleBonus + 8 );
		effDefLevel = Math.floor(effDefLevel*1)/1;

		return effDefLevel;
	}

	public static double  calculateMaxDefenceStabRol(double effDefLevel, double bossStabDefence) {
		return maxDef = (effDefLevel *(bossStabDefence + 64));

	}

	public static double  calculateMaxDefenceSlashRol(double effDefLevel,double bossSlashDefence) {
		return maxDef = (effDefLevel *(bossSlashDefence + 64));

	}

	public static double  calculateMaxDefenceCrushRol(double effDefLevel, double bossCrushDefence) {
		return maxDef = (effDefLevel *(bossCrushDefence + 64));
	}

	public static double calculateAccuracy(int ats,double maxAtk ,double maxDef ) {
		if (maxAtk > maxDef) {
			Accuracy = 1- (maxDef + 2 ) / (2*(maxAtk + 1));
			Accuracy = Accuracy *100;
			return Accuracy;
		} else {
			Accuracy = maxAtk / (2*(maxDef + 1));
			Accuracy = Accuracy *100;
			return Accuracy;
		}
	}

	public static double calculateDPS(double Accuracy, double maxHit, double attackSpeed) {
		return dps = (Accuracy/100) * (maxHit/2) * (1/attackSpeed);
	}

	public static double calculateDPT(double Accuracy, double maxHit, double attackSpeed) {
		return dpt = (Accuracy/100) * (maxHit/2) * (0.6/attackSpeed);
	}

	public  void calcdps(){


		calculateEffectiveStrength(strLevel,strPotionBonus,strPrayerBonus , strOtherBonus, strStyleBonus);
		calculateBaseDamage(effStr,strBonus);
		calculateMaxHit(baseDamage);

		calculateEffectiveAttackLevel(atkLevel, atkPotionBonus, atkPrayerBonus, atkOtherBonus, atkStyleBonus);
		calculateEffectiveDefenceLevel(bossDefenceLevel, bossStyleBonus);

		if (ats == 0) {
			calculateMaxAttackStabRol(effAtk,atkStabBonus );
			calculateMaxDefenceStabRol(effDefLevel,bossStabDefence);
		}
		if (ats == 1) {
			calculateMaxAttackSlashRol(effAtk, atkSlashBonus);
			calculateMaxDefenceSlashRol(effDefLevel, bossSlashDefence);
		}
		if (ats == 2) {
			calculateMaxAttackCrushRol(effAtk, atkSlashBonus);
			calculateMaxDefenceCrushRol(effDefLevel, bossCrushDefence);
		}

		calculateAccuracy(ats,maxAtk,maxDef);
		calculateDPS(Accuracy,maxHit,attackSpeed);
		calculateDPT(Accuracy,maxHit,attackSpeed);


	}

	public void getTextfieldvalues() {
    	strLevel = Integer.valueOf(strleveltf.getText());
		atkLevel = Integer.valueOf(attackLevelTextfield.getText());
    }

    public void updateAttackBonusLabels() {
    	atkStrengthBonusLabel.setText(Double.toString(strBonus));
    	atkSlashBonusLabel.setText(Double.toString(atkSlashBonus));
    	atkStabBonusLabel.setText(Double.toString(atkStabBonus));
    	atkCrushBonusLabel.setText(Double.toString(atkCrushBonus));
    	atkMagicBonusLabel.setText(Double.toString(magicBonus));
    	atkRanedBonusLabel.setText(Double.toString(rangedattackBonus));
		MaxHitLabel.setText(Double.toString(maxHit));
    }
    
    public void calcBonusTotals() {
    	strBonus = (strWeaponBonus+ strShieldBonus+ strCapeBonus+strHelmBonus+ strAmmyBonus+strBodyBonus+ strLegsBonus+strBootsBonus+strGlovesBonus+strRingBonus);
    	atkSlashBonus = (atkWeaponSlashBonus+atkShieldSlashBonus+atkCapeSlashBonus+atkHelmSlashBonus+atkAmmySlashBonus+atkBodySlashBonus+atkLegsSlashBonus+atkBootsSlashBonus+atkRingSlashBonus+atkGlovesSlashBonus);
    	atkStabBonus = (atkWeaponStabBonus+ atkShieldStabBonus+ atkCapeStabBonus+ atkHelmStabBonus+ atkAmmyStabBonus+ atkBodyStabBonus+ atkLegsStabBonus+ atkBootsStabBonus+ atkRingStabBonus+ atkGlovesStabBonus);
    	atkCrushBonus =(atkWeaponCrushBonus+atkShieldCrushBonus+atkCapeCrushBonus+atkHelmCrushBonus+atkAmmyCrushBonus+atkBodyCrushBonus+atkLegsCrushBonus+atkBootsCrushBonus+atkRingCrushBonus+atkGlovesCrushBonus);
    	magicBonus = (magicWeaponBonus+magicShieldBonus+magicCapeBonus+atkHelmMageBonus+magicAmmyBonus+magicBodyBonus+magicLegsBonus+magicBootBonus+magicRingBonus+magicGlovesBonus);
    	rangedattackBonus = (rangedattackWeaponBonus+rangedattackShieldBonus+rangedattackCapeBonus+atkHelmRangeBonus+rangedattackAmmyBonus+rangedattackBodyBonus+rangedattackLegsBonus+rangedattackBootBonus+rangedattackRingBonus+rangedattackGlovesBonus);
    	updateAttackBonusLabels();
    }
    
	public void updatedpsLabels(){
		MaxHitLabel.setText(Double.toString(maxHit));
		AccuracyLabel.setText(String.valueOf(decForPercentage.format(Accuracy)+"%"));
		DPSLabel.setText(String.valueOf(decForDPSDPT.format(dps)));
		DPTLabel.setText(String.valueOf(decForDPSDPT.format(dpt)));
	}

    public void  updateOpacityGear(){
		checkmarkimageweapon.setOpacity(weaponopacityvalue);
		checkmarkimageshield.setOpacity(shieldopacityvalue);
		checkmarkimagering.setOpacity(ringopacityvalue);
		checkmarkimagebody.setOpacity(bodyopacityvalue);
		checkmarkimagelegs.setOpacity(legsopacityvalue);
		checkmarkimagecape.setOpacity(capeopacityvalue);
		checkmarkimagehelm.setOpacity(helmopacityvalue);
		checkmarkimageboots.setOpacity(bootsopacityvalue);
		checkmarkimagegloves.setOpacity(glovesOpacityvalue);
		checkmarkimageammy.setOpacity(ammyopacityvalue);
	}

    @FXML
    void calculatedps(ActionEvent event) {
		updateOpacityGear();
		calcBonusTotals();
		getTextfieldvalues();
		calcdps();
		updatedpsLabels();

}

   public void updatingdps() {
	   updateOpacityGear();
	   calcBonusTotals();
	   getTextfieldvalues();
	   calcdps();
	   updatedpsLabels();
   }


	
	

}
