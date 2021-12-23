package sk.missa.interfaces;

import static org.junit.Assert.assertEquals;
import static sk.missa.interfaces.Modlitby_obdobia.*;

import junit.framework.TestCase;

import org.junit.Test;

public class Modlitby_obdobiaTest extends TestCase {

    public void testModlitbyCezrok() {
        for (String[] strings : cezrokModlitby) {
            try {
                assertEquals(4, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testModlitbyPost(){
        for (String[] strings : postModlitby) {
            try {
                assertEquals(4, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testModlitbyVelkanoc() {
        for (String[] strings : velkanocModlitby) {
            try {
                assertEquals(4, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testModlitbyAdvent() {
        for (String[] strings : adventModlitby) {
            try {
                assertEquals(4, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

}