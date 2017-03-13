package com.example.xyzreader;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class XYZApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Roboto-RobotoRegular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
}
