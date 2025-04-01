package punto20;

public class Main {
    public static void main(String[] args) {
        int[] origen = {10, 25, 30, 40, 50, 60, 70, 80, 90, 100};
        
        // Primero contamos cuántos números cumplen la condición
        int count = 0;
        for (int num : origen) {
            if (num > 25 && num % 2 == 0) {
                count++;
            }
        }
        
        // Creamos el array destino con el tamaño exacto
        int[] destino = new int[count];
        int index = 0;
        
        // Llenamos el array destino
        for (int num : origen) {
            if (num > 25 && num % 2 == 0) {
                destino[index] = num;
                index++;
            }
        }

        // Mostrar el arreglo de origen
        System.out.println("Arreglo de origen completo:");
        for (int num : origen) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mostrar solo los números introducidos en destino
        System.out.println("\nElementos en el arreglo destino (pares > 25):");
        for (int num : destino) {
            System.out.print(num + " ");
        }
    }
}