package com.gulci.defender;

import android.content.Context;
import android.view.SurfaceView;

public class DefenderView extends SurfaceView implements Runnable {

    // volatile - możliwość odwołania się do zmiennej spoza wątku
    volatile boolean playing;
    Thread gameThread = null;

    public DefenderView(Context context) {
        super(context);

        playing = true;
    }

    @Override
    public void run() {
        while(playing) {
            update();
            draw();
            control();
        }
    }

    private void update() {

    }

    private void draw() {

    }

    private void control() {

    }

    public void pause() {
        playing = false;
        try {
            gameThread.join();
        }
        catch(InterruptedException e) {

        }
    }

    public void resume() {
        playing = true;
        gameThread = new Thread(this);
        gameThread.start();
    }
}
