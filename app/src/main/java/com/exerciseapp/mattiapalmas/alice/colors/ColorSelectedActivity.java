package com.exerciseapp.mattiapalmas.alice.colors;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
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

import com.exerciseapp.mattiapalmas.alice.MyContextWrapper;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.chooseLenguage;

import java.io.IOException;
import java.util.Locale;

import static com.exerciseapp.mattiapalmas.alice.colors.ColorsActivity.language;

public class ColorSelectedActivity extends AppCompatActivity{

    public ImageView imageElephant;
    public TextView colorText;
    int [] imageColor, color,textColor;
    int index;

    int current_index;
    MediaPlayer mp = null;
    AssetFileDescriptor afd;
    int songs [];


    @Override
    protected void attachBaseContext(Context newBase) {
        Log.d("tag", String.valueOf(chooseLenguage.LANGUAGE));
        if (chooseLenguage.LANGUAGE == 0 || language == 0){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"it"));
        } else if (chooseLenguage.LANGUAGE == 1 || language == 1){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"en"));
        }
    }

    public static final String TAG = "onStop";
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_color_selected);

        imageElephant = (ImageView) findViewById(R.id.colorImg);
        colorText = (TextView) findViewById(R.id.textColorSelected);

        color = new int[] {R.color.colorRed,R.color.colorBlue,R.color.colorYellow,R.color.colorBlack,R.color.back_grey,R.color.colorWhite,R.color.colorOrange,R.color.purple,R.color.colorGreen,R.color.colorBrown,R.color.colorPink,R.color.colorLightBlue};
        imageColor = new int[] {R.drawable.elephant_red,R.drawable.elephant_blue,R.drawable.elephant_yellow,R.drawable.elephant_black,R.drawable.elephant_grey,R.drawable.elephant_white,R.drawable.elephant_orange,R.drawable.elephant_purple,R.drawable.elephant_green,R.drawable.elephant_brown,R.drawable.elephant_pink,R.drawable.elephant_light_blue};
        textColor = new int[] {R.string.red,R.string.blue,R.string.yellow,R.string.black,R.string.grey,R.string.white,R.string.orange,R.string.purple,R.string.green,R.string.brown,R.string.pink,R.string.light_blue};
        index=0;


        songs = new int[]{R.raw.red, R.raw.blue, R.raw.yellow, R.raw.black, R.raw.grey, R.raw.white, R.raw.orange, R.raw.purple, R.raw.green, R.raw.brown, R.raw.pink, R.raw.lightblue, R.raw.rosso, R.raw.blu, R.raw.giallo, R.raw.nero, R.raw.grigio, R.raw.bianco, R.raw.arancione, R.raw.viola, R.raw.verde, R.raw.marrone, R.raw.rosa, R.raw.azzurro};
        afd = this.getResources().openRawResourceFd(songs[current_index]);
        mp = MediaPlayer.create(this,songs[0]);

        Intent intent = getIntent();
        int animalId = intent.getIntExtra("colorId", 0);

        language = chooseLenguage.LANGUAGE;



        switch (animalId) {
            case R.id.button_red:
                setViews(0);
                break;

            case R.id.button_blue:
                setViews(1);
                break;

            case R.id.button_yellow:
                setViews(2);
                break;

            case R.id.button_black:
                setViews(3);
                break;

            case R.id.button_grey:
                setViews(4);
                break;

            case R.id.button_white:
                setViews(5);
                break;

            case R.id.button_orange:
                setViews(6);
                break;

            case R.id.button_purple:
                setViews(7);
                break;

            case R.id.button_green:
                setViews(8);
                break;

            case R.id.button_brown:
                setViews(9);
                break;

            case R.id.button_pink:
                setViews(10);
                break;

            case R.id.button_light_blue:
                setViews(11);
                break;
        }

        if (index==3)
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
        else
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorBlack));

        try {
            speak(colorText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void speak(View view) throws IOException {


        String colorString = colorText.getText().toString();
        Log.d("colorAABB",colorString);
        switch (colorString) {
            case "Red":
                setSong(0);
                break;
            case "Blue":
                setSong(1);
                break;
            case "Yellow":
                setSong(2);
                break;
            case "Black":
                setSong(3);
                break;
            case "Grey":
                setSong(4);
                break;
            case "White":
                setSong(5);
                break;
            case "Orange":
                setSong(6);
                break;
            case "Purple":
                setSong(7);
                break;
            case "Green":
                setSong(8);
                break;
            case "Brown":
                setSong(9);
                break;
            case "Pink":
                setSong(10);
                break;
            case "Light Blue":
                setSong(11);
                break;

            // italiano

            case "Rosso":
                setSong(12);
                break;
            case "Blu":
                setSong(13);
                break;
            case "Giallo":
                setSong(14);
                break;
            case "Nero":
                setSong(15);
                break;
            case "Grigio":
                setSong(16);
                break;
            case "Bianco":
                setSong(17);
                break;
            case "Arancione":
                setSong(18);
                break;
            case "Viola":
                setSong(19);
                break;
            case "Verde":
                setSong(20);
                break;
            case "Marrone":
                setSong(21);
                break;
            case "Rosa":
                setSong(22);
                break;
            case "Azzurro":
                setSong(23);
                break;

        }
    }


    public void setSong(int index) throws IOException {
        current_index=index;
        afd = this.getResources().openRawResourceFd(songs[current_index]);
        mp.reset();
        mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getDeclaredLength());
        mp.prepare();
        mp.start();
        afd.close();
    }



    public void setViews(int newIndex)
    {
        imageElephant.setImageResource(imageColor[newIndex]);
        colorText.setText(textColor[newIndex]);
        colorText.setBackgroundColor(ContextCompat.getColor(this, color[newIndex]));
        index = newIndex;

        if (index==3 || index==1 || index==9)
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
        else
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorBlack));
    }

    public void back(View view) throws IOException {
        if (index >=1){
            imageElephant.setImageResource(imageColor[index-1]);
            colorText.setText(textColor[index-1]);
            colorText.setBackgroundColor(ContextCompat.getColor(this, color[index-1]));
            index --;
        }
        if (index==3 || index==1 || index==9)
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
        else
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorBlack));

        speak(view);
    }

    public void next(View view) throws IOException {
        if (index < 11)
        {
            imageElephant.setImageResource(imageColor[index+1]);
            colorText.setText(textColor[index+1]);
            colorText.setBackgroundColor(ContextCompat.getColor(this, color[index+1]));
            index ++;
        }
        if (index==3 || index==1 || index==9)
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorWhite));
        else
            colorText.setTextColor(ContextCompat.getColor(this, R.color.colorBlack));

        speak(view);
    }


    @Override
    protected void onStop() {
        Log.d("mattia", "colorsel" + chooseLenguage.LANGUAGE);
        mp.release();
        super.onStop();

        Log.d(TAG, "onStop: COLOR SELECT, lenguage" + chooseLenguage.LANGUAGE);
    }

    @Override
    protected void onPause() {
        mp.release();
        super.onPause();
    }
}

