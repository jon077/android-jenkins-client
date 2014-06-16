package org.antczak.jenkins.demo;

import android.app.Application;
import android.content.Context;

/**
 * Created by https://github.com/pawelantczak on 2014-06-16.
 */
public class MainApp extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();

    }

    public static Context getmContext() {
        return mContext;
    }
}
