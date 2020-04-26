package org.bubenheimer.desugaring;

import android.util.Log;

import java.util.function.Supplier;

import androidx.multidex.MultiDexApplication;

public class App extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();

        final Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return "supplied value";
            }
        };

        Log.d(App.class.getSimpleName(), supplier.get());
    }
}
