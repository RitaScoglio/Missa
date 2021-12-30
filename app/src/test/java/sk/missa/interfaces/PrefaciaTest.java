package sk.missa.interfaces;

import static sk.missa.interfaces.Prefacia.*;

import junit.framework.TestCase;

public class PrefaciaTest extends TestCase {

    public void testPrefacie(){
        for (String[] strings : prefacie) {
            try {
                //System.out.println(strings[2]);
                assertEquals(4, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[1]);
                throw e;
            }
        }
    }

    public void testPrefacieIndex(){
        for (int i = 0; i <prefacie.length; i++) {
            System.out.println(i+": "+prefacie[i][0] + " "+prefacie[i][1]);
        }
    }


}