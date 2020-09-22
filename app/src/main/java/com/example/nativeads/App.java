package com.example.nativeads;

import android.app.Application;
import com.google.android.gms.ads.MobileAds;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(this, "ca-app-pub-3940256099942544/6300978111");
    }
}