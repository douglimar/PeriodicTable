package br.com.ddmsoftware.periodictable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.Toast;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        ImageButton imgBack = (ImageButton)findViewById(R.id.imgBtnWebViewBack);

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        Intent intent = getIntent();

        Bundle extra = intent.getExtras();
        String message = extra.getString(ResultActivity2.URL_MESSAGE);

        String url = message;

        WebView browser = (WebView)findViewById(R.id.webView2);

        if (!url.equals("")) {
            // Carrega Imagens Automaticamente
            browser.getSettings().setLoadsImagesAutomatically(true);
            // Habilita Suporte ao Java SCript
            //browser.getSettings().setJavaScriptEnabled(true);

            // habilita As barras de rolagem lateral
            browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);

            // Carrega as configuracoes de Navegacao dentro da WebView -- metodo implementado abaixo
            browser.setWebViewClient(new MyBrowser());
            browser.loadUrl(url);
        }
    }

    private class MyBrowser extends WebViewClient {
        @Override
        // Configura Navegacao dentro do WebView, ao inves de navegacao no Browser
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
