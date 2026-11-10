package exercitii;

import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sectiune2List {
    public static void ruleaza() {
        System.out.println("--- 2.1");
        puneDanPePrimaPozitie();
        System.out.println("--- 2.2");
        pozitiaLuiMariaSiZoe();
        System.out.println("--- 2.3");
        inlocuiesteIonCuEvaSiScoatePrimul();
        System.out.println("--- 2.4");
        citesteDupaUltimaPozitie();
        System.out.println("--- 2.5");
        deCeInterfataList();
    }

    private static void puneDanPePrimaPozitie() {
        List<String> l = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
        l.addFirst("Dan");
        System.out.println(l);
    }

    private static void pozitiaLuiMariaSiZoe() {
        List<String> l = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
        System.out.println(l.indexOf("Maria"));
        System.out.println(l.indexOf("Zoe"));       //-1 is false
    }

    private static void inlocuiesteIonCuEvaSiScoatePrimul() {
        List<String> l = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
        l.set(1, "Eva");
        l.remove(l.get(0));
        System.out.println(l);
    }

    private static void citesteDupaUltimaPozitie() {
        List<String> l = new ArrayList<>(Arrays.asList("Ana", "Ion", "Maria"));
        try{
            l.get(3);
        }catch (Exception ex){
            System.out.println(ex.toString());
        }
    }

    private static void deCeInterfataList() {


        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        mareste(arr);

        List<Integer> arrAsList = Arrays.asList(1, 2, 3);
        System.out.println(arrAsList.getClass());

        schimba(arr);
        schimba(arrAsList);

        try{
            mareste(arrAsList);
        } catch (UnsupportedOperationException ex){
            System.out.println(ex.toString());
        }
    }

    private static void mareste(List<Integer> l){

        l.add(4);
        System.out.println(l);

    }

    private static void schimba(List<Integer> l){

        l.set(0,9);         //replace index with value -- index 0, value 9;
        System.out.println(l);

    }

}
