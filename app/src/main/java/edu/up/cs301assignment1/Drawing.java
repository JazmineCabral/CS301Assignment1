/*
* Class: CS 301
* Author: Jazmine Cabral
* Date: 09/20/2024
*
* */
package edu.up.cs301assignment1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;

public class Drawing extends SurfaceView {
    // Color for Rectangle Objects
    protected int yellowPaint = 0xFFFDB600;
    protected int blackPaint = 0xFF000000;
    protected  int greyPaint = 0xFF808080;
    protected int bluePaint = 0xFF0000FF;
    protected int pinkPaint = 0xFFF55995;
    protected int woodPaint = 0xFFCAAB94;
    protected int bookPaint = 0xFF800E13;
    protected int darkRed = 0xFF250902;

    // Rectangle Objects
    protected CustomElements pen;
    protected CustomElements pencil;
    protected CustomElements pencilTip;
    protected CustomElements eraser;
    protected CustomElements eraser2;
    protected CustomElements book;
    protected CustomElements innerBook;
    protected CustomElements ruler;
    protected CustomElements phone;

    public Drawing(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        setBackgroundColor(0xFFFFFFFF);

        // Initialize the rectangle objects
        pencil = new Rectangle("Pencil", yellowPaint, 200, 150, 600,180);
        pencilTip = new Rectangle("Pencil Tip", blackPaint, 600, 155,630, 170);
        eraser = new Rectangle("Eraser", pinkPaint, 150, 150 , 200, 180);
        pen = new Rectangle("Pen", bluePaint, 150, 210 , 600, 230);
        book = new Rectangle("Book", bookPaint, 700, 210, 1100, 700);
        innerBook = new Rectangle("Inner Book", darkRed, 750, 240, 1050, 400);
        ruler = new Rectangle("Ruler", woodPaint, 1140, 255,1190, 650);
        phone = new Rectangle("Phone", greyPaint, 1300, 300, 1420, 550);
        eraser2 = new Rectangle("Eraser 2", pinkPaint, 350, 410, 410, 440);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // Draw to Canvas
        super.onDraw(canvas);
        pencil.drawCanvas(canvas);
        eraser.drawCanvas(canvas);
        pen.drawCanvas(canvas);
        book.drawCanvas(canvas);
        innerBook.drawCanvas(canvas);
        ruler.drawCanvas(canvas);
        pencilTip.drawCanvas(canvas);
        eraser2.drawCanvas(canvas);
        phone.drawCanvas(canvas);

    }

}
