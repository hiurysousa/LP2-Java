package application;
import entities.*;

public class Main {
    public static void main(String[] args){
        FiguraAbstrata f = new Quadrado(4);
        System.out.println(f.calcularArea());
    }
}
