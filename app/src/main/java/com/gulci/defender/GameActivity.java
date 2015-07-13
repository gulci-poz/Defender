package com.gulci.defender;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class GameActivity extends AppCompatActivity {

    private DefenderView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gameView = new DefenderView(this);
        setContentView(gameView);
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        gameView.resume();
    }
}
