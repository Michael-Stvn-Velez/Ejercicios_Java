// Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
// caracteres. Puedes hacer con o sin métodos de String. 

package punto6;

public class Main {
    public static void main(String[] args) {
        // Pedimos al usuario que introduzca una frase
        System.out.println("Introduce una frase: ");
        String frase = System.console().readLine();

        // Convertimos la frase a un array de caracteres
        char[] arrayCaracteres = frase.toCharArray();

        // Mostramos el contenido del array de caracteres
        System.out.println("Los caracteres de la frase son: ");
        for (int i = 0; i < arrayCaracteres.length; i++) {
            System.out.println("Posición " + i + ": " + arrayCaracteres[i]);
        }
    }

}
