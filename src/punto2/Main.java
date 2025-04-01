// 2) Crea un array de números donde le indicamos por teclado el tamaño del array, 
// rellenaremos el array con números aleatorios entre 0 y 9, al final muestra por pantalla 
// el valor de cada posición y la suma de todos los valores.  

package punto2;

public class Main {

    public static void main(String[] args) {

        // mostramos un mensaje de bienvenida
        System.out.println("Bienvenido al programa de suma de valores de un array.");

        // pidemos al usuario el tamaño del array
        System.out.println("Introduce el tamaño del array: ");

        // verificar que la entrada es un número entero positivo
        String entrada = System.console().readLine();
        while (!entrada.matches("\\d+")) {
            System.out.println("Por favor, introduce un número entero positivo.");
            entrada = System.console().readLine();
        }

        // convertimos la entrada a un número entero
        // y lo guardamos en la variable size
        int size = Integer.parseInt(entrada);

        // creamos el array con el tamaño indicado por el usuario
        int[] array = new int[size];
        // creamos la variable suma para guardar la suma de los valores del array   
        int suma = 0;

        // rellenamos el array con números aleatorios entre 0 y 9
        for (int i = 0; i < array.length; i++) {
            // generamos un número aleatorio entre 0 y 9
            array[i] = (int) (Math.random() * 10);
            // sumamos el valor del array a la variable suma
            suma += array[i];
        }

        // mostramos por pantalla el valor de cada posición del array
        System.out.println("Los valores del array son: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
        // mostramos por pantalla la suma de todos los valores del array
        System.out.println("La suma de todos los valores del array es: " + suma);

        // mostramos en parntalle un mensaje de despedida
        System.out.println("Fin del programa.");
    }
}
