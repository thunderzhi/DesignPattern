package org.example;

import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        C c = new C();
//        c.f();     // output: A: doing f()
//        c.g();     // output: A: doing g()
//        c.toB();
//        c.f();     // output: B: doing f()
//        c.g();     // output: B: doing g()
        GoodNotifier goodNotifier = new GoodNotifier();
        PlayingGameListener playingGameListener = new PlayingGameListener();
        WatchingTVListener watchingTVListener = new WatchingTVListener();
        goodNotifier.addListener(playingGameListener,"stopPlayingGame",new Date());
        goodNotifier.addListener(watchingTVListener,"stopWatchingTV",new Date());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        goodNotifier.notifyX();

    }
}
