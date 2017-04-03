package com.vamsi.audio;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AudioManager.OnAudioFocusChangeListener {


    private AudioManager mAudioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAudioManager= (AudioManager)getSystemService(Context.AUDIO_SERVICE);
      //  AudioManager.OnAudioFocusChangeListener afChangeListener;  Study more onchangelistener, it is related to abandoning audio


        // Request audio focus for playback
        int result = mAudioManager.requestAudioFocus(this,
// Use the music stream.
                AudioManager.STREAM_MUSIC,
// Request permanent focus.
                AudioManager.AUDIOFOCUS_GAIN);


        if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
            Toast.makeText(this,"There you go, take the AUDIO!",Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public void onAudioFocusChange(int i) {

    }
}
  /*  private AudioManager.OnAudioFocusChangeListener focusChangeListener =
            new AudioManager.OnAudioFocusChangeListener() {
                public void onAudioFocusChange(int focusChange) {
                    AudioManager am =(AudioManager)getSystemService(Context.AUDIO_SERVICE);
                    switch (focusChange) {

                        case (AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK) :
                            // Lower the volume while ducking.

                            break;
                        case (AudioManager.AUDIOFOCUS_LOSS_TRANSIENT) :

                            break;

                        case (AudioManager.AUDIOFOCUS_LOSS) :

                            break;

                        case (AudioManager.AUDIOFOCUS_GAIN) :

                        default: break;
                    }
                }
            };*/







