package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        // dado o valor de um carro descubra quantas vezes ele pode ser parcelado
        // condiçao valor da parcela >= 1000

        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
          double valorParcela = valorCarro / parcela;
          if (valorParcela >= 1000) {
              System.out.println("Parcela " + parcela + "x " + "R$ " + valorParcela);
          }else {
              break;
          }
        }
    }
}

