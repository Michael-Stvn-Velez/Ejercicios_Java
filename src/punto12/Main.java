// 12) Rellenar un array de numeros (int) usando el metodo fill de Arrays. 

package punto12;

public class Main {

    public static void main(String[] args) {
        // mostrar el mensaje de bienvenida
        System.out.println("Bienvenido al programa que rellena un array de números.");

        // crear un array de 10 elementos
        int[] array = new int[10];

        // rellenar el array con el número 5
        java.util.Arrays.fill(array, 5);

        // mostrar el contenido del array
        System.out.print("El array relleno es: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        // mostrar el mensaje de despedida
        System.out.println("Gracias por usar el programa.");
    }
    
}
