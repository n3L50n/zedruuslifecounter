package com.zedruuslifecounter.android.zedruuslifecounter;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    int lifePlayerOne = 20;
    int lifePlayerTwo = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void resetLife(View view){
        lifePlayerOne = 20;
        lifePlayerTwo = 20;
    }

    private void revealPoisonButton(View view){
        //if (Visibility.GONE == id.poison_button)
    }

    private void revealEnergyButton(View view){
        //if (Visibiltiy.GONE == id.energy_button)
    }
}
