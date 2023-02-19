package com.stuartyee.soundboard;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Method targeted by each button's android:onClick attribute
    public void buttonClick (View view) {
        // view item is passed in and cast as a Button object
        Button button = (Button) view;

        // Create MediaPlayer object to play .mp3
        // .mp3 must have same name as the tag in the button
        MediaPlayer mediaPlayer = MediaPlayer.create(
                this,
                // Method chain to identify .mp3 based on android:tag in button
                getResources().getIdentifier(
                        button.getTag().toString(),
                        "raw",
                        getPackageName()
                )
        );
        // play the mp3
        mediaPlayer.start();

    }
}