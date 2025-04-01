// 14) Ordena un array de números con Sort de Arrays. 


package punto14;

public class Main {
    public static void main(String[] args) {
        // mostramos un mensaje de bienvenida
        System.out.println("Bienvenido al programa de ordenación de arrays.");

        // creamos un array de 10 números aleatorios
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // números aleatorios entre 0 y 99
        }

        // mostramos el array original
        System.out.print("Array original: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        // ordenamos el array
        java.util.Arrays.sort(numeros);
        
        // mostramos el array ordenado
        System.out.print("Array ordenado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        
        // mostramos un mensaje de despedida
        System.out.println();
        System.out.println("Gracias por usar el programa de ordenación de arrays.");

    }
}
