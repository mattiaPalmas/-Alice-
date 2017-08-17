package com.exerciseapp.mattiapalmas.alice.colors;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.exerciseapp.mattiapalmas.alice.MyContextWrapper;
import com.exerciseapp.mattiapalmas.alice.MyServiceMusic;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.ChooseLenguage;

public class ColorsActivity extends AppCompatActivity {


    public static  int language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("tag", String.valueOf(ChooseLenguage.LANGUAGE));
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_colors);
        MyServiceMusic.backInTheMenu = true;

        language = ChooseLenguage.LANGUAGE;
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

    public void openColor(View view) {
        ImageButton img = (ImageButton) view;
        int imageButtonId = img.getId();


        Intent intent = new Intent(ColorsActivity.this, ColorSelectedActivity.class);
        intent.putExtra("colorId",view.getId());
        int aa = view.getId();
        Log.d("colorId", String.valueOf(aa));
        startActivity(intent);


    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(ColorSelectedActivity.TAG, "onStop: COLOR SELECT");
    }

}
