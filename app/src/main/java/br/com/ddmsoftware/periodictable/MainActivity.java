package br.com.ddmsoftware.periodictable;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = new String ("br.com.ddmsoftware.periodictable.MESSAGE");


    TextView tvNroAtomico;
    TextView tvSimbolo;
    TextView tvNome;
    TextView tvNomeIngles;
    TextView tvMassa;
    GridLayout gridResult;
    periodicTablePortuguese pt;

    TextView tvHydrogenium;
    TextView tvHelium;
    TextView tvLithium;
    TextView tvBeryllium;
    TextView tvBorium;
    TextView tvCarbonium;
    TextView tvNitrogenium;
    TextView tvOxygenium;
    TextView tvFluorum;
    TextView tvNeon;
    TextView tvNatrium;
    TextView tvMagnesium;
    TextView tvAlumen;
    TextView tvSilicium;
    TextView tvPhosphorus;
    TextView tvSulphur;
    TextView tvClorum;
    TextView tvArgon;
    TextView tvKalium;
    TextView tvCalcium;
    TextView tvScandium;
    TextView tvTitanium;
    TextView tvVanadium;
    TextView tvChromium;
    TextView tvManganum;
    TextView tvFerrum;
    TextView tvCobaltum;
    TextView tvNiccolum;
    TextView tvCuprum;
    TextView tvZincum;
    TextView tvGalium;
    TextView tvGermanium;
    TextView tvArsenicum;
    TextView tvSelenium;
    TextView tvBromum;
    TextView tvKrypton;
    TextView tvRubidium;
    TextView tvStrontium;
    TextView tvYttrium;
    TextView tvZirconium;
    TextView tvNiobium;
    TextView tvMolybdenum;
    TextView tvTechnetium;
    TextView tvRuthenium;
    TextView tvRhodium;
    TextView tvPalladium;
    TextView tvArgentum;
    TextView tvCadmium;
    TextView tvIndium;
    TextView tvStannum;
    TextView tvStibium;
    TextView tvTellurium;
    TextView tvIodum;
    TextView tvXenon;
    TextView tvCaesium;
    TextView tvBarium;
    TextView tvLanthanum;
    TextView tvCerium;
    TextView tvPraseodymium;
    TextView tvNeodymium;
    TextView tvPromethium;
    TextView tvSamarium;
    TextView tvEuropium;
    TextView tvGadolinium;
    TextView tvTerbium;
    TextView tvDysprosium;
    TextView tvHolmium;
    TextView tvErbium;
    TextView tvThulium;
    TextView tvYtterbium;
    TextView tvLutetium;
    TextView tvHafnium;
    TextView tvTantalum;
    TextView tvWolframium;
    TextView tvRhenium;
    TextView tvOsmium;
    TextView tvIridium;
    TextView tvPlatinum;
    TextView tvAurum;
    TextView tvHydrargyrum;
    TextView tvThallium;
    TextView tvPlumbum;
    TextView tvBismuthum;
    TextView tvPolonium;
    TextView tvAstatum;
    TextView tvRadon;
    TextView tvFrancium;
    TextView tvRadium;
    TextView tvActinium;
    TextView tvThorium;
    TextView tvProtactinium;
    TextView tvUranium;
    TextView tvNeptunium;
    TextView tvPlutonium;
    TextView tvAmericium;
    TextView tvCurium;
    TextView tvBerkelium;
    TextView tvCalifornium;
    TextView tvEinsteinium;
    TextView tvFermium;
    TextView tvMendelevium;
    TextView tvNobelium;
    TextView tvLawrencium;
    TextView tvRhuterfordium;
    TextView tvDubnium;
    TextView tvSeaborgium;
    TextView tvBohrium;
    TextView tvHassium;
    TextView tvMeitnerium;
    TextView tvDarmstadtium;
    TextView tvRoentgenium;
    TextView tvCopernicium;
    TextView tvUnuntrium;
    TextView tvFlerovium;
    TextView tvUnunpentium;
    TextView tvLivermorium;
    TextView tvUnunsentium;
    TextView tvUnunoctium;
    //WebView wv;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        gridResult = (GridLayout) findViewById(R.id.gridResult);

        tvNroAtomico = (TextView) findViewById(R.id.tvNroAtomico);
        tvSimbolo = (TextView) findViewById(R.id.tvSimbolo);

        tvNome = (TextView) findViewById(R.id.tvNome);
        tvMassa = (TextView) findViewById(R.id.tvMassa);
        //wv = (WebView) findViewById(R.id.webView);

        pt = new periodicTablePortuguese();
        pt.getAllElements();

        clearElementsTable();

        //wv.setVisibility(View.INVISIBLE);


        tvSimbolo.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clique e Funfou...", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);

                String message = tvSimbolo.getText().toString();

                intent.putExtra(EXTRA_MESSAGE, message);

                startActivity(intent);

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

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void clearElementsTable() {
        tvNroAtomico.setText(""); // Nro. Atomico
        tvSimbolo.setText(""); // Simbolo
        tvNome.setText(""); // Nome em Portugues
        tvMassa.setText(""); // Massa

        gridResult.setBackground(null);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    public void showElementOnScreen(String[] element, TextView tvTarget) {
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

        gridResult.setBackground(tvTarget.getBackground());
    }

    public void showMessage(String message) {

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onStart() {
        super.onStart();

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

 /*   public void showDialog() {
        DialogFragment newFragment = MyAlertDialogFragment.newInstance(
                R.string.alert_dialog_two_buttons_title);
        newFragment.show(getFragmentManager(), "dialog");
    }
*/

    public static class MyAlertDialog extends DialogFragment {

        public static MyAlertDialog newInstance(int title) {
            MyAlertDialog frag = new MyAlertDialog();
            Bundle args = new Bundle();
            args.putInt("title", title);
            frag.setArguments(args);
            return frag;
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            int title = getArguments().getInt("title");

            return new AlertDialog.Builder(getActivity())
                    .setIcon(R.mipmap.ic_launcher)
                    .setTitle(title)
                    .setPositiveButton(R.string.alert_dialog_ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton) {
                                    ((MainActivity) getActivity()).doPositiveClick();
                                }
                            }
                    )
                    .setNegativeButton(R.string.alert_dialog_cancel,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int whichButton) {
                                    ((MainActivity) getActivity()).doNegativeClick();
                                }
                            }
                    )
                    .create();
        }


        void showDialog() {
            DialogFragment newFragment = MyAlertDialog.newInstance(
                    R.string.alert_dialog_two_buttons_title);
            newFragment.show(getFragmentManager(), "dialog");
        }
    }

    public void doPositiveClick() {
        // Do stuff here.
        Log.i("FragmentAlertDialog", "Positive click!");
    }

    public void doNegativeClick() {
        // Do stuff here.
        Log.i("FragmentAlertDialog", "Negative click!");
    }

}
