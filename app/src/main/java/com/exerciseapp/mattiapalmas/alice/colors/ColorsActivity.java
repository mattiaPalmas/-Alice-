package com.exerciseapp.mattiapalmas.alice.colors;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.animals.AnimalSelected;
import com.exerciseapp.mattiapalmas.alice.animals.AnimalsMain;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_colors);
    }

    public void startActivityColorSelected(View view) {
        Button button = (Button) view;
        String color= button.getText().toString();
        Log.d("color",": " + color);
        Intent intent = new Intent(ColorsActivity.this, ColorSelectedActivity.class);
        intent.putExtra("color",color);
        startActivity(intent);
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
}
