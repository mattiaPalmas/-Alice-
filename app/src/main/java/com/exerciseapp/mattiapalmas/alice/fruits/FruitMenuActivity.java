package com.exerciseapp.mattiapalmas.alice.fruits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.exerciseapp.mattiapalmas.alice.R;

public class FruitMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fruit_menu);
    }

    public void shoeTOast(View view) {
        Toast.makeText(this, "It can be clicked!!", Toast.LENGTH_SHORT).show();
    }
}
