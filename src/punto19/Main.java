package punto19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class GeneradorArrayUnico {
    private int[] array;          // Array para almacenar números únicos
    private Random random;       // Generador de números aleatorios
    private Scanner scanner;     // Para entrada de usuario
    private Set<Integer> set;    // Para verificar duplicados

    // Constructor que inicializa los componentes necesarios
    public GeneradorArrayUnico(int tamaño) {
        this.array = new int[tamaño];
        this.random = new Random();
        this.scanner = new Scanner(System.in);
        this.set = new HashSet<>();
    }

    // Método para generar números aleatorios únicos
    public void generarNumerosUnicos() {
        int i = 0;
        while (i < array.length) {
            int num = random.nextInt(100) + 1;  // Números entre 1 y 100
            
            // Verifica si el número ya existe usando el Set
            if (!set.contains(num)) {
                array[i] = num;    // Almacena el número en el array
                set.add(num);      // Añade el número al Set para control
                i++;               // Solo incrementa si el número es único
            }
        }
    }

    // Método para mostrar el array generado
    public void mostrarArray() {
        System.out.println("Array generado: " + Arrays.toString(array));
    }

    // Método para obtener el array (opcional)
    public int[] getArray() {
        return array;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt();

        // Crear el generador de números únicos
        GeneradorArrayUnico generador = new GeneradorArrayUnico(tamaño);
        
        // Generar los números aleatorios únicos
        generador.generarNumerosUnicos();
        
        // Mostrar el resultado
        generador.mostrarArray();
    }
}