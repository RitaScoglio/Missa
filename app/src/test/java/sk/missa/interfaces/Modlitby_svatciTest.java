package sk.missa.interfaces;

import static sk.missa.interfaces.Modlitby_svatci.*;
import static sk.missa.interfaces.Svatci.*;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Modlitby_svatciTest extends TestCase {

    public void testModlitbyPohyb() {
        for (int i = 0; i < modlitbaPohyb.length; i++) {
            try {
                assertEquals(5, modlitbaPohyb[i].length);
            } catch (AssertionError e) {
                System.out.println(modlitbaPohyb[i][0]);
                throw e;
            }
        }
    }
    String[][][] list = new String[][][]{modlitba1, modlitba2, modlitba3, modlitba4,
            modlitba5, modlitba6, modlitba7, modlitba8, modlitba9, modlitba10, modlitba11, modlitba12};
    public void testModlitbyMonthsLength() {
        for (String[][] strings : list) {
            for (String[] string : strings) {
                try {
                    assertEquals(4, string.length);
                } catch (AssertionError e) {
                    System.out.println(string[0] + string[1]);
                    throw e;
                }
            }
        }
    }

    String[][][] months = new String[][][]{month1, month2, month3, month4, month5, month6, month7,
            month8, month9, month10, month11, month12};
    public void testModlitbyMonthsIDs() {
        for (int i = 0; i <list.length; i++) {
            List<String> IDs = new ArrayList<>();
            for (int k = 0; k < months[i].length; k++){
                IDs.add(months[i][k][0]);
            }
            for (int j = 0; j < list[i].length; j++) {
                try {
                    if(i==11 && !isAdventSpecial(list[i][j][0], 10))
                        assertTrue(IDs.contains(list[i][j][0]));
                } catch (AssertionError e) {
                    System.out.println("Month " + (i+1) + " " +list[i][j][0]);
                    throw e;
                }
            }
        }
    }

    public static boolean isAdventSpecial(String s, int radix) {
        if(s.isEmpty()) return false;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 && s.charAt(i) == '-') {
                if(s.length() == 1) return false;
                else continue;
            }
            if(Character.digit(s.charAt(i),radix) < 0) return false;
        }
        return Integer.parseInt(s) >= 17;
    }
}