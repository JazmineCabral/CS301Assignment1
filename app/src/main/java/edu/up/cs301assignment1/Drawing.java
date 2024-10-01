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
    protected int whitePaint = 0xFFFFFFFF;
    protected  int greyPaint = 0xFF808080;
    protected int bluePaint = 0xFF0000FF;
    protected int pinkPaint = 0xFFF55995;
    protected int woodPaint = 0xFFCAAB94;
    protected int bookPaint = 0xFF800E13;
    protected int darkRed = 0xFF250902;

    // Rectangle Objects
    protected CustomElements pen;
    protected CustomElements penTip;
    protected CustomElements pencil;
    protected CustomElements pencilTip;
    protected CustomElements eraser;
    protected CustomElements eraser2;
    protected CustomElements book;
    protected CustomElements innerBook;
    protected CustomElements ruler;
    protected CustomElements phone;
    protected CustomElements phoneScreen;
    protected CustomElements phoneButton;
    protected CustomElements rulerLine1, rulerLine2, rulerLine3, rulerLine4, rulerLine5, rulerLine6, rulerLine7, rulerLine8;



    public Drawing(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        setBackgroundColor(0xFFFFFFFF);

        // Initialize the rectangle, triangle, and line objects
        pencil = new Rectangle("Pencil", yellowPaint, 200, 150, 600,180);
        //pencilTip = new Rectangle("Pencil Tip", blackPaint, 600, 155,630, 170);
        pencilTip = new Triangle("Pencil tip", blackPaint,600, 150, 650, 165, 600, 180 );
        eraser = new Rectangle("Eraser", pinkPaint, 150, 150 , 200, 180);
        pen = new Rectangle("Pen", bluePaint, 150, 210 , 600, 230);
        penTip = new Triangle("Pen tip", blackPaint, 600, 210, 630, 220, 600,230);
        book = new Rectangle("Book", bookPaint, 700, 210, 1100, 700);
        innerBook = new Rectangle("Inner Book", darkRed, 750, 240, 1050, 400);
        ruler = new Rectangle("Ruler", woodPaint, 1140, 255,1190, 650);
        phone = new Rectangle("Phone", greyPaint, 1300, 300, 1420, 550);
        phoneScreen = new Rectangle("Phone", blackPaint, 1310, 310, 1410, 540);
        phoneButton = new Rectangle("Phone Button", whitePaint,1350 , 515, 1370,535);
        eraser2 = new Rectangle("Eraser 2", pinkPaint, 350, 405, 420, 445);
        rulerLine1 = new Lines("Line 1", blackPaint,1140, 255, 1140, 650);
        rulerLine2 = new Lines("Line 2", blackPaint,1140, 270, 1160, 270);
        rulerLine3 = new Lines("Line 3", blackPaint,1140, 300, 1175, 300);
        rulerLine4 = new Lines("Line 4", blackPaint,1140, 350, 1160, 350);

        rulerLine5 = new Lines("Line 1", blackPaint,1140, 380, 1140, 380);
        rulerLine6 = new Lines("Line 2", blackPaint,1140, 410, 1160, 410);
        rulerLine7 = new Lines("Line 3", blackPaint,1140, 540, 1175, 540);
        rulerLine8 = new Lines("Line 4", blackPaint,1140, 580, 1160, 580);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // Draw to Canvas
        super.onDraw(canvas);
        pencil.drawCanvas(canvas);
        eraser.drawCanvas(canvas);
        pen.drawCanvas(canvas);
        penTip.drawCanvas(canvas);
        book.drawCanvas(canvas);
        innerBook.drawCanvas(canvas);
        ruler.drawCanvas(canvas);
        pencilTip.drawCanvas(canvas);
        eraser2.drawCanvas(canvas);
        phone.drawCanvas(canvas);
        phoneScreen.drawCanvas(canvas);
        phoneButton.drawCanvas(canvas);
        rulerLine1.drawCanvas(canvas);
        rulerLine2.drawCanvas(canvas);
        rulerLine3.drawCanvas(canvas);
        rulerLine4.drawCanvas(canvas);
        rulerLine5.drawCanvas(canvas);
        rulerLine6.drawCanvas(canvas);
        rulerLine7.drawCanvas(canvas);
        rulerLine8.drawCanvas(canvas);

    }

}
