package cc.cosdy.album;

import android.app.Application;

/**
 * xxx
 */
public class AppContext extends Application {
    private static AppContext instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static AppContext getInstance(){
        return instance;
    }
}
