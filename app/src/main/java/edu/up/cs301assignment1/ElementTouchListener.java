package edu.up.cs301assignment1;

import android.graphics.Color;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.SeekBar;
import android.graphics.Rect;

public class ElementTouchListener implements View.OnTouchListener, SeekBar.OnSeekBarChangeListener {
    // Instance variables
    private final TextView textView, redSeekBarText, greenSeekBarText, blueSeekBarText;
    private final SeekBar redSeekBar, greenSeekBar, blueSeekBar;
    protected CustomElements lastTouched;
    private Drawing draw;

    // Constructor
    public ElementTouchListener(TextView textView, TextView redSeekBarText, TextView greenSeekBarText, TextView blueSeekBarText, SeekBar redSeekBar, SeekBar greenSeekBar, SeekBar blueSeekBar, Drawing draw) {
        this.textView = textView;
        this.redSeekBar = redSeekBar;
        this.greenSeekBar = greenSeekBar;
        this.blueSeekBar = blueSeekBar;
        this.draw = draw;
        this.redSeekBarText = redSeekBarText;
        this.greenSeekBarText = greenSeekBarText;
        this.blueSeekBarText = blueSeekBarText;

    }

    /** onTouch will display the currently touched drawn elements rbg values to their
     * corresponding seekbar **/
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
            for (int i = draw.elements.length - 1; i >= 0; i--) {
                CustomElements elementsArray = draw.elements[i];
                if (elementsArray instanceof Rectangle) {
                    Rectangle curRect = (Rectangle) elementsArray;
                    if (curRect.rect.contains(touchX, touchY)) {
                        lastTouched = elementsArray;

                        // Update the TextView with the name of the touched elementsArray
                        textView.setText("Current Drawing Element: " + elementsArray.getName());

                        int curRectColor = lastTouched.getColor();

                        // Update the SeekBars to reflect the color of the tapped elementsArray
                        redSeekBar.setProgress(Color.red(curRectColor));
                        greenSeekBar.setProgress(Color.green(curRectColor));
                        blueSeekBar.setProgress(Color.blue(curRectColor));

                        return true;
                    }
                }
            }

        }
        return false;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        if (lastTouched != null) {
            // Get rgb values
            int red = redSeekBar.getProgress();
            int green = greenSeekBar.getProgress();
            int blue = blueSeekBar.getProgress();


            // Set the new color of the last touched element
            lastTouched.myPaint.setColor(Color.rgb(red, green, blue));

            redSeekBarText.setText("Progress: " + red);
            greenSeekBarText.setText("Progress: " + green);
            blueSeekBarText.setText("Progress: " + blue);

            draw.invalidate();
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
