package com.burcuerdogan.makesmallerimage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public Bitmap makeSmallerImage(Bitmap image, int maximumSize) {

        int width = image.getWidth();
        int height = image.getHeight();

        float bitmapRatio = (float) width/ (float) height;

        if (bitmapRatio > 1){
            //Landscape Image
            width = maximumSize;
            height = (int) (width / bitmapRatio);

        } else {
            //Portrait Image
            height = maximumSize;
            width = (int) (height * bitmapRatio);
        }

        return image.createScaledBitmap(image, width, height, true);
    }
}