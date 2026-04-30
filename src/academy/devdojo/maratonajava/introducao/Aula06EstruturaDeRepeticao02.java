package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares de 0 até 1000000

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Esse número é par: " + i);
            }
        }
        // feito com while
        int i = 0;

        while (i <= 1000000) {
            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}
