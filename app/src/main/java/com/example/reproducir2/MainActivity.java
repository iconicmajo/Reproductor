package com.example.reproducir2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
MediaPlayer song;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        song = MediaPlayer.create(MainActivity.this, R.raw.centuries);
    }

    public void play(View v) {
        song.start();
    }

    protected void onPause() {
      super.onPause();
        song.release();
    }

    public void pause(View v) {
        song.pause();
    }
}
