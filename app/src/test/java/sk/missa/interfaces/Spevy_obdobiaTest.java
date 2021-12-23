package sk.missa.interfaces;

import static sk.missa.interfaces.Spevy_obdobia.*;

import junit.framework.TestCase;

public class Spevy_obdobiaTest extends TestCase {

    public void testSpevyCezrok() {
        for (String[] strings : cezrokSpev) {
            try {
                assertEquals(5, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testSpevyPost(){
        for (String[] strings : postSpev) {
            try {
                assertEquals(5, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testSpevVelkanoc() {
        for (String[] strings : velkanocSpev) {
            try {
                assertEquals(5, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testSpevAdvent() {
        for (String[] strings : adventSpev) {
            try {
                assertEquals(5, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

}