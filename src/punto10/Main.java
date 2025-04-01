// 10) Crea una aplicación que pida un numero por teclado y después comprobaremos 
// si el numero introducido es capicúa, es decir, que se lee igual sin importar la 
// dirección. Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no 
// es capicúa. Piensa como puedes dar la vuelta al número. 

package punto10;

public class Main {
    public static void main(String[] args) {
        // mostrar el mensaje de bienvenida
        System.out.println("Bienvenido al programa que comprueba si un número es capicúa.");

        // pedir al usuario que introduzca un número
        System.out.println("Introduce un número: ");
        String entrada = System.console().readLine();
        
        // verificar que la entrada es un número entero positivo
        while (!entrada.matches("\\d+")) {
            System.out.println("Por favor, introduce un número entero positivo.");
            entrada = System.console().readLine();
        }

        // convertir la entrada a un array de caracteres sin espacios
        char[] array = entrada.replaceAll(" ", "").toCharArray();

        // recorrer el array y comprobar si es capicúa
        boolean capicua = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                capicua = false;
                break;
            }
        }

        // mostrar el resultado
        if (capicua) {
            System.out.println("El número " + entrada + " es capicúa.");
        } else {
            System.out.println("El número " + entrada + " no es capicúa.");
        }

        // mostrar el mensaje de despedida
        System.out.println("Gracias por usar el programa.");
    }
}