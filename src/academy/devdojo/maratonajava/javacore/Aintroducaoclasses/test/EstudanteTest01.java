package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luiz";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println("Nome:" + estudante.nome + " Idade:" +  estudante.idade + " Sexo:" +  estudante.sexo);
    }
}
