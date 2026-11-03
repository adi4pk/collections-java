package exemple;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExempluMap {
    public static void ruleaza() {
        demo("HashMap", new HashMap<>());
        demo("LinkedHashMap", new LinkedHashMap<>());
        demo("TreeMap", new TreeMap<>());
    }

    private static void demo(String clasa, Map<String, Integer> preturi) {
        System.out.println("== " + clasa);
        preturi.put("paine", 4);
        preturi.put("lapte", 7);
        preturi.put("ou", 1);
        System.out.println("put(paine, 5) intoarce: " + preturi.put("paine", 5));
        System.out.println("Elemente: " + preturi);
        System.out.println("size(): " + preturi.size() + ", get(paine): " + preturi.get("paine"));
        System.out.println("get(unt): " + preturi.get("unt"));
        System.out.println("getOrDefault(unt, 0): " + preturi.getOrDefault("unt", 0));
        System.out.println("containsKey(ou): " + preturi.containsKey("ou"));
        System.out.println("remove(ou) intoarce: " + preturi.remove("ou"));
        System.out.println("putIfAbsent(lapte, 8) intoarce: " + preturi.putIfAbsent("lapte", 8));
        System.out.println("Elemente: " + preturi);
        try {
            int pret = preturi.get("unt");
            System.out.println(pret);
        } catch (Exception e) {
            System.out.println("int pret = preturi.get(unt): " + e.getClass().getSimpleName());
        }
        for (Map.Entry<String, Integer> intrare : preturi.entrySet()) {
            System.out.println(intrare.getKey() + " = " + intrare.getValue());
        }
    }
}
