package com.exerciseapp.mattiapalmas.alice.main_menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.BaseActivity;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.colors.ColorSelectedActivity;

import java.util.Locale;


public class chooseLenguage extends BaseActivity {

    public static int LANGUAGE;
    boolean goingToNext = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("tag", String.valueOf(LANGUAGE));
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose_lenguage);

        createMusic();
    }

    public void startMenuIt(View view) {
        goingToNext = true;
        LANGUAGE= 0;
        startActivity(new Intent(chooseLenguage.this,MainMenu.class));
    }

    public void startMenuEn(View view) {
        goingToNext = true;
        LANGUAGE= 1;
        startActivity(new Intent(chooseLenguage.this,MainMenu.class));
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

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(ColorSelectedActivity.TAG, "onStop: COLOR SELECT");
    }

}
