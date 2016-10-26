package com.example.com.w2d2prevetingdestructionwithrotation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: " + isOnDestroyCalled);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + isOnDestroyCalled);
    }

    /*
    * onConfigurationChanged: If there is a rotation it changes the text
    * */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e("TAG_", "onConfigurationChanged: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    private volatile boolean isOnDestroyCalled = false;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        isOnDestroyCalled = true;
        Log.d(TAG, "onDestroy: " + isOnDestroyCalled);
    }

    public boolean isOnDestroyCalled() {
        return this.isOnDestroyCalled;
    }
}
