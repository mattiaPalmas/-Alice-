package com.exerciseapp.mattiapalmas.alice.vegetanles;

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

public class VegetableSelected extends AppCompatActivity {

    ImageView vegImage;
    TextView vegText;
    int vegId;
    int [] imgResourse, textVeg;
    int index;

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
        setContentView(R.layout.activity_vegetable_selected);

        vegImage = (ImageView) findViewById(R.id.vegImg);
        vegText = (TextView) findViewById(R.id.vegText);

        imgResourse = new int[] {R.drawable.asparagus,R.drawable.beet,R.drawable.broccoli,R.drawable.carrot,R.drawable.corn,R.drawable.courgette,R.drawable.eggplant,R.drawable.green,R.drawable.leek,R.drawable.mushroom,R.drawable.onion,R.drawable.paprika,R.drawable.peas,R.drawable.potato,R.drawable.pumpkin};
        textVeg = new int[] {R.string.asparagus,R.string.beet,R.string.broccoli,R.string.carot,R.string.mais,R.string.zucchini,R.string.eggplant,R.string.salad,R.string.leek,R.string.mushroom,R.string.onion,R.string.pepper,R.string.pees,R.string.potatoes,R.string.pumpkin};


        Intent intent = getIntent();
        vegId = intent.getIntExtra("vegId", 0);
        Log.d("animal", String.valueOf(vegId));

        songs = new int[]{R.raw.asparagus, R.raw.beet, R.raw.broccoli_en, R.raw.carot, R.raw.corn, R.raw.zucchini, R.raw.eggplant, R.raw.salad, R.raw.leek, R.raw.mushroom, R.raw.onion, R.raw.pepper, R.raw.pees, R.raw.potatoes, R.raw.pumpkin, R.raw.asparagi, R.raw.barbabietola, R.raw.broccoli_it, R.raw.carota, R.raw.mais, R.raw.zucchina, R.raw.melanzana, R.raw.insalata, R.raw.porro, R.raw.funghi, R.raw.cipolla, R.raw.peperoni, R.raw.piselli, R.raw.patate, R.raw.zucca};
        afd = this.getResources().openRawResourceFd(songs[current_index]);
        mp = MediaPlayer.create(this,songs[0]);

        switch (vegId)
        {
            case R.id.asparagusImg:
                setViews(0);
                break;
            case R.id.beetImg:
                setViews(1);
                break;
            case R.id.broccoliImg:
                setViews(2);
                break;
            case R.id.carotImg:
                setViews(3);
                break;
            case R.id.maisImg:
                setViews(4);
                break;
            case R.id.zucchiniImg:
                setViews(5);
                break;
            case R.id.eggplantImg:
                setViews(6);
                break;
            case R.id.saladImg:
                setViews(7);
                break;
            case R.id.leekImg:
                setViews(8);
                break;
            case R.id.mushroomImg:
                setViews(9);
                break;
            case R.id.onionImg:
                setViews(10);
                break;
            case R.id.pepperImg:
                setViews(11);
                break;
            case R.id.peesImg:
                setViews(12);
                break;
            case R.id.potatoesImg:
                setViews(13);
                break;
            case R.id.pumpkinImg:
                setViews(14);
                break;
        }

        try {
            speak(vegText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void speak(View view) throws IOException {


        String vegString = vegText.getText().toString();
        switch (vegString) {
            case "Asparagus":
                setSong(0);
                break;
            case "Beet":
                setSong(1);
                break;
            case "Broccoli":
                if (ChooseLenguage.LANGUAGE == 0){
                    setSong(17);
                } else if (ChooseLenguage.LANGUAGE == 1){
                    setSong(2);
                }
                break;
            case "Carot":
                setSong(3);
                break;
            case "Corn":
                setSong(4);
                break;
            case "Zucchini":
                setSong(5);
                break;
            case "Eggplant":
                setSong(6);
                break;
            case "Salad":
                setSong(7);
                break;
            case "Leek":
                setSong(8);
                break;
            case "Mushroom":
                setSong(9);
                break;
            case "Onion":
                setSong(10);
                break;
            case "Pepper":
                setSong(11);
                break;
            case "Pees":
                setSong(12);
                break;
            case "Potato":
                setSong(13);
                break;
            case "Pumpkin":
                setSong(14);
                break;

            // italiano

            case "Asparago":
                setSong(15);
                break;
            case "Barbabietole":
                setSong(16);
                break;
            case "Carota":
                setSong(18);
                break;
            case "Mais":
                setSong(19);
                break;
            case "Zucchina":
                setSong(20);
                break;
            case "Melanzana":
                setSong(21);
                break;
            case "Insalata":
                setSong(22);
                break;
            case "Porro":
                setSong(23);
                break;
            case "Fungo":
                setSong(24);
                break;
            case "Cipolla":
                setSong(25);
                break;
            case "Peperone":
                setSong(26);
                break;
            case "Piselli":
                setSong(27);
                break;
            case "Patata":
                setSong(28);
                break;
            case "Zucca":
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
        vegImage.setImageResource(imgResourse[newIndex]);
        vegText.setText(textVeg[newIndex]);
        index = newIndex;

    }

    public void next(View view) throws IOException {
        if (index < 14)
        {
            index ++;
            vegImage.setImageResource(imgResourse[index]);
            vegText.setText(textVeg[index]);
        }

        speak(view);
    }

    public void back(View view) throws IOException {
        if (index > 0)
        {
            index --;
            vegImage.setImageResource(imgResourse[index]);
            vegText.setText(textVeg[index]);
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
