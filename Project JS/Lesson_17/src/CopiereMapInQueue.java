import java.util.*;

public class CopiereMapInQueue {
    public static void main(String[] args) {

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Ana", 25);
        originalMap.put("Ion", 30);
        originalMap.put("Maria", 22);


        Queue<Integer> valueQueue = new LinkedList<>();


        valueQueue.addAll(originalMap.values());


        System.out.println("Queue cu valorile: " + valueQueue);


        Queue<Map.Entry<String, Integer>> entryQueue = new LinkedList<>();


        entryQueue.addAll(originalMap.entrySet());


        System.out.println("Queue cu perechile cheie-valoare: " + entryQueue);
    }
}