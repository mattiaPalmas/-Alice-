package com.exerciseapp.mattiapalmas.alice.alphabet;

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
import java.util.Locale;

public class LetterMainActivity extends AppCompatActivity {

    String letter ;
    ImageView imageview;
    TextView letterTextView,wordTextView;
    String language;

    String [] englishWord;
    String [] italianWord;
    int [] englishImage;
    int [] italianImage;
    char [] charLetter;
    int [] colorLetter;
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
        setContentView(R.layout.activity_letter_main);

        Intent intent= getIntent();
        letter = intent.getStringExtra("letter");
        imageview= (ImageView) findViewById(R.id.imageAlpha);
        letterTextView= (TextView) findViewById(R.id.letterTextView);
        wordTextView=(TextView) findViewById(R.id.wordTextView);
        language= Locale.getDefault().getDisplayLanguage();
        Log.d("lang","is: " + language);

        englishWord = new String[] {"Apple","Bicycle","Cat","Dad","Egg","Flower","Giraffe","Heart","Ice-Cream","Jam","Kite","Leaf","Mum","Nest","Olive Oil","Penguin","Queen","Rabbit","Sun","Tree","Umbrella","Volcano","Window","Xylophone","Yacht","Zebra"};
        italianWord = new String[] {"Albero","Bicicletta","Cuore","Dadi","Elefante","Fiore","Gelato","Hotel","Ippopotamo","Jet","Kiwi","Libro","Mamma","Nido","Olio d'Oliva","Pinguino","Quadro","Regina","Sole","Treno","Uva","Vulcano","Wafer","Xilofono","Yacht","Zebra"};

        englishImage = new int [] {R.drawable.apple2,R.drawable.bicicletta, R.drawable.cat2,R.drawable.dad,R.drawable.egg,R.drawable.flower,R.drawable.giraffe,R.drawable.heart,R.drawable.icecream,R.drawable.jam,R.drawable.kite,R.drawable.leaf,R.drawable.mum,R.drawable.nest,R.drawable.oliveoil,R.drawable.penguin,R.drawable.queen,R.drawable.bunny,R.drawable.sun,R.drawable.tree,R.drawable.umbrella,R.drawable.volcano,R.drawable.window,R.drawable.xylophone,R.drawable.yacht,R.drawable.zebra};
        italianImage = new int[] {R.drawable.tree,R.drawable.bicicletta,R.drawable.heart,R.drawable.dado,R.drawable.eleph,R.drawable.flower,R.drawable.icecream,R.drawable.hotel,R.drawable.ippopotamo,R.drawable.jet,R.drawable.kiwi,R.drawable.libro,R.drawable.mum,R.drawable.nest,R.drawable.oliveoil,R.drawable.penguin,R.drawable.quadro,R.drawable.queen,R.drawable.sun,R.drawable.treno,R.drawable.grapes,R.drawable.volcano,R.drawable.waffel,R.drawable.xylophone,R.drawable.yacht,R.drawable.zebra};

