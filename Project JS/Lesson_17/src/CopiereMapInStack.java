import java.util.*;

public class CopiereMapInStack {
    public static void main(String[] args) {

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Ana", 25);
        originalMap.put("Ion", 30);
        originalMap.put("Maria", 22);


        Stack<Integer> valueStack = new Stack<>();


        valueStack.addAll(originalMap.values());


        System.out.println("Stack cu valorile: " + valueStack);


        Stack<Map.Entry<String, Integer>> entryStack = new Stack<>();


        entryStack.addAll(originalMap.entrySet());


        System.out.println("Stack cu perechile valoare: " + entryStack);
    }
}