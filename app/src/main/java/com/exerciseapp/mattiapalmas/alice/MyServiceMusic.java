package com.exerciseapp.mattiapalmas.alice;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

import java.io.IOException;

/**
 * Created by mattia palmas on 2017-06-16.
 */

public class MyServiceMusic extends Service {
    MediaPlayer mp;
    public static boolean backInTheMenu;

    private  final IBinder mbinder = new LocalBinder();

    @Override
    public void onCreate() {
        super.onCreate();
        createMusic();
    }

    public void createMusic()
    {
        mp = MediaPlayer.create(this, R.raw.musicmenu);
        mp.setLooping(true);
        mp.start();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mbinder;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (mp.isPlaying())
        mp.stop();
    }



    public  class  LocalBinder extends Binder
    {
        public void onRequestPause(){
            mp.pause();
            //mp.release();
        }

        public void onRequestResume()
        {
            Log.d("hello","" + mp);
            if (backInTheMenu)
                createMusic();

            if (!mp.isPlaying())
            mp.start();

            backInTheMenu= false;
        }

        public void onRequestStop(){
            // mp.release();
        }

    }
}
