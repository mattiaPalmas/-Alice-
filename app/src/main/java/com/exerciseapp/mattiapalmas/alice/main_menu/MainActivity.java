package com.exerciseapp.mattiapalmas.alice.main_menu;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.BaseActivity;
import com.exerciseapp.mattiapalmas.alice.MyServiceMusic;
import com.exerciseapp.mattiapalmas.alice.R;

public class MainActivity extends BaseActivity {

    MediaPlayer mp;
    boolean goingToNext = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        createMusic();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.arrowNext);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goingToNext = true;
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                startActivity(new Intent(MainActivity.this,MainElephant.class));
            }
        });
    }

    @Override
    protected void onPause() {
        if (!goingToNext)
        musicOnPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        musicOnResume();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
