package com.example.my_pageviewdemo;

import android.app.Application;
import android.util.Log;


import com.activeandroid.ActiveAndroid;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.splunk.mint.Mint;

/**
 * Created by angel on 14/07/15.
 */

public class App extends Application {
    private static App mInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                getApplicationContext())
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();
        ImageLoader.getInstance().init(config);
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.i("MintRunning", "Mint is running....");
                Mint.initAndStartSession(mInstance, "03008589");
            }
        }).start();
        ActiveAndroid.initialize(this);
    }
    public static App getInstance(){
        return mInstance;
    }

}
