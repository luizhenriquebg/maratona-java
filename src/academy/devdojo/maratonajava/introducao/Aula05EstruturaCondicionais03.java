package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        // doar salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro Devdojo";
        String mensagemNaoDoar = "Ainda nao tenho condições, mas vou ter!";
        // (condiçao) ? true : false
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
