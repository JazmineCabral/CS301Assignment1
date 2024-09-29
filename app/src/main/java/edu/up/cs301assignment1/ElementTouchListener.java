package edu.up.cs301assignment1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.graphics.Rect;

public class ElementTouchListener implements View.OnTouchListener {

    private final CustomElements[] elements;
    private final TextView textView;

    public ElementTouchListener(CustomElements[] elements, TextView textView) {
        this.elements = elements;
        this.textView = textView;
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            // Get touch coordinates
            int touchX = (int) event.getX();
            int touchY = (int) event.getY();

            for (CustomElements element : elements) {
                if (element instanceof Rectangle) { // Check if it's a Rectangle
                    Rectangle rectangle = (Rectangle) element; // Cast to Rectangle
                    if (rectangle.rect.contains(touchX, touchY)) {
                        // Update the TextView with the name of the touched element
                        textView.setText("Current Drawing Element: " + element.getName());
                        return true; // Touch was handled
                    }
                }
            }
        }
        return false; // Touch was not handled
}
}
