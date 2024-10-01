/*
 * Class: CS 301
 * Author: Jazmine Cabral
 * Date: 09/20/2024
 *
 * */
package edu.up.cs301assignment1;

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

        // Find a reference to the seekbar text views
        TextView redProgress = findViewById(R.id.redseekprogress);
        TextView greenProgress = findViewById(R.id.greenseekbartext);
        TextView blueProgress = findViewById(R.id.blueseekbartext);

        // Find the Drawing view and the TextView for element names
        Drawing drawingView = findViewById(R.id.surfaceView4);
        TextView currentElementTextView = findViewById(R.id.textView11);

        // Set all textviews and seekbars to the listener
        ElementTouchListener controller = new ElementTouchListener(currentElementTextView, redProgress, greenProgress, blueProgress, redSeek, greenSeek, blueSeek, drawingView);

        // Connect the view to the controller
        drawingView.setOnTouchListener(controller);

        // Set changeListener to the seekBarUpdates
        redSeek.setOnSeekBarChangeListener(controller);
        greenSeek.setOnSeekBarChangeListener(controller);
        blueSeek.setOnSeekBarChangeListener(controller);

    }
}