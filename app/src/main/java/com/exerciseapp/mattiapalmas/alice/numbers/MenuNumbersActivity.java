package com.exerciseapp.mattiapalmas.alice.numbers;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.exerciseapp.mattiapalmas.alice.R;

public class MenuNumbersActivity extends AppCompatActivity {

    Button numButton, numText;
    int [] numberName;
    String [] numberArray;
    int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_menu_numbers);

        numButton = (Button) findViewById(R.id.numButton);
        numText = (Button) findViewById(R.id.numText);


        numberName = new int[]{R.string.one, R.string.two, R.string.three, R.string.four, R.string.five,
                R.string.six, R.string.seven, R.string.eight, R.string.nine, R.string.ten};

        numberArray = new String[]{"1", "2", "3", "4", "5", "6"," 7", "8", "9", "10"};

    }



    public void nextNum(View view) {
        if (index != 9) {
            index++;
            numText.setText(numberName[index]);
            numButton.setText(numberArray[index]);
        }
    }

    public void backNumber(View view) {
        if (index !=0)
        {
        index--;
        numText.setText(numberName[index]);
        numButton.setText(numberArray[index]);
        }
    }

    public void speak(View view) {
        MediaPlayer mp;
        switch (index)
        {
            case 0 :
                mp = MediaPlayer.create(this, R.raw.sound1);
                mp.start();
                break;
            case 1 :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case 2 :
                mp = MediaPlayer.create(this, R.raw.sound3);
                mp.start();
                break;
            case 3 :
                mp = MediaPlayer.create(this, R.raw.sound4);
                mp.start();
                break;
            case 4 :
                mp = MediaPlayer.create(this, R.raw.sound5);
                mp.start();
                break;
            case 5 :
                mp = MediaPlayer.create(this, R.raw.sound6);
                mp.start();
                break;
            case 6 :
                mp = MediaPlayer.create(this, R.raw.sound7);
                mp.start();
                break;
            case 7 :
                mp = MediaPlayer.create(this, R.raw.sound8);
                mp.start();
                break;
            case 8 :
                mp = MediaPlayer.create(this, R.raw.sound9);
                mp.start();
                break;
            case 9 :
                mp = MediaPlayer.create(this, R.raw.sound10);
                mp.start();
                break;

        }
    }
}
