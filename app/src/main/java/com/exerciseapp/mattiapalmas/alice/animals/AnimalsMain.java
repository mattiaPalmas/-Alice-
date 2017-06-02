package com.exerciseapp.mattiapalmas.alice.animals;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.MainMenu;

public class AnimalsMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animals_main);
    }

    public void selectAnimal(View view) {
        Intent intent = new Intent(AnimalsMain.this, AnimalSelected.class);
        intent.putExtra("animalId",view.getId());
        int aa = view.getId();
        Log.d("animal", String.valueOf(aa));
        startActivity(intent);
    }
}
