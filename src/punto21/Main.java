package punto21;

import java.util.Scanner;

class Jugador {
    private int[] numeros;  // Almacena los 4 números elegidos por el jugador
    private String nombre;  // Nombre del jugador

    // Constructor que inicializa un jugador con su nombre
    public Jugador(String nombre) {
        this.nombre = nombre;
        this.numeros = new int[4];
    }

    // Método para que el jugador ingrese sus números
    public void elegirNumeros(Scanner scanner) {
        System.out.println("\n" + nombre + ", ingrese sus 4 números (1-10):");
        for (int i = 0; i < 4; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                try {
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num >= 1 && num <= 10) {
                        numeros[i] = num;
                        break;
                    } else {
                        System.out.println("Error: El número debe estar entre 1 y 10");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Debe ingresar un número válido");
                }
            }
        }
    }

    // Método para contar cuántos números están en el rango [A, B]
    public int contarAciertos(int a, int b) {
        int count = 0;
        for (int num : numeros) {
            if (num >= a && num <= b) {
                count++;
            }
        }
        return count;
    }

    // Método para mostrar los números del jugador
    public void mostrarNumeros() {
        System.out.print(nombre + ": [");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Getter para el nombre
    public String getNombre() {
        return nombre;
    }
}

class Arbitro {
    private int a;  // Primer número del árbitro
    private int b;  // Segundo número del árbitro

    // Método para que el árbitro elija los números A y B
    public void elegirNumeros(Scanner scanner) {
        System.out.println("\nÁrbitro, ingrese los números A y B (1-10):");
        
        // Solicitar número A con validación
        while (true) {
            System.out.print("Número A: ");
            try {
                a = Integer.parseInt(scanner.nextLine());
                if (a >= 1 && a <= 10) {
                    break;
                } else {
                    System.out.println("Error: El número debe estar entre 1 y 10");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido");
            }
        }
        
        // Solicitar número B con validación
        while (true) {
            System.out.print("Número B: ");
            try {
                b = Integer.parseInt(scanner.nextLine());
                if (b >= 1 && b <= 10) {
                    break;
                } else {
                    System.out.println("Error: El número debe estar entre 1 y 10");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido");
            }
        }
    }

    // Método para mostrar los números del árbitro
    public void mostrarNumeros() {
        System.out.println("\nNúmeros del árbitro: A = " + a + ", B = " + b);
    }

    // Getters para los números del árbitro
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Crear 3 jugadores
        Jugador[] jugadores = {
            new Jugador("Jugador 1"),
            new Jugador("Jugador 2"),
            new Jugador("Jugador 3")
        };
        
        // Crear árbitro
        Arbitro arbitro = new Arbitro();
        
        // Cada jugador elige sus números
        for (Jugador jugador : jugadores) {
            jugador.elegirNumeros(scanner);
        }
        
        // Árbitro elige sus números
        arbitro.elegirNumeros(scanner);
        
        // Mostrar todos los números elegidos
        System.out.println("\n--- Números elegidos ---");
        for (Jugador jugador : jugadores) {
            jugador.mostrarNumeros();
        }
        arbitro.mostrarNumeros();
        
        // Calcular y mostrar aciertos de cada jugador
        System.out.println("\n--- Resultados ---");
        int[] aciertos = new int[jugadores.length];
        int totalAciertos = 0;
        
        for (int i = 0; i < jugadores.length; i++) {
            aciertos[i] = jugadores[i].contarAciertos(arbitro.getA(), arbitro.getB());
            totalAciertos += aciertos[i];
            System.out.println(jugadores[i].getNombre() + ": " + aciertos[i] + " aciertos");
        }
        
        // Determinar al ganador
        int maxAciertos = 0;
        for (int acierto : aciertos) {
            if (acierto > maxAciertos) {
                maxAciertos = acierto;
            }
        }
        
        // Mostrar ganador(es)
        System.out.println("\n--- Ganador(es) ---");
        boolean hayEmpate = false;
        int ganadores = 0;
        
        for (int i = 0; i < jugadores.length; i++) {
            if (aciertos[i] == maxAciertos) {
                if (ganadores > 0) {
                    hayEmpate = true;
                }
                System.out.println(jugadores[i].getNombre());
                ganadores++;
            }
        }
        
        if (hayEmpate) {
            System.out.println("¡Hay empate entre los jugadores anteriores!");
        }
        
        // Calcular y mostrar media de aciertos
        double media = (double) totalAciertos / jugadores.length;
        System.out.printf("\nMedia de aciertos: %.2f\n", media);
    }
}