package application;
import entities.*;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        a1.falar();
        a2.falar();

    }
}