package org.benihannachef.sp12;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class StarshipTest {

    @Test
    public void test() {
        Injector injector = Guice.createInjector(); 
        
        assertNotNull(injector);
        
        Starship starship = injector.getInstance(Starship.class);
        assertNotNull(starship);
        assertNotNull(starship.getSaucer());
        assertNotNull(starship.getMainHull());
        assertNotNull(starship.getMainHull().getEngine());
        assertSame(starship.getMainHull().getEngine(), starship.getMainHull().getEngine());
        assertNotNull(starship.getMainHull().getShuttle());
        assertNotSame(starship.getMainHull().getShuttle(), starship.getMainHull().getShuttle());
    }

}
