package com.app.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvA;
    TextView tvB;
    TextView tvC;
    TextView tvD;
    TextView tvE;
    TextView tvF;
    Button btn;
    DrawView drawView;
    Points points;
    private float mPosX;
    private float mPosY;

    private float mLastTouchX;
    private float mLastTouchY;

    private int mActivePointerId = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize text views
        //our coordinates for now
        tvA = (TextView) findViewById(R.id.tvA);
        tvB = (TextView) findViewById(R.id.tvB);
        tvC = (TextView) findViewById(R.id.tvC);
        tvD = (TextView) findViewById(R.id.tvD);
        tvE = (TextView) findViewById(R.id.tvE);
        tvF = (TextView) findViewById(R.id.tvF);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDrawView();
            }
        });

    }

    @Override
    public View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);


    }



    public void setDrawView() {
        //get layout coordinates in order to draw lines between them
        points = new Points(tvA.getX(), tvA.getY(), tvB.getX(), tvB.getY(),
                tvC.getX(), tvC.getY(), tvD.getX(), tvD.getY(), tvE.getX(), tvE.getY(), tvF.getX(), tvF.getY());
        drawView = new DrawView(this, points);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);


    }

    public void setDrawImageonView(Points point) {
        //get layout coordinates in order to draw lines between them
        Points points = new Points(point.getAX(), point.getAY(), tvB.getX(), tvB.getY(),
                tvC.getX(), tvC.getY(), tvD.getX(), tvD.getY(), tvE.getX(), tvE.getY(), tvF.getX(), tvF.getY(),
                point.getStartX(), point.getStartY(),point.getFinishX(),point.getFinishY());
        DrawView2 drawView = new DrawView2(this, points);
        if (drawView.isDrawingCacheEnabled())
            drawView.destroyDrawingCache();
        drawView.buildDrawingCache();

        setContentView(drawView);


        System.out.println(tvA.getX() + "***");
        System.out.println(tvB.getY() + "***");
        System.out.println(points.getStartX() + "***");
        System.out.println(points.getStartY() + "***");
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        final int action = ev.getAction();
        switch (action & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN: {
                final float x = ev.getX();
                final float y = ev.getY();

                mLastTouchX = x;
                mLastTouchY = y;

                // Save the ID of this pointer
                mActivePointerId = ev.getPointerId(0);
                break;
            }

            case MotionEvent.ACTION_MOVE: {
                // Find the index of the active pointer and fetch its position
                final int pointerIndex = ev.findPointerIndex(mActivePointerId);
                final float x = ev.getX(pointerIndex);
                final float y = ev.getY(pointerIndex);

                final float dx = x - mLastTouchX;
                final float dy = y - mLastTouchY;

                mPosX += dx;
                mPosY += dy;

                mLastTouchX = x;
                mLastTouchY = y;

                //invalidate();
                break;
            }

            case MotionEvent.ACTION_UP: {
                mActivePointerId = -1;
                break;
            }

            case MotionEvent.ACTION_CANCEL: {
                mActivePointerId = -1;
                break;
            }

        }
        points.setStartX(mPosX);
                points.setStartY(mPosY);
                points.setFinishX(mLastTouchX);
                points.setFinishX(mLastTouchY);
                setDrawImageonView(points);
//        int pointerIndex = event.getActionIndex();
//
//        // get pointer ID
//        int pointerId = event.getPointerId(pointerIndex);
//
//        // get masked (not specific to a pointer) action
//        int maskedAction = event.getActionMasked();
//
//        switch (maskedAction) {
//
//            case MotionEvent.ACTION_DOWN:
//            case MotionEvent.ACTION_POINTER_DOWN: {
//                // TODO use data
//                PointF f = new PointF();
//                f.x = event.getX(pointerIndex);
//                f.y = event.getY(pointerIndex);
//                points.setStartX(f.x);
//                points.setStartY(f.y);
//                points.setFinishX(f.x);
//                points.setFinishX(f.y);
//                setDrawImageonView(points);
//
//               // mActivePointers.put(pointerId, f);
//                break;
//            }
//            case MotionEvent.ACTION_MOVE: { // a pointer was moved
//                // TODO use data
//                break;
//            }
//            case MotionEvent.ACTION_UP:
//            case MotionEvent.ACTION_POINTER_UP:
//            case MotionEvent.ACTION_CANCEL: {
//                // TODO use data
//                break;
//            }
//        }
       // invalidate();

        return true;
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                // PRESSED
//                points.setStartX(event.getRawX());
//                points.setStartY(event.getRawY() - 305);
//                setDrawImageonView(points);
//
//                return true;
//            case MotionEvent.ACTION_UP:
//                // RELEASED
//                return true;
//        }
//        return false;
    }
}
