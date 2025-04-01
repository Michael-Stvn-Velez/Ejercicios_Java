package punto13;

import java.util.Arrays;
import java.util.Scanner;

class CopiadorArrays {
    // Arrays para almacenar los números
    private int[] arrayOriginal;
    private int[] arrayCopia;
    // Objeto para leer entrada del usuario
    private Scanner scanner;

    // Constructor que recibe el tamaño del array
    public CopiadorArrays(int tamaño) {
        this.arrayOriginal = new int[tamaño];
        this.arrayCopia = new int[tamaño];
        this.scanner = new Scanner(System.in);
    }

    // Método para llenar el array original con números
    public void llenarArrayOriginal() {
        System.out.println("Ingrese " + arrayOriginal.length + " números enteros:");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arrayOriginal[i] = scanner.nextInt();
        }
    }

    // Método para copiar el array usando Arrays.copyOf()
    public void copiarArray() {
        arrayCopia = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        System.out.println("Array copiado exitosamente.");
    }

    // Método para mostrar ambos arrays
    public void mostrarArrays() {
        System.out.println("\nArray Original: " + Arrays.toString(arrayOriginal));
        System.out.println("Array Copia:    " + Arrays.toString(arrayCopia));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño para los arrays: ");
        int tamaño = scanner.nextInt();

        // Crear objeto copiador
        CopiadorArrays copiador = new CopiadorArrays(tamaño);

        // Llenar el array original
        copiador.llenarArrayOriginal();

        // Copiar el array
        copiador.copiarArray();

        // Mostrar ambos arrays
        copiador.mostrarArrays();
    }
}