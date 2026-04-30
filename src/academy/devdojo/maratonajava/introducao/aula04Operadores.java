package academy.devdojo.maratonajava.introducao;

public class aula04Operadores {
    public static void main(String[] args) {
        // operador logico: && (AND), || (or), ! (not)

        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float valorPs5 = 5000;
        boolean isViavelComprar = contaCorrente >= valorPs5 || contaPoupanca >= valorPs5;

        System.out.println("isViavelComprar: " + isViavelComprar);

        // operadores de atribuição: = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2;
        System.out.println(bonus);
    }
}
