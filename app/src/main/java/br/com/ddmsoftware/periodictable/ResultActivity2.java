package br.com.ddmsoftware.periodictable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import br.com.ddmsoftware.periodictable.util.SystemUiHider;

public class ResultActivity2 extends Activity {

    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * If set, will toggle the system UI visibility upon interaction. Otherwise,
     * will show the system UI visibility upon interaction.
     */
    private static final boolean TOGGLE_ON_CLICK = true;

    /**
     * The flags to pass to {@link SystemUiHider#getInstance}.
     */
    private static final int HIDER_FLAGS = SystemUiHider.FLAG_HIDE_NAVIGATION;

    /**
     * The instance of the {@link SystemUiHider} for this activity.
     */
    private SystemUiHider mSystemUiHider;


    public static final String URL_MESSAGE = "br.com.ddmsoftware.periodictable.URLMESSAGE";

    private String url = "";
    private int iDefaultImageNotFound;

    private TextView tvResult_info1;
    private TextView tvResult_info2;
    private TextView tvResult_info3;
    private TextView tvResult_info4;
    private TextView tvResult_info5;
    private TextView tvResult_info6;
    private TextView tvResult_info7;
    private TextView tvResult_info8;
    private TextView tvResult_info9;

    private ImageView imgResult;

    private enum Elements {
        H,He, Li, Be,B,C,N,O,F,Ne,Na,Mg,Al,Si,P,S,Cl,Ar,K,Ca,Sc,Ti,V,Cr,Mn,
        Fe,Co,Ni,Cu,Zn,Ga,Ge,As,Se,Br,Kr,Rb,Sr,Y,Zr,Nb,Mo,Tc,Ru,Rh,Pd,Ag,Cd,In,Sn,Sb,Te,I,Xe,Cs,
        Ba,La,Ce,Pr,Nd,Pm,Sm,Eu,Gd,Tb,Dy,Ho,Er,Tm,Yb,Lu,Hf,Ta,W,Re,Os,Ir,Pt,Au,Hg,Tl,Pb,Bi,Po,At,
        Rn,Fr,Ra,Ac,Th,Pa,U,Np, Pu, Am, Cm,Bk, Cf, Es, Fm, Md, No, Lr, Rf, Db, Sg, Bh, Hs, Mt,
        Ds,Rg, Cn, Uut, Fl, Uup, Lv, Uus, Uuo
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hiding Title Bar and Setting FullScreen Mode
        requestWindowFeature( Window.FEATURE_NO_TITLE);
        //requestWindowFeature( Window.FEATURE_CUSTOM_TITLE);

        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_result2);

        tvResult_info1 = (TextView) findViewById(R.id.tvResult_Info1);
        tvResult_info2 = (TextView) findViewById(R.id.tvResult_Info2);
        tvResult_info3 = (TextView) findViewById(R.id.tvResult_Info3);
        tvResult_info4 = (TextView) findViewById(R.id.tvResult_Info4);
        tvResult_info5 = (TextView) findViewById(R.id.tvResult_info5);
        tvResult_info6 = (TextView) findViewById(R.id.tvResult_info6);
        tvResult_info7 = (TextView) findViewById(R.id.tvResult_info7);
        tvResult_info8 = (TextView) findViewById(R.id.tvResult_info8);
        tvResult_info9 = (TextView) findViewById(R.id.tvResult_info9);

        imgResult = (ImageView) findViewById(R.id.imgResultInfo);
        //TODO: Validar o IDIOMA antes de configurar a Imagem Padrao

        iDefaultImageNotFound = R.drawable.img_not_found;
        //imgResult.setImageResource(iImageFromResource);

        ImageButton imgBtnBack = (ImageButton) findViewById(R.id.imgBtnBack);

        imgBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ImageButton imgBtnWiki = (ImageButton) findViewById(R.id.imgBtnWiki);


        imgBtnWiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(MainActivity.this, "Clique e Funfou...", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(ResultActivity2.this, WebviewActivity.class);

                intent.putExtra(URL_MESSAGE, url);

                startActivity(intent);

            }
        });

        //createTabHost();

        receiveDataFromActivity();

        // Load Advertisement Banner
        AdView mAdView = (AdView) findViewById(R.id.adViewResult);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

   /* private void createTabHost() {
        TabHost tabHost = (TabHost) findViewById(R.id.tabHost);
        tabHost.setup();

        // Tab1
        TabHost.TabSpec spec = tabHost.newTabSpec("Gen. Info");
        spec.setContent(R.id.linearLayoutTab1);
        spec.setIndicator("Gen. Info");
        tabHost.addTab(spec);

        // Tab2
        spec = tabHost.newTabSpec("Wiki");
        spec.setContent(R.id.linearLayout2Tab2);
        spec.setIndicator("Wiki");
        tabHost.addTab(spec);

        // Add more lines
    }*/

    private void receiveDataFromActivity() {

                /*
        Z[0]                    Sym[1]	                Element[2]
        Oficiallatim[3]	        Origin of name[4]       Group[5]
        Group Name[6]	        Period[7]	            Atomic weight (u (±))[8]
        Density (g/cm3)[9]	    Melting Point (K)[10]	Boiling Point (K)[11]
        C10 (J/(g·K))[12]	    χ10[13]                 Abundance (mg/kg)[14]
        URL[15]	                Image[16]*/

        //WebView browser = (WebView) findViewById(R.id.webView);
        String[] aResult;

        Intent intent = getIntent();

        Bundle extra = intent.getExtras();
        String message = extra.getString(MainActivity.EXTRA_MESSAGE);

        aResult = message != null ? message.split( ";" ) : new String[0];

        tvResult_info1.setText(aResult[0] + " - " + aResult[2] + " (" + aResult[1] +")");
        tvResult_info2.setText(aResult[3]); // "Nome em Latim: "
        tvResult_info3.setText(aResult[4]); //"Origem do Nome: " +
        tvResult_info4.setText(aResult[5]+ "-" + aResult[6]); //"Nome do Grupo: " +
        tvResult_info5.setText(aResult[7]);//"Periodo: " +
        tvResult_info6.setText(aResult[8]); //"Massa Atômica: " +
        tvResult_info7.setText(aResult[9]); //"Densidade: " +
        tvResult_info8.setText(aResult[10]);//"Ponto de Fusão: " +
        tvResult_info9.setText(aResult[11]); //"Ponto de Ebulicao: " +

        url = aResult[15];

        setElementImage(aResult[1]);
    }

    private class MyBrowser extends WebViewClient {
        @Override
        // Configura Navegacao dentro do WebView, ao inves de navegacao no Browser
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    private void setElementImage(String pElement) {

        //String value ; // assume input
        Elements element = Elements.valueOf(pElement);


        switch(element) {
            case H : imgResult.setImageResource(R.drawable.h); break;
            case He : imgResult.setImageResource(R.drawable.he); break;
            case Li : imgResult.setImageResource(R.drawable.li); break;
            case Be : imgResult.setImageResource(R.drawable.be); break;
            case B : imgResult.setImageResource(iDefaultImageNotFound); break;
            case C : imgResult.setImageResource(R.drawable.c); break;
            case N : imgResult.setImageResource(R.drawable.n); break;
            case O : imgResult.setImageResource(iDefaultImageNotFound); break;
            case F : imgResult.setImageResource(R.drawable.f); break;
            case Ne : imgResult.setImageResource(R.drawable.ne); break;
            case Na : imgResult.setImageResource(R.drawable.na); break;
            case Mg : imgResult.setImageResource(R.drawable.mg); break;
            case Al : imgResult.setImageResource(R.drawable.al); break;
            case Si : imgResult.setImageResource(R.drawable.si); break;
            case P : imgResult.setImageResource(R.drawable.p); break;
            case S : imgResult.setImageResource(R.drawable.s); break;
            case Cl : imgResult.setImageResource(R.drawable.cl); break;
            case Ar : imgResult.setImageResource(R.drawable.ar); break;
            case K : imgResult.setImageResource(R.drawable.k); break;
            case Ca : imgResult.setImageResource(R.drawable.ca); break;
            case Sc : imgResult.setImageResource(R.drawable.sc); break;
            case Ti : imgResult.setImageResource(R.drawable.ti); break;
            case V : imgResult.setImageResource(R.drawable.v); break;
            case Cr : imgResult.setImageResource(R.drawable.cr); break;
            case Mn : imgResult.setImageResource(R.drawable.mn); break;
            case Fe : imgResult.setImageResource(R.drawable.fe); break;
            case Co : imgResult.setImageResource(R.drawable.co); break;
            case Ni : imgResult.setImageResource(R.drawable.ni); break;
            case Cu : imgResult.setImageResource(R.drawable.cu); break;
            case Zn : imgResult.setImageResource(R.drawable.zn); break;
            case Ga : imgResult.setImageResource(R.drawable.ga); break;
            case Ge : imgResult.setImageResource(R.drawable.ge); break;
            case As : imgResult.setImageResource(R.drawable.as); break;
            case Se : imgResult.setImageResource(R.drawable.se); break;
            case Br : imgResult.setImageResource(R.drawable.br); break;
            case Kr : imgResult.setImageResource(R.drawable.kr); break;
            case Rb : imgResult.setImageResource(R.drawable.rb); break;
            case Sr : imgResult.setImageResource(R.drawable.sr); break;
            case Y : imgResult.setImageResource(R.drawable.y); break;
            case Zr : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Nb : imgResult.setImageResource(R.drawable.nb); break;
            case Mo : imgResult.setImageResource(R.drawable.mo); break;
            case Tc : imgResult.setImageResource(R.drawable.tc); break;
            case Ru : imgResult.setImageResource(R.drawable.ru); break;
            case Rh : imgResult.setImageResource(R.drawable.rh); break;
            case Pd : imgResult.setImageResource(R.drawable.pd); break;
            case Ag : imgResult.setImageResource(R.drawable.ag); break;
            case Cd : imgResult.setImageResource(R.drawable.cd); break;
            case In : imgResult.setImageResource(R.drawable.in); break;
            case Sn : imgResult.setImageResource(R.drawable.sn); break;
            case Sb : imgResult.setImageResource(R.drawable.sb); break;
            case Te : imgResult.setImageResource(R.drawable.te); break;
            case I : imgResult.setImageResource(R.drawable.i); break;
            case Xe : imgResult.setImageResource(R.drawable.xe); break;
            case Cs : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Ba : imgResult.setImageResource(R.drawable.ba); break;
            case La : imgResult.setImageResource(R.drawable.la); break;
            case Ce : imgResult.setImageResource(R.drawable.ce); break;
            case Pr : imgResult.setImageResource(R.drawable.pr); break;
            case Nd : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Pm : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Sm : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Eu : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Gd : imgResult.setImageResource(R.drawable.gd); break;
            case Tb : imgResult.setImageResource(R.drawable.tb); break;
            case Dy : imgResult.setImageResource(R.drawable.dy); break;
            case Ho : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Er : imgResult.setImageResource(R.drawable.er); break;
            case Tm : imgResult.setImageResource(R.drawable.tm); break;
            case Yb : imgResult.setImageResource(R.drawable.yb); break;
            case Lu : imgResult.setImageResource(R.drawable.lu); break;
            case Hf : imgResult.setImageResource(R.drawable.hf); break;
            case Ta : imgResult.setImageResource(R.drawable.ta); break;
            case W : imgResult.setImageResource(R.drawable.w); break;
            case Re : imgResult.setImageResource(R.drawable.re); break;
            case Os : imgResult.setImageResource(R.drawable.os); break;
            case Ir : imgResult.setImageResource(R.drawable.ir); break;
            case Pt : imgResult.setImageResource(R.drawable.pt); break;
            case Au : imgResult.setImageResource(R.drawable.au); break;
            case Hg : imgResult.setImageResource(R.drawable.hg); break;
            case Tl : imgResult.setImageResource(R.drawable.tl); break;
            case Pb : imgResult.setImageResource(R.drawable.pb); break;
            case Bi : imgResult.setImageResource(R.drawable.bi); break;
            case Po : imgResult.setImageResource(R.drawable.po); break;
            case At : imgResult.setImageResource(R.drawable.at); break;
            case Rn : imgResult.setImageResource(R.drawable.rn); break;
            case Fr : imgResult.setImageResource(R.drawable.fr); break;
            case Ra : imgResult.setImageResource(R.drawable.ra); break;
            case Ac : imgResult.setImageResource(R.drawable.ac); break;
            case Th : imgResult.setImageResource(R.drawable.th); break;
            case Pa : imgResult.setImageResource(R.drawable.pa); break;
            case U : imgResult.setImageResource(R.drawable.u); break;
            case Np : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Pu : imgResult.setImageResource(R.drawable.pu); break;
            case Am : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Cm : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Bk : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Cf : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Es : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Fm : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Md : imgResult.setImageResource(iDefaultImageNotFound); break;
            case No : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Lr : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Rf : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Db : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Sg : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Bh : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Hs : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Mt : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Ds : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Rg : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Cn : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Uut : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Fl : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Uup : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Lv : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Uus : imgResult.setImageResource(iDefaultImageNotFound); break;
            case Uuo : imgResult.setImageResource(iDefaultImageNotFound); break;
        }
    }
}