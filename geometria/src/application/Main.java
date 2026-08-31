package application;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Figura f1 = new Quadrado(3);
        System.out.println(f1.calcularArea());
        System.out.println(f1.calcularPerimetro());
        System.out.println("\n");
        Figura f2 = new Retangulo(2, 3);
        System.out.println(f2.calcularArea());
        System.out.println(f2.calcularPerimetro());
    }
}