package punto11;

class InversorArray {
    // Array original
    private int[] arrayOriginal;
    // Array invertido
    private int[] arrayInvertido;

    // Constructor que recibe el array original
    public InversorArray(int[] arrayOriginal) {
        this.arrayOriginal = arrayOriginal;
        this.arrayInvertido = new int[arrayOriginal.length];
    }

    // Método para invertir el array
    public void invertirArray() {
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }
    }

    // Método para mostrar el array original
    public void mostrarOriginal() {
        System.out.print("Array original: {");
        for (int i = 0; i < arrayOriginal.length; i++) {
            System.out.print(arrayOriginal[i]);
            if (i < arrayOriginal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    // Método para mostrar el array invertido
    public void mostrarInvertido() {
        System.out.print("Array invertido: {");
        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.print(arrayInvertido[i]);
            if (i < arrayInvertido.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear el array original con los valores {1,2,3,4,5}
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        
        // Crear el objeto inversor
        InversorArray inversor = new InversorArray(arrayOriginal);
        
        // Mostrar array original
        inversor.mostrarOriginal();
        
        // Invertir el array
        inversor.invertirArray();
        
        // Mostrar array invertido
        inversor.mostrarInvertido();
    }
}