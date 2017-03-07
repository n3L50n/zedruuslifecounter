package com.zedruuslifecounter.android.zedruuslifecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
        displayPlayerOneLifeTotal(lifePlayerOne);
    }

    public void decrementPlayerOneLifeTotal(View view){
        lifePlayerOne -= 1;
        displayPlayerOneLifeTotal(lifePlayerOne);
    }

    public void incrementPlayerTwoLifeTotal(View view){
        lifePlayerTwo += 1;
        displayPlayerTwoLifeTotal(lifePlayerTwo);
    }

    public void decrementPlayerTwoLifeTotal(View view){
        lifePlayerTwo -= 1;
        displayPlayerTwoLifeTotal(lifePlayerTwo);
    }

    public void incrementPlayerOnePoisonCounter(View view){
        poisonPlayerOne += 1;
        displayPlayerOnePoisonTotal(poisonPlayerOne);
    }

    public void decrementPlayerOnePoisonCounter(View view){
        poisonPlayerOne -= 1;
        displayPlayerTwoLifeTotal(poisonPlayerOne);
    }

    public void incrementPlayerTwoPoisonCounter(View view){
        poisonPlayerTwo += 1;
        displayPlayerTwoPoisonTotal(poisonPlayerTwo);
    }

    public void decrementPlayerTwoPoisonCounter(View view){
        poisonPlayerTwo -= 1;
        displayPlayerTwoPoisonTotal(poisonPlayerTwo);
    }

    public void incrementPlayerOneEnergyCounter(View view){
        energyPlayerOne += 1;
        displayPlayerOneEnergyTotal(energyPlayerOne);
    }

    public void decrementPlayerOneEnergyCounter(View view){
        energyPlayerOne -= 1;
        displayPlayerOneEnergyTotal(energyPlayerOne);
    }

    public void incrementPlayerTwoEnergyCounter(View view){
        energyPlayerTwo += 1;
        displayPlayerTwoEnergyTotal(energyPlayerTwo);

    }

    public void decrementPlayerTwoEnergyCounter(View view){
        energyPlayerTwo -= 1;
        displayPlayerTwoEnergyTotal(energyPlayerTwo);
    }

    public void resetLife(View view){
        lifePlayerOne = 20;
        lifePlayerTwo = 20;
        poisonPlayerOne = 0;
        poisonPlayerTwo = 0;
        energyPlayerOne = 0;
        energyPlayerTwo = 0;
    }

    public void displayPlayerOneLifeTotal(int lifeTotal){
        TextView lifeView = (TextView) findViewById(R.id.life_player_one_text_view);
        lifeView.setText(String.valueOf(lifeTotal));
    }

    public void displayPlayerTwoLifeTotal(int lifeTotal2){
        TextView lifeView2 = (TextView) findViewById(R.id.life_player_two_text_view);
        lifeView2.setText(String.valueOf(lifeTotal2));
    }

    public void displayPlayerOnePoisonTotal(int poisonTotal){
        TextView poisonView = (TextView) findViewById(R.id.player_one_poison_text_view);
        poisonView.setText(String.valueOf(poisonTotal));
    }

    public void displayPlayerTwoPoisonTotal(int poisonTotal2){
        TextView poisonview2 = (TextView) findViewById(R.id.player_two_poison_text_view);
        poisonview2.setText(String.valueOf(poisonTotal2));
    }

    public void displayPlayerOneEnergyTotal(int energyTotal){
        TextView energyView = (TextView) findViewById(R.id.player_one_energy_text_view);
        energyView.setText(String.valueOf(energyTotal));
    }

    public void displayPlayerTwoEnergyTotal(int energyTotal2){
        TextView energyView2 = (TextView) findViewById(R.id.player_two_energy_text_view);
        energyView2.setText(String.valueOf(energyTotal2));
    }

    public void revealPoisonButton(View view){
        //if (Visibility.GONE == id.poison_button)
    }

    public void revealEnergyButton(View view){
        //if (Visibiltiy.GONE == id.energy_button)
    }
}
