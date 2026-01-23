import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> palabras = new HashMap<>();

        System.out.println("Ingrese un texto:");
        String texto = sc.nextLine();

        // Separar por comas
        String[] partes = texto.split(",");

        for (String palabra : partes) {
            palabra = palabra.toLowerCase(); // opcional: evitar mayúsculas

            if (palabras.containsKey(palabra)) {
                palabras.put(palabra, palabras.get(palabra) + 1);
            } else {
                palabras.put(palabra, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : palabras.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
