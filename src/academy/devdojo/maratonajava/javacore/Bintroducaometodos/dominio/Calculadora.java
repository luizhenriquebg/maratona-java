package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double n1, double n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public void alteraDoisNumeros(int n1, int n2) {
        n1 = 99;
        n2 = 33;
        System.out.println("Dentro alteraDoisNumeros");
        System.out.println("n1:" + n1);
        System.out.println("n2:" + n2);
    }
}
