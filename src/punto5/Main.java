package punto5;

import java.util.Scanner;

class GeneradorAlfabeto {
    //creacion de array de caracteres
    private char[] alfabeto;
    //Objeto para leer entrada del usuario
    private Scanner scanner;
    //Cadena resultante
    private StringBuilder cadenaResultante;

    //Constructor que inicializa el array con el alfabeto
    public GeneradorAlfabeto() {
        this.alfabeto = new char[26]; // Inicializa el array con tamaño 26 (A-Z)
        this.scanner = new Scanner(System.in); // Inicializa el scanner para entrada
        this.cadenaResultante = new StringBuilder(); // Inicializa la cadena resultante
        
        //Llenar el array con las letras del alfabeto
        for (int i = 0; i < 26; i++) {
            alfabeto[i] = (char) ('A' + i);
        }
    }

    //Metodo para validar si una posición es válida
    private boolean esPosicionValida(int posicion) {
        return posicion >= 0 && posicion < alfabeto.length;
    }

    //Metodo para procesar las entradas del usuario
    public void procesarEntradas() {
        System.out.println("Ingrese posiciones del alfabeto (0-25) o -1 para terminar:");
        
        while (true) {
            System.out.print("Posición: ");
            try {
                int posicion = Integer.parseInt(scanner.nextLine());
                
                //Validar si el usuario quiere terminar
                if (posicion == -1) {
                    break;
                }
                
                //Validar posición y agregar letra correspondiente
                if (esPosicionValida(posicion)) {
                    char letra = alfabeto[posicion];
                    cadenaResultante.append(letra);
                    System.out.println("Letra añadida: " + letra);
                } else {
                    System.out.println("Error, ingrese otro número (0-25)");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido");
            }
        }
    }

    //Metodo para mostrar la cadena resultante
    public void mostrarResultado() {
        System.out.println("Cadena resultante: " + cadenaResultante.toString());
    }
}

public class Main {
    public static void main(String[] args) {
        //crear objeto
        GeneradorAlfabeto generador = new GeneradorAlfabeto();
        
        //procesar entradas del usuario
        generador.procesarEntradas();
        
        //mostrar resultado final
        generador.mostrarResultado();
    }
}