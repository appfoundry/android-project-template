package be.appfoundry.android.androidarchitecture;

import android.app.Application;

import timber.log.Timber;

/**
 * @author Filip Maelbrancke
 */
public class AppFoundryApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
