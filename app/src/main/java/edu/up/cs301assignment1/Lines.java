package edu.up.cs301assignment1;

import android.graphics.Canvas;

public class Lines extends CustomElements {
    // Location of beginning and end of line
    private float startX, startY, endX, endY;

    public Lines(String Name, int color, float startX, float startY, float endX, float endY) {
        super(Name, color, (int) Math.min(startX, endX), (int) Math.min(startY, endY),
                (int) Math.max(startX, endX), (int) Math.max(startY, endY));
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    // Draw line to canvas
    @Override
    public void drawCanvas(Canvas canvas) {
        canvas.drawLine(startX, startY, endX, endY, myPaint);
    }
}