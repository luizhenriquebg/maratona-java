package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador2 = new Jogador("paqueta");
        Time time = new Time("Santos");
        Time time2 = new Time("Flamengo");
        Jogador[] jogadoresSantos = {jogador};
        Jogador[] jogadoresFlamengo = {jogador2};

        jogador.setTime(time);
        jogador2.setTime(time2);
        time.setJogadores(jogadoresSantos);
        time2.setJogadores(jogadoresFlamengo);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Jogador2 ---");
        jogador2.imprime();
        System.out.println("--- Time ---");
        time.imprime();
        System.out.println("--- Time2 ---");
        time2.imprime();
    }
}
