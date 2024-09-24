/*
 * Class: CS 301
 * Author: Jazmine Cabral
 * Date: 09/20/2024
 *
 * */
package edu.up.cs301assignment1;

import android.widget.SeekBar;
import android.widget.TextView;

public class SeekBarUpdate implements SeekBar.OnSeekBarChangeListener {

    private TextView progressText;

    public SeekBarUpdate(TextView progressText) {
        this.progressText = progressText;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
        progressText.setText("Progress: " + progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
