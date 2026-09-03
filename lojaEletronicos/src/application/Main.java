package application;
import entities.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Smartphone("Iphone 17", 13000, 20);
        Produto p2 = new Notebook("Acer Nitro", 5500, 35);
        Produto p3 = new Notebook("Lenovo Ideapad", 2500, 0);
        Produto p4 = new Smartphone("Samsung a05", 1000, 5);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        System.out.println("--- PRODUTOS DISPONÍVEIS ---\n");
        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).getEstoque() > 0){
                Produto prod = produtos.get(i);
                System.out.printf("Nome: %s | Estoque: %d | Preço: %.2f | Desconto aplicado: %.2f\n", prod.getNome(), prod.getEstoque(), (prod.getPreco() - prod.calcularDesconto()), prod.calcularDesconto());
            }
        }


    }
}
