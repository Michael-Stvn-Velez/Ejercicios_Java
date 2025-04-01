// 8) Crea un array de números de un tamaño pasado por teclado, el array contendrá 
// números aleatorios entre 1 y 300 y mostrar aquellos números que acaben en un dígito 
// que nosotros le indiquemos por teclado (debes controlar que se introduce un numero 
// correcto), estos deben guardarse en un nuevo array. 
// Por ejemplo, en un array de 10 posiciones e indicamos mostrar los números 
// acabados en 5, podría salir 155, 25, etc. 

package punto8;

public class Main {
    public static void main(String[] args) {
        // mostramos un mensaje de bienvenida
        System.out.println("Bienvenido al programa de números aleatorios.");

        // pedimos al usuario el tamaño del array
        System.out.println("Introduce el tamaño del array: ");
        // guardadr string de entrada
        String entrada = System.console().readLine();
        // verificar que la entrada es un número entero positivo  
        while (!entrada.matches("\\d+")) {
            System.out.println("Por favor, introduce un número entero positivo.");
            entrada = System.console().readLine();
        }
        // convertimos la entrada a un número entero
        int size = Integer.parseInt(entrada);
        // creamos el array con el tamaño indicado por el usuario
        int[] array = new int[size];

         // llenamos el array con números aleatorios entre 1 y 300
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 300) + 1;
        }

        // pedimos al usuario el dígito que quiere buscar
        System.out.println("Introduce el dígito que quieres buscar (0-9): ");
        // guardadr string de entrada
        String digitoEntrada = System.console().readLine();
        // verificar que la entrada es un número entero positivo
        while (!digitoEntrada.matches("[0-9]")) {
            System.out.println("Por favor, introduce un dígito entre 0 y 9.");
            digitoEntrada = System.console().readLine();
        } 

        // convertimos la entrada a un número entero
        int digito = Integer.parseInt(digitoEntrada);

        // contamos los números que acaban en el dígito indicado por el usuario
        int contador = 0;
        for (int i = 0; i < size; i++) {
            // si el número acaba en el dígito indicado por el usuario
            if (array[i] % 10 == digito) {
                contador++;
            }
        }

        // si no hay números que acaban en el dígito indicado por el usuario
        if (contador == 0) {
            System.out.println("No hay números que acaban en " + digito + ".");
            // mensaje de despedida
            System.out.println("Gracias por usar el programa de números aleatorios.");
            return;
        }

        // creamos un nuevo array con el tamaño del contador
        int[] arrayResultado = new int[contador];

        // llenamos el nuevo array con los números que acaban en el dígito indicado por el usuario
        int j = 0;
        for (int i = 0; i < size; i++) {
            // si el número acaba en el dígito indicado por el usuario
            if (array[i] % 10 == digito) {
                arrayResultado[j] = array[i];
                j++;
            }
        }

        // mostramos por pantalla el nuevo array
        System.out.println("Los números que acaban en " + digito + " son: ");
        for (int i = 0; i < arrayResultado.length; i++) {
            System.out.println(arrayResultado[i]);
        }

        // mensaje de despedida
        System.out.println("Gracias por usar el programa de números aleatorios.");
    }
}