package punto16;

public class Main {
    public static void main(String[] args) {
        // Crear un array de cadenas
        String[] array = {"banana", "manzana", "naranja", "uva", "kiwi"};

        // Mostrar el array original
        System.out.println("Array original: ");
        imprimirArray(array);

        // Ordenar el array usando Quicksort
        quicksort(array, 0, array.length - 1);

        // Mostrar el array ordenado
        System.out.println("Array ordenado: ");
        imprimirArray(array);
    }

    // Método auxiliar para imprimir el array
    public static void imprimirArray(String[] array) {
        for (String elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }

    // Método para realizar el algoritmo Quicksort
    public static void quicksort(String[] array, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particion(array, inicio, fin);
            quicksort(array, inicio, indiceParticion - 1);
            quicksort(array, indiceParticion + 1, fin);
        }
    }

    // Método para particionar el array
    public static int particion(String[] array, int inicio, int fin) {
        String pivote = array[fin]; // Elegir el último elemento como pivote
        int i = inicio; // Índice del elemento más pequeño

        for (int j = inicio; j < fin; j++) {
            // Comparar cadenas (ignorando mayúsculas/minúsculas si se desea)
            if (array[j].compareToIgnoreCase(pivote) < 0) {
                // Intercambiar array[i] y array[j]
                intercambiar(array, i, j);
                i++;
            }
        }

        // Intercambiar el pivote con el elemento en la posición i
        intercambiar(array, i, fin);

        return i; // Retornar el índice de partición
    }

    // Método auxiliar para intercambiar elementos
    public static void intercambiar(String[] array, int i, int j) {
        if (i == j) return; // No hay necesidad de intercambiar si son el mismo índice
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
