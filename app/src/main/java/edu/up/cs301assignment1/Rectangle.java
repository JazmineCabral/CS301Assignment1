/*
 * Class: CS 301
 * Author: Jazmine Cabral
 * Date: 09/20/2024
 *
 * */
package edu.up.cs301assignment1;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceView;;

public class Rectangle extends CustomElements {
    protected String myName;
    public int left, right, top, bottom, color;
    public Rect rect;

    public Rectangle(String Name, int color, int left, int top, int right, int bottom){
        super(Name, color, left, top, right, bottom);
        this.rect = new Rect(left, top, right, bottom);
    }

    @Override
    public void drawCanvas(Canvas canvas) {
        canvas.drawRect(rect, myPaint);
    }
}
