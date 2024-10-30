import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ValoriUnice {

    public static void main(String[] args) {

        List<String> listaInitiala = new ArrayList<>();
        listaInitiala.add("Luni");
        listaInitiala.add("Marti");
        listaInitiala.add("Luni");
        listaInitiala.add("Miercuri");
        listaInitiala.add("Marti");
        listaInitiala.add("Joi");
        listaInitiala.add("Vineti");
        listaInitiala.add("Simbata");
        listaInitiala.add("Duminica");

        Collection<String> valoriUnice = obtineValoriUnice(listaInitiala);

        afiseazaValoriUnice(valoriUnice);
    }

    public static Collection<String> obtineValoriUnice(List<String> lista) {
        return new HashSet<>(lista);
    }

    public static void afiseazaValoriUnice(Collection<String> valoriUnice) {
        System.out.println("Valori unice:");
        for (String valoare : valoriUnice) {
            System.out.println(valoare);
        }
    }
}