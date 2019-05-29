package com.example.pelangiaquascapeproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView bgapp, clover;
    LinearLayout logosplash;
    Animation frombottom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);

        bgapp = (ImageView) findViewById(R.id.bgapp);
        clover = (ImageView) findViewById(R.id.clover);
        logosplash = (LinearLayout) findViewById(R.id.logosplash);

        bgapp.animate().translationY(-1500).setDuration(1500).setStartDelay(1500);
        clover.animate().alpha(0).setDuration(1000).setStartDelay(600);
        logosplash.animate().translationY(-260).setDuration(1500).setStartDelay(1000);


    }
}
