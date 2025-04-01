package punto9;

import java.util.Scanner;

class GestorNotas {
    // Arrays para almacenar los datos
    private String[] nombresAlumnos;
    private double[] notasAlumnos;
    private String[] resultadosNotas;
    // Objeto para leer entrada del usuario
    private Scanner scanner;
    // Tamaño fijo de los arrays
    private final int TAMANO = 10;

    // Constructor que inicializa los arrays
    public GestorNotas() {
        this.nombresAlumnos = new String[TAMANO];
        this.notasAlumnos = new double[TAMANO];
        this.resultadosNotas = new String[TAMANO];
        this.scanner = new Scanner(System.in);
    }

    // Método para validar que una nota esté entre 0 y 10
    private boolean esNotaValida(double nota) {
        return nota >= 0 && nota <= 10;
    }

    // Método para convertir nota a resultado en palabras
    private String convertirNotaAPalabra(double nota) {
        if (nota < 5) return "Suspenso";
        if (nota < 7) return "Bien";
        if (nota < 9) return "Notable";
        return "Sobresaliente";
    }

    // Método para ingresar los nombres de los alumnos
    public void ingresarNombresAlumnos() {
        System.out.println("Ingrese los nombres de los 10 alumnos:");
        for (int i = 0; i < TAMANO; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            nombresAlumnos[i] = scanner.nextLine();
        }
    }

    // Método para ingresar las notas de los alumnos
    public void ingresarNotasAlumnos() {
        System.out.println("\nIngrese las notas de los alumnos (entre 0 y 10):");
        for (int i = 0; i < TAMANO; i++) {
            do {
                System.out.print("Nota para " + nombresAlumnos[i] + ": ");
                try {
                    double nota = Double.parseDouble(scanner.nextLine());
                    if (esNotaValida(nota)) {
                        notasAlumnos[i] = nota;
                        resultadosNotas[i] = convertirNotaAPalabra(nota);
                        break;
                    } else {
                        System.out.println("Error: La nota debe estar entre 0 y 10");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debe ingresar un número válido");
                }
            } while (true);
        }
    }

    // Método para mostrar todos los resultados
    public void mostrarResultados() {
        System.out.println("\n*** RESULTADOS FINALES ***");
        System.out.println("----------------------------------------");
        System.out.printf("%-20s %-10s %-15s\n", "ALUMNO", "NOTA", "RESULTADO");
        System.out.println("----------------------------------------");
        
        for (int i = 0; i < TAMANO; i++) {
            System.out.printf("%-20s %-10.2f %-15s\n", 
                             nombresAlumnos[i], 
                             notasAlumnos[i], 
                             resultadosNotas[i]);
        }
        System.out.println("----------------------------------------");
    }

    // Método principal que ejecuta todas las operaciones
    public void ejecutar() {
        ingresarNombresAlumnos();
        ingresarNotasAlumnos();
        mostrarResultados();
    }
}

public class Main {
    public static void main(String[] args) {
        GestorNotas gestor = new GestorNotas();
        gestor.ejecutar();
    }
}