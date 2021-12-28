package sk.missa.interfaces;

import static sk.missa.interfaces.Formular.*;

import junit.framework.TestCase;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FormularTest extends TestCase {

    public void testFormularLength(){
        assertEquals(spevFormular.length, modlitbaFormular.length, prosbyFormular.length);
    }

    public void testFormularNames(){
        List<String> spevFormularNames = new ArrayList<>();
        List<String> modlitbaFormularNames = new ArrayList<>();
        List<String> prosbyFormularNames = new ArrayList<>();
        for (String[] strings : spevFormular) {
            spevFormularNames.add(strings[2]);
        }
        for (String[] strings : modlitbaFormular) {
            modlitbaFormularNames.add(strings[2]);
        }
        for (String[] strings : prosbyFormular) {
            prosbyFormularNames.add(strings[2]);
        }
        for(int i = 0; i <spevFormularNames.size(); i++){
            try {
                assertEquals(spevFormularNames.get(i), modlitbaFormularNames.get(i), prosbyFormularNames.get(i));
            } catch (AssertionError e){
                System.out.println(spevFormularNames.get(i)+" -> "+ modlitbaFormularNames.get(i)+ " -> " + prosbyFormularNames.get(i));
                throw e;
            }
        }
    }

    public void testFormularNumbers(){
        List<String> spevFormularNumbers = new ArrayList<>();
        List<String> modlitbaFormularNumbers = new ArrayList<>();
        List<String> prosbyFormularNumbers = new ArrayList<>();
        for (String[] strings : spevFormular) {
            spevFormularNumbers.add(strings[0]);
        }
        for (String[] strings : modlitbaFormular) {
            modlitbaFormularNumbers.add(strings[0]);
        }
        for (String[] strings : prosbyFormular) {
            prosbyFormularNumbers.add(strings[0]);
        }
        for(int i = 0; i <spevFormularNumbers.size(); i++){
            try {
                assertEquals(spevFormularNumbers.get(i), modlitbaFormularNumbers.get(i), prosbyFormularNumbers.get(i));
            } catch (AssertionError e){
                System.out.println(spevFormularNumbers.get(i)+" -> "+ modlitbaFormularNumbers.get(i)+ " -> " + prosbyFormularNumbers.get(i));
                throw e;
            }
        }
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