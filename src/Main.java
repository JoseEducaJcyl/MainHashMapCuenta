import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarmos un scanner
        Scanner sc = new Scanner(System.in);
        //Declaramos un Map "palabras"
        Map<String, Integer> palabras = new HashMap<>();

        //Le pedimos al usuario que introduzca un texto
        System.out.println("Ingrese un texto:");
        String texto = sc.nextLine();

        //Se añade a un lista "partes" que se  
        //separan por comas las partes del texto
        String[] partes = texto.split(",");

        //Se recorre la lista y se cuenta cuantas veces 
        //se repite la palabra 
        for (String palabra : partes) {
            palabra = palabra.toLowerCase(); // opcional: evitar mayúsculas

            if (palabras.containsKey(palabra)) {
                palabras.put(palabra, palabras.get(palabra) + 1);
            } else {
                palabras.put(palabra, 1);
            }
        }

        //Se muestra los resultados 
        for (Map.Entry<String, Integer> entry : palabras.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
