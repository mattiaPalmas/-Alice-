package com.exerciseapp.mattiapalmas.alice.fruits;

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

public class FruitSelected extends AppCompatActivity {

    ImageView fruitImg;
    TextView fruitText;
    int fruitId;
    int [] imgResource, textFruit;
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
        setContentView(R.layout.activity_fruit_selected);


        fruitImg = (ImageView) findViewById(R.id.fruitImg);
        fruitText = (TextView) findViewById(R.id.fruitText);
        index =0;

        imgResource = new int[] {R.drawable.banana,R.drawable.cherries,R.drawable.coconut,R.drawable.grapes,R.drawable.blueberries,R.drawable.kiwi,R.drawable.watermelon1,R.drawable.melon,R.drawable.orange,R.drawable.peach,R.drawable.passionfruit,R.drawable.pear2,R.drawable.pineapple,R.drawable.fig,R.drawable.apple2};
        textFruit = new int[] {R.string.banana,R.string.cherry,R.string.coconut,R.string.grapes,R.string.blueberries,R.string.kiwi,R.string.Watermelon,R.string.Melon,R.string.Orange,R.string.Peach,R.string.passion_fruit,R.string.Pear,R.string.Pineapple,R.string.fig,R.string.Apple};


        Intent intent = getIntent();
        fruitId = intent.getIntExtra("fruitId", 0);
        Log.d("animal", String.valueOf(fruitId));


        songs = new int[]{R.raw.banana_en, R.raw.cherry, R.raw.coconut, R.raw.grapes, R.raw.blueberries, R.raw.kiwi, R.raw.watermelon, R.raw.melon,R.raw.orange, R.raw.peach, R.raw.passion_fruit, R.raw.pear, R.raw.pineapple, R.raw.fig, R.raw.apple, R.raw.babana_it, R.raw.cigliege, R.raw.cocco, R.raw.uva, R.raw.mirtilli, R.raw.kiwi_it, R.raw.anguria, R.raw.melone, R.raw.arancia, R.raw.pesca, R.raw.futto_passione, R.raw.pera, R.raw.ananas, R.raw.fico, R.raw.mela};
        afd = this.getResources().openRawResourceFd(songs[current_index]);
        mp = MediaPlayer.create(this,songs[0]);

        switch (fruitId)
        {
            case R.id.bananaImg:
                setViews(0);
                break;
            case R.id.cherryImg:
                setViews(1);
                break;
            case R.id.coconutImg:
                setViews(2);
                break;
            case R.id.grapesImg:
                setViews(3);
                break;
            case R.id.blueberriesImg:
                setViews(4);
                break;
            case R.id.kiwiImg:
                setViews(5);
                break;
            case R.id.watermelonImg:
                setViews(6);
                break;
            case R.id.melonImg:
                setViews(7);
                break;
            case R.id.orangeImg:
                setViews(8);
                break;
            case R.id.peachImg:
                setViews(9);
                break;
            case R.id.passionImg:
                setViews(10);
                break;
            case R.id.pearImg:
                setViews(11);
                break;
            case R.id.pineappleImg:
                setViews(12);
                break;
            case R.id.figImg:
                setViews(13);
                break;
            case R.id.appleImg:
                setViews(14);
                break;

        }

        try {
            speak(fruitText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public void speak(View view) throws IOException {


        String fruitString = fruitText.getText().toString();
        switch (fruitString) {
            case "Banana":
                if (ChooseLenguage.LANGUAGE == 0){
                    setSong(15);
                } else if (ChooseLenguage.LANGUAGE == 1){
                    setSong(0);
                }
                break;
            case "Cherry":
                setSong(1);
                break;
            case "Coconut":
                setSong(2);
                break;
            case "Grapes":
                setSong(3);
                break;
            case "Blueberries":
                setSong(4);
                break;
            case "Kiwi":
                if (ChooseLenguage.LANGUAGE == 0){
                    setSong(20);
                } else if (ChooseLenguage.LANGUAGE == 1){
                    setSong(5);
                }
                break;
            case "Watermelon":
                setSong(6);
                break;
            case "Melon":
                setSong(7);
                break;
            case "Orange":
                setSong(8);
                break;
            case "Peach":
                setSong(9);
                break;
            case "Passion fruit":
                setSong(10);
                break;
            case "Pear":
                setSong(11);
                break;
            case "Pineapple":
                setSong(12);
                break;
            case "Fig":
                setSong(13);
                break;
            case "Apple":
                setSong(14);
                break;

            // italiano

            case "Cigliege":
                setSong(16);
                break;
            case "Cocco":
                setSong(17);
                break;
            case "Uva":
                setSong(18);
                break;
            case "Mirtilli":
                setSong(19);
                break;
            case "Anguria":
                setSong(21);
                break;
            case "Melone":
                setSong(22);
                break;
            case "Arancia":
                setSong(23);
                break;
            case "Pesca":
                setSong(24);
                break;
            case "Frutto della Passione":
                setSong(25);
                break;
            case "Pera":
                setSong(26);
                break;
            case "Ananas":
                setSong(27);
                break;
            case "Fico":
                setSong(28);
                break;
            case "Mela":
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


    public void setViews(int newIndex){
        fruitImg.setImageResource(imgResource[newIndex]);
        fruitText.setText(textFruit[newIndex]);
        index = newIndex;
    }

    public void next(View view) throws IOException {
        if (index < 14)
        {
            index ++;
            fruitImg.setImageResource(imgResource[index]);
            fruitText.setText(textFruit[index]);
        }
        speak(view);
    }

    public void back(View view) throws IOException {
        if (index >0)
        {
            index --;
            fruitImg.setImageResource(imgResource[index]);
            fruitText.setText(textFruit[index]);
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
