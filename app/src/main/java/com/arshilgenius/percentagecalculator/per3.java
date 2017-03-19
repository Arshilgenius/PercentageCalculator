package com.arshilgenius.percentagecalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by arshil on 3/18/2017.
 */

public class per3 extends AppCompatActivity{
        private AdView mAdView;

        private static final String TAG = "per3Activity";


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.per3);
            mAdView = (AdView) findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);

    }
    public void per3(View view) {

        EditText text = (EditText) findViewById(R.id.calculate);
        Float p = "".equals(text.getText().toString()) ? 0 : Float.parseFloat(text.getText().toString());
        Float result = 19/2 * p;
        TextView view2 = (TextView) findViewById(R.id.textView);
        view2.setText(String.valueOf("% = " + result));

    }
}
