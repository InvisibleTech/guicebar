package org.benihannachef.sp12;

import javax.inject.Inject;
import javax.inject.Provider;

public class MainHull {
    private final WarpNacelle engine;
    private final Provider<Shuttle> shuttleProvider;
    
    @Inject
    public MainHull(WarpNacelle engine, Provider<Shuttle> shuttleProvider) {
        this.engine = engine;
        this.shuttleProvider = shuttleProvider;
    }

    public WarpNacelle getEngine() {
        return engine;
    }
    
    public Shuttle getShuttle() {
        return shuttleProvider.get();
    }
}
