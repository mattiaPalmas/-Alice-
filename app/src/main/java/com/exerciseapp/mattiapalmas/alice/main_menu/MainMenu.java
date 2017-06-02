package com.exerciseapp.mattiapalmas.alice.main_menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.alphabet.AlphabetActivity;
import com.exerciseapp.mattiapalmas.alice.animals.AnimalsMain;
import com.exerciseapp.mattiapalmas.alice.colors.ColorsActivity;
import com.exerciseapp.mattiapalmas.alice.fruits.FruitMenuActivity;
import com.exerciseapp.mattiapalmas.alice.numbers.MenuNumbersActivity;
import com.exerciseapp.mattiapalmas.alice.vegetanles.mainVegetables;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu);

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
}