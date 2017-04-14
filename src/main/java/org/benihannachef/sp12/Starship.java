package org.benihannachef.sp12;

import javax.inject.Inject;

public class Starship {
private final Saucer saucer;
private final MainHull mainHull;

@Inject
public Starship(Saucer saucer, MainHull mainHull) {
    this.saucer = saucer;
    this.mainHull = mainHull;
}

public Saucer getSaucer() {
    return saucer;
}

public MainHull getMainHull() {
    return mainHull;
}


}
