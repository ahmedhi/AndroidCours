package com.britos.androidcours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUGTAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(DEBUGTAG,"on est dans onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(DEBUGTAG,"on est dans onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(DEBUGTAG,"on est dans onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(DEBUGTAG,"on est dans onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(DEBUGTAG,"on est dans onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(DEBUGTAG,"on est dans onStop");
    }
}
