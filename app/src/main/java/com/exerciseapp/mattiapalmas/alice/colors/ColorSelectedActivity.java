package com.exerciseapp.mattiapalmas.alice.colors;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.exerciseapp.mattiapalmas.alice.R;

import java.util.Locale;

public class ColorSelectedActivity extends AppCompatActivity {

    public ImageView imageElephant;
    public TextView colorText;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_color_selected);

        imageElephant = (ImageView) findViewById(R.id.colorImg);
        colorText = (TextView) findViewById(R.id.textColorSelected);

        Intent intent = getIntent();
        int animalId = intent.getIntExtra("colorId", 0);


        switch (animalId) {
            case R.id.button_red:
                imageElephant.setImageResource(R.drawable.elephant_red);
                colorText.setText(R.string.red);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorRed));
                break;

            case R.id.button_blue:
                imageElephant.setImageResource(R.drawable.elephant_blue);
                colorText.setText(R.string.blue);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBlue));
                break;

            case R.id.button_yellow:
                imageElephant.setImageResource(R.drawable.elephant_yellow);
                colorText.setText(R.string.yellow);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorYellow));
                break;

            case R.id.button_black:
                imageElephant.setImageResource(R.drawable.elephant_black);
                colorText.setText(R.string.black);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBlack));
                colorText.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
                break;

            case R.id.button_grey:
                imageElephant.setImageResource(R.drawable.elephant_grey);
                colorText.setText(R.string.grey);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.back_grey));
                break;

            case R.id.button_white:
                imageElephant.setImageResource(R.drawable.elephant_white);
                colorText.setText(R.string.white);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorWhite));
                break;

            case R.id.button_orange:
                imageElephant.setImageResource(R.drawable.elephant_orange);
                colorText.setText(R.string.orange);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorOrange));
                break;

            case R.id.button_violet:
                imageElephant.setImageResource(R.drawable.elephant_purple);
                colorText.setText(R.string.violet);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryDark));
                break;

            case R.id.button_green:
                imageElephant.setImageResource(R.drawable.elephant_green);
                colorText.setText(R.string.green);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorGreen));
                break;

            case R.id.button_brown:
                imageElephant.setImageResource(R.drawable.elephant_brown);
                colorText.setText(R.string.brown);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorBrown));
                colorText.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
                break;

            case R.id.button_pink:
                imageElephant.setImageResource(R.drawable.elephant_pink);
                colorText.setText(R.string.pink);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPink));
                break;

            case R.id.button_light_blue:
                imageElephant.setImageResource(R.drawable.elephant_light_blue);
                colorText.setText(R.string.light_blue);
                colorText.setBackgroundColor(ContextCompat.getColor(this, R.color.colorLightBlue));
                break;
        }

    }

    public void speak(View view) {

        MediaPlayer mp;
        String colorString = colorText.getText().toString();
        Log.d("colorAABB",colorString);
        switch (colorString) {
            case "Red":
                Log.d("colorAABB",colorString);
                mp = MediaPlayer.create(this, R.raw.sound1);
                mp.start();
                break;
            case "Blue":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Yellow":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Black":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Grey":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "White":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Orange":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Violet":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Green":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Brown":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Pink":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case "Light blue":
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;

        }
    }
}
