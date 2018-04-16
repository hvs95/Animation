package com.example.sondeshp.animation;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Media extends AppCompatActivity {

        MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);
        mediaPlayer=MediaPlayer.create(Media.this,R.raw.def);

    }

    public void Play(View view) {
        mediaPlayer.start();
    }

    public void Pause(View view) {
        mediaPlayer.pause();
    }

    public void Stop(View view) {
        mediaPlayer.stop();
    }


}
