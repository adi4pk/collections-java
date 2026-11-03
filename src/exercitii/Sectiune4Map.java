package exercitii;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sectiune4Map {
    public static void ruleaza() {
        System.out.println("--- 4.1");
        adaugaSiSuprascrie();
        System.out.println("--- 4.2");
        cautaCuGetSiGetOrDefault();
        System.out.println("--- 4.3");
        putIfAbsentSiNullPeDan();
        System.out.println("--- 4.4");
        scoateAnaDeDouaOri();
        System.out.println("--- 4.5");
        deCeInterfataMap();
    }

    private static void adaugaSiSuprascrie() {
        Map<String, Integer> d = new HashMap<>();
    }

    private static void cautaCuGetSiGetOrDefault() {
        Map<String, Integer> d = new HashMap<>();
        d.put("Ana", 9);
        d.put("Ion", 7);
    }

    private static void putIfAbsentSiNullPeDan() {
        Map<String, Integer> d = new HashMap<>();
        d.put("Ana", 9);
        d.put("Ion", 7);
    }

    private static void scoateAnaDeDouaOri() {
        Map<String, Integer> d = new HashMap<>();
        d.put("Ana", 9);
        d.put("Ion", 7);
    }

    private static void deCeInterfataMap() {
        Map<String, Integer> date = new LinkedHashMap<>();
        date.put("Zoe", 3);
        date.put("Ana", 9);
        date.put("Ion", 7);
    }
}
