package ru.samsung.itschool.spacearrays;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Rocket {
    float x,y, vx, vy;
    Bitmap image;
    Canvas canvas;
    Rocket(float x, float y, Bitmap image){
        this.image=image;
        //this.canvas=canvas;
        this.x=x;
        this.y=y;
        vx = (float)(Math.random() * 0.5 -1);
        vy = (float)(Math.random() * 0.5 -1);
    }
    public void move(){
        x += vx;
        y += vy;
    }
    Paint paint = new Paint();
    public void draw(Canvas canvas)
    {
        Matrix matrix = new Matrix();
        matrix.setScale(0.2f, 0.2f);
        //Study mathematics, dear young programmer :)
        matrix.postRotate((float)Math.toDegrees(Math.atan2(vy, vx)) + 45);
        matrix.postTranslate(x, y);
        paint.setAlpha(255);
        canvas.drawBitmap(image, matrix, paint);
    }
}
