package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Devdojo";
        professor.idade = 37;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " Idade:" +  professor.idade + " Sexo:" +  professor.sexo);
    }
}
