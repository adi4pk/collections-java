package exemple;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ExempluQueueDeque {
    public static void ruleaza() {
        Queue<String> printari = new ArrayDeque<>();
        printari.offer("raport");
        printari.offer("poza");
        printari.offer("bilet");
        System.out.println("Coada: " + printari);
        System.out.println("peek(): " + printari.peek());
        System.out.println("poll(): " + printari.poll());
        System.out.println("size(): " + printari.size());

        Deque<String> anulari = new ArrayDeque<>();
        anulari.push("scrie");
        anulari.push("sterge");
        anulari.push("lipeste");
        System.out.println("Stiva (de la varf): " + anulari);
        System.out.println("peek(): " + anulari.peek());
        System.out.println("pop(): " + anulari.pop());
        System.out.println("size(): " + anulari.size());

        Deque<String> rand = new ArrayDeque<>();
        rand.offer("Ion");
        rand.offer("Maria");
        rand.offerFirst("Ana");
        rand.offerLast("Dan");
        System.out.println("Deque pe ambele capete: " + rand);
        System.out.println("pollLast(): " + rand.pollLast());
        System.out.println("Rand: " + rand);

        Queue<String> goala = new ArrayDeque<>();
        System.out.println("poll() pe coada goala: " + goala.poll());
        System.out.println("peek() pe coada goala: " + goala.peek());
        try {
            goala.remove();
        } catch (Exception e) {
            System.out.println("remove() pe coada goala: " + e.getClass().getSimpleName());
        }
    }
}
