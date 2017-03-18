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

public class per1 extends AppCompatActivity {

    private AdView mAdView;
    private static final String TAG = "per1Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.per1);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }




    public void per1(View view) {

        EditText text = (EditText) findViewById(R.id.calculate);
        String s = text.getText().toString();
        Float p = Float.parseFloat(s);
        Float result = 20 * p * p * p;
        result = result - 380 * p * p;
        result = result + 2725 * p;
        result = result - 1690;
        result = result / 84;
        TextView view2 = (TextView) findViewById(R.id.textView);
        view2.setText(String.valueOf("% = " + result));

    }
}
