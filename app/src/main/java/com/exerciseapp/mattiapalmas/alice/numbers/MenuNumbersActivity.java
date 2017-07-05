package com.exerciseapp.mattiapalmas.alice.numbers;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.exerciseapp.mattiapalmas.alice.MyContextWrapper;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.chooseLenguage;

import java.io.IOException;

public class MenuNumbersActivity extends AppCompatActivity {

    Button numButton, numText;
    ImageView imageButton;
    int [] numberName;
    int [] numberImage;
    int index = 0;

    MediaPlayer mp = null;
    AssetFileDescriptor afd;
    int songs [];
    int current_index;


    @Override
    protected void attachBaseContext(Context newBase) {
        Log.d("tag", String.valueOf(chooseLenguage.LANGUAGE));
        if (chooseLenguage.LANGUAGE == 0){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"it"));
        } else if (chooseLenguage.LANGUAGE == 1){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"en"));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_numbers);

        imageButton = (ImageView) findViewById(R.id.imageView2);
        numText = (Button) findViewById(R.id.numText);


        numberName = new int[]{R.string.one, R.string.two, R.string.three, R.string.four, R.string.five,
                R.string.six, R.string.seven, R.string.eight, R.string.nine, R.string.ten};

        numberImage = new int[]{R.drawable.onefinger,R.drawable.twofinger,R.drawable.threefinger,R.drawable.fourfinger,R.drawable.fivefinger,R.drawable.sixfinger,R.drawable.sevenfinger,R.drawable.eightfinger,R.drawable.ninefinger,R.drawable.tenfinger};


        songs = new int[]{R.raw.one, R.raw.two, R.raw.three, R.raw.four, R.raw.five, R.raw.six, R.raw.seven, R.raw.eight, R.raw.nine, R.raw.ten, R.raw.uno, R.raw.due, R.raw.tre, R.raw.quattro, R.raw.cinque, R.raw.sei, R.raw.sette, R.raw.otto, R.raw.nove, R.raw.dieci};
        afd = this.getResources().openRawResourceFd(songs[current_index]);

        if (chooseLenguage.LANGUAGE == 0){
            mp = MediaPlayer.create(this,songs[10]);
        } else if (chooseLenguage.LANGUAGE == 1){
            mp = MediaPlayer.create(this,songs[0]);
        }
        mp.start();
    }



    public void nextNum(View view) throws IOException {
        if (index != 9) {
            index++;
            numText.setText(numberName[index]);
            imageButton.setImageResource(numberImage[index]);
        }
        speak(view);
    }

    public void backNumber(View view) throws IOException {
        if (index !=0)
        {
            index--;
            numText.setText(numberName[index]);
            imageButton.setImageResource(numberImage[index]);
        }
        speak(view);
    }

    public void speak(View view) throws IOException {
        MediaPlayer mp;
        Log.d("speak","" + numText.getText().toString());
        switch (numText.getText().toString())
        {
            case "One" :
                setSong(0);
                break;
            case "Two" :
                setSong(1);
                break;
            case "Three" :
                setSong(2);
                break;
            case "Four" :
                setSong(3);
                break;
            case "Five" :
                setSong(4);
                break;
            case "Six" :
                setSong(5);
                break;
            case "Seven" :
                setSong(6);
                break;
            case "Eight" :
                setSong(7);
                break;
            case "Nine" :
                setSong(8);
                break;
            case "Ten" :
                setSong(9);
                break;
            case "Uno" :
                setSong(10);
                break;
            case "Due" :
                setSong(11);
                break;
            case "Tre" :
                setSong(12);
                break;
            case "Quattro" :
                setSong(13);
                break;
            case "Cinque" :
                setSong(14);
                break;
            case "Sei" :
                setSong(15);
                break;
            case "Sette" :
                setSong(16);
                break;
            case "Otto" :
                setSong(17);
                break;
            case "Nove" :
                setSong(18);
                break;
            case "Dieci" :
                setSong(19);
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

    @Override
    protected void onPause() {
        mp.release();
        super.onPause();
    }

    @Override
    protected void onStop() {
        mp.release();
        super.onStop();
    }
}
