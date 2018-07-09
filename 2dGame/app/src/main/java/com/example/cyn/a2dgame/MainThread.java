package com.example.cyn.a2dgame;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class MainThread extends Thread {
    private SurfaceHolder surfaceHolder;
    private GameView gameView;
    private boolean running;
    private static Canvas canvas;

    public MainThread(SurfaceHolder surfaceHolder, GameView gameView)
    {
        super();
        this.surfaceHolder = surfaceHolder;
        this.gameView = gameView;
    }

    @Override
    public void run()
    {
        while (running)
        {
            canvas = null;

            try {
                canvas = this.surfaceHolder.lockCanvas();
            }
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
