package com.app.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Alexandra on 12/17/2016.
 */
public class DrawView2 extends View {
    Paint paint = new Paint();
    Points points;
    Canvas canvas;

    public DrawView2(Context context, Points param) {
        super(context);
        points = param;
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(8);

    }

    @Override
    public void onDraw(Canvas canvas2) {
        canvas = canvas2;
        canvas.drawLine(points.getAX(), points.getAY(), points.getBX(), points.getBY(), paint);


        canvas.drawLine(points.getBX(), points.getBY(), points.getFX(), points.getFY(), paint);
        canvas.drawLine(points.getBX(), points.getBY(), points.getCX(), points.getCY(), paint);
        canvas.drawLine(points.getDX(), points.getDY(), points.getAX(), points.getAY(), paint);
        canvas.drawLine(points.getDX(), points.getDY(), points.getCX(), points.getCY(), paint);
        canvas.drawLine(points.getEX(), points.getEY(), points.getDX(), points.getDY(), paint);
        canvas.drawLine(points.getEX(), points.getEY(), points.getFX(), points.getFY(), paint);
        canvas.drawText("Str Hossu", points.getAX() - 10, points.getAY() - 10, paint);
        canvas.drawText("Str Motilor", points.getDX() - 10, points.getDY() - 10, paint);
        Paint paint1=new Paint();
        paint1.setStrokeWidth(30);
        paint1.setColor(Color.RED);
        canvas.drawPoint(points.getStartX(), points.getStartY(), paint1);
        canvas.drawPoint(points.getFinishX(), points.getFinishY(), paint1);

    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        super.setOnTouchListener(l);

        Toast.makeText(getContext(), "1111", Toast.LENGTH_LONG).show();
    }

    @Override
    public void addOnLayoutChangeListener(OnLayoutChangeListener listener) {
        super.addOnLayoutChangeListener(listener);
    }


}