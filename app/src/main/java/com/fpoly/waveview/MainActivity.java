package com.fpoly.waveview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import me.itangqi.waveloadingview.WaveLoadingView;

public class MainActivity extends AppCompatActivity {
    private WaveLoadingView waveView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        waveView = findViewById(R.id.waveView);

        waveView.setProgressValue(40);
    }
}
