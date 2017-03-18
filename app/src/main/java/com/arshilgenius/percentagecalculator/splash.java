package com.arshilgenius.percentagecalculator;

/**
 * Created by arshil on 3/18/2017.
 */

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
public class splash extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Thread timer = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(1500);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    finish();
                    startActivity(new Intent(splash.this, MainActivity.class));
                }
            }
        };
        timer.start();
    }
}