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

    /**
     * Add one to Player One's Life Total then display the new total
     */
    public void incrementPlayerOneLifeTotal(View view) {
//        if (view.setOnLongClickListener() == )
        lifePlayerOne += 1;
        displayPlayerOneLifeTotal(lifePlayerOne);
    }

    /**
     * Subtract one from Player One's Life Total then display the new total
     * In Magic: the Gathering it is possible for a player to have
     * a negative life total, so there is no check here.
     */
    public void decrementPlayerOneLifeTotal(View view) {
        lifePlayerOne -= 1;
        displayPlayerOneLifeTotal(lifePlayerOne);
    }

    /**
     * Add one to Player Two's Life Total then display the new total
     */
    public void incrementPlayerTwoLifeTotal(View view) {
        lifePlayerTwo += 1;
        displayPlayerTwoLifeTotal(lifePlayerTwo);
    }

    /**
     * Subtract one from Player Two's Life Total then display the new total
     * In Magic: the Gathering it is possible for a player to have
     * a negative life total, so there is no check here.
     */
    public void decrementPlayerTwoLifeTotal(View view) {
        lifePlayerTwo -= 1;
        displayPlayerTwoLifeTotal(lifePlayerTwo);
    }

    public void incrementPlayerOnePoisonCounter(View view) {
        poisonPlayerOne += 1;
        displayPlayerOnePoisonTotal(poisonPlayerOne);
    }

    /**
     * Used to subtract from a players Poison count total.
     * Players can not have less than 0 counters.
     */
    public void decrementPlayerOnePoisonCounter(View view) {
        poisonPlayerOne -= 1;
        if (poisonPlayerOne == -1) {
            poisonPlayerOne = 0;
        }
        displayPlayerOnePoisonTotal(poisonPlayerOne);
    }

    public void incrementPlayerTwoPoisonCounter(View view) {
        poisonPlayerTwo += 1;
        displayPlayerTwoPoisonTotal(poisonPlayerTwo);
    }

    /**
     * Used to subtract from a players Poison count total.
     * Players can not have less than 0 counters.
     */
    public void decrementPlayerTwoPoisonCounter(View view) {
        poisonPlayerTwo -= 1;
        if (poisonPlayerTwo == -1) {
            poisonPlayerTwo = 0;
        }
        displayPlayerTwoPoisonTotal(poisonPlayerTwo);
    }

    public void incrementPlayerOneEnergyCounter(View view) {
        energyPlayerOne += 1;
        displayPlayerOneEnergyTotal(energyPlayerOne);
    }

    /**
     * Used to subtract from a players Energy count total.
     * Players can not have less than 0 counters.
     */
    public void decrementPlayerOneEnergyCounter(View view) {
        energyPlayerOne -= 1;
        if (energyPlayerOne == -1) {
            energyPlayerOne = 0;
        }
        displayPlayerOneEnergyTotal(energyPlayerOne);
    }

    public void incrementPlayerTwoEnergyCounter(View view) {
        energyPlayerTwo += 1;
        displayPlayerTwoEnergyTotal(energyPlayerTwo);

    }

    /**
     * Used to subtract from a players Energy count total.
     * Players can not have less than 0 counters.
     */
    public void decrementPlayerTwoEnergyCounter(View view) {
        energyPlayerTwo -= 1;
        if (energyPlayerTwo == -1) {
            energyPlayerTwo = 0;
        }
        displayPlayerTwoEnergyTotal(energyPlayerTwo);
    }

    /**
     * Reset all values to a new game start then display the new total
     * A classic Magic: the Gathering game starts players at 20 life.
     */
    public void resetLife(View view) {
        lifePlayerOne = 20;
        lifePlayerTwo = 20;
        poisonPlayerOne = 0;
        poisonPlayerTwo = 0;
        energyPlayerOne = 0;
        energyPlayerTwo = 0;
        displayPlayerOneLifeTotal(lifePlayerOne);
        displayPlayerTwoLifeTotal(lifePlayerTwo);
        displayPlayerOnePoisonTotal(poisonPlayerOne);
        displayPlayerTwoPoisonTotal(poisonPlayerTwo);
        displayPlayerOneEnergyTotal(energyPlayerOne);
        displayPlayerTwoEnergyTotal(energyPlayerTwo);
    }

    public void displayPlayerOneLifeTotal(int lifeTotal) {
        TextView lifeView = (TextView) findViewById(R.id.life_player_one_text_view);
        lifeView.setText(String.valueOf(lifeTotal));
    }

    public void displayPlayerTwoLifeTotal(int lifeTotal2) {
        TextView lifeView2 = (TextView) findViewById(R.id.life_player_two_text_view);
        lifeView2.setText(String.valueOf(lifeTotal2));
    }

    public void displayPlayerOnePoisonTotal(int poisonTotal) {
        TextView poisonView = (TextView) findViewById(R.id.player_one_poison_text_view);
        poisonView.setText(String.valueOf(poisonTotal));
    }

    public void displayPlayerTwoPoisonTotal(int poisonTotal2) {
        TextView poisonview2 = (TextView) findViewById(R.id.player_two_poison_text_view);
        poisonview2.setText(String.valueOf(poisonTotal2));
    }

    public void displayPlayerOneEnergyTotal(int energyTotal) {
        TextView energyView = (TextView) findViewById(R.id.player_one_energy_text_view);
        energyView.setText(String.valueOf(energyTotal));
    }

    public void displayPlayerTwoEnergyTotal(int energyTotal2) {
        TextView energyView2 = (TextView) findViewById(R.id.player_two_energy_text_view);
        energyView2.setText(String.valueOf(energyTotal2));
    }

    public void revealPoisonButton(View view) {
        View poisonCounterView = findViewById(R.id.player_one_poison_layout_view);
        View poisonCounterView2 = findViewById(R.id.player_two_poison_layout_view);
        if (poisonCounterView.getVisibility() == View.VISIBLE) {
            poisonCounterView.setVisibility(View.INVISIBLE);
            poisonCounterView2.setVisibility(View.INVISIBLE);
        } else {
            poisonCounterView.setVisibility(View.VISIBLE);
            poisonCounterView2.setVisibility(View.VISIBLE);
        }
    }

    public void revealEnergyButton(View view) {
        View energyCounterView = findViewById(R.id.player_one_energy_layout_view);
        View energyCounterView2 = findViewById(R.id.player_two_energy_layout_view);
        if (energyCounterView.getVisibility() == View.VISIBLE) {
            energyCounterView.setVisibility(View.INVISIBLE);
            energyCounterView2.setVisibility(View.INVISIBLE);
        } else {
            energyCounterView.setVisibility(View.VISIBLE);
            energyCounterView2.setVisibility(View.VISIBLE);
        }
    }

    public void changeColors(View view) {
        View v = findViewById(R.id.player_one_layout);
        v.setBackgroundColor(getResources().getColor(R.color.magic_red));
    }
}
