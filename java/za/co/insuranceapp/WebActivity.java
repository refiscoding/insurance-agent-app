package ke.co.insuranceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebActivity extends AppCompatActivity {

    WebView webView;

    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_activity);

        progressBar = findViewById(R.id.progressBar);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new MyWebViewClient());


        Bundle b = getIntent().getExtras();

        if (b != null){
            if (b.containsKey("url")) {
                String url = b.getString("url");
                String title = b.getString("title");

                webView.loadUrl(url);
                setTitle(title);
            }
        }

    }


    private class MyWebViewClient extends WebViewClient {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            progressBar.setVisibility(View.GONE);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return true;
        }
    }
}
