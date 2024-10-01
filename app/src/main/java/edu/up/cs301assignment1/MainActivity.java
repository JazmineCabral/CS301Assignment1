/*
 * Class: CS 301
 * Author: Jazmine Cabral
 * Date: 09/20/2024
 *
 * */
package edu.up.cs301assignment1;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private CustomElements lastTapped = null;
    private SeekBar redSeek, greenSeek, blueSeek;
    private CustomElements[] elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Find a reference to the red seekbar and the text we will update
        SeekBar redSeek = findViewById(R.id.seekBarRed);
        SeekBar greenSeek = findViewById(R.id.seekBarGreen);
        SeekBar blueSeek = findViewById(R.id.seekBarBlue);

        TextView redProgress = findViewById(R.id.redseekprogress);
        TextView greenProgress = findViewById(R.id.greenseekbartext);
        TextView blueProgress = findViewById(R.id.blueseekbartext);


        // Create an instance of SeekBarUpdate and pass the TextView
        SeekBarUpdate redSeekBarUpdate = new SeekBarUpdate(redProgress);
        SeekBarUpdate greenSeekBarUpdate = new SeekBarUpdate(greenProgress);
        SeekBarUpdate blueSeekBarUpdate = new SeekBarUpdate(blueProgress);

        // Set changeListener to the seekBarUpdates
        redSeek.setOnSeekBarChangeListener(redSeekBarUpdate);
        greenSeek.setOnSeekBarChangeListener(greenSeekBarUpdate);
        blueSeek.setOnSeekBarChangeListener(blueSeekBarUpdate);


        // Find the Drawing view and the TextView for element names
        Drawing drawingView = findViewById(R.id.surfaceView4);
        TextView currentElementTextView = findViewById(R.id.textView11);

        // Create an array of elements that will go to the listener
        CustomElements[] elements = {
                //drawingView.table,
                drawingView.pencil,
                drawingView.eraser,
                drawingView.pen,
                drawingView.book,
                drawingView.ruler,
                drawingView.eraser2,
                drawingView.phone,
                drawingView.innerBook,
        };

        // Set the array of elements to the drawing view
        drawingView.setOnTouchListener(new ElementTouchListener(elements, currentElementTextView, redSeek, greenSeek, blueSeek));
    }

    private class colorListener implements SeekBar.OnSeekBarChangeListener{

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean user) {
            if (lastTapped != null){
                int red = redSeek.getProgress();
                int green = greenSeek.getProgress();
                int blue = blueSeek.getProgress();

            }
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }

    }