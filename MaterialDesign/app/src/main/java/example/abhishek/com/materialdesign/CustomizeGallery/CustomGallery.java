package example.abhishek.com.materialdesign.CustomizeGallery;

import android.app.Application;
import android.content.Context;

/**
 * Created by Abhishek on 27-02-2016.
 */
public class CustomGallery extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return mContext;
    }
}