package com.exerciseapp.mattiapalmas.alice.animals;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.exerciseapp.mattiapalmas.alice.MyContextWrapper;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.ChooseLenguage;

import java.io.IOException;

public class AnimalSelected extends AppCompatActivity {

    ImageView animalImg;
    TextView animalText;

    int [] animal, animalname;
    int index;

    int animalId;

    int current_index;
    MediaPlayer mp = null;
    AssetFileDescriptor afd;
    int songs [];

    @Override
    protected void attachBaseContext(Context newBase) {
        Log.d("tag", String.valueOf(ChooseLenguage.LANGUAGE));
        if (ChooseLenguage.LANGUAGE == 0){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"it"));
        } else if (ChooseLenguage.LANGUAGE == 1){
            super.attachBaseContext(MyContextWrapper.wrap(newBase,"en"));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_animal_selected);

        animalImg = (ImageView) findViewById(R.id.animalImg);
        animalText = (TextView) findViewById(R.id.animalText);

        animal = new int[] {R.drawable.owl,R.drawable.parrot,R.drawable.eagle,R.drawable.bee,R.drawable.seagull,R.drawable.monkey,R.drawable.koala,R.drawable.bat,R.drawable.snake,R.drawable.tiger,R.drawable.snail,R.drawable.sheep2,R.drawable.pig,R.drawable.cow,R.drawable.bear};
        animalname = new int[] {R.string.owl,R.string.parrot,R.string.eagle,R.string.bee,R.string.bird,R.string.monkey,R.string.koala,R.string.bat,R.string.snake,R.string.tiger,R.string.snail,R.string.sheep,R.string.pig,R.string.cow,R.string.bear};
        index=0;


        songs = new int[]{R.raw.owl, R.raw.parrot, R.raw.eagle, R.raw.bee, R.raw.seagull, R.raw.monkey, R.raw.koala_en, R.raw.bat, R.raw.snake, R.raw.tiger, R.raw.snail, R.raw.sheep, R.raw.pig, R.raw.cow, R.raw.bear, R.raw.gufo, R.raw.pappagallo, R.raw.aquila, R.raw.ape, R.raw.gabbiano, R.raw.scimmia, R.raw.koala_it, R.raw.pipistrello, R.raw.serpente, R.raw.tigre, R.raw.lumaca, R.raw.pecora, R.raw.maiale, R.raw.mucca, R.raw.orso};
        afd = this.getResources().openRawResourceFd(songs[current_index]);
        mp = MediaPlayer.create(this,songs[0]);
        current_index=0;


        Intent intent = getIntent();
        animalId = intent.getIntExtra("animalId", 0);
        Log.d("animal", String.valueOf(animalId));

        switch (animalId) {
            case R.id.owlId:
                setViews(0);
                break;
            case R.id.parrotId:
                setViews(1);
                break;
            case R.id.eagleId:
                setViews(2);
                break;
            case R.id.beeId:
                setViews(3);
                break;
            case R.id.gabbianoId:
                setViews(4);
                break;
            case R.id.monkeyId:
                setViews(5);
                break;
            case R.id.koalaId:
                setViews(6);
                break;
            case R.id.batId:
                setViews(7);
                break;
            case R.id.snakeId:
                setViews(8);
                break;
            case R.id.tigerId:
                setViews(9);
                break;
            case R.id.snailId:
                setViews(10);
                break;
            case R.id.sheepId:
                setViews(11);
                break;
            case R.id.pigId:
                setViews(12);
                break;
            case R.id.cowId:
                setViews(13);
                break;
            case R.id.bearId:
                setViews(14);
                break;
        }

        try {
            speak(animalText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void speak(View view) throws IOException {
        switch (animalText.getText().toString())
        {
            case "Owl" :
                setSong(0);
                break;
            case "Parrot" :
                setSong(1);
                break;
            case "Eagle" :
                setSong(2);
                break;
            case "Bee" :
                setSong(3);
                break;
            case "Seagull" :
                setSong(4);
                break;
            case "Monkey" :
                setSong(5);
                break;
            case "Koala" :
                if (ChooseLenguage.LANGUAGE == 0)
                    setSong(21);
                else if (ChooseLenguage.LANGUAGE == 1)
                    setSong(6);
                break;
            case "Bat" :
                setSong(7);
                break;
            case "Snake" :
                setSong(8);
                break;
            case "Tiger" :
                setSong(9);
                break;
            case "Snail" :
                setSong(10);
                break;
            case "Sheep" :
                setSong(11);
                break;
            case "Pig" :
                setSong(12);
                break;
            case "Cow" :
                setSong(13);
                break;
            case "Bear" :
                setSong(14);
                break;
            case "Gufo" :
                setSong(15);
                break;
            case "Pappagallo" :
                setSong(16);
                break;
            case "Aquila" :
                setSong(17);
                break;
            case "Ape" :
                setSong(18);
                break;
            case "Gabbiano" :
                setSong(19);
                break;
            case "Scimmia" :
                setSong(20);
                break;
            case "Pipistrello" :
                setSong(22);
                break;
            case "Serpente" :
                setSong(23);
                break;
            case "Tigre" :
                setSong(24);
                break;
            case "Lumaca" :
                setSong(25);
                break;
            case "Pecora" :
                setSong(26);
                break;
            case "Maiale" :
                setSong(27);
                break;
            case "Mucca" :
                setSong(28);
                break;
            case "Orso" :
                setSong(29);
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
        animalImg.setImageResource(animal[newIndex]);
        animalText.setText(animalname[newIndex]);
        index = newIndex;
    }

    public void next(View view) throws IOException {
        if (index < 14)
        {
            index ++;
            animalImg.setImageResource(animal[index]);
            animalText.setText(animalname[index]);
        }
        speak(view);
    }

    public void back(View view) throws IOException {
        if (index >0)
        {
            index --;
            animalImg.setImageResource(animal[index]);
            animalText.setText(animalname[index]);
        }
        speak(view);
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
