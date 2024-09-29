/*
 * Class: CS 301
 * Author: Jazmine Cabral
 * Date: 09/20/2024
 *
 * */
package edu.up.cs301assignment1;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint;

public abstract class CustomElements {

    // Instance Variables: All qualities that apply to all subclasses
    protected Paint myPaint = new Paint();
    protected String myName;
    protected int left, top, right, bottom;

    public CustomElements(String Name, int Color, int left, int top, int right, int bottom){
        this.myName = Name;
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        setColor(Color);

    }

    /*  In Code Citation: I used code provided to us from Nuxoll's CustomElements class.
    *   Methods like getName(), setColor(), and getColor were directly from Nux's code.
    */

    public String getName() {
        return this.myName;
    }

    public void setColor(int color) {

        // ignore request if it's not a new color (this keeps the undo queue
        // clean)
        if (color == myPaint.getColor())
            return;

        // make the change
        this.myPaint.setColor(color);
    }

    /** get the color */
    public int getColor() {
        return this.myPaint.getColor();
    }



    public abstract void drawCanvas(Canvas canvas);


}
