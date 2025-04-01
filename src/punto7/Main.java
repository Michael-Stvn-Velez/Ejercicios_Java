package punto7;

import java.util.Scanner;
import java.util.Random;

class OperadorArrays {
    //Arrays para almacenar los números
    private int[] arrayOriginal;
    private int[] arrayReferencia;
    private int[] arrayNuevo;
    private int[] arrayResultado;
    //Objeto para generar números aleatorios
    private Random random;
    //Objeto para leer entrada del usuario
    private Scanner scanner;

    //Constructor que recibe el tamaño de los arrays
    public OperadorArrays(int tamaño) {
        this.arrayOriginal = new int[tamaño];
        this.arrayReferencia = arrayOriginal; //Apuntar al array original
        this.arrayNuevo = new int[tamaño];
        this.arrayResultado = new int[tamaño];
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }

    //Método para llenar el array original con números aleatorios
    public void llenarArrayOriginal() {
        for(int i = 0; i < arrayOriginal.length; i++) {
            arrayOriginal[i] = random.nextInt(100) + 1; //Números entre 1 y 100
        }
        System.out.println("Array original llenado con números aleatorios.");
    }

    //Método para llenar el nuevo array con números aleatorios
    public void llenarArrayNuevo() {
        for(int i = 0; i < arrayNuevo.length; i++) {
            arrayNuevo[i] = random.nextInt(100) + 1; //Números entre 1 y 100
        }
        System.out.println("Nuevo array llenado con números aleatorios.");
    }

    //Método para multiplicar los arrays
    public int[] multiplicarArrays(int[] arr1, int[] arr2) {
        int[] resultado = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            resultado[i] = arr1[i] * arr2[i];
        }
        return resultado;
    }

    //Método para mostrar el contenido de un array
    public void mostrarArray(String nombre, int[] arr) {
        System.out.println("\n*** " + nombre + " ***");
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Índice " + i + ": " + arr[i]);
        }
    }

    //Método principal que ejecuta todas las operaciones
    public void ejecutarOperaciones() {
        llenarArrayOriginal();
        llenarArrayNuevo();
        
        //Multiplicar los arrays
        arrayResultado = multiplicarArrays(arrayOriginal, arrayNuevo);
        
        //Mostrar todos los arrays
        mostrarArray("Array Original", arrayOriginal);
        mostrarArray("Array Referencia (apunta a Original)", arrayReferencia);
        mostrarArray("Nuevo Array", arrayNuevo);
        mostrarArray("Array Resultado (multiplicación)", arrayResultado);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño para los arrays: ");
        //tamaño de los arrays
        int tamaño = scanner.nextInt();

        //crear objeto
        OperadorArrays operador = new OperadorArrays(tamaño);

        //ejecutar todas las operaciones
        operador.ejecutarOperaciones();
    }
}