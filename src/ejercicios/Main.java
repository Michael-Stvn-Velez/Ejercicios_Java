package ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seleccione el ejercicio a ejecutar (1-21): ");
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1 -> Ejercicio1.main(args);
            default -> System.out.println("Ejercicio no encontrado.");
        }
        
        scanner.close();
    }
}
