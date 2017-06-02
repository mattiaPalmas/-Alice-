package com.exerciseapp.mattiapalmas.alice.alphabet;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.exerciseapp.mattiapalmas.alice.R;

import org.w3c.dom.Text;

import java.util.Locale;

public class LetterMainActivity extends AppCompatActivity {

    String letter ;
    ImageView imageview;
    TextView letterTextView,wordTextView;
    String language;

    String [] englishWord;
    int [] englishImage;
    char [] charLetter;
    char prova;
    int index;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_letter_main);

        Intent intent= getIntent();
        letter = intent.getStringExtra("letter");
        imageview= (ImageView) findViewById(R.id.imageView);
        letterTextView= (TextView) findViewById(R.id.letterTextView);
        wordTextView=(TextView) findViewById(R.id.wordTextView);
        language= Locale.getDefault().getDisplayLanguage();
        Log.d("lang","is: " + language);

        englishWord = new String[] {"Apple","Bee","Cat","Dad","Egg","Flower","Giraffe","Heart","Ice-Cream","Jam","Kite","Leaf","Mum","Nest","Olive Oil","Penguin","Queen","Rubbit","Sun","Tree","Umbrella","Volcano","Window","xylophone","Yacht","Zebra"};
        englishImage = new int [] {R.drawable.apple2,R.drawable.bee, R.drawable.cat2,R.drawable.dad,R.drawable.egg,R.drawable.flower,R.drawable.giraffe,R.drawable.heart,R.drawable.icecream,R.drawable.jam,R.drawable.kite,R.drawable.leaf,R.drawable.mum,R.drawable.nest,R.drawable.oliveoil,R.drawable.penguin,R.drawable.queen,R.drawable.bunny,R.drawable.sun,R.drawable.tree,R.drawable.umbrella,R.drawable.volcano,R.drawable.window,R.drawable.xylophone,R.drawable.yacht,R.drawable.zebra};
        charLetter = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        prova = 'a';
        index = 0;
        setViewsResources();
    }



    private void setViewsResources() {
        switch (letter)
        {
            case "a":
                if(language.equals("English"))
                    setEnglishViews(0);
                else if (language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.bee);
                    letterTextView.setText("A");
                    wordTextView.setText("APE");
                }

                break;
            case "b":
                if(language.equals("English"))
                    setEnglishViews(1);
                else if (language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("B");
                    wordTextView.setText("Banana");
                }

                break;
            case "c":
                if(language.equals("English"))
                    setEnglishViews(2);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("C");
                    wordTextView.setText("CASA");
                }
                break;
            case "d":
                if(language.equals("English"))
                    setEnglishViews(3);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("D");
                    wordTextView.setText("DADO");
                }

                break;
            case "e":
                if(language.equals("English"))
                    setEnglishViews(4);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("E");
                    wordTextView.setText("ELEFANTE");
                }

                break;
            case "f":
                if(language.equals("English"))
                    setEnglishViews(5);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("F");
                    wordTextView.setText("FAMIGLIA");

                }
                break;
            case "g":
                if(language.equals("English"))
                    setEnglishViews(6);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("G");
                    wordTextView.setText("GATTO");

                }

                break;
            case "h":
                if(language.equals("English"))
                    setEnglishViews(7);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("H");
                    wordTextView.setText("HALLOWEEN");

                }

                break;
            case "i":
                if(language.equals("English"))
                    setEnglishViews(8);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("I");
                    wordTextView.setText("INDIANO");

                }
                break;
            case "j":
                if(language.equals("English"))
                    setEnglishViews(9);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("J");
                    wordTextView.setText("JUDO");
                }

                break;
            case "k":
                if(language.equals("English"))
                    setEnglishViews(10);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("K");
                    wordTextView.setText("KOALA");
                }
                break;
            case "l":
                if(language.equals("English"))
                    setEnglishViews(11);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("L");
                    wordTextView.setText("LIMONE");
                }
                break;
            case "m":
                if(language.equals("English"))
                    setEnglishViews(12);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("M");
                    wordTextView.setText("MAMMA");
                }
                break;
            case "n":
                if(language.equals("English"))
                    setEnglishViews(13);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("N");
                    wordTextView.setText("NAVE");
                }
                break;
            case "o":
                if(language.equals("English"))
                    setEnglishViews(14);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("O");
                    wordTextView.setText("OLIVA");
                }
                break;
            case "p":
                if(language.equals("English"))
                    setEnglishViews(15);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("P");
                    wordTextView.setText("PAPA'");
                }

                break;
            case "q":
                if(language.equals("English"))
                    setEnglishViews(16);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("Q");
                    wordTextView.setText("QUADRO");
                }

                break;
            case "r":
                if(language.equals("English"))
                    setEnglishViews(17);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("R");
                    wordTextView.setText("RANA");
                }
                break;
            case "s":
                if(language.equals("English"))
                    setEnglishViews(18);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("S");
                    wordTextView.setText("SALAME");
                }
                break;
            case "t":
                if(language.equals("English"))
                    setEnglishViews(19);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("T");
                    wordTextView.setText("TELEFONO");
                }
                break;
            case "u":
                if(language.equals("English"))
                    setEnglishViews(20);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("U");
                    wordTextView.setText("UCCELLO");
                }
                break;
            case "v":
                if(language.equals("English"))
                    setEnglishViews(21);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("V");
                    wordTextView.setText("VASO");
                }
                break;
            case "w":
                if(language.equals("English"))
                    setEnglishViews(22);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("W");
                    wordTextView.setText("WAFER");
                }
                break;
            case "x":
                if(language.equals("English"))
                    setEnglishViews(23);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("X");
                    wordTextView.setText("XILOFONO");
                }
                break;
            case "y":
                if(language.equals("English"))
                    setEnglishViews(24);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("Y");
                    wordTextView.setText("YOGURT");
                }
                break;
            case "z":
                if(language.equals("English"))
                    setEnglishViews(25);
                else if(language.equals("italiano"))
                {
                    imageview.setImageResource(R.drawable.banana);
                    letterTextView.setText("Z");
                    wordTextView.setText("ZUCCA");
                }
                break;
        }
    }


    public void playSound(View view) {
        MediaPlayer mp;

        mp = MediaPlayer.create(this, R.raw.sound1);
        mp.start();
    }


    public void buttonNext(View view) {
        if (index <= 24)
        {
            if(language.equals("English"))
                setEnglishViews(index+1);
            else if (language.equals("italiano"))
            {

            }
        }
    }


    public void buttonBack(View view) {
        if (index > 1)
        {
            if(language.equals("English"))
                setEnglishViews(index-1);
            else if (language.equals("italiano"))
            {

            }
        }
    }


    public void setEnglishViews(int index) {
        imageview.setImageResource(englishImage[index]);
        letterTextView.setText(String.valueOf(charLetter[index]));
        wordTextView.setText(englishWord[index]);
        letter = String.valueOf(charLetter[index]);
        letter = letter.toLowerCase();
        this.index = index;
    }


    public void setItalianViews (int index) {

    }

}
