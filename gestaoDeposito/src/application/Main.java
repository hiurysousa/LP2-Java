package application;

import java.util.Scanner;
import java.util.ArrayList;
import entities.Produto;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto caneta = new Produto("Caneta", 1.0, 50.0);
        Produto lapis = new Produto("Lápis", 0.5, 100.0);
        Produto caderno = new Produto("Caderno", 20.0, 30.0);

        produtos.add(caneta);
        produtos.add(lapis);
        produtos.add(caderno);

        for (int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i));
        }

        caneta.removerQuantidade(51);
        caneta.setPreco(1.5);
        System.out.println("\n");
        for (int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i));
        }
    }
}
