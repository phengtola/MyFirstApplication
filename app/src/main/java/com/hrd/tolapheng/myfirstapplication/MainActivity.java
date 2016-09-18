package com.hrd.tolapheng.myfirstapplication;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = "KSHRD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG , "onCreated");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStarted");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG , "onResumed");
    }






    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG , "onStopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG , "onDestroy");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.e(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG , "onRestoreInstanceState");
    }
}
