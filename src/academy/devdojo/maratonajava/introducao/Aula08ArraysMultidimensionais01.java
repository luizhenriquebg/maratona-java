package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1,2,3,4 Meses
        // 31,28,31,30 Dias dos meses
        int[][] num = { {1,2,3,4}, {31,28,31,30} };

        for (int meses = 0; meses < num[0].length; meses++) {
            System.out.println("Mes " + num[0][meses] + " tem " + num[1][meses] + " dias");
        }
    }
}
