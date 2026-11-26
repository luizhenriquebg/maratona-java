package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luiz", "123.678.345-75", 3500);

        funcionario.apresentar();
        double bonus = funcionario.calcularBonus();
        System.out.println( "Seu bonus é de: " + bonus);
    }
}
