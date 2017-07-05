package com.exerciseapp.mattiapalmas.alice.alphabet;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.exerciseapp.mattiapalmas.alice.MyContextWrapper;
import com.exerciseapp.mattiapalmas.alice.R;
import com.exerciseapp.mattiapalmas.alice.main_menu.chooseLenguage;

public class AlphabetActivity extends AppCompatActivity {


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
        setContentView(R.layout.activity_alphabet);
    }


    public void startLetterActivity(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.aButton:
                 intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","a");
                startActivity(intent);
            break;
            case R.id.bButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","b");
                startActivity(intent);
                break;
            case R.id.cButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","c");
                startActivity(intent);
                break;
            case R.id.dButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","d");
                startActivity(intent);
                break;
            case R.id.eButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","e");
                startActivity(intent);
                break;
            case R.id.fButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","f");
                startActivity(intent);
                break;
            case R.id.gButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","g");
                startActivity(intent);
                break;
            case R.id.hButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","h");
                startActivity(intent);
                break;
            case R.id.iButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","i");
                startActivity(intent);
                break;
            case R.id.jButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","j");
                startActivity(intent);
                break;
            case R.id.kButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","k");
                startActivity(intent);
                break;
            case R.id.lButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","l");
                startActivity(intent);
                break;
            case R.id.mButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","m");
                startActivity(intent);
                break;
            case R.id.nButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","n");
                startActivity(intent);
                break;
            case R.id.oButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","o");
                startActivity(intent);
                break;
            case R.id.pButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","p");
                startActivity(intent);
                break;
            case R.id.qButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","q");
                startActivity(intent);
                break;
            case R.id.rButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","r");
                startActivity(intent);
                break;
            case R.id.sButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","s");
                startActivity(intent);
                break;
            case R.id.tButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","t");
                startActivity(intent);
                break;
            case R.id.uButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","u");
                startActivity(intent);
                break;
            case R.id.vButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","v");
                startActivity(intent);
                break;
            case R.id.wButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","w");
                startActivity(intent);
                break;
            case R.id.xButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","x");
                startActivity(intent);
                break;
            case R.id.yButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","y");
                startActivity(intent);
                break;
            case R.id.zButton:
                intent = new Intent(AlphabetActivity.this,LetterMainActivity.class);
                intent.putExtra("letter","z");
                startActivity(intent);
                break;
        }
    }
}

