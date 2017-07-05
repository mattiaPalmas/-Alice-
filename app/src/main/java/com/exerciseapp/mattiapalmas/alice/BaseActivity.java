package com.exerciseapp.mattiapalmas.alice;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mattia palmas on 2017-06-16.
 */

public class BaseActivity extends AppCompatActivity {

    MyServiceMusic.LocalBinder binder;
    boolean status;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected  void createMusic()
    {
        Intent i = new Intent(this, MyServiceMusic.class);
        bindService(i,sc, Context.BIND_AUTO_CREATE);
    }

    protected void musicOnPause() {
        binder.onRequestPause();
        super.onPause();
    }



    protected void musicOnResume() {
        super.onResume();
        if (binder != null)
            binder.onRequestResume();
    }

    protected void musicOnStop() {
        binder.onRequestStop();
        super.onStop();
    }

    protected void musicOnDestroy() {
        binder.onRequestStop();
        unbindService(sc);
        super.onDestroy();
    }

    private ServiceConnection sc = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            binder = (MyServiceMusic.LocalBinder) iBinder;
            status = true;
            binder.onRequestResume();
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            status = false;
        }
    };
}