        charLetter = new char[] {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        colorLetter = new int[] {R.color.colorYellow,R.color.colorRed,R.color.colorWhite,R.color.darkGreen,R.color.lightPurple,R.color.darkGrey,R.color.lightOrange,R.color.darkRed,R.color.colorBlue,R.color.colorLightBlue,R.color.colorBrown,R.color.darkOrange,R.color.colorGreen,R.color.colorYellow,R.color.colorPink,R.color.darkGreen,R.color.colorWhite,R.color.colorYellow,R.color.colorPink,R.color.colorRed,R.color.colorWhite,R.color.colorGreen,R.color.lightOrange,R.color.colorYellow,R.color.darkOrange,R.color.purple};

        index = 0;
        setViewsResources();

        songs = new int[]{R.raw.a_like, R.raw.a_come, R.raw.b_like, R.raw.b_come, R.raw.c_like, R.raw.c_come, R.raw.d_like, R.raw.d_come,R.raw.e_like, R.raw.e_come, R.raw.f_like, R.raw.f_come, R.raw.g_like, R.raw.g_come, R.raw.h_like, R.raw.h_come, R.raw.i_like, R.raw.i_come, R.raw.j_like, R.raw.j_come, R.raw.k_like, R.raw.k_come, R.raw.l_like, R.raw.l_come, R.raw.m_like, R.raw.m_come, R.raw.n_like, R.raw.n_come, R.raw.o_like, R.raw.o_come, R.raw.p_like, R.raw.p_come, R.raw.q_like, R.raw.q_come, R.raw.r_like, R.raw.r_come, R.raw.s_like, R.raw.s_come, R.raw.t_like, R.raw.t_come, R.raw.u_like, R.raw.u_come, R.raw.v_like, R.raw.v_come, R.raw.w_like, R.raw.w_come, R.raw.x_like, R.raw.x_come, R.raw.y_like, R.raw.y_come, R.raw.z_like, R.raw.z_come};
        afd = this.getResources().openRawResourceFd(songs[current_index]);
        mp = MediaPlayer.create(this,songs[0]);
        current_index=0;

        try {
            speak(letterTextView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private void setViewsResources() {
        switch (letter)
        {
            case "a":
                if(language.equals("English"))
                    setEnglishViews(0);
                else if (language.equals("italiano"))
                    setItalianViews(0);
                break;

            case "b":
                if(language.equals("English"))
                    setEnglishViews(1);
                else if (language.equals("italiano"))
                    setItalianViews(1);
                break;

            case "c":
                if(language.equals("English"))
                    setEnglishViews(2);
                else if(language.equals("italiano"))
                    setItalianViews(2);
                break;

            case "d":
                if(language.equals("English"))
                    setEnglishViews(3);
                else if(language.equals("italiano"))
                    setItalianViews(3);
                break;

            case "e":
                if(language.equals("English"))
                    setEnglishViews(4);
                else if(language.equals("italiano"))
                    setItalianViews(4);
                break;

            case "f":
                if(language.equals("English"))
                    setEnglishViews(5);
                else if(language.equals("italiano"))
                    setItalianViews(5);
                break;

            case "g":
                if(language.equals("English"))
                    setEnglishViews(6);
                else if(language.equals("italiano"))
                    setItalianViews(6);
                break;

            case "h":
                if(language.equals("English"))
                    setEnglishViews(7);
                else if(language.equals("italiano"))
                    setItalianViews(7);
                break;

            case "i":
                if(language.equals("English"))
                    setEnglishViews(8);
                else if(language.equals("italiano"))
                    setItalianViews(8);
                break;

            case "j":
                if(language.equals("English"))
                    setEnglishViews(9);
                else if(language.equals("italiano"))
                    setItalianViews(9);
                break;

            case "k":
                if(language.equals("English"))
                    setEnglishViews(10);
                else if(language.equals("italiano"))
                    setItalianViews(10);
                break;

            case "l":
                if(language.equals("English"))
                    setEnglishViews(11);
                else if(language.equals("italiano"))
                    setItalianViews(11);
                break;

            case "m":
                if(language.equals("English"))
                    setEnglishViews(12);
                else if(language.equals("italiano"))
                    setItalianViews(12);
                break;

            case "n":
                if(language.equals("English"))
                    setEnglishViews(13);
                else if(language.equals("italiano"))
                    setItalianViews(13);
                break;

            case "o":
                if(language.equals("English"))
                    setEnglishViews(14);
                else if(language.equals("italiano"))
                setItalianViews(14);
                break;

            case "p":
                if(language.equals("English"))
                    setEnglishViews(15);
                else if(language.equals("italiano"))
                setItalianViews(15);
                break;

            case "q":
                if(language.equals("English"))
                    setEnglishViews(16);
                else if(language.equals("italiano"))
                    setItalianViews(16);
                break;

            case "r":
                if(language.equals("English"))
                    setEnglishViews(17);
                else if(language.equals("italiano"))
                    setItalianViews(17);
                break;

            case "s":
                if(language.equals("English"))
                    setEnglishViews(18);
                else if(language.equals("italiano"))
                    setItalianViews(18);
                break;

            case "t":
                if(language.equals("English"))
                    setEnglishViews(19);
                else if(language.equals("italiano"))
                setItalianViews(19);
                break;

            case "u":
                if(language.equals("English"))
                    setEnglishViews(20);
                else if(language.equals("italiano"))
                setItalianViews(20);
                break;

            case "v":
                if(language.equals("English"))
                    setEnglishViews(21);
                else if(language.equals("italiano"))
                setItalianViews(21);
                break;

            case "w":
                if(language.equals("English"))
                    setEnglishViews(22);
                else if(language.equals("italiano"))
                setItalianViews(22);
                break;
            case "x":
                if(language.equals("English"))
                    setEnglishViews(23);
                else if(language.equals("italiano"))
                    setItalianViews(23);
                break;

            case "y":
                if(language.equals("English"))
                    setEnglishViews(24);
                else if(language.equals("italiano"))
                setItalianViews(24);
                break;

            case "z":
                if(language.equals("English"))
                    setEnglishViews(25);
                else if(language.equals("italiano"))
                setItalianViews(25);
                break;
        }
    }


    public void speak(View view) throws IOException {


        String letterString = letterTextView.getText().toString();
        switch (letterString) {
            case "A":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(0);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(1);
                }
                break;
            case "B":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(2);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(3);
                }
                break;
            case "C":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(4);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(5);
                }
                break;
            case "D":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(6);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(7);
                }
                break;
            case "E":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(8);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(9);
                }
                break;
            case "F":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(10);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(11);
                }
                break;
            case "G":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(12);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(13);
                }
                break;
            case "H":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(14);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(15);
                }
                break;
            case "I":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(16);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(17);
                }
                break;
            case "J":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(18);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(19);
                }
                break;
            case "K":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(20);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(21);
                }
                break;
            case "L":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(22);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(23);
                }
                break;
            case "M":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(24);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(25);
                }
                break;
            case "N":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(26);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(27);
                }
                break;
            case "O":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(28);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(29);
                }
                break;
            case "P":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(30);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(31);
                }
                break;
            case "Q":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(32);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(33);
                }
                break;
            case "R":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(34);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(35);
                }
                break;
            case "S":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(36);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(37);
                }
                break;
            case "T":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(38);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(39);
                }
                break;
            case "U":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(40);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(41);
                }
                break;
            case "V":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(42);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(43);
                }
                break;
            case "W":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(44);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(45);
                }
                break;
            case "X":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(46);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(47);
                }
                break;
            case "Y":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(48);
                } else if (ChooseLenguage.LANGUAGE ==0){
                    setSong(49);
                }
                break;
            case "Z":
                if (ChooseLenguage.LANGUAGE == 1){
                    setSong(50);
                } else if (ChooseLenguage.LANGUAGE == 0){
                    setSong(51);
                }
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


    public void buttonNext(View view) throws IOException {
        if (index <= 24)
        {
            if(language.equals("English"))
                setEnglishViews(index+1);
            else if (language.equals("italiano"))
            {
                setItalianViews(index+1);
            }
        }

        speak(view);
    }


    public void buttonBack(View view) throws IOException {
        if (index >= 1)
        {
            if(language.equals("English"))
                setEnglishViews(index-1);
            else if (language.equals("italiano"))
            {
                setItalianViews(index-1);
            }
        }
        speak(view);
    }


    public void setEnglishViews(int index) {
        imageview.setImageResource(englishImage[index]);
        letterTextView.setText(String.valueOf(charLetter[index]));
        //letterTextView.getBackground().setColorFilter(ContextCompat.getColor(this,colorLetter[index]), PorterDuff.Mode.SRC_ATOP);
        wordTextView.setText(englishWord[index]);
        letter = String.valueOf(charLetter[index]);
        letter = letter.toLowerCase();
        this.index = index;
    }


    public void setItalianViews (int index) {
        imageview.setImageResource(italianImage[index]);
        letterTextView.setText(String.valueOf(charLetter[index]));
        //letterTextView.getBackground().setColorFilter(ContextCompat.getColor(this,colorLetter[index]), PorterDuff.Mode.SRC_ATOP);
        wordTextView.setText(italianWord[index]);
        letter = String.valueOf(charLetter[index]);
        letter = letter.toLowerCase();
        this.index = index;
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
