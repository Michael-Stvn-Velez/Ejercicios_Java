package punto15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase que implementa el algoritmo QuickSort para ordenar arrays de números enteros.
 */
class OrdenadorQuickSort {
    private int[] array;
    private Scanner scanner;

    /**
     * Constructor que inicializa el array con el tamaño especificado.
     * @param tamaño Tamaño del array a ordenar
     */
    public OrdenadorQuickSort(int tamaño) {
        this.array = new int[tamaño];
        this.scanner = new Scanner(System.in);
    }

    /**
     * Método para llenar el array con números ingresados por el usuario.
     */
    public void llenarArray() {
        System.out.println("Ingrese " + array.length + " números enteros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    /**
     * Método público que inicia el proceso de ordenamiento QuickSort.
     */
    public void ordenar() {
        quickSort(array, 0, array.length - 1);
        System.out.println("Array ordenado con QuickSort.");
    }

    /**
     * Implementación recursiva del algoritmo QuickSort.
     * @param arr Array a ordenar
     * @param inicio Índice de inicio del subarray
     * @param fin Índice de fin del subarray
     */
    private void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            // Obtener el índice del pivote después de la partición
            int indicePivote = particion(arr, inicio, fin);

            // Ordenar recursivamente los subarrays antes y después del pivote
            quickSort(arr, inicio, indicePivote - 1);
            quickSort(arr, indicePivote + 1, fin);
        }
    }

    /**
     * Método de partición para QuickSort.
     * @param arr Array a particionar
     * @param inicio Índice de inicio
     * @param fin Índice de fin
     * @return Índice de la posición final del pivote
     */
    private int particion(int[] arr, int inicio, int fin) {
        int pivote = arr[fin];
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (arr[j] <= pivote) {
                i++;
                intercambiar(arr, i, j);
            }
        }

        intercambiar(arr, i + 1, fin);
        return i + 1;
    }

    /**
     * Método auxiliar para intercambiar elementos del array.
     * @param arr Array donde se intercambiarán los elementos
     * @param i Primer índice a intercambiar
     * @param j Segundo índice a intercambiar
     */
    private void intercambiar(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * Método para mostrar el array.
     */
    public void mostrarArray() {
        System.out.println("Array: " + Arrays.toString(array));
    }
}

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ORDENAMIENTO QUICKSORT");
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt();

        // Crear el ordenador
        OrdenadorQuickSort ordenador = new OrdenadorQuickSort(tamaño);

        // Llenar el array
        ordenador.llenarArray();

        // Mostrar array original
        System.out.println("\nArray original:");
        ordenador.mostrarArray();

        // Ordenar el array
        ordenador.ordenar();

        // Mostrar array ordenado
        System.out.println("\nArray ordenado:");
        ordenador.mostrarArray();
    }
}