package com.exerciseapp.mattiapalmas.alice.main_menu;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.BaseActivity;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.colors.ColorSelectedActivity;


public class ChooseLenguage extends BaseActivity {

    public static int LANGUAGE;
    boolean goingToNext = false;
    public static int numMenus;

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
        startActivity(new Intent(ChooseLenguage.this,MainMenu.class));
    }

    public void startMenuEn(View view) {
        goingToNext = true;
        LANGUAGE= 1;
        startActivity(new Intent(ChooseLenguage.this,MainMenu.class));
    }


    @Override
    protected void onPause() {
        if (!goingToNext)
            musicOnPause();

        super.onPause();
    }

    @Override
    protected void onResume() {
        goingToNext= false;
        musicOnResume();
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.d("hello",LANGUAGE + "");
        super.onStop();

        Log.d(ColorSelectedActivity.TAG, "onStop: COLOR SELECT");
    }

}
