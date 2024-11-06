import java.util.HashMap;
import java.util.Map;

public class CopiereMap {
    public static void main(String[] args) {

        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("Ana", 25);
        originalMap.put("Ion", 30);
        originalMap.put("Maria", 22);


        Map<String, Integer> copiaMap = new HashMap<>();

                copiaMap.putAll(originalMap);


        System.out.println("Map original: " + originalMap);
        System.out.println("Map copiat: " + copiaMap);
    }
}