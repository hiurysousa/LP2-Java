package entities;

public class Notebook extends Produto{

    public Notebook(String nome, double preco, int estoque){
        super(nome, preco, estoque);
    }

    public double calcularDesconto(){
        if (getPreco() > 3000){
            return getPreco() * 0.10;
        } else {
            return 0;
        }
    }
}
