package com.exerciseapp.mattiapalmas.alice.animals;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.MainActivity;
import com.exerciseapp.mattiapalmas.alice.main_menu.MainElephant;

public class AnimalSelected extends AppCompatActivity {

    ImageView animalImg;
    TextView animalText;

    int animalId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animal_selected);

        animalImg = (ImageView) findViewById(R.id.animalImg);
        animalText = (TextView) findViewById(R.id.animalText);

        Intent intent = getIntent();
        animalId = intent.getIntExtra("animalId", 0);
        Log.d("animal", String.valueOf(animalId));

        switch (animalId) {
            case R.id.monkeyId:
                animalImg.setImageResource(R.drawable.monkey);
                animalText.setText(R.string.monkey);
                break;
            case R.id.owlId:
                animalImg.setImageResource(R.drawable.owl);
                animalText.setText(R.string.owl);
                break;
            case R.id.parrotId:
                animalImg.setImageResource(R.drawable.parrot);
                animalText.setText(R.string.parrot);
                break;
            case R.id.eagleId:
                animalImg.setImageResource(R.drawable.eagle);
                animalText.setText(R.string.eagle);
                break;
            case R.id.beeId:
                animalImg.setImageResource(R.drawable.ape);
                animalText.setText(R.string.bee);
                break;
            case R.id.gabbianoId:
                animalImg.setImageResource(R.drawable.gabbiano);
                animalText.setText(R.string.bird);
                break;
            case R.id.koalaId:
                animalImg.setImageResource(R.drawable.koala);
                animalText.setText(R.string.koala);
                break;
            case R.id.batId:
                animalImg.setImageResource(R.drawable.bat);
                animalText.setText(R.string.bat);
                break;
            case R.id.snakeId:
                animalImg.setImageResource(R.drawable.snake);
                animalText.setText(R.string.snake);
                break;
            case R.id.tigerId:
                animalImg.setImageResource(R.drawable.tiger);
                animalText.setText(R.string.tiger);
                break;
            case R.id.snailId:
                animalImg.setImageResource(R.drawable.snail);
                animalText.setText(R.string.snail);
                break;
            case R.id.sheepId:
                animalImg.setImageResource(R.drawable.sheep2);
                animalText.setText(R.string.sheep);
                break;
            case R.id.pigId:
                animalImg.setImageResource(R.drawable.pig);
                animalText.setText(R.string.pig);
                break;
            case R.id.cowId:
                animalImg.setImageResource(R.drawable.cow);
                animalText.setText(R.string.cow);
                break;
            case R.id.bearId:
                animalImg.setImageResource(R.drawable.bear);
                animalText.setText(R.string.bear);
                break;
        }
    }

    public void speak(View view) {
        MediaPlayer mp;
        switch (animalId)
        {
            case R.id.monkeyId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.owlId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.parrotId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.eagleId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.beeId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.gabbianoId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.koalaId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.batId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.snakeId :
                animalImg.setImageResource( R.drawable.snake);
                animalText.setText(R.string.snake);
                break;
            case R.id.tigerId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.snailId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.sheepId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.pigId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.cowId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
            case R.id.bearId :
                mp = MediaPlayer.create(this, R.raw.sound2);
                mp.start();
                break;
        }
        }
    }
