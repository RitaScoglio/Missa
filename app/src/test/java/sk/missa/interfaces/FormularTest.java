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

    public void testFormularSpevZmierenie(){
        for (String[] strings : spevFormularZmierenie) {
            try {
                assertEquals(5, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testFormularModlitbaZmierenie() {
        for (String[] strings : modlitbaFormularZmierenie) {
            try {
                assertEquals(4, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[0]);
                throw e;
            }
        }
    }

    public void testFormularZmierenieNames(){
        List<String> spevFormularZmierenieNames = new ArrayList<>();
        List<String> modlitbaFormularZmierenieNames = new ArrayList<>();
        for (String[] strings : spevFormularZmierenie) {
            spevFormularZmierenieNames.add(strings[0]);
        }
        for (String[] strings : modlitbaFormularZmierenie) {
            modlitbaFormularZmierenieNames.add(strings[0]);
        }
        for(int i = 0; i <spevFormularZmierenieNames.size(); i++){
            try {
                assertEquals(spevFormularZmierenieNames.get(i), modlitbaFormularZmierenieNames.get(i));
            } catch (AssertionError e){
                System.out.println(spevFormularZmierenieNames.get(i)+" -> "+ modlitbaFormularZmierenieNames.get(i));
                throw e;
            }
        }
    }

    public void testFormularSpevZosnuly(){
        for (String[] strings : spevFormularZosnuly) {
            try {
                //System.out.println("formArray.add(new String[]{\""+strings[0] + "\", \""+ strings[1] + "\", \"" + strings[2] + "\"});");
                assertEquals(7, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[2]);
                throw e;
            }
        }
    }

    public void testFormularModlitbaZosnuly() {
        for (String[] strings : modlitbaFormularZosnuly) {
            try {
                assertEquals(6, strings.length);
            } catch (AssertionError e) {
                System.out.println(strings[2]);
                throw e;
            }
        }
    }

    public void testFormularZosnulyNames(){
        List<String> spevFormularZosnulyNames = new ArrayList<>();
        List<String> modlitbaFormularZosnulyNames = new ArrayList<>();
        for (String[] strings : spevFormularZosnuly) {
            spevFormularZosnulyNames.add(strings[0]);
        }
        for (String[] strings : modlitbaFormularZosnuly) {
            modlitbaFormularZosnulyNames.add(strings[0]);
        }
        for(int i = 0; i <spevFormularZosnulyNames.size(); i++){
            try {
                assertEquals(spevFormularZosnulyNames.get(i), modlitbaFormularZosnulyNames.get(i));
            } catch (AssertionError e){
                System.out.println(spevFormularZosnulyNames.get(i)+" -> "+ modlitbaFormularZosnulyNames.get(i));
                throw e;
            }
        }
    }



}