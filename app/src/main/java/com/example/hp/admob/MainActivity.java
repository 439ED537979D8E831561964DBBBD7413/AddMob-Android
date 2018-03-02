package com.example.hp.admob;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.startapp.android.publish.adsCommon.AutoInterstitialPreferences;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        StartAppAd startAppAd=new StartAppAd(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AdView adView=(AdView)findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        StartAppSDK.init(this, "203119675", true);
        StartAppAd.showSplash(this,savedInstanceState);


    }

    @Override
    public void onBackPressed() {
        StartAppAd.onBackPressed(this);
        super.onBackPressed();
    }

    public void btnOpenActivity (View view){
        Intent nextActivity = new Intent(this, NextActivity.class);
        startActivity(nextActivity);
        StartAppAd.showAd(this);
    }



}
