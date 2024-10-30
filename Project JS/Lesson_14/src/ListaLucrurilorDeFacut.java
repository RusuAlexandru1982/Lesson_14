import java.util.ArrayList;
import java.util.List;

public class ListaLucrurilorDeFacut {

    public static void main(String[] args) {
        List<String> lucruriDeFacut = obtineLucruriDeFacut();
        afiseazaListaLucrurilor(lucruriDeFacut);
    }

      public static List<String> obtineLucruriDeFacut() {
        List<String> lucruriDeFacut = new ArrayList<>();
        lucruriDeFacut.add("1. Merg la Serviciu");
        lucruriDeFacut.add("2. Termină raportul pentru muncă");
        lucruriDeFacut.add("3. Sună un prieten");
        lucruriDeFacut.add("4. de facut tema pentru acasa JS ");
        lucruriDeFacut.add("5. Sport");
        return lucruriDeFacut;
    }

    public static void afiseazaListaLucrurilor(List<String> lucruri) {
        System.out.println("CE lucruri trebuie de făcut astăzi:");
        for (String lucru : lucruri) {
            System.out.println(lucru);
        }
    }
}
