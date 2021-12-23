package sk.missa.interfaces;

import static sk.missa.interfaces.Formular.*;

import junit.framework.TestCase;

import org.junit.Test;

public class FormularTest extends TestCase {

    public void testFormularLength(){
        assertEquals(spevFormular.length, modlitbaFormular.length);
    }

    public void testFormularSpev(){
        for (String[] strings : spevFormular) {
            try {
                //System.out.println(strings[2]);
                assertEquals(7, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[2]);
                throw e;
            }
        }
    }

    public void testFormularModlitba(){
        for (String[] strings : modlitbaFormular) {
            try {
                assertEquals(6, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[2]);
                throw e;
            }
        }
    }
    public void testFormularProsby(){
        for (String[] strings : prosbyFormular) {
            try {
                assertTrue(strings.length == 4 ||
                        strings.length % 6 == 1);
            } catch (AssertionError e) {
                System.out.println(strings[2]);
                throw e;
            }
        }
    }

}