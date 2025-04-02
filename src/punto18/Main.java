// 18)  Vamos a crear el juego del ahorcado por consola. 
// Al inicio del programa, pedirá los nombres de los dos jugadores. El primer turno será 
// para el jugador 1. 
// Uno escribe una palabra y el otro la adivina, si este la adivina obtendrá un punto y 
// escribirá una palabra, sino lo acierta el jugador actual suma un punto y escribe de 
// nuevo otra palabra. 
// Cuando el jugador inserte su palabra también deberá añadir una pequeña pista, por 
// ejemplo si la palabra es Madrid, la pista puede ser «Ciudad». 
// El jugador que tenga que acertar la palabra tendrá seis oportunidades (cabeza, 
// cuerpo, brazos y piernas). No es necesario dibujar nada por pantalla, solo mostrar el 
// número de oportunidades restantes. 
// Deberá mostrase los caracteres que el usuario inserta para esa palabra, para evitar 
// que las repita, en caso de que lo haga, avisarle y no contar como error. 
// Cada vez que acierte o no la palabra, deberá mostrar la puntuación de ambos. El 
// primero que llegue a 3 puntos gana. 
// Puedes usar todos los medios a tu alcance.

package punto18;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar nombres de los jugadores
        System.out.println("JUEGO DEL AHORCADO");
        System.out.println("------------------");
        System.out.print("Introduce el nombre del jugador 1: ");
        String jugador1 = scanner.nextLine();
        System.out.print("Introduce el nombre del jugador 2: ");
        String jugador2 = scanner.nextLine();
        
        // Inicializar puntuaciones
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        
        // El jugador 1 comienza proponiendo palabra
        String jugadorActual = jugador1;
        String jugadorAdivinador = jugador2;
        
        // Bucle principal del juego
        while (puntosJugador1 < 3 && puntosJugador2 < 3) {
            System.out.println("\n------------------");
            System.out.println("Turno de " + jugadorActual + " para proponer palabra");
            
            // Obtener palabra y pista
            System.out.print("Introduce una palabra (sin espacios): ");
            String palabra = scanner.nextLine().toLowerCase();
            
            System.out.print("Introduce una pista para la palabra: ");
            String pista = scanner.nextLine();
            
            // Limpiar la consola
            // Clear the console using ANSI escape codes
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
            // Inicializar variables para la ronda
            char[] palabraOculta = new char[palabra.length()];
            for (int i = 0; i < palabra.length(); i++) {
                palabraOculta[i] = '_';
            }
            
            Set<Character> letrasUsadas = new HashSet<>();
            int intentosRestantes = 6;
            boolean palabraAdivinada = false;
            
            System.out.println(jugadorAdivinador + ", adivina la palabra. Pista: " + pista);
            
            // Bucle de adivinanza
            while (intentosRestantes > 0 && !palabraAdivinada) {
                System.out.println("\nPalabra: " + String.valueOf(palabraOculta));
                System.out.println("Intentos restantes: " + intentosRestantes);
                System.out.println("Letras usadas: " + letrasUsadas);
                
                System.out.print("Introduce una letra o la palabra completa: ");
                String entrada = scanner.nextLine().toLowerCase();
                
                if (entrada.length() == 1) {
                    char letra = entrada.charAt(0);
                    
                    if (letrasUsadas.contains(letra)) {
                        System.out.println("Ya has usado esta letra. Prueba con otra.");
                        continue;
                    }
                    
                    letrasUsadas.add(letra);
                    
                    boolean acierto = false;
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabra.charAt(i) == letra) {
                            palabraOculta[i] = letra;
                            acierto = true;
                        }
                    }
                    
                    if (!acierto) {
                        intentosRestantes--;
                        System.out.println("La letra no está en la palabra.");
                    } else {
                        System.out.println("¡Bien! La letra está en la palabra.");
                    }
                    
                    if (String.valueOf(palabraOculta).equals(palabra)) {
                        palabraAdivinada = true;
                    }
                } else {
                    if (entrada.equals(palabra)) {
                        palabraAdivinada = true;
                    } else {
                        intentosRestantes--;
                        System.out.println("Palabra incorrecta.");
                    }
                }
            }
            
            // Actualizar puntuaciones y turnos según el resultado
            if (palabraAdivinada) {
                System.out.println("\n¡" + jugadorAdivinador + " ha adivinado la palabra " + palabra + "!");
                // El adivinador gana un punto y ahora propondrá palabra
                if (jugadorAdivinador.equals(jugador1)) {
                    puntosJugador1++;
                } else {
                    puntosJugador2++;
                }
                // Intercambiar roles para la siguiente ronda
                String temp = jugadorActual;
                jugadorActual = jugadorAdivinador;
                jugadorAdivinador = temp;
            } else {
                System.out.println("\n" + jugadorAdivinador + " no ha adivinado la palabra. La palabra era: " + palabra);
                // El proponente gana un punto y mantiene su rol
                if (jugadorActual.equals(jugador1)) {
                    puntosJugador1++;
                } else {
                    puntosJugador2++;
                }
                // El adivinador sigue siendo el mismo para la siguiente ronda
            }
            
            // Mostrar puntuación
            System.out.println("\nPuntuación actual:");
            System.out.println(jugador1 + ": " + puntosJugador1 + " puntos");
            System.out.println(jugador2 + ": " + puntosJugador2 + " puntos");
        }
        
        // Determinar ganador
        String ganador = puntosJugador1 >= 3 ? jugador1 : jugador2;
        System.out.println("\n¡" + ganador + " ha ganado el juego!");
        
        scanner.close();
    }
}