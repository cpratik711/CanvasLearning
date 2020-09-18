package com.example.canvaslearning;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;


public class MyView extends View {
    Path mPath;


    Paint mPaint;

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(14);





       /* Point p1 = new Point((int) pxFromDp(context, 80) + (screenWidth / 2), (int) pxFromDp(context, 40));
        mPath = new Path();
        mPath.moveTo(p1.x, p1.y);
        mPath.lineTo(p2.x, p2.y);
        mPath.lineTo(p3.x, p3.y);
        mPath.close();*/

        canvas.drawLine(250, 250, 400, 400, mPaint);

        RectF rectF = new RectF(100, 100, 200, 800);


        int screenWidth= getWidth();
        int screenHeight = getHeight();
        RectF mRectF = new RectF(screenWidth / 4, screenHeight / 3, screenWidth / 6, screenHeight / 2);
     //   canvas.drawRect(rectF, mPaint);
        canvas.drawRoundRect(mRectF, 12, 12, mPaint);
    }

    public static float pxFromDp(final Context context, final float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }
}


