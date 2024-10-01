/*
 * Class: CS 301
 * Author: Jazmine Cabral
 * Date: 09/20/2024
 * Description: This class is not used at all in Part A, but I may use this in Part B.
 *
 * */
package edu.up.cs301assignment1;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;

public class Triangle extends CustomElements{
    public String myName;

    // Triangle coordinates
    private float x1, y1, x2, y2, x3, y3;

    // Constructor for the triangle
    public Triangle(String Name, int color, float x1, float y1, float x2, float y2, float x3, float y3) {
        super(Name, color, (int) Math.min(Math.min(x1, x2), x3), (int) Math.min(Math.min(y1, y2), y3),
                (int) Math.max(Math.max(x1, x2), x3), (int) Math.max(Math.max(y1, y2), y3));
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public void drawCanvas(Canvas canvas) {
        Path path = new Path();
        path.moveTo(x1, y1);
        path.lineTo(x2, y2);
        path.lineTo(x3, y3);
        path.close();
        canvas.drawPath(path, myPaint);
    }
}
