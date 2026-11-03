package exercitii;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Sectiune5QueueDeque {
    public static void ruleaza() {
        System.out.println("--- 5.1");
        servesteUnClient();
        System.out.println("--- 5.2");
        stivaPopPeekSiParcurgere();
        System.out.println("--- 5.3");
        scoateToataCoada();
        System.out.println("--- 5.4");
        scoateDinGol();
    }

    private static void servesteUnClient() {
        Queue<String> q = new ArrayDeque<>();
        q.offer("Ana");
        q.offer("Ion");
        q.offer("Maria");
    }

    private static void stivaPopPeekSiParcurgere() {
        Deque<String> s = new ArrayDeque<>();
        s.push("Ana");
        s.push("Ion");
        s.push("Maria");
    }

    private static void scoateToataCoada() {
        Queue<String> q = new ArrayDeque<>();
        q.offer("Ana");
        q.offer("Ion");
        q.offer("Maria");
    }

    private static void scoateDinGol() {
    }
}
