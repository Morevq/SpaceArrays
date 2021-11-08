package ru.samsung.itschool.spacearrays;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyDraw extends View {

	public MyDraw(Context context) {
		super(context);
	}
	
	Paint paint = new Paint();
	Bitmap rocketImage = BitmapFactory.decodeResource(getResources(), R.drawable.rocket);

	Sky sky = new Sky();
	Rocket rocket = new Rocket(300,300,rocketImage);
	
	@Override
	protected void onDraw(Canvas canvas) {

		sky.draw(canvas);
		rocket.draw(canvas);
		rocket.move();

		// Запрос на перерисовку экрана
		invalidate();
	}
}
