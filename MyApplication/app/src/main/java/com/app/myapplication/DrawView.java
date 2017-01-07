package com.app.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


/**
 * Created by Homsi Firas on 12/13/2016.
 *
 */
public class DrawView extends View {
    Paint paint = new Paint();
    Points points;
    Canvas canvas;
    public DrawView(Context context, Points param) {
        super(context);
        points=param;
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(8);

    }

    @Override
    public void onDraw(Canvas canvas2) {
        canvas=canvas2;
        canvas.drawLine(points.getAX(),points.getAY(),points.getBX(),points.getBY(),paint);


        canvas.drawLine(points.getBX(),points.getBY(),points.getFX(),points.getFY(),paint);
        canvas.drawLine(points.getBX(),points.getBY(),points.getCX(),points.getCY(),paint);
        canvas.drawLine(points.getDX(),points.getDY(),points.getAX(),points.getAY(),paint);
        canvas.drawLine(points.getDX(),points.getDY(),points.getCX(),points.getCY(),paint);
        canvas.drawLine(points.getEX(),points.getEY(),points.getDX(),points.getDY(),paint);
        canvas.drawLine(points.getEX(),points.getEY(),points.getFX(),points.getFY(),paint);
        canvas.drawText("Str Hossu",points.getAX()-10,points.getAY()-10,paint);
        canvas.drawText("Str Motilor",points.getDX()-10,points.getDY()-10,paint);


    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        super.setOnTouchListener(l);
        }

    @Override
    public void addOnLayoutChangeListener(OnLayoutChangeListener listener) {
        super.addOnLayoutChangeListener(listener);
    }


}
