package ru.samsung.itschool.spacearrays;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Sky {
    int num=500,X,Y;
    int x[] = new int[num];
    int y[] = new int[num];
    int alpha[] = new int[num];

    Sky(){
        X = 2000;
        Y = 2000;
        for (int i = 0; i < num; i++)
        {
            x[i] = (int)(Math.random() * X);
            y[i] = (int)(Math.random() * Y);
            alpha[i] = (int)(Math.random() * 256);
        }
    }
    Paint paint = new Paint();
    public void draw(Canvas canvas)
    {
        canvas.drawColor(Color.BLACK);
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(2);
        for (int i = 0; i < num; i++)
        {
            paint.setAlpha(alpha[i]);
            alpha[i] += (int)(Math.random() * 11) - 5;
            if (alpha[i] > 255) alpha[i] = 255;
            if (alpha[i] < 0) alpha[i] = 0;
            canvas.drawCircle(x[i], y[i], 3, paint);
        }
    }
}
