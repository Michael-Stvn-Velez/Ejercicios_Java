package punto3;

import java.util.Scanner;
import java.util.Random;

class ArrayRandom{
    //creacion de array de numeros
    private int[] numeros;
    //Objeto para generar numeros aleatorios
    private Random random;

    //Constructor que recibe el tamaño de la array 
    public ArrayRandom(int n){
        this.numeros = new int[n]; // Inicializa el array con el tamaño dado
        this.random = new Random(); // Inicializa el generador de números aleatorios
    }

    //Metodo para verificar si un numero es primo
    private boolean esPrimo(int numero){
        if(numero < 2 || numero % 2 == 0) return false; //valida numero 
        if(numero == 2) return true;

        for(int i = 3; i <= Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    //Metodo para llenar de numeros primos la array
    public void llenarArraysRandom(){
        int i = 0;
        //ciclo que se repite hasta que la array este llena
        while (i < numeros.length) {
            int nuevoNumero = random.nextInt(100) + 1; //Genera numeros entre 1 y 100
            //valida si el numero es primo
            if(esPrimo(nuevoNumero)){
                numeros[i] = nuevoNumero; //almacena el numero
                i++;
            }
        }
        System.out.println("El array ha sido llenado con numeros primos aleatorios.");
    }

    //Metodo para mostrar la array
    public void mostrarArray(){
        System.out.println("***Array***");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Indice: " + 1 + " - Valor: " + numeros[i]);
        }
    }

    //metodo para encontrar el numero mas grande de la array
    public int encontrarValorMaximo(){
        int maximo = numeros[0]; //valor inicial de maximo
        for(int num : numeros){ //validar si maximo es mayor a otro valor de la array
            if(num > maximo){ 
                maximo = num; 
            }
        }
        return maximo;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del array: ");
        //tamaño de la array
        int tamaño = scanner.nextInt();

        //crear objeto
        ArrayRandom arrayNueva = new ArrayRandom(tamaño);

        arrayNueva.llenarArraysRandom(); //llenar la array
        arrayNueva.mostrarArray(); //mostrar la array
        System.out.println("\nEl número mayor en el array es: " + arrayNueva.encontrarValorMaximo());
    }
}
