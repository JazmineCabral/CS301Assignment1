package edu.up.cs301assignment1;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.SeekBar;
import android.graphics.Rect;

public class ElementTouchListener implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {

    private final CustomElements[] elements;
    private final TextView textView;
    private final SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    protected CustomElements lastTouched;

    public ElementTouchListener(CustomElements[] elements,TextView textView, SeekBar redSeekBar, SeekBar greenSeekBar, SeekBar blueSeekBar) {
        this.elements = elements;
        this.textView = textView;
        this.redSeekBar = redSeekBar;
        this.greenSeekBar = greenSeekBar;
        this.blueSeekBar = blueSeekBar;
//        this.seekBarText = BarText;
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            // location of touch
            int touchX = (int) event.getX();
            int touchY = (int) event.getY();

            /*  IN CODE CITATION:
                Had to look up how to use the 'instanceof' operator and looked at definitions and
                some examples on javatpoint.com.
            * */

            /* checks for a rectangle, and updates the textview with the name of the element being touched. This code
               Does not work for triangle elements, but in this context they are so small and will always be black they did
                not need to be taken into account for the listener */
            for (int i = elements.length - 1; i >= 0; i--) {
                CustomElements elementsArray = elements[i];
                if (elementsArray instanceof Rectangle) { // Check if it's a Rectangle
                    Rectangle curRect = (Rectangle) elementsArray; // Cast to Rectangle
                    if (curRect.rect.contains(touchX, touchY)) {

                        // Update the TextView with the name of the touched elementsArray
                        textView.setText("Current Drawing Element: " + elementsArray.getName());

                        int curRectColor = curRect.getColor();

                        // Update the SeekBars to reflect the color of the tapped elementsArray
                        redSeekBar.setProgress(Color.red(curRectColor));
                        greenSeekBar.setProgress(Color.green(curRectColor));
                        blueSeekBar.setProgress(Color.blue(curRectColor));

                        return true; // Touch was handled
                    }
                }
            }
        }
        return false; // Touch was not handled
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        if (lastTouched != null) {
            // Get the current RGB values
            int red = redSeekBar.getProgress();
            int green = greenSeekBar.getProgress();
            int blue = blueSeekBar.getProgress();

            // Set the new color of the last touched element
            lastTouched.setColor(Color.rgb(red, green, blue));

        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
