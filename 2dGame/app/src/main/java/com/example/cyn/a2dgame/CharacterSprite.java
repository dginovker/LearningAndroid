package com.example.cyn.a2dgame;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class CharacterSprite {
    private Bitmap image;
    private int x,y;

    public CharacterSprite(Bitmap bmp)
    {
        this.image = bmp;
        x = 100;
        y = 100;
    }

    public void draw(Canvas canvas)
    {
        canvas.drawBitmap(image, x, y, null);
    }

    public void update() {
        y++;
    }
}
