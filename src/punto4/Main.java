// 4) Crea un array de números de 100 posiciones, que contendrá los números del 1 al 
// 100. Obtén la suma de todos ellos y la media. 

package punto4;

public class Main {
    public static void main(String[] args) {
        // mostrar mensaje de bienvenida
        System.out.println("Bienvenido punto 4");

        // crear un array de 100 posiciones
        int[] numeros = new int[100];
        // rellenar el array con los números del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // sumar los números del array
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        // calcular la media
        double media = (double) suma / numeros.length;
        // mostrar la suma y la media
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
        System.out.println("La media de los números del 1 al 100 es: " + media);

        // mostrar mensaje de despedida
        System.out.println("Gracias por usar el programa. Hasta luego.");
    }
}
