package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "BMW";
        carro1.modelo = "320i";
        carro1.ano = 2025;

        carro2.marca = "Porsche";
        carro2.modelo = "Macan";
        carro2.ano = 2025;

        carro1 = carro2;

        System.out.println("Marca:" + carro1.marca + " Modelo:" + carro1.modelo + " Ano:" + carro1.ano);
        System.out.println("Marca:" + carro2.marca + " Modelo:" + carro2.modelo + " Ano:" + carro2.ano);
    }
}
