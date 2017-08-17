package com.exerciseapp.mattiapalmas.alice.fruits;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.MyContextWrapper;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.ChooseLenguage;

public class FruitMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fruit_menu);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        Log.d("tag", String.valueOf(ChooseLenguage.LANGUAGE));
        if (ChooseLenguage.LANGUAGE == 0){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"it"));
        } else if (ChooseLenguage.LANGUAGE == 1){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"en"));
        }
    }


    public void openSecondActivity(View view) {
        Intent intent = new Intent(FruitMenuActivity.this, FruitSelected.class);
        intent.putExtra("fruitId",view.getId());
        int aa = view.getId();
        Log.d("fruit", String.valueOf(aa));
        startActivity(intent);
    }
}
