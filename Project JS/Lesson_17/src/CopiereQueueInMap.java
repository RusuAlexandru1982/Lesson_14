import java.util.*;

public class CopiereQueueInMap {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
            myQueue.add("Ana");
            myQueue.add("Ion");
            myQueue.add("Maria");

        Map<Integer, String> myMap = new HashMap<>();

            int counter = 1;


        while (!myQueue.isEmpty()) {
            String value = myQueue.poll();  // Extragem un element din Queue
            myMap.put(counter++, value);    // Adăugăm elementul în Map cu o cheie unică
        }

                System.out.println("Map cu conținutul din Queue: " + myMap);
    }
}