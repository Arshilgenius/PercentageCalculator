package com.arshilgenius.percentagecalculator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
    public void per1(View view){
        Intent intent= new Intent(getApplicationContext(),per1.class);
        startActivity(intent);
    }
    public void per2(View view){
        Intent intent2= new Intent(getApplicationContext(),per2.class);
        startActivity(intent2);}

    public void per3(View view){
        Intent intent3= new Intent(getApplicationContext(),per3.class);
        startActivity(intent3);}


}


