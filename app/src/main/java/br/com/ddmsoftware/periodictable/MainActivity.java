package br.com.ddmsoftware.periodictable;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "br.com.ddmsoftware.periodictable.MESSAGE";

    private String message ="";

    private TextView tvNroAtomico;
    private TextView tvSimbolo;
    private TextView tvNome;
    private TextView tvMassa;
    private GridLayout gridResult;
    private periodicTable pt;
    private ImageView imgFirstbootTuto;

    private TextView tvHydrogenium;
    private TextView tvHelium;
    private TextView tvLithium;
    private TextView tvBeryllium;
    private TextView tvBorium;
    private TextView tvCarbonium;
    private TextView tvNitrogenium;
    private TextView tvOxygenium;
    private TextView tvFluorum;
    private TextView tvNeon;
    private TextView tvNatrium;
    private TextView tvMagnesium;
    private TextView tvAlumen;
    private TextView tvSilicium;
    private TextView tvPhosphorus;
    private TextView tvSulphur;
    private TextView tvClorum;
    private TextView tvArgon;
    private TextView tvKalium;
    private TextView tvCalcium;
    private TextView tvScandium;
    private TextView tvTitanium;
    private TextView tvVanadium;
    private TextView tvChromium;
    private TextView tvManganum;
    private TextView tvFerrum;
    private TextView tvCobaltum;
    private TextView tvNiccolum;
    private TextView tvCuprum;
    private TextView tvZincum;
    private TextView tvGalium;
    private TextView tvGermanium;
    private TextView tvArsenicum;
    private TextView tvSelenium;
    private TextView tvBromum;
    private TextView tvKrypton;
    private TextView tvRubidium;
    private TextView tvStrontium;
    private TextView tvYttrium;
    private TextView tvZirconium;
    private TextView tvNiobium;
    private TextView tvMolybdenum;
    private TextView tvTechnetium;
    private TextView tvRuthenium;
    private TextView tvRhodium;
    private TextView tvPalladium;
    private TextView tvArgentum;
    private TextView tvCadmium;
    private TextView tvIndium;
    private TextView tvStannum;
    private TextView tvStibium;
    private TextView tvTellurium;
    private TextView tvIodum;
    private TextView tvXenon;
    private TextView tvCaesium;
    private TextView tvBarium;
    private TextView tvLanthanum;
    private TextView tvCerium;
    private TextView tvPraseodymium;
    private TextView tvNeodymium;
    private TextView tvPromethium;
    private TextView tvSamarium;
    private TextView tvEuropium;
    private TextView tvGadolinium;
    private TextView tvTerbium;
    private TextView tvDysprosium;
    private TextView tvHolmium;
    private TextView tvErbium;
    private TextView tvThulium;
    private TextView tvYtterbium;
    private TextView tvLutetium;
    private TextView tvHafnium;
    private TextView tvTantalum;
    private TextView tvWolframium;
    private TextView tvRhenium;
    private TextView tvOsmium;
    private TextView tvIridium;
    private TextView tvPlatinum;
    private TextView tvAurum;
    private TextView tvHydrargyrum;
    private TextView tvThallium;
    private TextView tvPlumbum;
    private TextView tvBismuthum;
    private TextView tvPolonium;
    private TextView tvAstatum;
    private TextView tvRadon;
    private TextView tvFrancium;
    private TextView tvRadium;
    private TextView tvActinium;
    private TextView tvThorium;
    private TextView tvProtactinium;
    private TextView tvUranium;
    private TextView tvNeptunium;
    private TextView tvPlutonium;
    private TextView tvAmericium;
    private TextView tvCurium;
    private TextView tvBerkelium;
    private TextView tvCalifornium;
    private TextView tvEinsteinium;
    private TextView tvFermium;
    private TextView tvMendelevium;
    private TextView tvNobelium;
    private TextView tvLawrencium;
    private TextView tvRhuterfordium;
    private TextView tvDubnium;
    private TextView tvSeaborgium;
    private TextView tvBohrium;
    private TextView tvHassium;
    private TextView tvMeitnerium;
    private TextView tvDarmstadtium;
    private TextView tvRoentgenium;
    private TextView tvCopernicium;
    private TextView tvUnuntrium;
    private TextView tvFlerovium;
    private TextView tvUnunpentium;
    private TextView tvLivermorium;
    private TextView tvUnunsentium;
    private TextView tvUnunoctium;
    //WebView wv;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    // To validate Application First Run
    private SharedPreferences prefs = null;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Hiding Title Bar and Setting FullScreen Mode
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        // Create a AdView
        // Load Advertisement Banner
        AdView mAdView = (AdView) findViewById(R.id.adViewMain);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        // Perhaps set content view here
        // To validate Application First Run (First boot)
        prefs = getSharedPreferences("br.com.ddmsoftware.periodictable", MODE_PRIVATE);
        //prefs.edit().putBoolean("firstRun", true).commit();

        // Code to Change Wallpaper dinamically, according to the environment Language
        // DDM code
        String lang = Locale.getDefault().getDisplayLanguage();

        gridResult = (GridLayout) findViewById(R.id.gridResult);

        tvNroAtomico = (TextView) findViewById(R.id.tvNroAtomico);
        tvSimbolo = (TextView) findViewById(R.id.tvSimbolo);

        tvNome = (TextView) findViewById(R.id.tvNome);
        tvMassa = (TextView) findViewById(R.id.tvMassa);

        imgFirstbootTuto = (ImageView) findViewById( R.id.imgTutorial );

        imgFirstbootTuto.setVisibility( View.INVISIBLE );
        pt = new periodicTable();

        //clearElementsTable();

        //wv.setVisibility(View.INVISIBLE);

        tvSimbolo.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                onElementsClick();
            }
        });
        tvNroAtomico.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                onElementsClick();
            }
        });
        tvMassa.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                onElementsClick();
            }
        });
        tvNome.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                onElementsClick();
            }
        });
        gridResult.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                onElementsClick();
            }
        });

        tvHydrogenium= (TextView) findViewById(R.id.tvHydrogenium);
        tvHelium= (TextView) findViewById(R.id.tvHelium);
        tvLithium= (TextView) findViewById(R.id.tvLithium);
        tvBeryllium= (TextView) findViewById(R.id.tvBeryllium);
        tvBorium= (TextView) findViewById(R.id.tvBoron);
        tvCarbonium= (TextView) findViewById(R.id.tvCarbon);
        tvNitrogenium= (TextView) findViewById(R.id.tvNitrogen);
        tvOxygenium= (TextView) findViewById(R.id.tvOxygen);
        tvFluorum= (TextView) findViewById(R.id.tvFluorine);
        tvNeon= (TextView) findViewById(R.id.tvNeon);
        tvNatrium= (TextView) findViewById(R.id.tvSodium);
        tvMagnesium= (TextView) findViewById(R.id.tvMagnesium);
        tvAlumen= (TextView) findViewById(R.id.tvAluminium);
        tvSilicium= (TextView) findViewById(R.id.tvSilicon);
        tvPhosphorus= (TextView) findViewById(R.id.tvPhosphorus);
        tvSulphur= (TextView) findViewById(R.id.tvSulfur);
        tvClorum= (TextView) findViewById(R.id.tvChlorine);
        tvArgon= (TextView) findViewById(R.id.tvArgon);
        tvKalium= (TextView) findViewById(R.id.tvPotassium);
        tvCalcium= (TextView) findViewById(R.id.tvCalcium);
        tvScandium= (TextView) findViewById(R.id.tvScandium);
        tvTitanium= (TextView) findViewById(R.id.tvTitanium);
        tvVanadium= (TextView) findViewById(R.id.tvVanadium);
        tvChromium= (TextView) findViewById(R.id.tvChromium);
        tvManganum= (TextView) findViewById(R.id.tvManganese);
        tvFerrum= (TextView) findViewById(R.id.tvIron);
        tvCobaltum= (TextView) findViewById(R.id.tvCobalt);
        tvNiccolum= (TextView) findViewById(R.id.tvNickel);
        tvCuprum= (TextView) findViewById(R.id.tvCopper);
        tvZincum= (TextView) findViewById(R.id.tvZinc);
        tvGalium= (TextView) findViewById(R.id.tvGallium);
        tvGermanium= (TextView) findViewById(R.id.tvGermanium);
        tvArsenicum= (TextView) findViewById(R.id.tvArsenic);
        tvSelenium= (TextView) findViewById(R.id.tvSelenium);
        tvBromum= (TextView) findViewById(R.id.tvBromine);
        tvKrypton= (TextView) findViewById(R.id.tvKrypton);
        tvRubidium= (TextView) findViewById(R.id.tvRubidium);
        tvStrontium= (TextView) findViewById(R.id.tvStrontium);
        tvYttrium= (TextView) findViewById(R.id.tvYttrium);
        tvZirconium= (TextView) findViewById(R.id.tvZirconium);
        tvNiobium= (TextView) findViewById(R.id.tvNiobium);
        tvMolybdenum= (TextView) findViewById(R.id.tvMolybdenum);
        tvTechnetium= (TextView) findViewById(R.id.tvTechnetium);
        tvRuthenium= (TextView) findViewById(R.id.tvRuthenium);
        tvRhodium= (TextView) findViewById(R.id.tvRhodium);
        tvPalladium= (TextView) findViewById(R.id.tvPalladium);
        tvArgentum= (TextView) findViewById(R.id.tvSilver);
        tvCadmium= (TextView) findViewById(R.id.tvCadmium);
        tvIndium= (TextView) findViewById(R.id.tvIndium);
        tvStannum= (TextView) findViewById(R.id.tvTin);
        tvStibium= (TextView) findViewById(R.id.tvAntimony);
        tvTellurium= (TextView) findViewById(R.id.tvTellurium);
        tvIodum= (TextView) findViewById(R.id.tvIodine);
        tvXenon= (TextView) findViewById(R.id.tvXenon);
        tvCaesium= (TextView) findViewById(R.id.tvCaesium);
        tvBarium= (TextView) findViewById(R.id.tvBarium);
        tvLanthanum= (TextView) findViewById(R.id.tvLanthanum);
        tvCerium= (TextView) findViewById(R.id.tvCerium);
        tvPraseodymium= (TextView) findViewById(R.id.tvPraseodymium);
        tvNeodymium= (TextView) findViewById(R.id.tvNeodymium);
        tvPromethium= (TextView) findViewById(R.id.tvPromethium);
        tvSamarium= (TextView) findViewById(R.id.tvSamarium);
        tvEuropium= (TextView) findViewById(R.id.tvEuropium);
        tvGadolinium= (TextView) findViewById(R.id.tvGadolinium);
        tvTerbium= (TextView) findViewById(R.id.tvTerbium);
        tvDysprosium= (TextView) findViewById(R.id.tvDysprosium);
        tvHolmium= (TextView) findViewById(R.id.tvHolmium);
        tvErbium= (TextView) findViewById(R.id.tvErbium);
        tvThulium= (TextView) findViewById(R.id.tvThulium);
        tvYtterbium= (TextView) findViewById(R.id.tvYtterbium);
        tvLutetium= (TextView) findViewById(R.id.tvLutetium);
        tvHafnium= (TextView) findViewById(R.id.tvHafnium);
        tvTantalum= (TextView) findViewById(R.id.tvTantalum);
        tvWolframium= (TextView) findViewById(R.id.tvTungsten);
        tvRhenium= (TextView) findViewById(R.id.tvRhenium);
        tvOsmium= (TextView) findViewById(R.id.tvOsmium);
        tvIridium= (TextView) findViewById(R.id.tvIridium);
        tvPlatinum= (TextView) findViewById(R.id.tvPlatinum);
        tvAurum= (TextView) findViewById(R.id.tvGold);
        tvHydrargyrum= (TextView) findViewById(R.id.tvMercury);
        tvThallium= (TextView) findViewById(R.id.tvThallium);
        tvPlumbum= (TextView) findViewById(R.id.tvLead);
        tvBismuthum= (TextView) findViewById(R.id.tvBismuth);
        tvPolonium= (TextView) findViewById(R.id.tvPolonium);
        tvAstatum= (TextView) findViewById(R.id.tvAstatine);
        tvRadon= (TextView) findViewById(R.id.tvRadon);
        tvFrancium= (TextView) findViewById(R.id.tvFrancium);
        tvRadium= (TextView) findViewById(R.id.tvRadium);
        tvActinium= (TextView) findViewById(R.id.tvActinium);
        tvThorium= (TextView) findViewById(R.id.tvThorium);
        tvProtactinium= (TextView) findViewById(R.id.tvProtactinium);
        tvUranium= (TextView) findViewById(R.id.tvUranium);
        tvNeptunium= (TextView) findViewById(R.id.tvNeptunium);
        tvPlutonium= (TextView) findViewById(R.id.tvPlutonium);
        tvAmericium= (TextView) findViewById(R.id.tvAmericium);
        tvCurium= (TextView) findViewById(R.id.tvCurium);
        tvBerkelium= (TextView) findViewById(R.id.tvBerkelium);
        tvCalifornium= (TextView) findViewById(R.id.tvCalifornium);
        tvEinsteinium= (TextView) findViewById(R.id.tvEinsteinium);
        tvFermium= (TextView) findViewById(R.id.tvFermium);
        tvMendelevium= (TextView) findViewById(R.id.tvMendelevium);
        tvNobelium= (TextView) findViewById(R.id.tvNobelium);
        tvLawrencium= (TextView) findViewById(R.id.tvLawrencium);
        tvRhuterfordium= (TextView) findViewById(R.id.tvRutherfordium);
        tvDubnium= (TextView) findViewById(R.id.tvDubnium);
        tvSeaborgium= (TextView) findViewById(R.id.tvSeaborgium);
        tvBohrium= (TextView) findViewById(R.id.tvBohrium);
        tvHassium= (TextView) findViewById(R.id.tvHassium);
        tvMeitnerium= (TextView) findViewById(R.id.tvMeitnerium);
        tvDarmstadtium= (TextView) findViewById(R.id.tvDarmstadtium);
        tvRoentgenium= (TextView) findViewById(R.id.tvRoentgenium);
        tvCopernicium= (TextView) findViewById(R.id.tvCopernicium);
        tvUnuntrium= (TextView) findViewById(R.id.tvUnuntrium);
        tvFlerovium= (TextView) findViewById(R.id.tvFlerovium);
        tvUnunpentium= (TextView) findViewById(R.id.tvUnunpentium);
        tvLivermorium= (TextView) findViewById(R.id.tvLivermorium);
        tvUnunsentium= (TextView) findViewById(R.id.tvUnunseptium);
        tvUnunoctium= (TextView) findViewById(R.id.tvUnunoctium);


        tvHydrogenium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Hydrogenium, tvHydrogenium);
            }
        });

        tvHelium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Helium, tvHelium);
            }
        });
        tvLithium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Lithium, tvLithium);
            }
        });
        tvBeryllium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Beryllium, tvBeryllium);
            }
        });
        tvBorium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Borium, tvBorium);
            }
        });
        tvCarbonium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Carbonium, tvCarbonium);
            }
        });
        tvNitrogenium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Nitrogenium, tvNitrogenium);
            }
        });
        tvOxygenium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Oxygenium, tvOxygenium);
            }
        });
        tvFluorum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Fluorum, tvFluorum);
            }
        });
        tvNeon.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Neon, tvNeon);
            }
        });
        tvNatrium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Natrium, tvNatrium);
            }
        });
        tvMagnesium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Magnesium, tvMagnesium);
            }
        });
        tvAlumen.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Alumen, tvAlumen);
            }
        });
        tvSilicium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Silicium, tvSilicium);
            }
        });
        tvPhosphorus.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Phosphorus, tvPhosphorus);
            }
        });
        tvSulphur.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Sulphur, tvSulphur);
            }
        });
        tvClorum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Clorum, tvClorum);
            }
        });
        tvArgon.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Argon, tvArgon);
            }
        });
        tvKalium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Kalium, tvKalium);
            }
        });
        tvCalcium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Calcium, tvCalcium);
            }
        });
        tvScandium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Scandium, tvScandium);
            }
        });
        tvTitanium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Titanium, tvTitanium);
            }
        });
        tvVanadium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Vanadium, tvVanadium);
            }
        });
        tvChromium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Chromium, tvChromium);
            }
        });
        tvManganum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Manganum, tvManganum);
            }
        });
        tvFerrum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Ferrum, tvFerrum);
            }
        });
        tvCobaltum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Cobaltum, tvCobaltum);
            }
        });
        tvNiccolum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Niccolum, tvNiccolum);
            }
        });
        tvCuprum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Cuprum, tvCuprum);
            }
        });
        tvZincum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Zincum, tvZincum);
            }
        });
        tvGalium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Galium, tvGalium);
            }
        });
        tvGermanium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Germanium, tvGermanium);
            }
        });
        tvArsenicum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Arsenicum, tvArsenicum);
            }
        });
        tvSelenium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Selenium, tvSelenium);
            }
        });
        tvBromum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Bromum, tvBromum);
            }
        });
        tvKrypton.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Krypton, tvKrypton);
            }
        });
        tvRubidium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Rubidium, tvRubidium);
            }
        });
        tvStrontium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Strontium, tvStrontium);
            }
        });
        tvYttrium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Yttrium, tvYttrium);
            }
        });
        tvZirconium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Zirconium, tvZirconium);
            }
        });
        tvNiobium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Niobium, tvNiobium);
            }
        });
        tvMolybdenum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Molybdenum, tvMolybdenum);
            }
        });
        tvTechnetium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Technetium, tvTechnetium);
            }
        });
        tvRuthenium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Ruthenium, tvRuthenium);
            }
        });
        tvRhodium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Rhodium, tvRhodium);
            }
        });
        tvPalladium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Palladium, tvPalladium);
            }
        });
        tvArgentum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Argentum, tvArgentum);
            }
        });
        tvCadmium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Cadmium, tvCadmium);
            }
        });
        tvIndium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Indium, tvIndium);
            }
        });
        tvStannum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Stannum, tvStannum);
            }
        });
        tvStibium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Stibium, tvStibium);
            }
        });
        tvTellurium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Tellurium, tvTellurium);
            }
        });
        tvIodum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Iodum, tvIodum);
            }
        });
        tvXenon.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Xenon, tvXenon);
            }
        });
        tvCaesium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Caesium, tvCaesium);
            }
        });
        tvBarium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Barium, tvBarium);
            }
        });
        tvLanthanum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Lanthanum, tvLanthanum);
            }
        });
        tvCerium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Cerium, tvCerium);
            }
        });
        tvPraseodymium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Praseodymium, tvPraseodymium);
            }
        });
        tvNeodymium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Neodymium, tvNeodymium);
            }
        });
        tvPromethium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Promethium, tvPromethium);
            }
        });
        tvSamarium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Samarium, tvSamarium);
            }
        });
        tvEuropium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Europium, tvEuropium);
            }
        });
        tvGadolinium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Gadolinium, tvGadolinium);
            }
        });
        tvTerbium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Terbium, tvTerbium);
            }
        });
        tvDysprosium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Dysprosium, tvDysprosium);
            }
        });
        tvHolmium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Holmium, tvHolmium);
            }
        });
        tvErbium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Erbium, tvErbium);
            }
        });
        tvThulium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Thulium, tvThulium);
            }
        });
        tvYtterbium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Ytterbium, tvYtterbium);
            }
        });
        tvLutetium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Lutetium, tvLutetium);
            }
        });
        tvHafnium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Hafnium, tvHafnium);
            }
        });
        tvTantalum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Tantalum, tvTantalum);
            }
        });
        tvWolframium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Wolframium, tvWolframium);
            }
        });
        tvRhenium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Rhenium, tvRhenium);
            }
        });
        tvOsmium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Osmium, tvOsmium);
            }
        });
        tvIridium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Iridium, tvIridium);
            }
        });
        tvPlatinum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Platinum, tvPlatinum);
            }
        });
        tvAurum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Aurum, tvAurum);
            }
        });
        tvHydrargyrum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Hydrargyrum, tvHydrargyrum);
            }
        });
        tvThallium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Thallium, tvThallium);
            }
        });
        tvPlumbum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Plumbum, tvPlumbum);
            }
        });
        tvBismuthum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Bismuthum, tvBismuthum);
            }
        });
        tvPolonium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Polonium, tvPolonium);
            }
        });
        tvAstatum.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Astatum, tvAstatum);
            }
        });
        tvRadon.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Radon, tvRadon);
            }
        });
        tvFrancium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Francium, tvFrancium);
            }
        });
        tvRadium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Radium, tvRadium);
            }
        });
        tvActinium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Actinium, tvActinium);
            }
        });
        tvThorium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Thorium, tvThorium);
            }
        });
        tvProtactinium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Protactinium, tvProtactinium);
            }
        });
        tvUranium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Uranium, tvUranium);
            }
        });
        tvNeptunium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Neptunium, tvNeptunium);
            }
        });
        tvPlutonium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Plutonium, tvPlutonium);
            }
        });
        tvAmericium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Americium, tvAmericium);
            }
        });
        tvCurium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Curium, tvCurium);
            }
        });
        tvBerkelium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Berkelium, tvBerkelium);
            }
        });
        tvCalifornium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Californium, tvCalifornium);
            }
        });
        tvEinsteinium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Einsteinium, tvEinsteinium);
            }
        });
        tvFermium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Fermium, tvFermium);
            }
        });
        tvMendelevium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Mendelevium, tvMendelevium);
            }
        });
        tvNobelium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Nobelium, tvNobelium);
            }
        });
        tvLawrencium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Lawrencium, tvLawrencium);
            }
        });
        tvRhuterfordium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Rhuterfordium, tvRhuterfordium);
            }
        });
        tvDubnium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Dubnium, tvDubnium);
            }
        });
        tvSeaborgium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Seaborgium, tvSeaborgium);
            }
        });
        tvBohrium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Bohrium, tvBohrium);
            }
        });
        tvHassium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Hassium, tvHassium);
            }
        });
        tvMeitnerium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Meitnerium, tvMeitnerium);
            }
        });
        tvDarmstadtium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Darmstadtium, tvDarmstadtium);
            }
        });
        tvRoentgenium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Roentgenium, tvRoentgenium);
            }
        });
        tvCopernicium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Copernicium, tvCopernicium);
            }
        });
        tvUnuntrium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Ununtrium, tvUnuntrium);
            }
        });
        tvFlerovium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Flerovium, tvFlerovium);
            }
        });
        tvUnunpentium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Ununpentium, tvUnunpentium);
            }
        });
        tvLivermorium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Livermorium, tvLivermorium);
            }
        });
        tvUnunsentium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Ununsentium, tvUnunsentium);
            }
        });
        tvUnunoctium.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                showElementOnScreen(pt.Ununoctium, tvUnunoctium);
            }
        });

        // Implementation of OnLongClick_Listener

        tvHydrogenium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Hydrogenium, tvHydrogenium);
                onElementsClick();
                return true;
            }
        });
        tvHelium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Helium, tvHelium);
                onElementsClick();
                return true;
            }
        });
        tvLithium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Lithium, tvLithium);
                onElementsClick();
                return true;
            }
        });
        tvBeryllium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Beryllium, tvBeryllium);
                onElementsClick();
                return true;
            }
        });
        tvBorium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Borium, tvBorium);
                onElementsClick();
                return true;
            }
        });
        tvCarbonium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Carbonium, tvCarbonium);
                onElementsClick();
                return true;
            }
        });
        tvNitrogenium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Nitrogenium, tvNitrogenium);
                onElementsClick();
                return true;
            }
        });
        tvOxygenium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Oxygenium, tvOxygenium);
                onElementsClick();
                return true;
            }
        });
        tvFluorum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Fluorum, tvFluorum);
                onElementsClick();
                return true;
            }
        });
        tvNeon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Neon, tvNeon);
                onElementsClick();
                return true;
            }
        });
        tvNatrium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Natrium, tvNatrium);
                onElementsClick();
                return true;
            }
        });
        tvMagnesium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Magnesium, tvMagnesium);
                onElementsClick();
                return true;
            }
        });
        tvAlumen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Alumen, tvAlumen);
                onElementsClick();
                return true;
            }
        });
        tvSilicium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Silicium, tvSilicium);
                onElementsClick();
                return true;
            }
        });
        tvPhosphorus.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Phosphorus, tvPhosphorus);
                onElementsClick();
                return true;
            }
        });
        tvSulphur.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Sulphur, tvSulphur);
                onElementsClick();
                return true;
            }
        });
        tvClorum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Clorum, tvClorum);
                onElementsClick();
                return true;
            }
        });
        tvArgon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Argon, tvArgon);
                onElementsClick();
                return true;
            }
        });
        tvKalium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Kalium, tvKalium);
                onElementsClick();
                return true;
            }
        });
        tvCalcium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Calcium, tvCalcium);
                onElementsClick();
                return true;
            }
        });
        tvScandium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Scandium, tvScandium);
                onElementsClick();
                return true;
            }
        });
        tvTitanium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Titanium, tvTitanium);
                onElementsClick();
                return true;
            }
        });
        tvVanadium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Vanadium, tvVanadium);
                onElementsClick();
                return true;
            }
        });
        tvChromium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Chromium, tvChromium);
                onElementsClick();
                return true;
            }
        });
        tvManganum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Manganum, tvManganum);
                onElementsClick();
                return true;
            }
        });
        tvFerrum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Ferrum, tvFerrum);
                onElementsClick();
                return true;
            }
        });
        tvCobaltum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Cobaltum, tvCobaltum);
                onElementsClick();
                return true;
            }
        });
        tvNiccolum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Niccolum, tvNiccolum);
                onElementsClick();
                return true;
            }
        });
        tvCuprum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Cuprum, tvCuprum);
                onElementsClick();
                return true;
            }
        });
        tvZincum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Zincum, tvZincum);
                onElementsClick();
                return true;
            }
        });
        tvGalium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Galium, tvGalium);
                onElementsClick();
                return true;
            }
        });
        tvGermanium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Germanium, tvGermanium);
                onElementsClick();
                return true;
            }
        });
        tvArsenicum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Arsenicum, tvArsenicum);
                onElementsClick();
                return true;
            }
        });
        tvSelenium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Selenium, tvSelenium);
                onElementsClick();
                return true;
            }
        });
        tvBromum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Bromum, tvBromum);
                onElementsClick();
                return true;
            }
        });
        tvKrypton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Krypton, tvKrypton);
                onElementsClick();
                return true;
            }
        });
        tvRubidium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Rubidium, tvRubidium);
                onElementsClick();
                return true;
            }
        });
        tvStrontium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Strontium, tvStrontium);
                onElementsClick();
                return true;
            }
        });
        tvYttrium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Yttrium, tvYttrium);
                onElementsClick();
                return true;
            }
        });
        tvZirconium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Zirconium, tvZirconium);
                onElementsClick();
                return true;
            }
        });
        tvNiobium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Niobium, tvNiobium);
                onElementsClick();
                return true;
            }
        });
        tvMolybdenum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Molybdenum, tvMolybdenum);
                onElementsClick();
                return true;
            }
        });
        tvTechnetium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Technetium, tvTechnetium);
                onElementsClick();
                return true;
            }
        });
        tvRuthenium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Ruthenium, tvRuthenium);
                onElementsClick();
                return true;
            }
        });
        tvRhodium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Rhodium, tvRhodium);
                onElementsClick();
                return true;
            }
        });
        tvPalladium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Palladium, tvPalladium);
                onElementsClick();
                return true;
            }
        });
        tvArgentum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Argentum, tvArgentum);
                onElementsClick();
                return true;
            }
        });
        tvCadmium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Cadmium, tvCadmium);
                onElementsClick();
                return true;
            }
        });
        tvIndium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Indium, tvIndium);
                onElementsClick();
                return true;
            }
        });
        tvStannum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Stannum, tvStannum);
                onElementsClick();
                return true;
            }
        });
        tvStibium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Stibium, tvStibium);
                onElementsClick();
                return true;
            }
        });
        tvTellurium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Tellurium, tvTellurium);
                onElementsClick();
                return true;
            }
        });
        tvIodum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Iodum, tvIodum);
                onElementsClick();
                return true;
            }
        });
        tvXenon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Xenon, tvXenon);
                onElementsClick();
                return true;
            }
        });
        tvCaesium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Caesium, tvCaesium);
                onElementsClick();
                return true;
            }
        });
        tvBarium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Barium, tvBarium);
                onElementsClick();
                return true;
            }
        });
        tvLanthanum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Lanthanum, tvLanthanum);
                onElementsClick();
                return true;
            }
        });
        tvCerium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Cerium, tvCerium);
                onElementsClick();
                return true;
            }
        });
        tvPraseodymium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Praseodymium, tvPraseodymium);
                onElementsClick();
                return true;
            }
        });
        tvNeodymium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Neodymium, tvNeodymium);
                onElementsClick();
                return true;
            }
        });
        tvPromethium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Promethium, tvPromethium);
                onElementsClick();
                return true;
            }
        });
        tvSamarium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Samarium, tvSamarium);
                onElementsClick();
                return true;
            }
        });
        tvEuropium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Europium, tvEuropium);
                onElementsClick();
                return true;
            }
        });
        tvGadolinium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Gadolinium, tvGadolinium);
                onElementsClick();
                return true;
            }
        });
        tvTerbium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Terbium, tvTerbium);
                onElementsClick();
                return true;
            }
        });
        tvDysprosium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Dysprosium, tvDysprosium);
                onElementsClick();
                return true;
            }
        });
        tvHolmium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Holmium, tvHolmium);
                onElementsClick();
                return true;
            }
        });
        tvErbium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Erbium, tvErbium);
                onElementsClick();
                return true;
            }
        });
        tvThulium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Thulium, tvThulium);
                onElementsClick();
                return true;
            }
        });
        tvYtterbium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Ytterbium, tvYtterbium);
                onElementsClick();
                return true;
            }
        });
        tvLutetium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Lutetium, tvLutetium);
                onElementsClick();
                return true;
            }
        });
        tvHafnium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Hafnium, tvHafnium);
                onElementsClick();
                return true;
            }
        });
        tvTantalum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Tantalum, tvTantalum);
                onElementsClick();
                return true;
            }
        });
        tvWolframium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Wolframium, tvWolframium);
                onElementsClick();
                return true;
            }
        });
        tvRhenium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Rhenium, tvRhenium);
                onElementsClick();
                return true;
            }
        });
        tvOsmium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Osmium, tvOsmium);
                onElementsClick();
                return true;
            }
        });
        tvIridium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Iridium, tvIridium);
                onElementsClick();
                return true;
            }
        });
        tvPlatinum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Platinum, tvPlatinum);
                onElementsClick();
                return true;
            }
        });
        tvAurum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Aurum, tvAurum);
                onElementsClick();
                return true;
            }
        });
        tvHydrargyrum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Hydrargyrum, tvHydrargyrum);
                onElementsClick();
                return true;
            }
        });
        tvThallium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Thallium, tvThallium);
                onElementsClick();
                return true;
            }
        });
        tvPlumbum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Plumbum, tvPlumbum);
                onElementsClick();
                return true;
            }
        });
        tvBismuthum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Bismuthum, tvBismuthum);
                onElementsClick();
                return true;
            }
        });
        tvPolonium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Polonium, tvPolonium);
                onElementsClick();
                return true;
            }
        });
        tvAstatum.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Astatum, tvAstatum);
                onElementsClick();
                return true;
            }
        });
        tvRadon.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Radon, tvRadon);
                onElementsClick();
                return true;
            }
        });
        tvFrancium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Francium, tvFrancium);
                onElementsClick();
                return true;
            }
        });
        tvRadium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Radium, tvRadium);
                onElementsClick();
                return true;
            }
        });
        tvActinium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Actinium, tvActinium);
                onElementsClick();
                return true;
            }
        });
        tvThorium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Thorium, tvThorium);
                onElementsClick();
                return true;
            }
        });
        tvProtactinium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Protactinium, tvProtactinium);
                onElementsClick();
                return true;
            }
        });
        tvUranium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Uranium, tvUranium);
                onElementsClick();
                return true;
            }
        });
        tvNeptunium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Neptunium, tvNeptunium);
                onElementsClick();
                return true;
            }
        });
        tvPlutonium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Plutonium, tvPlutonium);
                onElementsClick();
                return true;
            }
        });
        tvAmericium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Americium, tvAmericium);
                onElementsClick();
                return true;
            }
        });
        tvCurium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Curium, tvCurium);
                onElementsClick();
                return true;
            }
        });
        tvBerkelium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Berkelium, tvBerkelium);
                onElementsClick();
                return true;
            }
        });
        tvCalifornium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Californium, tvCalifornium);
                onElementsClick();
                return true;
            }
        });
        tvEinsteinium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Einsteinium, tvEinsteinium);
                onElementsClick();
                return true;
            }
        });
        tvFermium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Fermium, tvFermium);
                onElementsClick();
                return true;
            }
        });
        tvMendelevium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Mendelevium, tvMendelevium);
                onElementsClick();
                return true;
            }
        });
        tvNobelium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Nobelium, tvNobelium);
                onElementsClick();
                return true;
            }
        });
        tvLawrencium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Lawrencium, tvLawrencium);
                onElementsClick();
                return true;
            }
        });
        tvRhuterfordium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Rhuterfordium, tvRhuterfordium);
                onElementsClick();
                return true;
            }
        });
        tvDubnium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Dubnium, tvDubnium);
                onElementsClick();
                return true;
            }
        });
        tvSeaborgium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Seaborgium, tvSeaborgium);
                onElementsClick();
                return true;
            }
        });
        tvBohrium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Bohrium, tvBohrium);
                onElementsClick();
                return true;
            }
        });
        tvHassium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Hassium, tvHassium);
                onElementsClick();
                return true;
            }
        });
        tvMeitnerium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Meitnerium, tvMeitnerium);
                onElementsClick();
                return true;
            }
        });
        tvDarmstadtium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Darmstadtium, tvDarmstadtium);
                onElementsClick();
                return true;
            }
        });
        tvRoentgenium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Roentgenium, tvRoentgenium);
                onElementsClick();
                return true;
            }
        });
        tvCopernicium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Copernicium, tvCopernicium);
                onElementsClick();
                return true;
            }
        });
        tvUnuntrium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Ununtrium, tvUnuntrium);
                onElementsClick();
                return true;
            }
        });
        tvFlerovium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Flerovium, tvFlerovium);
                onElementsClick();
                return true;
            }
        });
        tvUnunpentium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Ununpentium, tvUnunpentium);
                onElementsClick();
                return true;
            }
        });
        tvLivermorium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Livermorium, tvLivermorium);
                onElementsClick();
                return true;
            }
        });
        tvUnunsentium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Ununsentium, tvUnunsentium);
                onElementsClick();
                return true;
            }
        });


        tvUnunoctium.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showElementOnScreen(pt.Ununoctium, tvUnunoctium);
                onElementsClick();
                return true;
            }
        });




        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        // Starts using Hydrogen Information
        //showElementOnScreen(pt.Hydrogenium, tvHydrogenium);
