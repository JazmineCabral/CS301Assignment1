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
import android.view.SurfaceView;

public class Drawing extends SurfaceView {
    // ADD COLORS HERE
    private int brownPaint = 0xFF432704;
    private int yellowPaint = 0xFFFDB600;
    private int darkBrownPaint ;
    private int blackPaint = 0xFF000000;
    private int bluePaint = 0xFF0000FF;
    private int pinkPaint = 0xFFF55995;
    private int woodPaint = 0xFFCAAB94;
    private int bookPaint = 0xFF800E13;
    private int darkRed = 0xFF250902;
    private CustomElements table;
    private CustomElements pen;
    private CustomElements pencil;
    private CustomElements pencilTip;
    private CustomElements eraser;
    private CustomElements eraser2;
    private CustomElements book;
    private CustomElements innerBook;
    private CustomElements ruler;

    public Drawing(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        setBackgroundColor(0xFFFFFFFF);

        // Initialize the table rectangle
        table = new Rectangle("Table", brownPaint, 100, 100, 1900, 800);
        pencil = new Rectangle("Pencil", yellowPaint, 200, 150, 600,180);
        pencilTip = new Rectangle("Pencil Tip", blackPaint, 600, 155,630, 170);
        eraser = new Rectangle("Eraser", pinkPaint, 150, 150 , 200, 180);
        pen = new Rectangle("Pen", bluePaint, 150, 210 , 600, 230);
        book = new Rectangle("Book", bookPaint, 700, 210, 1100, 700);
        innerBook = new Rectangle("Inner Book", darkRed, 750, 240, 1050, 400);
        ruler = new Rectangle("Ruler", woodPaint, 1140, 255,1190, 650);
        eraser2 = new Rectangle("Eraser 2", pinkPaint, 350, 410, 410, 440);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        table.drawCanvas(canvas);
        pencil.drawCanvas(canvas);
        eraser.drawCanvas(canvas);
        pen.drawCanvas(canvas);
        book.drawCanvas(canvas);
        innerBook.drawCanvas(canvas);
        ruler.drawCanvas(canvas);
        pencilTip.drawCanvas(canvas);
        eraser2.drawCanvas(canvas);




//        canvas.drawRect(100, 100, 700, 400, brownPaint); // Table
//
//        canvas.drawRect(100, 100, 700, 400, darkBrownPaint); // Table outline
//
//        canvas.drawRect(120, 150, 180, 160, yellowPaint); // Pencil body
//
//        canvas.drawRect(175, 150, 180, 160, darkBrownPaint); // Pencil tip
//
//        canvas.drawRect(200, 200, 250, 210, bluePaint); // Pen
//
//        canvas.drawRect(300, 150, 330, 170, pinkPaint); // Eraser
//
//        canvas.drawRect(400, 250, 550, 260, woodPaint); // Ruler
//
//        canvas.drawRect(500, 150, 650, 250, bookPaint); // Book
    }

}
