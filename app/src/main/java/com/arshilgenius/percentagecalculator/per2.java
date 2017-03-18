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

public class per2 extends AppCompatActivity {

    private AdView mAdView;
    private static final String TAG = "per2Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.per2);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    public void per2(View view) {


        EditText text = (EditText) findViewById(R.id.calculate);
        String s = text.getText().toString();
        Float p = Float.parseFloat(s);
        Double r  = 0.5;
        Double result = p-r;
        result = result*10;
        TextView view2 = (TextView) findViewById(R.id.textView);
        view2.setText(String.valueOf("% = " + result));


    }
}
