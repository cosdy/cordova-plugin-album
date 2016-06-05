package cc.cosdy.album;

import android.app.Activity;
import android.content.Context;

/**
 * 
 */
public class AppContext {

	private static Context context;

	public static void init(Activity activity) {
		context = activity.getApplicationContext();
	}

	public static Context getInstance(){
    return context;
  }
}