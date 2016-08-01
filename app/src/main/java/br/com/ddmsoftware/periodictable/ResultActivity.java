package br.com.ddmsoftware.periodictable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button btnBack = (Button)findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        String url = "";

        TabHost tabHost = (TabHost)findViewById(R.id.tabHost);
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



        WebView browser = (WebView) findViewById(R.id.webView);
        Intent intent = getIntent();

        Bundle extra = intent.getExtras();
        String message = extra.getString(MainActivity.EXTRA_MESSAGE);

        if (message.equals("H")) {

            url = "https://pt.wikipedia.org/wiki/Hidrog%C3%A9nio";

        }

        if (!url.equals("")) {
            // Carrega Imagens Automaticamente
            browser.getSettings().setLoadsImagesAutomatically(true);
            // Habilita Suporte ao Java SCript
            browser.getSettings().setJavaScriptEnabled(true);

            // habilita As barras de rolagem lateral
            browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            // Carrega as configuracoes de Navegacao dentro da WebView -- metodo implementado abaixo
            browser.setWebViewClient(new MyBrowser());
            browser.loadUrl(url);
        } else Toast.makeText(ResultActivity.this, "URL em branco.", Toast.LENGTH_SHORT).show();



    }

    private class MyBrowser extends  WebViewClient{
        @Override
        // Configura Navegacao dentro do WebView, ao inves de navegacao no Browser
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
