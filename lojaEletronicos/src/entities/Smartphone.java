package entities;

public class Smartphone extends Produto{

    public Smartphone(String nome, double preco, int estoque){
        super(nome, preco, estoque);
    }

    public double calcularDesconto(){
        if (getPreco() > 2000){
            return getPreco() * 0.05;
        } else {
            return 0;
        }
    }

}
