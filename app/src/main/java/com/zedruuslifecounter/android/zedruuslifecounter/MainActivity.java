package com.zedruuslifecounter.android.zedruuslifecounter;

import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity {

    int lifePlayerOne = 20;
    int lifePlayerTwo = 20;
    int poisonPlayerOne = 0;
    int poisonPlayerTwo = 0;
    int energyPlayerOne = 0;
    int energyPlayerTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementPlayerOneLifeTotal(View view){
        lifePlayerOne += 1;
    }

    public void decrementPlayerOneLifeTotal(View view){
        lifePlayerOne -= 1;
    }

    public void incrementPlayerTwoLifeTotal(View view){
        lifePlayerTwo += 1;
    }

    public void decrementPlayerTwoLifeTotal(View view){
        lifePlayerTwo -= 1;
    }

    public void incrementPlayerOnePoisonCounter(View view){
        poisonPlayerOne += 1;
    }

    public void decrementPlayerOnePoisonCounter(View view){
        poisonPlayerOne -= 1;
    }

    public void incrementPlayerTwoPoisonCounter(View view){
        poisonPlayerTwo += 1;
    }

    public void decrementPlayerTwoPoisonCounter(View view){
        poisonPlayerTwo -= 1;
    }

    public void incrementPlayerOneEnergyCounter(View view){
        energyPlayerOne += 1;
    }

    public void decrementPlayerOneEnergyCounter(View view){
        energyPlayerOne -= 1;
    }

    public void incrementPlayerTwoEnergyCounter(View view){
        energyPlayerTwo += 1;
    }

    public void decrementPlayerTwoEnergyCounter(View view){
        energyPlayerTwo -= 1;
    }

    public void resetLife(View view){
        lifePlayerOne = 20;
        lifePlayerTwo = 20;
        poisonPlayerOne = 0;
        poisonPlayerTwo = 0;
        energyPlayerOne = 0;
        energyPlayerTwo = 0;
    }

    public void revealPoisonButton(View view){
        //if (Visibility.GONE == id.poison_button)
    }

    public void revealEnergyButton(View view){
        //if (Visibiltiy.GONE == id.energy_button)
    }
}
