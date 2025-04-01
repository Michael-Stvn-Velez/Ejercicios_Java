package punto17;

import java.util.Arrays;
import java.util.Scanner;

class BuscadorArray {
    private int[] array;         // Array para almacenar los números
    private Scanner scanner;     // Objeto para leer entrada del usuario

    // Constructor que inicializa el array con el tamaño especificado
    public BuscadorArray(int tamaño) {
        this.array = new int[tamaño];
        this.scanner = new Scanner(System.in);
    }

    // Método para llenar el array con números ingresados por el usuario
    public void llenarArray() {
        System.out.println("Ingrese " + array.length + " números enteros:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }

    // Método para ordenar el array usando el algoritmo de ordenación de Arrays
    public void ordenarArray() {
        Arrays.sort(array); // Ordena el array en orden ascendente
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }

    // Método para buscar un número en el array ordenado
    public void buscarNumero() {
        System.out.print("Ingrese el número a buscar: ");
        int numero = scanner.nextInt();
        
        // Realiza la búsqueda binaria
        int resultado = busquedaBinaria(numero);
        
        // Muestra el resultado de la búsqueda
        if (resultado == -1) {
            System.out.println("El número " + numero + " no se encuentra en el array.");
        } else {
            System.out.println("El número " + numero + " se encuentra en la posición " + resultado);
        }
    }

    // Implementación del algoritmo de búsqueda binaria
    private int busquedaBinaria(int numero) {
        int inicio = 0;               // Índice inicial del rango de búsqueda
        int fin = array.length - 1;    // Índice final del rango de búsqueda
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;  // Calcula el punto medio
            
            if (array[medio] == numero) {
                return medio;  // Número encontrado, retorna la posición
            }
            
            // Ajusta los límites de búsqueda según la comparación
            if (array[medio] < numero) {
                inicio = medio + 1;  // Busca en la mitad superior
            } else {
                fin = medio - 1;     // Busca en la mitad inferior
            }
        }
        
        return -1;  // Retorna -1 si el número no se encuentra
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita el tamaño del array al usuario
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt();

        // Crea una instancia de BuscadorArray
        BuscadorArray buscador = new BuscadorArray(tamaño);

        // Ejecuta los métodos en orden
        buscador.llenarArray();    // Llena el array con valores
        buscador.ordenarArray();   // Ordena el array
        buscador.buscarNumero();   // Realiza la búsqueda
    }
}