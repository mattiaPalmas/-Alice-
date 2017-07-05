package com.exerciseapp.mattiapalmas.alice.main_menu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.BaseActivity;
import com.exerciseapp.mattiapalmas.alice.MyContextWrapper;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.alphabet.AlphabetActivity;
import com.exerciseapp.mattiapalmas.alice.animals.AnimalsMain;
import com.exerciseapp.mattiapalmas.alice.colors.ColorsActivity;
import com.exerciseapp.mattiapalmas.alice.fruits.FruitMenuActivity;
import com.exerciseapp.mattiapalmas.alice.numbers.MenuNumbersActivity;
import com.exerciseapp.mattiapalmas.alice.vegetanles.mainVegetables;

public class MainMenu extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_menu);
        createMusic();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        Log.d("tag", "" + chooseLenguage.LANGUAGE);
        if (chooseLenguage.LANGUAGE == 0)
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"it"));
        else if (chooseLenguage.LANGUAGE == 1)
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"en"));
    }

    public void startColorsGame(View view) {
        startActivity( new Intent(MainMenu.this, ColorsActivity.class));
    }

    public void startNumbersGame(View view) {
        startActivity(new Intent(MainMenu.this, MenuNumbersActivity.class));
    }

    public void startFruitsGame(View view)
    {
        startActivity(new Intent(MainMenu.this, FruitMenuActivity.class));
    }

    public void startAlphabetGame(View view)
    {
        startActivity(new Intent(MainMenu.this, AlphabetActivity.class));
    }

    public void startAnimalsGame(View view) {
        startActivity(new Intent(MainMenu.this, AnimalsMain.class));
    }

    public void startVegetablesGame(View view) {
        startActivity(new Intent(MainMenu.this, mainVegetables.class));
    }

    @Override
    protected void onPause() {
            musicOnPause();
        super.onPause();
    }

    @Override
    protected void onResume() {
        musicOnResume();
        super.onResume();
    }

    @Override
    protected void onStop() {
        musicOnStop();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

