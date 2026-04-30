package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicionais04 {
    public static void main(String[] args) {

        double salarioAnual = 70000;
        double resultado1 = salarioAnual * 0.097;
        double resultado2 = salarioAnual * 0.3735;
        double resultado3 = salarioAnual * 0.495;
        double resultado;

        if (salarioAnual <= 34712) {
            resultado = resultado1;
        } else if ( salarioAnual >= 34713 && salarioAnual <= 68507) {
            resultado = resultado2;
        } else {
            resultado = resultado3;
        }
        System.out.println("A taxa sobre o seu salario é: " + resultado);
    }
}
