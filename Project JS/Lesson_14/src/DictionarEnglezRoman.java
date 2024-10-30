import java.util.HashMap;
import java.util.Map;

public class DictionarEnglezRoman {

    public static void main(String[] args) {
        // Creăm dicționarul englez-român
        Map<String, String> dictionar = new HashMap<>();


        dictionar.put("apple", "măr");
        dictionar.put("banana", "banană");
        dictionar.put("orange", "portocală");
        dictionar.put("grape", "strugure");
        dictionar.put("pear", "pară");
        dictionar.put("strawberry", "căpșună");
        dictionar.put("watermelon", "pepene");


         afiseazaDictionar(dictionar);
    }

    public static void afiseazaDictionar(Map<String, String> dictionar) {
        System.out.println("Dicționar Englez-Român:");
        for (Map.Entry<String, String> entry : dictionar.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