/*
        tvNroAtomico.setText(pt.Hydrogenium[0]); // Nro. Atomico
        tvSimbolo.setText(pt.Hydrogenium[1]); // Simbolo
        tvNome.setText(pt.Hydrogenium[2]); // Nome em Portugues
        tvMassa.setText(pt.Hydrogenium[8]); // Massa

        gridResult.setBackground( tvHydrogenium.getBackground());

*/
        if ((!lang.equals("pt")) && (!lang.equals("português"))){
            pt.getAllEnglishElements();
            imgFirstbootTuto.setImageResource( R.drawable.setapequena_en );

        } else {
            pt.getAllPortugueseElements();
            imgFirstbootTuto.setImageResource( R.drawable.setapequena );
        }
        //gridResult.setBackground(tvHydrogenium.getBackground());

        //showElementOnScreen(pt.Hydrogenium, tvHydrogenium);

        message = pt.Hydrogenium[0] +";"+pt.Hydrogenium[1] +";"+pt.Hydrogenium[2] +";"+pt.Hydrogenium[3] +";"+pt.Hydrogenium[4] +";"+pt.Hydrogenium[5] +";"+
                pt.Hydrogenium[6] +";"+pt.Hydrogenium[7] +";"+pt.Hydrogenium[8] +";"+pt.Hydrogenium[9] +";"+pt.Hydrogenium[10]+";"+pt.Hydrogenium[11]+";"+
                pt.Hydrogenium[12]+";"+pt.Hydrogenium[13]+";"+pt.Hydrogenium[14]+";"+pt.Hydrogenium[15]+";"+pt.Hydrogenium[16];

    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void showElementOnScreen(String[] element, TextView tvTarget) {
        /*
        Z[0]                    Sym[1]	                Element[2]
        Oficiallatim[3]	        Origin of name[4]       Group[5]
        Group Name[6]	        Period[7]	            Atomic weight (u (±))[8]
        Density (g/cm3)[9]	    Melting Point (K)[10]	Boiling Point (K)[11]
        C10 (J/(g·K))[12]	    χ10[13]                 Abundance (mg/kg)[14]
        URL[15]	                Image[16]*/

        tvNroAtomico.setText(element[0]); // Nro. Atomico
        tvSimbolo.setText(element[1]); // Simbolo
        tvNome.setText(element[2]); // Nome em Portugues
        tvMassa.setText(element[8]); // Massa

        imgFirstbootTuto.setVisibility( View.INVISIBLE );

        if(imgFirstbootTuto.getVisibility() == View.VISIBLE) {
            imgFirstbootTuto.setVisibility( View.INVISIBLE );
        }

        /*tvNroAtomico.setBackground( tvTarget.getBackground());
        tvSimbolo.setBackground( tvTarget.getBackground());
        tvNome.setBackground( tvTarget.getBackground());
        tvMassa.setBackground( tvTarget.getBackground());*/
        gridResult.setBackground(tvTarget.getBackground());

        message = element[0] +";"+element[1] +";"+element[2] +";"+element[3] +";"+element[4] +";"+element[5] +";"+
                  element[6] +";"+element[7] +";"+element[8] +";"+element[9] +";"+element[10]+";"+element[11]+";"+
                  element[12]+";"+element[13]+";"+element[14]+";"+element[15]+";"+element[16];
    }

    public void showMessage(String message) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();

        //Toast.makeText( MainActivity.this, "Dentro do On Start", Toast.LENGTH_SHORT ).show();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://br.com.ddmsoftware.periodictable/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://br.com.ddmsoftware.periodictable/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }

    @Override
    public void onResume(){
        super.onResume();

        //Toast.makeText( MainActivity.this, "Estoy aki", Toast.LENGTH_SHORT ).show();
        //imgFirstbootTuto.setVisibility( View.INVISIBLE );

        //showElementOnScreen(pt.Hydrogenium, tvHydrogenium);


        // Validate First Run of Application
        if (prefs.getBoolean("firstRun", true)) {

            showElementOnScreen(pt.Hydrogenium, tvHydrogenium);

            imgFirstbootTuto.setVisibility( View.VISIBLE );
           // Toast.makeText( MainActivity.this, "First Run...", Toast.LENGTH_SHORT ).show();
            prefs.edit().putBoolean("firstRun", false).apply();
        }
    }

    private void onElementsClick(){
        imgFirstbootTuto.setVisibility( View.INVISIBLE );
        Intent intent = new Intent(MainActivity.this, ActivityResult.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

}
