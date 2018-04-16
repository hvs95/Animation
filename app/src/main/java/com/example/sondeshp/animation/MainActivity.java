package com.example.sondeshp.animation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {

    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animation= AnimationUtils.loadAnimation(MainActivity.this,R.anim.abc);
    }



public void venkat(View view)
{
    view.startAnimation(animation);
    Intent intent=new Intent(MainActivity.this,Media.class);
    startActivity(intent);

    }
}
