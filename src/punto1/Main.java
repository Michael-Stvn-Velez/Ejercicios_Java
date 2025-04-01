package punto1;

import java.util.Scanner;

class NumerosArray{
    //Se crea la array
    private int[] numeros;

    //Indica que la array va a tener 10 posiciones, contructor del objeto
    public NumerosArray(){
        this.numeros = new int[10];
    }

    //Metodo para solicitar los datos
    public void llenarArrays(){
        //objeto para solicitar datos por consola
        Scanner scanner = new Scanner(System.in);
        //mensaje para indicar que se busca que realice el usuario
        System.out.println("Ingrese los 10 numeros: ");

        //ciclo para llenar la array
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Número en índice " + i + ": ");
            //solicitar los datos
            numeros[i] = scanner.nextInt();
        }
    }

    //Metodo para mostrar los valores de la array
    public void mostrarArray(){
        System.out.println("**********************");
        //ciclo para mostrar cada valor de la array
        for(int i = 0; i < numeros.length; i++){
            //imprime cada indice con el valor
            System.out.println("Indice: " + i + " -  Valor: " + numeros[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear array
        NumerosArray numerosArray = new NumerosArray();
        //Llamar metodo para llenar la array
        numerosArray.llenarArrays();
        //Llamar metodo para mostrar los datos de la array
        numerosArray.mostrarArray();
    }
}
